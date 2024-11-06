package com.example.shopping_list_v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    ShoppingRepository shoppingRepository;

    @GetMapping("/")
    public List<ShoppingItem> getList() {
        return shoppingRepository.getAll();
    }
}
