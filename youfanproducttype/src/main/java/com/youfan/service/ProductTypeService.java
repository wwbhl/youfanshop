package com.youfan.service;

import com.youfan.dao.ProducttypeDao;
import com.youfan.model.ProductType;
import com.youfan.vo.ProductTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void updateProducttype(ProductType productType){
        producttypeDao.updateProducttype(productType);
    }
    public List<ProductType> queryListbyVo(ProductTypeVo productTypeVo){
        return producttypeDao.queryListbyVo(productTypeVo);
    }
    public void deleteProducttypeByid(int id){
        producttypeDao.deleteProducttypeByid(id);
    }
}
