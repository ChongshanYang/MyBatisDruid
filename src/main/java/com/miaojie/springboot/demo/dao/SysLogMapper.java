package com.miaojie.springboot.demo.dao;

import com.miaojie.springboot.demo.model.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value="SysLogMapper")
public interface SysLogMapper {

    int insert(SysLog sysLog);

    int insertSelective(SysLog sysLog);
}