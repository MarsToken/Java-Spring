package com.mayikt.factory;

import com.mayikt.dao.UserDao;

/**
 * @ClassName UserDaoFactory
 * @Author 蚂蚁课堂余胜军 QQ644064779 www.mayikt.com
 * @Version V1.0
 **/
public class UserDaoFactory {

    public static UserDao getUserDao() {
        return new UserDao();
    }

}
