package com.ly.demo1.biz.share.impl;

import com.ly.demo1.biz.share.OrderService;
import com.ly.demo1.biz.share.converter.MemberConverter;
import com.ly.demo1.biz.share.vo.MemberVO;
import com.ly.demo1.dal.dao.MemberDAO;
import com.ly.demo1.dal.domain.Member;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by yk48631 on 2017/7/31.
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private MemberDAO memberDAO;

    @Override
    public boolean isValidOrder() {
        return false;
    }

    @Override
    public MemberVO findMemberById(Long id) {
        Member menberDO = memberDAO.findOne(1l);
        MemberVO memberVO = MemberConverter.convertFrom(menberDO);
        return memberVO;
    }

    public void setMemberDAO(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }
}
