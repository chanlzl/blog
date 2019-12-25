package com.lzl.blog.service;

import com.lzl.blog.entity.ClassFication;
import com.lzl.blog.entity.vo.ArticleVo;
import org.springframework.stereotype.Service;


public interface ClassFicationService {

    int insertClass(ArticleVo articleVo);

    ClassFication selectByParam(ArticleVo articleVo);
}
