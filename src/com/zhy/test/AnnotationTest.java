package com.zhy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zhy.mapper.ClazzMapper;
import com.zhy.mapper.OrderMapper;
import com.zhy.mapper.PersonMapper;
import com.zhy.mapper.UserMapper;
import com.zhy.model.Clazz;
import com.zhy.model.Order;
import com.zhy.model.Person;
import com.zhy.model.User;

public class AnnotationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		UserMapper um=session.getMapper(UserMapper.class);
		/*--@insert:--
		User user=new User("笨蛋", "男", 24);
		um.saveUser(user);
		System.out.println(user.getId());*/
		/*--@delete:--
		System.out.println(um.removeUser(11));*/
		/*--@update:--
		User user=new User("傻瓜", "男", 34);
		user.setId(10);
		um.updateUser(user);*/
		/*--@select:--
		System.out.println(um.selectUserById(10));
		List<User> users=um.selectAllUser();
		System.out.println(users+"/n");*/
		/*OneToOne:
		PersonMapper pm=session.getMapper(PersonMapper.class);
		Person p=pm.selectPersonById(1);
		System.out.println(p);*/
		/*OneToMany:
		ClazzMapper cm=session.getMapper(ClazzMapper.class);
		Clazz clazz=cm.selectById(2);
		System.out.println(clazz);
		clazz.getStudents().forEach(student->System.out.print(student));*/
		/*ManyToMany:*/
		OrderMapper om=session.getMapper(OrderMapper.class);
		Order order=om.selectById(1);
		System.out.println(order.getId()+";"+order.getCode()+";"+order.getTotal());
		System.out.println("---------");
		System.out.println(order.getCustomer());
		order.getArticles().forEach(article->System.out.println(article));
		session.commit();
		session.close();
	}

}
