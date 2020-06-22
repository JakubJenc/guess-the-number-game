package com.udemy.learnprogramming.util.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

@Slf4j
@Component
public class DecoupledLogicSetup {

    // == fields ==
    private final SpringResourceTemplateResolver templateResolver;

    // == constructors ==
    public DecoupledLogicSetup(SpringResourceTemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }

    // == init ==
    public void init() {
        templateResolver.setUseDecoupledLogic(true);
        log.info("Decoupled logic enabled");
    }
}
