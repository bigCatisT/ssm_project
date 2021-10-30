package com.ssm.base.service.impl;

import com.ssm.utils.PageBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BaseTestCase {

    protected PageBean pageBean;

    @Before
    public void setUp(){
         pageBean=new PageBean();
    }


}
