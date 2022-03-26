package pro.gsilva.catalogo.controller;

import lombok.extern.slf4j.Slf4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
@Slf4j
public class ControllerAdviceConfig {

    final static Logger log = LogManager.getLogger(ControllerAdviceConfig.class);
    @ExceptionHandler(Exception.class)
    public String handle500Error(Exception ex) {
        log.error(ex.getMessage(), ex);
        return "error-500";
    }

    @ExceptionHandler(AccessDeniedException.class)
    public String handleAccessDenied(AccessDeniedException ex) {
        log.info("Acesso negado");
        return "error-401";
    }
}
