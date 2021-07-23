package lxm.controller;

import com.alibaba.fastjson.JSON;
import lxm.model.Test;
import lxm.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public Object test(@RequestParam("id") String id) {
        return testService.queryById(id);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@RequestBody Test test) {
        logger.info("test:{}", JSON.toJSONString(test));
        return "ok";
    }
}
