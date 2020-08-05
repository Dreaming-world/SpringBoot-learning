package com.example.demo.algorithms;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuxiangfeng
 */
@Component
public class AlgorithmsSet {

    private Map<String,AlgorithmsInterface> algorithmsInterfaceMap = new HashMap<>();

    public AlgorithmsSet(List<AlgorithmsInterface> algorithmsInterfaceList) {

        for (AlgorithmsInterface algorithmsInterface : algorithmsInterfaceList) {
            String modelName = algorithmsInterface.getName();
            algorithmsInterfaceMap.put(modelName, algorithmsInterface);

        }

    }

    public AlgorithmsInterface getAlgorithm(String modelName) {
        AlgorithmsInterface algorithmsInterface = algorithmsInterfaceMap.get(modelName);
        if (algorithmsInterface == null) {
            throw new NullPointerException(String.format("不支持的相似度算法%s", modelName));
        } else {
            return algorithmsInterface;
        }
    }

}
