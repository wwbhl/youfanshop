package com.youfan.service;

import com.youfan.dao.ProducttypeDao;
import com.youfan.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    @Autowired
    ProducttypeDao producttypeDao;

    public void insertProducttype(ProductType productType){
        producttypeDao.insertProducttype(productType);
    }

    public ProductType findProducttypeByid(int id){
        return producttypeDao.findProducttypeByid(id);
    }
}
