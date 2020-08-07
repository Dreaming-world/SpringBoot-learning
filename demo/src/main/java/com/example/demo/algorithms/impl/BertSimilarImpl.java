package com.example.demo.algorithms.impl;

import com.example.demo.algorithms.AlgorithmsInterface;
import com.example.demo.dto.BertPost;
import com.example.demo.dto.ResponseBert;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuxiangfeng
 */
@Service("bert")
public class BertSimilarImpl implements AlgorithmsInterface {

    public static final String MODEL_NAME = "bert";

    private final RestTemplate restTemplate;

    public BertSimilarImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getName() {
        return MODEL_NAME;
    }

    @Override
    public double[] similarScores(String query, String[] compareList) {
        Integer id = 1;
        System.out.println(get(1));
        return new double[0];
    }

    private ResponseBert get(Integer id) {
        BertPost bertPost = new BertPost();
        String[] compareList = {"hello","hello"};
        String query = "hello";
//        bertPost.setCompareList(compareList);
        bertPost.setQuery(query);
        return restTemplate.postForObject("http://127.0.0.1:5000/hello",bertPost, ResponseBert.class);
    }
}
