package com.lzl.blog.service;

import com.github.pagehelper.PageInfo;
import com.lzl.blog.entity.Article;
import com.lzl.blog.entity.vo.ArticleVo;

public interface ArticleService {

    PageInfo<ArticleVo> getArticleList(int page, int limit,ArticleVo articleVo);

    int publishArticle(ArticleVo articleVo);


}
