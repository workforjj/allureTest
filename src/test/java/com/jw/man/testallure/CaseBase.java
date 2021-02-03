package com.jw.man.testallure;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @program: testallure
 * @description: 基础测试类
 * @author: jianjianL
 * @create: 2021-02-02 16:35
 **/
@SpringBootTest(classes = TestallureApplication.class)
@WebAppConfiguration
@Slf4j
@Data
public class CaseBase extends AbstractTestNGSpringContextTests {
}
