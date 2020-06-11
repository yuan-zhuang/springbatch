package com.jrx.service.impl;

import com.jrx.pojo.TransactionDetail;
import com.jrx.repository.TransactionDetailMapper;
import com.jrx.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService {

    @Autowired
    private TransactionDetailMapper transactionDetailMapper;

    /**
     * 查询所有交易信息
     */
    @Override
    public List<TransactionDetail> queryAllTransaction() {
        List<TransactionDetail> list = transactionDetailMapper.queryAllTransaction();
        return list;
    }

    /**
     * 根据id查询交易信息
     * @param id
     * @return
     */
    @Override
    public TransactionDetail queryTransactionById(int id) {
        TransactionDetail transactionDetail = transactionDetailMapper.queryTransactionById(id);
        System.out.println(transactionDetail);
        return transactionDetail;
    }

    /**
     * 添加交易信息
     * @param map
     */
    @Override
    public void insertTransaction(Map<String, Object> map) {
        transactionDetailMapper.insertTransaction(map);
    }

    /**
     * 修改交易信息
     * @param map
     */
    @Override
    public void updateTransaction(Map<String, Object> map) {
        transactionDetailMapper.updateTransaction(map);
    }

    /**
     * 根据id删除交易信息
     * @param id
     */
    @Override
    public void deleteTransaction(int id) {
        transactionDetailMapper.deleteTransaction(id);

    }

    /**
     * 根据客户id删除和此客户所有的交易信息
     * @param id
     */
    @Override
    public void deleteTransactionByCustomerId(int id) {
        transactionDetailMapper.deleteTransactionByCustomerId(id);
    }

    @Override
    public List<Map> countMonth(int id) {
        List<Map> list = transactionDetailMapper.countMonth(id);
        return list;
    }
}
