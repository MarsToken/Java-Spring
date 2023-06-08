package com.mayikt.service;

import com.mayikt.dao.UserDao;
import com.mayikt.factory.UserDaoFactory;

/**
 * @ClassName UserService
 * @Author 蚂蚁课堂余胜军 QQ644064779 www.mayikt.com
 * @Version V1.0
 **/
public class UserService {
    public void addUser() {
//       new UserDao().addUser();
        System.out.println("UserService.addUser");
        UserDao userDao0 = UserDaoFactory.getUserDao();
        UserDao userDao1 = UserDaoFactory.getUserDao();
//        userDao.addUser();
        System.out.println(userDao0 == userDao1);
    }

    public static void main(String[] args) {
        new UserService().addUser();
    }
}
