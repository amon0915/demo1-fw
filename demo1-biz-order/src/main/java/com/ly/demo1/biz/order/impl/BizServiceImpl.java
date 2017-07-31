package com.ly.demo1.biz.order.impl;

import com.ly.demo1.biz.order.BizService;
import com.ly.demo1.biz.share.OrderService;
import com.ly.demo1.biz.share.vo.MemberVO;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yk48631 on 2017/7/31.
 */

@Service
public class BizServiceImpl implements BizService {

    @Resource
    OrderService orderService;

    @Override
    public String myBiz() {
        MemberVO memberVO = orderService.findMemberById(1l);
        return ReflectionToStringBuilder.toString(memberVO);
    }

    @Override
    public boolean checkOrder() {
        return orderService.isValidOrder();
    }
}
