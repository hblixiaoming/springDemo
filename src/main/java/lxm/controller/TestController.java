package lxm.controller;

import lxm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public Object test(@RequestParam("id") String id) {
        return testService.queryById(id);
    }
}
