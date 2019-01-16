package com.ctc.myspringboot.config;

import com.ctc.myspringboot.common.dto.ValidateResult;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 全局Hibernate validate 异常配置
 * 自定义验证格式返回
 * @author ctc
 * @date 2018-12-28 11:01
 */
@RestControllerAdvice
public class GlobalValidationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ValidateResult validationErrorHandler(MethodArgumentNotValidException ex) {
        // 同样是获取BindingResult对象，然后获取其中的错误信息
        // 如果前面开启了fail_fast，事实上这里只会有一个信息
        //如果没有，则可能又多个
        List<String> errorInformation = ex.getBindingResult().getAllErrors()
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());
        return ValidateResult.erros(errorInformation);
    }


    @ExceptionHandler(ConstraintViolationException.class)
    public ValidateResult validationErrorHandler(ConstraintViolationException ex) {
        List<String> errorInformation = ex.getConstraintViolations()
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toList());
        return ValidateResult.erros(errorInformation);
    }

    @ExceptionHandler(BindException.class)
    public ValidateResult bindExceptionHandler(BindException ex) {
        List<String> errorInformation = ex.getAllErrors()
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());
        return ValidateResult.erros(errorInformation);
    }
}

