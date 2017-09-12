package com.zhy.mapper;

import org.apache.ibatis.annotations.Select;

import com.zhy.model.Customer;

public interface CustomerMapper {
	@Select("select * from tb_customer where id=#{id}")
	Customer selectById(int id);
}
