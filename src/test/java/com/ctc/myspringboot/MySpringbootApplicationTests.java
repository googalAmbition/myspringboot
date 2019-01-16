package com.ctc.myspringboot;

import com.ctc.myspringboot.dao.dict.DictTypeMapper;
import com.ctc.myspringboot.model.dict.DictType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringbootApplicationTests {


    @Autowired
    private DictTypeMapper dictTypeMapper;

    @Test
    public void test(){
        DictType info = dictTypeMapper.selectById(1);
        System.out.println(info);
    }

}

