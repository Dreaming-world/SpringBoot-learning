package com.example.demo.algorithms.impl;

import com.example.demo.algorithms.AlgorithmsInterface;
import org.springframework.stereotype.Service;

/**
 * @author liuxiangfeng
 */
@Service("CWV")
public class CharWvSimilarImpl implements AlgorithmsInterface {

    public static final String MODEL_NAME = "CWV";

    @Override
    public String getName() {
        return MODEL_NAME;
    }

    @Override
    public double[] similarScores(String query, String[] compareList) {
        double[] queryVec = getSentenceVec(query);
        double[][] compareListVec = getSentencesVec(compareList);

        double[] scores = new double[compareList.length];

        return scores;
    }

    private double[] getSentenceVec(String sentence) {
        double[] sentenceVec = {1, 2, 3};
        return sentenceVec;
    }

    private double[][] getSentencesVec(String[] sentences) {
        double[][] sentencesVec = new double[sentences.length][3];
        for (int i = 0; i < sentences.length; i++) {
            double[] sentenceVec = getSentenceVec(sentences[i]);
            for (int j = 0; j < sentenceVec.length; j++) {
                sentencesVec[i][j] = sentenceVec[j];
            }

        }
        return sentencesVec;
    }


}
