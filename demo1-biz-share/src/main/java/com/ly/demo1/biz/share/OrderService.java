package com.ly.demo1.biz.share;

import com.ly.demo1.biz.share.vo.MemberVO;

/**
 * Created by yk48631 on 2017/7/31.
 */
public interface OrderService {
    public boolean isValidOrder();
    public MemberVO findMemberById(Long id);
}
