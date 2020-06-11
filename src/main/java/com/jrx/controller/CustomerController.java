package com.jrx.controller;

import com.jrx.pojo.Customer;
import com.jrx.service.CustomerService;

import com.jrx.service.TransactionDetailService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private TransactionDetailService transactionDetailService;

    /**
     * 查询所有客户信息
     * @return
     */
    @GetMapping("/queryAllCustomer")
    @ApiOperation("查询所有客户信息")
    public List<Customer> queryAllCustomer(){
        List<Customer> list = customerService.queryAllCustomer();
        return list;
    }

    /**
     * 根据客户id查询客户信息
     * @param id
     * @return
     */
    @GetMapping("queryCustomerById/{id}")
    @ApiOperation("根据客户id查询客户信息")
    public Customer queryCustomerById(@ApiParam("客户id") @PathVariable int id){
        Customer customer = customerService.queryCustomerById(id);
        return customer;
    }

    /**
     * 添加客户信息
     * @param surname
     * @param gender
     * @param educa_des
     * @param mar_des
     * @param birthday
     * @param address
     */
    @GetMapping("insertCustomer")
    @ApiOperation("添加客户信息")
    public void insertCustomer(String surname,String gender,String educa_des,String mar_des,String birthday,String address){
        Map<String, Object> map = new HashMap<>();
        map.put("surname",surname);
        map.put("gender",gender);
        map.put("educa_des",educa_des);
        map.put("mar_des",mar_des);
        map.put("birthday",birthday);
        map.put("address",address);
        customerService.insertCustomer(map);
    }

    /**
     * 修改客户信息
     * @param surname
     * @param gender
     * @param educa_des
     * @param mar_des
     * @param birthday
     * @param address
     */
    @GetMapping("updateCustomer")
    @ApiOperation("修改客户信息")
    public void updateCustomer(String surname,String gender,String educa_des,String mar_des,String birthday,String address){
        Map<String, Object> map = new HashMap<>();
        map.put("surname",surname);
        map.put("gender",gender);
        map.put("educa_des",educa_des);
        map.put("mar_des",mar_des);
        map.put("birthday",birthday);
        map.put("address",address);
        customerService.updateCustomer(map);
    }
    /**
     * 删除客户信息
     * @param id
     */
    @GetMapping("deleteCustomerById/{id}")
    @ApiOperation("删除客户信息")
    public void deleteCustomerById(@ApiParam("客户id") @PathVariable int id){
        customerService.deleteCustomerById(id);
        transactionDetailService.deleteTransaction(id);
    }
}
