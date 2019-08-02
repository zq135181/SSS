package cn.itsource.aibuy.controller;

import cn.itsource.aibuy.domain.Brand;
import cn.itsource.aibuy.query.BrandQuery;
import cn.itsource.aibuy.service.IBrandService;
import cn.itsource.basic.util.PageList;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandControllerTest {
    @Autowired
    private IBrandService brandService;

    @Test
    public void json() {
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.setPageNum(1);
        brandQuery.setPageSize(10);
        PageList<Brand> brandPageList = brandService.queryPage(brandQuery);


    }
}