package lv.lu.finalwork.domain;

import lv.lu.finalwork.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCrudRepository extends CrudRepository<Product, Long> {
}