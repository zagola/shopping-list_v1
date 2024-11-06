package com.example.shopping_list_v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    ShoppingRepository shoppingRepository;

    @GetMapping("/get")
    public List<ShoppingItem> getList() {
        return shoppingRepository.getAll();
    }

    @PostMapping("/add")
    public void addItem(@RequestBody ShoppingItem item) {
        shoppingRepository.addItem(item.getItem());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable("id") int id) {
        shoppingRepository.deleteItem(id);
    }
}
