package com.jrx.repository;

import com.jrx.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

/**
 * 定义操作客户信息的持久层接口
 */
@Mapper
@Repository
public interface CustomerMapper {

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
