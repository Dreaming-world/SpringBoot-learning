package com.example.demo.dto;

import java.util.Arrays;

/**
 * @author liuxiangfeng
 */
public class ResponseBert {
    private Integer code;
    private String message;
    private double[] scores;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseBert{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
