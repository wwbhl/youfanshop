package com.youfan.service;

import com.youfan.dao.MerchantDao;
import com.youfan.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {
    @Autowired
    MerchantDao merchantDao;

    public void insertMerchant(Merchant merchant){
        merchant.setAuditstatus(1);
        merchantDao.insertMerchant(merchant);
    }

}
