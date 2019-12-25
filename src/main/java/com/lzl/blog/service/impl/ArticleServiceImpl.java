package com.lzl.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzl.blog.consts.CodeConst;
import com.lzl.blog.dao.ArticleDetailMapper;
import com.lzl.blog.dao.ArticleMapper;
import com.lzl.blog.entity.Article;
import com.lzl.blog.entity.ArticleDetail;
import com.lzl.blog.entity.ClassFication;
import com.lzl.blog.entity.vo.ArticleVo;
import com.lzl.blog.enums.StatusEnum;
import com.lzl.blog.exception.BusinessException;
import com.lzl.blog.service.ArticleService;
import com.lzl.blog.service.ClassFicationService;
import com.lzl.blog.util.CommonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ClassFicationService classFicationService;

    @Autowired
    private ArticleDetailMapper articleDetailMapper;



    @Override
    public PageInfo<ArticleVo> getArticleList(int page, int limit,ArticleVo articleVo) {
        PageHelper.startPage(page, limit);
        List<ArticleVo> articleVos = articleMapper.selectArticleByParam(articleVo);
        return new PageInfo<>(articleVos);
    }

    @Override
    @Transactional
    public int publishArticle(ArticleVo articleVo) {
        int insert = 0;
        try {
            Article article = new Article();
            BeanUtils.copyProperties(articleVo,article);
            if (StringUtils.isEmpty(articleVo.getClassName())){
                article.setClassId(CodeConst.DEFAULT_CLASS);
            }else{
                ClassFication classFication = classFicationService.selectByParam(articleVo);
                if (null == classFication){
                    int classId = classFicationService.insertClass(articleVo);
                    article.setClassId(classId);
                }else{
                    article.setClassId(classFication.getId());
                }
            }
            String articleId = CommonUtil.generateUUID();
            article.setId(articleId);
            articleMapper.insertSelective(article);
            ArticleDetail articleDetail = new ArticleDetail();
            articleDetail.setArticleId(articleId);
            articleDetail.setContent(articleVo.getContent());
            insert = articleDetailMapper.insert(articleDetail);
        } catch (BeansException e) {
            throw new BusinessException(StatusEnum.UNKNOWN_ERROR);
        }
        return insert;
    }
}
