package com.example.demo.dto;

/**
 * 演示如何读取配置文件文件
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liuxiangfeng
 */

@Component
@PropertySource("classpath:esconfig.properties")  // 文件的地址
@ConfigurationProperties(prefix = "elasticsearch")
public class GetEsConfig {

    private String host;
    private Integer port;
    private Cluster cluster;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "GetEsConfig{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", cluster=" + cluster +
                '}';
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    public Cluster getCluster() {
        return this.cluster;
    }

    public static class Cluster {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cluster{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
