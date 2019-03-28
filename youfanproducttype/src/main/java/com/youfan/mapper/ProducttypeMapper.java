package com.youfan.mapper;

import com.youfan.model.ProductType;

public interface ProducttypeMapper {
    public void insertProducttype(ProductType productType);
    public ProductType findProducttypeByid(int id);
}