package com.jw.man.testallure.model1;

import com.jw.man.testallure.CaseBase;
import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @program: testallure
 * @description:
 * @author: jianjianL
 * @create: 2021-02-02 16:39
 **/
@Slf4j
@Epic("第一级目录")
@Feature("第二级目录")
public class TestDemo1 extends CaseBase {


    @Story("Story类似三级目录")
    @Test(description = "测试用例2")
    @Description("Description注解：验证主页测试1")
    public void test(){
        log.info("success!");
    }
}
