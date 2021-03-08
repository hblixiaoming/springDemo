package lxm.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestBeanB implements InitializingBean {

    public TestBeanB(){
        log.info("TestBeanB  instantiation...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("TestBeanB  afterPropertiesSet...");
    }

    public void test() {
        log.info("TestBeanB  test...");
    }
}
