package lxm.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("TestBeanFactoryPostProcessor  afterPropertiesSet...");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        log.info("TestBeanFactoryPostProcessor  postProcessBeanFactory...");
    }
}
