package com.zhy.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.zhy.model.Clazz;

public interface ClazzMapper {
	@Select("select * from tb_class where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="code",property="code"),
		@Result(column="id",property="students",
		many=@Many(select="com.zhy.mapper.StudentMapper.selectByClazzId",fetchType=FetchType.LAZY))
	})
	Clazz selectById(int id);
}	
