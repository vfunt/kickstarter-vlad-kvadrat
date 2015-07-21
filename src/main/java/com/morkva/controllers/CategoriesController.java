package com.morkva.controllers;

import com.morkva.services.CategoryService;
import com.morkva.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/category")
public class CategoriesController {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public String showCategories(ModelMap model) {

        model.addAttribute("quote", quoteService.getRandom());
        model.addAttribute("list", categoryService.getAll());
        return "categories";
    }
}
