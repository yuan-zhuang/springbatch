package com.jrx.service;

import com.jrx.pojo.TransactionDetail;

import java.util.List;
import java.util.Map;

public interface TransactionDetailService {

    //查询所有交易信息
    public List<TransactionDetail> queryAllTransaction();

    //根据id查询交易信息
    public TransactionDetail queryTransactionById(int id);

    //添加交易信息
    public void insertTransaction(Map<String,Object> map);

    //修改交易信息
    public void updateTransaction(Map<String,Object> map);

    //根据id删除交易信息
    public void deleteTransaction(int id);

    //根据客户id删除和此客户所有的交易信息
    public void deleteTransactionByCustomerId(int id);

    public List<Map> countMonth(int id);
}
