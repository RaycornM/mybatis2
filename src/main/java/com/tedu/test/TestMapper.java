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
	//�ڿ����У���д�Ĳ��Դ���ķ������������Ҫ���Եķ�������һ��
	@Test
	public void selectEmpById() {
		InputStream in = TestMapper.class.getClassLoader().getResourceAsStream("mybatis-configs.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		//�������ֵsqlSession������Ϊ��Connection statement
		SqlSession session = sessionFactory.openSession();
		System.out.println(session);
		//�õ�����ӿ����͵�ʵ�����
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectAllEmp();
		for(EmpBean bean : list) {
			System.out.println(bean);
		}
	}
}
