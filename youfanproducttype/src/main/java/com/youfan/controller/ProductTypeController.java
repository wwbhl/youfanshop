package com.youfan.controller;

import com.youfan.model.ProductType;
import com.youfan.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ProductTypeController {

    @Autowired
    ProductTypeService productTypeService;

    @RequestMapping(value = "/insertProducttype",method = RequestMethod.POST)
    public void insertProducttype(ProductType productType){
        productTypeService.insertProducttype(productType);
    }

    @RequestMapping(value = "/findProductytpeByid",method = RequestMethod.GET)
    public String findProductytpeByid(int id, Model model){
        ProductType productType = productTypeService.findProducttypeByid(id);
        int pareid = productType.getParentid();
        ProductType parentproductType = productTypeService.findProducttypeByid(pareid);
        model.addAttribute("productType",productType);
        model.addAttribute("parentproductType",parentproductType);
        return "producttypeview";
    }

    @RequestMapping(value = "/toaddProductytpeByid",method = RequestMethod.GET)
    public String toaddProductytpeByid(int id, Model model){
        ProductType productType = productTypeService.findProducttypeByid(id);
        if(productType == null){
            productType = new ProductType();
            productType.setId(-1);
        }
        model.addAttribute("productType",productType);
        return "producttypeadd";
    }
    @RequestMapping(value = "/toupdateProducttype",method = RequestMethod.GET)
    public String toupdateProducttype(int id, Model model){
        ProductType productType = productTypeService.findProducttypeByid(id);
        model.addAttribute("productType",productType);
        return "producttypeupdate";
    }

    @RequestMapping(value = "/updateProducttype",method = RequestMethod.POST)
    public String updateProducttype(ProductType productType){
        productTypeService.updateProducttype(productType);
        return "producttypeview";
    }
}
