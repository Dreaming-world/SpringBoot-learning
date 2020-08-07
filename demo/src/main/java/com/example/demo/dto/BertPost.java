package com.example.demo.dto;

import java.util.Arrays;

/**
 * @author liuxiangfeng
 */
public class BertPost {
    private String query;
    private String[] compareList;

    public BertPost() {}

    public BertPost(String query, String[] compareList) {
        this.query = query;
        this.compareList =compareList;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String[] getCompareList() {
        return compareList;
    }

    public void setCompareList(String[] compareList) {
        this.compareList = compareList;
    }

    @Override
    public String toString() {
        return "BertPost{" +
                "query='" + query + '\'' +
                ", compareList=" + Arrays.toString(compareList) +
                '}';
    }
}
