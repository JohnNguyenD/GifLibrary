package com.itc.giflib.data;

import com.itc.giflib.model.Category;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Funny"),
            new Category(2, "Robot"),
            new Category(3, "Books")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }

    public Category findByID(Integer id){
        for(Category category: ALL_CATEGORIES){
            if(category.getId() == id)
                return category;
        }
        return null;
    }
}
