package com.itmad.study.cloud.provider.api.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Gabriel.Ge on 2017-02-28.
 */
@XmlRootElement(name = "baseResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseResponse<T> {
    @XmlElement(name = "code")
    private int code = 0;
    @XmlElement(name = "msg")
    private String message = "success";
    @XmlElement(name = "elapsedTime")
    private long elapsedTime;
    @XmlElement(name = "data")
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }
}
