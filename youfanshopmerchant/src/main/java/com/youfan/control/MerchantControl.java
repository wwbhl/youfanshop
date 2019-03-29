package com.youfan.control;

import com.youfan.model.Merchant;
import com.youfan.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.RequestWrapper;

@Controller
public class MerchantControl {
    @Autowired
    MerchantService merchantService;

    @RequestMapping(value = "/insertMerchant", method = RequestMethod.POST)
    public String insertMerchant(Merchant merchant){
        merchantService.insertMerchant(merchant);
        return "merchantregister";
    }

    @RequestMapping(value = "/toinsertMerchant", method = RequestMethod.GET)
    public String toinsertMerchant(Merchant merchant){
        merchantService.insertMerchant(merchant);
        return "merchantregister";
    }
    
}
