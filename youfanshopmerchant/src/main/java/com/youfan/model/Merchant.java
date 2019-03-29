package com.youfan.model;

public class Merchant {

    private int id;//主键
    private String merchantname;//商家名称
    private String merchantshopname;//商店名称
    private String merchantaccount;//商家账号
    private String merchantpassword;//商家密码
    private String merchantscope;//商家等级
    private int auditstatus;//审核状态 1提交成功，2审核通过3审核不通过

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public String getMerchantshopname() {
        return merchantshopname;
    }

    public void setMerchantshopname(String merchantshopname) {
        this.merchantshopname = merchantshopname;
    }

    public String getMerchantaccount() {
        return merchantaccount;
    }

    public void setMerchantaccount(String merchantaccount) {
        this.merchantaccount = merchantaccount;
    }

    public String getMerchantpassword() {
        return merchantpassword;
    }

    public void setMerchantpassword(String merchantpassword) {
        this.merchantpassword = merchantpassword;
    }

    public String getMerchantscope() {
        return merchantscope;
    }

    public void setMerchantscope(String merchantscope) {
        this.merchantscope = merchantscope;
    }

    public int getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(int auditstatus) {
        this.auditstatus = auditstatus;
    }
}
