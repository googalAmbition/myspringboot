package com.ctc.myspringboot.common.dto;

import java.util.List;

/**
 * @author ctc
 * @date 2018-12-28 16:04
 */
public class ValidateResult {

    private List<String> errorMsg;
    private Boolean success = false;


    public ValidateResult(List<String> msg) {
        this.errorMsg = msg;
    }

    public static ValidateResult erros(List<String> msg) {
        return new ValidateResult(msg);
    }


    public List<String> getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(List<String> errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}

