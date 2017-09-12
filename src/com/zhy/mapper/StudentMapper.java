package com.zhy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.zhy.model.Student;

public interface StudentMapper {
	@Select("select * from tb_student where class_id=#{id}")
	@Results({
		@Result(id=true,column="s_id",property="id"),
		@Result(column="s_name",property="name"),
		@Result(column="s_sex",property="sex"),
		@Result(column="s_age",property="age")
	})
	List<Student> selectByClazzId(int clazzId);
}
