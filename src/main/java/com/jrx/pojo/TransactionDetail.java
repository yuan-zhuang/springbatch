package com.jrx.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.sql.Date;

@ApiModel("交易信息类")
public class TransactionDetail {
    @ApiModelProperty("交易id")
    private int trans_id;

    @ApiModelProperty("客户号")
    private int cust_id;

    @ApiModelProperty("账户号")
    private String account;

    @ApiModelProperty("卡号")
    private String card_nbr;

    @ApiModelProperty("交易流水号")
    private int tranno;

    @ApiModelProperty("账单月")
    private int month_nbr;

    @ApiModelProperty("交易金额")
    private BigDecimal bill;

    @ApiModelProperty("交易类型")
    private String trans_type;

    @ApiModelProperty("交易日期")
    private Date txn_datetime;

    public TransactionDetail() {
    }

    public TransactionDetail(int trans_id, int cust_id, String account, String card_nbr, int tranno, int month_nbr, BigDecimal bill, String trans_type, Date txn_datetime) {
        this.trans_id = trans_id;
        this.cust_id = cust_id;
        this.account = account;
        this.card_nbr = card_nbr;
        this.tranno = tranno;
        this.month_nbr = month_nbr;
        this.bill = bill;
        this.trans_type = trans_type;
        this.txn_datetime = txn_datetime;
    }

    public int getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCard_nbr() {
        return card_nbr;
    }

    public void setCard_nbr(String card_nbr) {
        this.card_nbr = card_nbr;
    }

    public int getTranno() {
        return tranno;
    }

    public void setTranno(int tranno) {
        this.tranno = tranno;
    }

    public int getMonth_nbr() {
        return month_nbr;
    }

    public void setMonth_nbr(int month_nbr) {
        this.month_nbr = month_nbr;
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        this.bill = bill;
    }

    public String getTrans_type() {
        return trans_type;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public Date getTxn_datetime() {
        return txn_datetime;
    }

    public void setTxn_datetime(Date txn_datetime) {
        this.txn_datetime = txn_datetime;
    }

    @Override
    public String toString() {
        return "TransactionDetail{" +
                "trans_id=" + trans_id +
                ", cust_id=" + cust_id +
                ", account='" + account + '\'' +
                ", card_nbr='" + card_nbr + '\'' +
                ", tranno=" + tranno +
                ", month_nbr=" + month_nbr +
                ", bill=" + bill +
                ", trans_type='" + trans_type + '\'' +
                ", txn_datetime=" + txn_datetime +
                '}';
    }
}
