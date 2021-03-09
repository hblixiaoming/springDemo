package lxm.test.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Component
@Slf4j
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor, InitializingBean {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        log.info("TestInstantiationAwareBeanPostProcessor  postProcessBeforeInstantiation beanName:{}...", beanName);
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        log.info("TestInstantiationAwareBeanPostProcessor  postProcessAfterInstantiation beanName:{}...", beanName);
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        log.info("TestInstantiationAwareBeanPostProcessor  postProcessPropertyValues beanName:{}...", beanName);
        return pvs;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("TestInstantiationAwareBeanPostProcessor  afterPropertiesSet...");
    }
}
