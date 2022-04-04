package com.tedu.test;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.tedu.bean.EmpBean;
import com.tedu.mapper.EmpMapper;

public class TestMapper {
	//在开发中，编写的测试代码的方法名建议和需要测试的方法名称一致
	@Test
	public void selectEmpById() {
		InputStream in = TestMapper.class.getClassLoader().getResourceAsStream("mybatis-configs.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		//这个返回值sqlSession可以认为是Connection statement
		SqlSession session = sessionFactory.openSession();
		System.out.println(session);
		//得到这个接口类型的实体对象
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectAllEmp();
		for(EmpBean bean : list) {
			System.out.println(bean);
		}
	}
}
