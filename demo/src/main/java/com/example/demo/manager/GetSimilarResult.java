package com.example.demo.manager;

/**
 * @author liuxiangfeng
 */
public class GetSimilarResult {

    public void getSimilarResult() {
    }

    /**针对客服机器人，从一组数据中，获得对应的最大值以及最佳的答案
     * @param scores 得分
     * @param compareList 句子集合
     * @return 返回最大值以及最佳答案
     */
    public String[] getMaxScoreQa(double[] scores, String[] compareList) {
        String[] maxScoreQa = new String[2];
        double maxScore = scores[0];
        int maxIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxIndex) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }
        String bestQa = compareList[maxIndex];
        maxScoreQa[0] = Double.toString(maxScore);
        maxScoreQa[1] = bestQa;
        return maxScoreQa;

    }

}
