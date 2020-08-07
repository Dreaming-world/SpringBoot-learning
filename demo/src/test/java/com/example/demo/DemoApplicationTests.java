package com.example.demo;

import com.example.demo.algorithms.AlgorithmsInterface;
import com.example.demo.algorithms.AlgorithmsSet;
import com.example.demo.algorithms.impl.BertSimilarImpl;
import com.example.demo.dto.GetEsConfig;
import com.example.demo.manager.GetSimilarResult;
import org.apache.catalina.Cluster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private GetEsConfig getEsConfig;

    @Autowired
    private AlgorithmsSet algorithmsSet;

    @Test
    void contextLoads() {
    }

    @Test
    public  void testEsConfig() {
        GetEsConfig.Cluster cluster = getEsConfig.getCluster();
        String name = cluster.getName();
        System.out.println(name);
        System.out.println(getEsConfig.getHost());
        System.out.println(getEsConfig.getRobot());
        System.out.println(getEsConfig);

    }

    @Test
    public void testAlgorithm() {

        String[] comparesList = {"hello", "you"};
        String query = "hello";

        AlgorithmsInterface algorithmsInterface = algorithmsSet.getAlgorithm("ES");
        System.out.println(algorithmsInterface.getName());
        double[] scores = algorithmsInterface.similarScores(query, comparesList);
        System.out.println(Arrays.toString(scores));

        AlgorithmsInterface algorithmsInterface1 = algorithmsSet.getAlgorithm("CWV");
        System.out.println(algorithmsInterface1.getName());
        double[] scores1 = algorithmsInterface1.similarScores(query, comparesList);
        System.out.println(Arrays.toString(scores1));

    }

    @Test
    public void testGetSimilarResult() {
        double[] scores = {1.0, 2.0};
        String[] compareList = {"hello", "you"};
        GetSimilarResult getSimilarResult = new GetSimilarResult();
        String[] maxScoreQa = getSimilarResult.getMaxScoreQa(scores, compareList);
        System.out.println(Arrays.toString(maxScoreQa));

    }

    @Test
    public void testBert() {
        String[] comparesList = {"hello", "you"};
        String query = "hello";
        AlgorithmsInterface algorithmsInterface = algorithmsSet.getAlgorithm("bert");
        System.out.println(algorithmsInterface.getName());
        algorithmsInterface.similarScores(query, comparesList);

    }

}
