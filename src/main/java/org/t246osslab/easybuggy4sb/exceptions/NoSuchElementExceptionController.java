package org.t246osslab.easybuggy4sb.exceptions;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.t246osslab.easybuggy4sb.Config;

@Controller
public class NoSuchElementExceptionController {

    @RequestMapping(value = Config.APP_ROOT + "/nsee")
    public void process() {
        new ArrayList<String>().iterator().next();
    }
}
