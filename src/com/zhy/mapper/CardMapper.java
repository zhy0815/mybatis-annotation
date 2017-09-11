package com.zhy.mapper;

import org.apache.ibatis.annotations.Select;

import com.zhy.model.Card;

public interface CardMapper {
	@Select("select * from tb_card where id=#{id}")
	Card selectCardById(int id);
}
