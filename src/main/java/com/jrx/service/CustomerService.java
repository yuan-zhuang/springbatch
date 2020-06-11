package com.jrx.service;

import com.jrx.pojo.Customer;
import java.util.List;
import java.util.Map;

/**
 * 定义操作客户信息Service接口
 */
public interface CustomerService {

    //查询所有客户
    public List<Customer> queryAllCustomer();

    //根据id查询
    public Customer queryCustomerById(int id);

    //添加客户
    public void insertCustomer(Map<String, Object> map);

    //修改客户信息
    public void updateCustomer(Map<String, Object> map);

    //删除客户
    public void deleteCustomerById(int id);
}
