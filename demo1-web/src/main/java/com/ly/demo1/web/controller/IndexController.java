package com.ly.demo1.web.controller;

import com.ly.demo1.biz.order.BizService;
import com.ly.demo1.web.controller.dto.IndexDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yk48631 on 2017/7/31.
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Resource
    BizService bizService;

    @RequestMapping("/index")
    public IndexDTO indexPage() {
        String val = bizService.myBiz();
        boolean check = bizService.checkOrder();
        IndexDTO indexDTO = new IndexDTO();
        indexDTO.setAppName("demo1");
        indexDTO.setOwner("yk");
        indexDTO.setDescription("hello world, " + val + "," + check);
        return indexDTO;
    }
}
