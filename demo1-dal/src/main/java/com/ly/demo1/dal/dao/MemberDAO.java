package com.ly.demo1.dal.dao;

import com.ly.demo1.dal.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by yk48631 on 2017/7/31.
 */

@Component
@Mapper
public interface MemberDAO {
    @Select("select * from member where id=#{id}")
    Member findOne(Long id);
}
