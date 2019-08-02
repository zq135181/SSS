package cn.itsource.basic.util;

public class AjaxResult {

    private boolean success=true;

    private String message;

    private Object restObj;

    private Integer errorCode;

    private AjaxResult(){}

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getRestObj() {
        return restObj;
    }

    public AjaxResult setRestObj(Object restObj) {
        this.restObj = restObj;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public AjaxResult setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return  this;
    }
}
