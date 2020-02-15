package weilyu.springframework.springwebfluxrest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import weilyu.springframework.springwebfluxrest.domain.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
