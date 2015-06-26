package com.tallgeorge.color.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.webjars.RequireJS;
/**
 * Created by campbelg on 6/25/15.
 */

@Controller
public class WebJarsController {

    @ResponseBody
    @RequestMapping(value = "/webjarsjs", produces = "application/javascript")
    public String webjarJs() {
        return RequireJS.getSetupJavaScript("/webjars/");
    }

}

