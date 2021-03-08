package lxm.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition rootBeanDefinition, Class<?> aClass, String s) {
        log.info("TestMergedBeanDefinitionPostProcessor  postProcessMergedBeanDefinition...");
    }
}
