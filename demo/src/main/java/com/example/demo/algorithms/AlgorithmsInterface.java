package com.example.demo.algorithms;

/**
 * @author liuxiangfeng
 */
public interface AlgorithmsInterface {

    /** 算法名字
     * @return 每一个算法的名字
     */
    String getName();

    /** 返回相似度的得分
     * @param query 输入
     * @param compareList
     * @return 返回一组得分
     */
    double[] similarScores (String query, String[] compareList);
}
