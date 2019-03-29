package com.youfan.dao;

import com.youfan.mapper.MerchantMapper;
import com.youfan.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MerchantDao {
    @Autowired
    MerchantMapper merchantMapper;

    public void insertMerchant(Merchant merchant){
        merchantMapper.insertMerchant(merchant);
    }

}
