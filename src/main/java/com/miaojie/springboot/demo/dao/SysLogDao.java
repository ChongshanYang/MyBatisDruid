package com.miaojie.springboot.demo.dao;

import com.miaojie.springboot.demo.model.SysLog;

/**
 * @author: miaojie
 * @date: 2018/05/17 22:09
 */
public interface SysLogDao {

    void saveSysLog(SysLog syslog);

    void test();

}
