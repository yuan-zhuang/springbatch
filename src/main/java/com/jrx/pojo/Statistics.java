package com.jrx.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.sql.Date;

@ApiModel("每日交易类")
public class Statistics {
    @ApiModelProperty("索引项")
    private String s_index;

    @ApiModelProperty("客户号")
    private int cust_id;

    @ApiModelProperty("更新时间")
    private Date update_time;

    @ApiModelProperty("日期")
    private Date trans_date;

    @ApiModelProperty("客户姓名")
    private String surname;

    @ApiModelProperty("最大单交易金额")
    private BigDecimal tran_max_amt;

    @ApiModelProperty("当天还款总金额")
    private BigDecimal pay_amt;

    @ApiModelProperty("当天消费笔数")
    private int tran_cnt;

    @ApiModelProperty("当天还款笔数")
    private int pay_cnt;

    @ApiModelProperty("当天交易总金额")
    private BigDecimal tram_amt;

    public Statistics() {
    }

    public Statistics(String s_index, int cust_id, Date update_time, Date trans_date, String surname, BigDecimal tran_max_amt, BigDecimal pay_amt, int tran_cnt, int pay_cnt, BigDecimal tram_amt) {
        this.s_index = s_index;
        this.cust_id = cust_id;
        this.update_time = update_time;
        this.trans_date = trans_date;
        this.surname = surname;
        this.tran_max_amt = tran_max_amt;
        this.pay_amt = pay_amt;
        this.tran_cnt = tran_cnt;
        this.pay_cnt = pay_cnt;
        this.tram_amt = tram_amt;
    }

    public String getS_index() {
        return s_index;
    }

    public void setS_index(String s_index) {
        this.s_index = s_index;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Date getTrans_date() {
        return trans_date;
    }

    public void setTrans_date(Date trans_date) {
        this.trans_date = trans_date;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getTran_max_amt() {
        return tran_max_amt;
    }

    public void setTran_max_amt(BigDecimal tran_max_amt) {
        this.tran_max_amt = tran_max_amt;
    }

    public BigDecimal getPay_amt() {
        return pay_amt;
    }

    public void setPay_amt(BigDecimal pay_amt) {
        this.pay_amt = pay_amt;
    }

    public int getTran_cnt() {
        return tran_cnt;
    }

    public void setTran_cnt(int tran_cnt) {
        this.tran_cnt = tran_cnt;
    }

    public int getPay_cnt() {
        return pay_cnt;
    }

    public void setPay_cnt(int pay_cnt) {
        this.pay_cnt = pay_cnt;
    }

    public BigDecimal getTram_amt() {
        return tram_amt;
    }

    public void setTram_amt(BigDecimal tram_amt) {
        this.tram_amt = tram_amt;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "s_index='" + s_index + '\'' +
                ", cust_id=" + cust_id +
                ", update_time=" + update_time +
                ", trans_date=" + trans_date +
                ", surname='" + surname + '\'' +
                ", tran_max_amt=" + tran_max_amt +
                ", pay_amt=" + pay_amt +
                ", tran_cnt=" + tran_cnt +
                ", pay_cnt=" + pay_cnt +
                ", tram_amt=" + tram_amt +
                '}';
    }
}
