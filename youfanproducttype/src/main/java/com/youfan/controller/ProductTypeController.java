package com.youfan.controller;

import com.youfan.model.ProductType;
import com.youfan.service.ProductTypeService;
import com.youfan.vo.ProductTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


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
        if(parentproductType == null){
            parentproductType = new ProductType();
            parentproductType.setProducttypename("");
        }
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
    @RequestMapping(value = "/listproducttype",method = RequestMethod.GET)
    public String listproducttype(Model model){
        ProductTypeVo productTypeVo = new ProductTypeVo();
        List<ProductType> list = productTypeService.queryListbyVo(productTypeVo);
        productTypeService.queryListbyVo(productTypeVo);
        model.addAttribute("list", list);
        return "list";
    }
    @RequestMapping(value = "/deleteProducttypeByid",method = RequestMethod.GET)
    public void deleteProducttypeByid(int id){
        productTypeService.deleteProducttypeByid(id);
    }
}
