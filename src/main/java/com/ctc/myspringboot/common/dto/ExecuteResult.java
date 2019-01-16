package com.ctc.myspringboot.common.dto;

import com.ctc.myspringboot.common.enums.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 返回结果封装
 *
 * @author ctc
 */
@ApiModel(description = "返回响应数据")
public class ExecuteResult<T> implements Serializable {

    private static final long serialVersionUID = -6862578677059993683L;
    @ApiModelProperty(value = "返回对象")
    private T result;
    @ApiModelProperty(value = "返回结果编码")
    private Integer code;
    @ApiModelProperty(value = "返回结果信息")
    private String resultMessage;
    @ApiModelProperty(value = "错误信息")
    private List<String> errorMessages = new ArrayList<String>();

    public ExecuteResult() {
        this.code = ResponseCode.Res_Success.getCode();
    }

    public boolean isSuccess() {
        return this.errorMessages.isEmpty();
    }

    public static ExecuteResult<String> ok() {
        return ok(ResponseCode.Res_Success.getLabel(), null);
    }

    public static <T> ExecuteResult<T> ok(T data) {
        return ok(data, null);
    }


    public static <T> ExecuteResult<T> ok(T data, String resultMsg) {
        ExecuteResult<T> result = new ExecuteResult<>();
        result.setCode(ResponseCode.Res_Success.getCode());
        result.setResult(data);
        result.setResultMessage(resultMsg);
        return result;
    }

    public static <T> ExecuteResult<T> fail(String errorMsg) {
        return fail(ResponseCode.Res_Fail, errorMsg);
    }

    public static <T> ExecuteResult<T> fail(ResponseCode code, String errorMsg) {
        ExecuteResult<T> result = new ExecuteResult<>();
        result.addErrorMsg(code, errorMsg);
        return result;
    }

    public void setErrorMessages(ResponseCode code, List<String> errorMessages) {
        this.code = (code == null ? ResponseCode.Custom.getCode() : code.getCode());
        this.errorMessages = errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.code = ResponseCode.Res_Fail.getCode();
        this.errorMessages = errorMessages;
    }

    public void addErrorMsg(String errorMsg) {
        this.code = ResponseCode.Res_Fail.getCode();
        this.errorMessages.add(errorMsg);
    }

    public void addErrorMsg(ResponseCode code, String errorMsg) {
        this.code = (code == null ? ResponseCode.Custom.getCode() : code.getCode());
        this.errorMessages.add(errorMsg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }


    public String getResultMessage() {
        return this.resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public List<String> getErrorMessages() {
        return this.errorMessages;
    }
}