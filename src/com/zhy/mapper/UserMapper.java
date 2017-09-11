package com.zhy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zhy.model.User;

public interface UserMapper {
	@Insert("insert into tb_user(name,sex,age) values(#{name},#{sex},#{age})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	int saveUser(User user);
	@Delete("delete from tb_user where id=#{id}")
	int removeUser(@Param("id") Integer id);
	@Update("update tb_user set name=#{name},sex=#{sex},age=#{age} where id=#{id}")
	void updateUser(User user);
	@Select("select * from tb_user where id=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="sex",property="sex"),
		@Result(column="age",property="age")
	})
	User selectUserById(int id);
	@Select("select * from tb_user")
	List<User> selectAllUser();
}
