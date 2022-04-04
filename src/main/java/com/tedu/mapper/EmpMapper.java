package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.EmpBean;

//dao mapper的接口类
public interface EmpMapper {
	//查询所有数据
	public List<EmpBean> selectAllEmp();
}
