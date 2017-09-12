package com.zhy.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.zhy.model.Order;

public interface OrderMapper {
	@Select("select * from tb_order where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="code",property="code"),
		@Result(column="total",property="total"),
		@Result(column="customer_id",property="customer",
		one=@One(select="com.zhy.mapper.CustomerMapper.selectById",fetchType=FetchType.LAZY)),
		@Result(column="id",property="articles",
		many=@Many(select="com.zhy.mapper.ArticleMapper.selectByOrderId",fetchType=FetchType.LAZY))
	})
	Order selectById(int id);
}
