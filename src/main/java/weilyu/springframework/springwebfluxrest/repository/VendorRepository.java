package weilyu.springframework.springwebfluxrest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import weilyu.springframework.springwebfluxrest.domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
