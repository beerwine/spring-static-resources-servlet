package com.test.sr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String getInfo() {
        return "<h1>Generated page</h1>"
                + "Visit <a href=\"html/index.html\">static page</a>";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String getTestInfo() {
        return "Test info";
    }

    @RequestMapping(value = "/test/sub", method = RequestMethod.GET)
    public @ResponseBody String getTestSub() {
        return "Test SUB";
    }
}
