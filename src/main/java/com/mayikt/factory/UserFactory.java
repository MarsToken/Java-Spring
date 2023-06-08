package com.mayikt.factory;

import com.mayikt.entity.UserEntity;
import com.mayikt.utils.Dom4jClass;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * @ClassName UserFactory
 * @Author 蚂蚁课堂余胜军 QQ644064779 www.mayikt.com
 * @Version V1.0
 **/
public class UserFactory {

    public static UserEntity getUserEntity() throws ClassNotFoundException, IllegalAccessException, InstantiationException, DocumentException {
        /**
         * 1.使用解析xml技术 解析spring.xml配置文件；
         *         2.获取<bean id=”” class=””/> 类的完整路径地址
         *         3.使用到反射技术初始化对象
         *         4.需要使用工厂模式封装初始化对象
         */
        //1.使用解析xml技术 解析spring.xml配置文件；dom4j
        String userClass = new Dom4jClass().getUserClass();
        //2.类的完整路径地址com.mayikt.entity.UserEntity
        //3.使用到反射技术初始化对象
        Class<?> aClass = Class.forName(userClass);
        // 默认执行无参数构造函数
        UserEntity userEntity = (UserEntity) aClass.newInstance();
        return userEntity;
    }


}
