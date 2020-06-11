package com.jrx.repository;

import com.jrx.pojo.TransactionDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TransactionDetailMapper {

    public List<TransactionDetail> queryAllTransaction();

    public TransactionDetail queryTransactionById(int id);

    public List<Map> countMonth(int id);

    public void insertTransaction(Map<String, Object> map);

    public void updateTransaction(Map<String, Object> map);

    public void deleteTransaction(int id);

    public void deleteTransactionByCustomerId(int id);
}
