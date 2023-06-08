package com.mayikt.service;/*
* 作    者 ：蚂蚁课堂-余胜军
* 版 本 号 ：v1.0.0.0
*******************************************************************
* 版权由每特教育-蚂蚁课堂-余胜军所有 微信yushengjun644 QQ644064779
* 官方网址:www.mayikt.com 
*******************************************************************
//----------------------------------------------------------------*/

import com.mayikt.dao.MemberDao;
import com.mayikt.dao.MemberDaoImpl;

public class MemberService {

    /**
     * 使用到属性注入的方式
     */
    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void addMember() {
//        // 原生的方式
//        new MemberDaoImpl().addMember();
        System.out.println(">MemberService.addMember()<");
        memberDao.addMember();
    }
}
