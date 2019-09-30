package com.rabbit.samples.springi18n.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class I18NController {

    @RequestMapping("/i18n")
    public String i18n(){

        log.info("i18n page called");

        return "i18n";
    }

}
