package lxm.service;

import lxm.mapper.TestMapper;
import lxm.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public Test queryById(String id){
        return testMapper.selectByPrimaryKey(Integer.parseInt(id));
    }
}
