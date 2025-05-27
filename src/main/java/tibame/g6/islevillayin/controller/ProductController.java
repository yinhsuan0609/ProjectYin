package tibame.g6.islevillayin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @PostMapping("/product")
    public String insert(){
        Map<String, Object> map = new HashMap<>();

        jdbcTemplate.update("INSERT INTO product (product_category_id, product_name, product_price, product_description, product_quantity, product_status) VALUES (1, '測試', 300, '測試描述', 2, 1)", map);
        return "Insert product";
    }
}
