package com.didiglobal.sds.web.test.dao;

import com.didiglobal.sds.web.dao.PointReturnValueDao;
import com.didiglobal.sds.web.dao.bean.PointReturnValueDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yizhenqiang on 18/2/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PointReturnValueDaoTest {

    @Autowired
    private PointReturnValueDao pointReturnValueDao;


    @Test
    public void addPointReturnValueTest() {

        PointReturnValueDO pointReturnValueDO = new PointReturnValueDO();

        pointReturnValueDO.setAppGroupName("htw");
        pointReturnValueDO.setAppName("易振强测试");
        pointReturnValueDO.setPoint("testPoint");
        pointReturnValueDO.setStatus(1);
        pointReturnValueDO.setReturnValueStr("abc-json");
        pointReturnValueDO.setOperatorName("yizhenqiang");
        pointReturnValueDO.setOperatorEmail("yizhenqiang@didichuxing.com");
        pointReturnValueDO.setCreatorName("yizhenqiang");
        pointReturnValueDO.setCreatorEmail("yizhenqiang@didichuxing.com");

        pointReturnValueDao.addPointReturnValue(pointReturnValueDO);
    }


    @Test
    public void updatePointReturnValueTest() {

        pointReturnValueDao.updatePointReturnValue("htw", "易振强测试", "testPoint",
                "new-abc-json", 0, "yizhenqiang", "yizhenqiang@didichuxing.com");
    }


    @Test
    public void deletePointReturnValueTest() {

        pointReturnValueDao.deletePointReturnValue("htw", "易振强测试", "testPoint");
    }

    @Test
    public void queryPointReturnValueByPageTest() {
        System.out.println(
                pointReturnValueDao.queryPointReturnValueByPage("hm", "yzq-dubbo1", "sdfsdf", "sdfsdf", 0, 10));
    }

}
