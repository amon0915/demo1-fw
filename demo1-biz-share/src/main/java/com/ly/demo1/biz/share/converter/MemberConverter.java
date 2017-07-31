package com.ly.demo1.biz.share.converter;

import com.ly.demo1.biz.share.vo.MemberVO;
import com.ly.demo1.dal.domain.Member;

/**
 * Created by yk48631 on 2017/7/31.
 */
public class MemberConverter {
    public static MemberVO convertFrom(Member memberDO) {
        MemberVO memberVO = new MemberVO();
        memberVO.setId(memberDO.getId());
        memberVO.setMenberId(memberDO.getMemberId());
        return memberVO;
    }
}
