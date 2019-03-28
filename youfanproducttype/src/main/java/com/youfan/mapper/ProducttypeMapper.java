package com.youfan.mapper;

import com.youfan.model.ProductType;
import com.youfan.vo.ProductTypeVo;

import java.util.List;

public interface ProducttypeMapper {
    public void insertProducttype(ProductType productType);
    public ProductType findProducttypeByid(int id);
    public void updateProducttype(ProductType productType);
    public List<ProductType> queryListbyVo(ProductTypeVo productTypeVo);
    public void deleteProducttypeByid(int id);
}