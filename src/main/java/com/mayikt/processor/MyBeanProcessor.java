package com.mayikt.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * 后置处理器
 *
 * @author WangMaoBo
 * @since 2023/6/7
 */
public class MyBeanProcessor implements BeanPostProcessor , Ordered {
    private static final String TAG = "MyBeanProcessor";

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前置处理器" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器" + bean);
        return bean;
    }

    /**
     * 可以配置多个后置处理器，默认顺序是在spring.xml配置的顺序，如果想要手动干预，此方法返回值越小越优先加载。
     *
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
