package com.rabbit.samples.springi18n.controllers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Getter
@RestController
public class RestI18NController {

    MessageSource messageSource;

    public RestI18NController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping(value = "/greeting")
    public String greeting() {

        log.info("Greeting REST API called");

        /**
         *   @LocaleContextHolder.getLocale()
         *  Return the Locale associated with the given user context,if any, or the system default Locale otherwise.
         *  This is effectively a replacement for Locale.getDefault(), able to optionally respect a user-level Locale setting.
         */
        return getMessageSource().getMessage("welcome.message", null, LocaleContextHolder.getLocale());
    }

}
