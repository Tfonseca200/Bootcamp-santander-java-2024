package com.dio.my_first_api.handler;


import java.util.Date;

public class ResponseError {

    private Date timeStamp = new Date() ;
    private  String status = "error";
    private int statusCode = 400;
    private String erro;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return erro;
    }

    public void setError(String erro) {
        this.erro = erro;
    }
}

