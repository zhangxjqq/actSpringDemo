package com.zx.actSpringDemo;

import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 *
 * @author 爪哇张
 * &#064;date  2024/7/24
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:activiti-spring.xml")
public class ActSpringTest {

    @Resource
    private RepositoryService repositoryService;


    @Test
    public void testRep(){
        System.out.println(repositoryService);
    }

}
