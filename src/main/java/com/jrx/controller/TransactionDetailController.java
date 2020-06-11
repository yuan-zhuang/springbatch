package com.jrx.controller;

import com.jrx.pojo.Customer;
import com.jrx.pojo.Statistics;
import com.jrx.pojo.TransactionDetail;
import com.jrx.service.CustomerService;
import com.jrx.service.StatisticsService;
import com.jrx.service.TransactionDetailService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TransactionDetailController {

    public static final Logger log = LogManager.getLogger(TransactionDetailController.class);

    @Autowired
    private CustomerService customerService;

    @Autowired
    private StatisticsService statisticsService;

    @Autowired
    private TransactionDetailService transactionDetailService;

    /**
     * 查询所有交易信息
     * @return
     */
    @GetMapping("queryAllTransaction")
    @ApiOperation("查询所有交易信息")
    public List<TransactionDetail> queryAllTransaction(){
        List<TransactionDetail> list = transactionDetailService.queryAllTransaction();
        return list;
    }

    /**
     * 根据id查询交易信息
     * @param id
     * @return
     */
    @GetMapping("queryTransactionById/{id}")
    @ApiOperation("根据id查询交易信息")
    public TransactionDetail queryTransactionById(@ApiParam("交易信息id") @PathVariable int id){
        TransactionDetail transactionDetail = transactionDetailService.queryTransactionById(id);
        System.out.println(transactionDetail);
        return transactionDetail;
    }

    /**
     * 添加交易信息
     * 统计客户日交易信息
     * @param cust_id
     * @param account
     * @param card_nbr
     * @param tranno
     * @param month_nbr
     * @param bill
     * @param trans_type
     * @param txn_datetime
     */
    @GetMapping("insertTransaction")
    @ApiOperation("添加交易信息")
    public void insertTransaction(int cust_id, String account, String card_nbr, int tranno, int month_nbr, BigDecimal bill, String trans_type, String txn_datetime){
        Customer customer = customerService.queryCustomerById(cust_id);
        String[] arr = txn_datetime.split("\\ ");
        Map<String, Object> map = new HashMap<>();
        map.put("cust_id",cust_id);
        map.put("account",account);
        map.put("card_nbr",card_nbr);
        map.put("tranno",tranno);
        map.put("month_nbr",month_nbr);
        map.put("bill",bill);
        map.put("trans_type",trans_type);
        map.put("txn_datetime",txn_datetime);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("cust_id",cust_id);
        map1.put("txn_datetime",txn_datetime);
        transactionDetailService.insertTransaction(map);
        Statistics statistics = statisticsService.queryByIdAndDate(map1);
        if(statistics == null){
            String s_index = "uuid-"+txn_datetime;
            String trans_date = arr.toString();
            String surname = customer.getSurname();
            BigDecimal tran_max_amt = bill;
            BigDecimal pay_amt = BigDecimal.valueOf(0.00);
            int tran_cnt = 1;
            int pay_cnt = 0;
            BigDecimal tran_amt = bill;
            Map<String, Object> map2 = new HashMap<>();
            map2.put("s_index", s_index);
            map2.put("cust_id",cust_id);
            map2.put("update_time",txn_datetime);
            map2.put("trans_date", trans_date);
            map2.put("surname", surname);
            map2.put("tran_max_amt", tran_max_amt);
            map2.put("pay_amt",pay_amt);
            map2.put("stran_cnt", tran_cnt);
            map2.put("pay_cnt",pay_cnt);
            map2.put("tran_amt", tran_amt);
           statisticsService.insertStatistics(map2);
        }else {
            Map<String, Object> map3 = new HashMap<>();
            String trans_date = arr.toString();
            BigDecimal tran_max_amt = statistics.getTran_max_amt();
            if(tran_max_amt.compareTo(bill)<0){
                 tran_max_amt = bill;
            }
            BigDecimal pay_amt = BigDecimal.valueOf(0.00);
            int tran_cnt = statistics.getTran_cnt() + 1;
            int pay_cnt = 0;
            BigDecimal tran_amt = statistics.getTram_amt().add(bill);
            map3.put("update_time",txn_datetime);
            map3.put("trans_date",trans_date);
            map3.put("tran_max_amt",tran_max_amt);
            map3.put("pay_amt",pay_amt);
            map3.put("tran_cnt",tran_cnt);
            map3.put("pay_cnt",pay_cnt);
            map3.put("tran_amt",tran_amt);
           statisticsService.updateStatistics(map3);
        }

    }

    /**
     * 修改交易信息
     * @param cust_id
     * @param account
     * @param card_nbr
     * @param tranno
     * @param month_nbr
     * @param bill
     * @param trans_type
     * @param txn_datetime
     */
    @GetMapping("updateTransaction")
    @ApiOperation("修改交易信息")
    public void updateTransaction(int cust_id, String account, String card_nbr, int tranno, int month_nbr, BigDecimal bill, String trans_type, String txn_datetime){

        Map<String, Object> map = new HashMap<>();
        map.put("cust_id",cust_id);
        map.put("account",account);
        map.put("card_nbr",card_nbr);
        map.put("tranno",tranno);
        map.put("month_nbr",month_nbr);
        map.put("bill",bill);
        map.put("trans_type",trans_type);
        map.put("txn_datetime",txn_datetime);
        transactionDetailService.updateTransaction(map);
    }

    /**
     * 删除交易信息
     * @param id
     */
    @GetMapping("deleteTransaction/{id}")
    @ApiOperation("删除交易信息")
    public void deleteTransaction(@ApiParam("交易信息id") @PathVariable int id){
        transactionDetailService.deleteTransaction(id);
    }

    /**
     * 根据客户id删除和此客户所有的交易信息
     * @param id
     */
    @GetMapping("deleteTransactionByCustomerId/{id}")
    @ApiOperation("根据客户id删除和此客户所有的交易信息")
    public void deleteTransactionByCustomerId(@ApiParam("客户id") @PathVariable int id){
        transactionDetailService.deleteTransactionByCustomerId(id);
    }

    @GetMapping("/countMonth")
    @ResponseBody
    public List<Map> countMonth(int id){
        log.info("查询没月消费笔数");
        List<Map> list = transactionDetailService.countMonth(id);
        System.out.println(list);
        return list;
    }

    @GetMapping("/bar")
    public String show2(){
        return "bar";
    }
}
