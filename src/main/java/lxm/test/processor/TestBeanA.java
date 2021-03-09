package lxm.test.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestBeanA implements InitializingBean {
    @Autowired
    private TestBeanB testBeanB;

    public TestBeanA() {
        log.info("TestBeanA  instantiation...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("TestBeanA  afterPropertiesSet...");
    }

    public void test() {
        log.info("TestBeanA  test...");
        testBeanB.test();
    }
}
