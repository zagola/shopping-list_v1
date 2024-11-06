package com.example.shopping_list_v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShoppingRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ShoppingItem> getAll() {
        return jdbcTemplate.query("SELECT item, id FROM List",
                BeanPropertyRowMapper.newInstance(ShoppingItem.class));
    }

    public void addItem(String item) {
        jdbcTemplate.update("INSERT INTO List (item) VALUES (?)", item);
    }

    public void deleteItem(int id) {
        jdbcTemplate.update("DELETE FROM List WHERE id=?", id);
    }


}
