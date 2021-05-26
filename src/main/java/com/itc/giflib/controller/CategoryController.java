package com.itc.giflib.controller;

import com.itc.giflib.data.CategoryRepository;
import com.itc.giflib.data.GifRepository;
import com.itc.giflib.model.Category;
import com.itc.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap){
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String categoriesDetail(@PathVariable Integer id, ModelMap modelMap){
        Category category = categoryRepository.findByID(id);
        modelMap.put("category", category);

        List<Gif> gif = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gif);
        return "category";
    }

}
