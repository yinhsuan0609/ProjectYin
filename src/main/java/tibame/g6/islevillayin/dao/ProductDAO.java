package tibame.g6.islevillayin.dao;

import tibame.g6.islevillayin.entity.Product;

import java.util.List;

public interface ProductDAO {
    public void insert(Product product);
    public void update(Product product);
    public void delete(Integer productId);
    public Product findByPK(Integer productId);
    public List<Product> getAll();
}
