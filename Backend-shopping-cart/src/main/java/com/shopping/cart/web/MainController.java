package com.shopping.cart.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.shopping.cart.Repository.ProductRepository;

@Controller
public class MainController {

	@GetMapping("/")
	public String index(ModelMap modelMap) {
		ProductRepository productModel = new ProductRepository();
		modelMap.put("products", productModel.findAll());
		return "index";
	}

}