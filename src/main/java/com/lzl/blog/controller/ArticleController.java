package com.lzl.blog.controller;

import com.github.pagehelper.PageInfo;
import com.lzl.blog.consts.CodeConst;
import com.lzl.blog.consts.PathConst;
import com.lzl.blog.entity.Article;
import com.lzl.blog.entity.vo.ArticleVo;
import com.lzl.blog.enums.StatusEnum;
import com.lzl.blog.exception.BusinessException;
import com.lzl.blog.reponse.CommonResponse;
import com.lzl.blog.service.ArticleService;
import com.lzl.blog.service.ClassFicationService;
import com.lzl.blog.util.CommonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(PathConst.ARTICLE_PATH)
public class ArticleController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private ArticleService articleService;




    /**
     * blog列表
     * @param page
     * @param limit
     * @param articleVo
     * @param request
     * @return
     */
    @RequestMapping(value = "")
    public CommonResponse index(@RequestParam(value = "page", defaultValue = "1") int page,
                        @RequestParam(value = "limit", defaultValue = "15") int limit,
                        ArticleVo articleVo,
                        HttpServletRequest request){
        logger.info("search blog");
        PageInfo<ArticleVo> articleList = articleService.getArticleList(page, limit, articleVo);
        return CommonResponse.Response(StatusEnum.SUCCESS,articleList);
    }

    /**
     * 发表blog
     * @param articleVo
     * @param request
     * @return
     */
    @RequestMapping(value = PathConst.PUBLISH,method = RequestMethod.POST)
    public CommonResponse publish(@RequestBody ArticleVo articleVo, HttpServletRequest request){
        if (null == articleVo){
            logger.error("param is null");
            throw new BusinessException(StatusEnum.INPUT_PARAMETER_INVALID);
        }
        CommonUtil.validateParams(articleVo);
        articleService.publishArticle(articleVo);
        return CommonResponse.Response(StatusEnum.SUCCESS);
    }

    /**
     * 修改blog
     * @param articleVo
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public CommonResponse updateArticle(@RequestBody ArticleVo articleVo){
        if (null == articleVo){
            logger.error("param is null");
            throw new BusinessException(StatusEnum.INPUT_PARAMETER_INVALID);
        }
        CommonUtil.validateParams(articleVo);
        articleService.updateArticle(articleVo);
        return CommonResponse.Response(StatusEnum.SUCCESS);
    }
}
