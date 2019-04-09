package com.sanmei.util;

import java.io.Serializable;
import java.util.Map;

/**
 * create by: yumiao
 * create time: 15:29 2019/4/9
 * description:
 */
public class Response<T> implements Serializable {
    private boolean success;
    private String error;
    private T result;
    private String pageId;

    private Map<String,Object> Message;

    public boolean isSuccess() {
        return success;
    }

    private void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public Response<T> setError(String error) {
        this.setSuccess(false);
        this.error = error;
        return this;
    }

    public T getResult() {
        return result;
    }

    public Response<T> setResult(T result) {
        this.setSuccess(true);
        this.result = result;
        return this;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public Map<String, Object> getMessage() {
        return Message;
    }

    public void setMessage(Map<String, Object> message) {
        Message = message;
    }
}
