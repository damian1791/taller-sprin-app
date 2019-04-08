package ar.com.bbva.taller.app.endpoint;

import ar.com.bbva.taller.app.repository.*;
import ar.com.bbva.taller.app.model.*;
import java.util.List;

import org.springframework.beans.factory.*;
import org.springframework.web.bind.*;

@RestController
@RequesMapping("/customer")
public class CustomerController() {
    
    @Autowired
    private CustormerReposity customerRepository;

    @RequesMapping(method=RescuesMeht.POST)
    public Customer save(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @recuestMapping(value="/{name}", method=RecuestMethod.GET)
    public List<customer> byName(@PathVariable String name){
        return customerRepository.findByName(name);
    }
}