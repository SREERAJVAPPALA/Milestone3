package main.java.com.example.demo.Service;

import main.java.com.example.demo.Repository.EmployeeRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public Address createAddress(Address address){
        return addressRepository.save(address);
        
    }

    public List<Address> getAll(){
        List<Address>li=addressRepository.findAll();
        return li;
    }

    
}
