package com.lzl.blog.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

/**
 * md5生成与校验
 * @author huwei
 *
 */
public class MD5Util {

    /**
     * 盐值长度
     */
    static final private Integer SALT_LENGTH = 12;
    /**
     * 加密方式
     */
    static final public String ALGORITHM = "MD5";


    /**
     * 加密
     * @param str
     * @return
     */
    static public String encypt(String str) {
        //创建随机盐值
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[SALT_LENGTH];
        secureRandom.nextBytes(salt);

        return encypt(salt, str.getBytes());
    }

    /**
     * 校验
     * @param newStr
     * @param encyptStr
     * @return
     */
    static public boolean valid(String newStr ,String encyptStr) {
        //base64解密编译过的字符
        byte[] encypt = Base64.getDecoder().decode(encyptStr);
        //获取盐值
        byte[] salt = new byte[SALT_LENGTH];
        System.arraycopy(encypt, 0, salt, 0, SALT_LENGTH);
        return encyptStr.equals(encypt(salt ,newStr.getBytes()));
    }

    static public String encypt(byte[] salt ,byte[] buf) {
        MessageDigest md = getMessageDigest();
        md.update(salt);
        md.update(buf);
        byte[] encrypt = md.digest();
        byte[] result = new byte[salt.length + encrypt.length];
        System.arraycopy(salt, 0, result, 0, salt.length);
        System.arraycopy(encrypt, 0, result, salt.length, encrypt.length);
        return Base64.getEncoder().encodeToString(result);
    }

    static private MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            // api error
            throw new RuntimeException("java api error" ,e);
        }
    }

    static public void main(String[] args) {
        String encrypt = MD5Util.encypt("hello");
        System.out.println(encrypt);
        System.out.println(MD5Util.valid("hello", encrypt));
    }
}

