package com.example.demo;

import com.example.demo.dto.GetEsConfig;
import org.apache.catalina.Cluster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private GetEsConfig getEsConfig;

    @Test
    void contextLoads() {
    }

    @Test
    public  void testEsConfig() {
        GetEsConfig.Cluster cluster = getEsConfig.getCluster();
        String name = cluster.getName();
        System.out.println(name);

        System.out.println(getEsConfig);

    }

}
