package lxm.test.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestBeanPostProcessor implements BeanPostProcessor, InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("TestBeanPostProcessor  afterPropertiesSet...");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("TestBeanPostProcessor  postProcessBeforeInitialization beanName:{}...", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("TestBeanPostProcessor  postProcessAfterInitialization beanName:{}...", beanName);
        return bean;
    }
}
