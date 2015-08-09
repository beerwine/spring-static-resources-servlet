package com.test.sr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Provides dynamically served content
 */
@Controller
public class InfoController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String getTestInfo() {
        return "Test info";
    }

    @RequestMapping(value = "/test/sub", method = RequestMethod.GET)
    public @ResponseBody String getTestSub() {
        return "Test SUB";
    }
}
