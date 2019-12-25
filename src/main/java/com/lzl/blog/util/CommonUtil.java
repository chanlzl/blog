package com.lzl.blog.util;

import com.lzl.blog.entity.UserDetail;
import com.lzl.blog.entity.vo.ArticleVo;
import com.lzl.blog.enums.StatusEnum;
import com.lzl.blog.exception.BusinessException;
import com.lzl.blog.reponse.CommonResponse;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class CommonUtil {

    public static String generateUUID()
    {
        String replace = UUID.randomUUID().toString().replaceAll("-", "");
        return replace;
    }

    public static CommonResponse validateParams(UserDetail userDetail){
        if (StringUtils.isEmpty(userDetail.getUserName()) ||
                StringUtils.isEmpty(userDetail.getPassword())
        ){
            return CommonResponse.Response(StatusEnum.INPUT_PARAMETER_INVALID);
        }
        return CommonResponse.Response(StatusEnum.SUCCESS);
    }

    public static void main(String[] args) {
        String s = generateUUID();
        System.out.println(s);
    }

    public static void  validateParams(ArticleVo articleVo){
        if (StringUtils.isEmpty(articleVo.getContent()) ||
                StringUtils.isEmpty(articleVo.getUserId()) ||
                StringUtils.isEmpty(articleVo.getSummary()) ||
                StringUtils.isEmpty(articleVo.getTitle())
        ){
            throw new BusinessException(StatusEnum.INPUT_PARAMETER_INVALID);
        }
    }

    public static boolean equals(ArticleVo articleVo,ArticleVo DBArticleVo){
        if (null != articleVo.getEssence() && !DBArticleVo.getEssence().equals(articleVo.getEssence())){
            return true;
        }
        if (null != articleVo.getContent() && !DBArticleVo.getContent().equals(articleVo.getContent()) && !"".equals(articleVo.getContent())){
            return true;
        }
        if (null != articleVo.getSummary() && !DBArticleVo.getSummary().equals(articleVo.getSummary()) && !"".equals(articleVo.getSummary())) {
            return true;
        }
        if (null != articleVo.getTitle() && !DBArticleVo.getTitle().equals(articleVo.getTitle()) && !"".equals(articleVo.getTitle())) {
            return true;
        }
        if (null != articleVo.getClassId() && DBArticleVo.getClassId()!=(articleVo.getClassId())) {
            return true;
        }
        if (null != articleVo.getIsTop() && DBArticleVo.getIsTop()!=(articleVo.getIsTop())) {
            return true;
        }
        if (null != articleVo.getIsDelete() && DBArticleVo.getIsDelete()!=(articleVo.getIsDelete())) {
            return true;
        }
        if (null != articleVo.getReadCount() && DBArticleVo.getReadCount()!=(articleVo.getReadCount())) {
            return true;
        }
        return false;
    }
}
