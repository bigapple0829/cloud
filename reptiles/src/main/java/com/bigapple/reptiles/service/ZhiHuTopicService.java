package com.bigapple.reptiles.service;

import com.bigapple.reptiles.utils.PropertiesUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author: xiongtao
 * @Date: 16/11/2018 2:36 PM
 * @Description: 爬取知乎的话题
 * @Email: xiongtao@juran.com.cn
 */
@Service
public class ZhiHuTopicService {

    @Autowired
    PropertiesUtils propertiesUtils;
    /**
     * 爬取知乎话题
     */
    public void getTopic(){
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(propertiesUtils.getProperty("zhihu.topics"));

        HttpResponse httpResponse = null;

        try {
            httpResponse = httpClient.execute(httpGet);

            HttpEntity entity = httpResponse.getEntity();
            String  data1 = EntityUtils.toString(entity, "gb2312");
            System.out.println(data1);

        } catch (IOException e) {
            e.printStackTrace();
        }








    }








}
