package lxm.test.factorybean;

import lombok.extern.slf4j.Slf4j;
import lxm.test.model.Apple;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        log.info("TestFactoryBean  getObject...");
        Apple apple = new Apple();
        apple.setId(1);
        apple.setName("apple");
        apple.setColor("red");
        return apple;
    }

    @Override
    public Class<?> getObjectType() {
        return Apple.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
