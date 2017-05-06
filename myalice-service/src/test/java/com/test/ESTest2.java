package com.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.myalice.MyAliceSpringConfig;
import com.myalice.services.ESQuestionService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration( classes = MyAliceSpringConfig.class )
public class ESTest2 {

    
    @Autowired
    ESQuestionService questionService ;

    @Test
    public void test01(){
    	Map<String,Object> data = new HashMap<>();
    	data.put("title", "如何开始学习Mycat"); 
    	data.put("state", "1");
    	questionService.add(data);
    }
}
