package com.youfan.dao;

import com.youfan.mapper.ProducttypeMapper;
import com.youfan.model.ProductType;
import com.youfan.vo.ProductTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ProducttypeDao {
    @Autowired
    ProducttypeMapper producttypeMapper;

    public void insertProducttype(ProductType productType){
        producttypeMapper.insertProducttype(productType);
    }
    public ProductType findProducttypeByid(int id){
        return producttypeMapper.findProducttypeByid(id);
    }
    public void updateProducttype(ProductType productType){
        producttypeMapper.updateProducttype(productType);
    }
    public List<ProductType> queryListbyVo(ProductTypeVo productTypeVo){
        return producttypeMapper.queryListbyVo(productTypeVo);
    }
    public void deleteProducttypeByid(int id){
        producttypeMapper.deleteProducttypeByid(id);
    }
}