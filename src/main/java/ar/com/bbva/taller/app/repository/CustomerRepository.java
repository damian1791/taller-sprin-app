package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ar.com.bbva.taller.app.model.*;

@repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    @query(SELECT c FROM Customer c WHERE c.firstName = :name)
    List<Customer> findByName(String name);
}