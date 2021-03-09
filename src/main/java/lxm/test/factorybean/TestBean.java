package lxm.test.factorybean;

import lxm.test.model.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestBean {
    @Autowired
    private Apple apple;

}
