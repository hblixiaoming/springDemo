package lxm.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("TestBeanDefinitionRegistryPostProcessor  afterPropertiesSet...");
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        log.info("TestBeanDefinitionRegistryPostProcessor  postProcessBeanDefinitionRegistry...");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        log.info("TestBeanDefinitionRegistryPostProcessor  postProcessBeanFactory...");
    }
}
