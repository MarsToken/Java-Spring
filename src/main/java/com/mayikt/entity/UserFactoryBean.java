package com.mayikt.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author WangMaoBo
 * @since 2023/6/7
 */
public class UserFactoryBean implements FactoryBean {
    private static final String TAG = "UserFactoryBean";

    /**
     * 返回值取决于此返回对象类型
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        return new UserEntity();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
