package com.ctc.myspringboot.common.enums;

/**
 * 系统枚举
 *
 * @author lyf
 * @createDate 2018年12月11日
 */
public enum ResponseCode {

    Service_Error(101, "系统服务异常"), Res_Success(200, "处理完成"), Req_Param_Null(301, "请求参数缺失"), Req_Param_Error(302,
            "请求参数错误"), Res_Fail(401, "处理失败"), Res_Nullity(402, "用户失效"), Res_Auth(403, "权限受限"), Custom(900, "自定义");

    private int code;
    private String label;

    private ResponseCode(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getCode() {
        return code;
    }
}


