package com.lzl.blog.service.impl;

import com.lzl.blog.dao.ClassFicationMapper;
import com.lzl.blog.entity.ClassFication;
import com.lzl.blog.entity.vo.ArticleVo;
import com.lzl.blog.service.ClassFicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassFicationServiceImpl implements ClassFicationService {

    @Autowired
    private ClassFicationMapper ficationMapper;

    @Override
    public int insertClass(ArticleVo articleVo) {
        ClassFication classFication = new ClassFication();
        classFication.setName(articleVo.getClassName());
        ficationMapper.insertSelective(classFication);
        return classFication.getId();
    }

    @Override
    public ClassFication selectByParam(ArticleVo articleVo) {
        ClassFication classFication = new ClassFication();
        classFication.setName(articleVo.getClassName());
        return ficationMapper.selectByParam(classFication);
    }


}
