package com.bigapple.reptiles.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
@Slf4j
public class PropertiesUtils {
    private Properties properties;

    @PostConstruct
    private void loadProperties(){
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream ins = classloader.getResourceAsStream("variable.properties");
        properties = new Properties();
        try {
            properties.load(ins);
        } catch (IOException e) {
            log.error("加载variable.properties文件异常{}",e.getMessage());
        }
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

    public Properties buildProperties(String[] keys, Object[] values){
        Properties properties = new Properties();
        for (int i = 0; i < keys.length; i++) {
            properties.put(keys[i], values[i]);
        }
        return properties;
    }
}
