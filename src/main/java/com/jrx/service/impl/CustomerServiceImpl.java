package com.jrx.service.impl;

import com.jrx.pojo.Customer;
import com.jrx.repository.CustomerMapper;

import com.jrx.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    public static final Logger log = LogManager.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询所有客户信息
     * @return
     */
    @Override
    public List<Customer> queryAllCustomer() {
        List<Customer> list = customerMapper.queryAllCustomer();
        return list;
    }

    /**
     * 根据id查询客户信息
     * @param id
     * @return
     */
    @Override
    public Customer queryCustomerById(int id) {
        log.info("根据id查询客户信息");
        Customer customer = customerMapper.queryCustomerById(id);
        return customer;
    }

    /**
     * 添加客户信息
     * @param map
     */
    @Override
    public void insertCustomer(Map<String, Object> map) {
        customerMapper.insertCustomer(map);
    }

    /**
     * 修改客户信息
     * @param map
     */
    @Override
    public void updateCustomer(Map<String, Object> map) {
        customerMapper.updateCustomer(map);
    }

    /**
     * 根据id删除客户信息
     * @param id
     */
    @Override
    public void deleteCustomerById(int id) {
        customerMapper.deleteCustomerById(id);

    }
}
