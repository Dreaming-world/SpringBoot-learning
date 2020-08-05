package com.example.demo.algorithms.impl;

import com.example.demo.algorithms.AlgorithmsInterface;
import org.springframework.stereotype.Service;

/**
 * @author liuxiangfeng
 */
@Service("ES")
public class EqualSimilarImpl implements AlgorithmsInterface {

    public static final String MODEL_NAME = "ES";

    @Override
    public String getName() {
        return MODEL_NAME;
    }

    @Override
    public double[] similarScores(String query, String[] compareList) {
        double[] scores = new double[compareList.length];
        for (int i = 0; i < compareList.length; i++) {
            double score = pairSimilarScore(query, compareList[i]);
            scores[i] = score;
        }
        return scores;
    }

    private double pairSimilarScore(String sentenceA, String sentenceB) {
        if (sentenceA.equals(sentenceB)) {
            return 1.0;
        } else {
            return 0.0;
        }

    }
}
