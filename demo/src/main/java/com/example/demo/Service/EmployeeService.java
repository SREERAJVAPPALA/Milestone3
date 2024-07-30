package main.java.com.example.demo.Service;

import main.java.com.example.demo.Exception.NotFoundException;
import main.java.com.example.demo.Repository.AddressRepository;
import main.java.com.example.demo.Repository.EmployeeRepository;
import main.java.com.example.demo.entity.Employee;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Employee getById(Long employeeId){
        Employee e = employeeRepository.findById(employeeId);
        if(e == null){
            throw new NotFoundException("not found");
        }
        return e;
    }

    public Employee updateById(Long employeeId,Employee employee){
        Employee e = employeeRepository.findById(employeeId);
        if(e == null){
            throw new NotFoundException("nf");
        }
        else{
            e.setFirstName(employee.getFirstName());
            return employeeRepository.save(e);
        }
    }

    public void deleteById(Long id){
        Employee e = employeeRepository.findById(id);
        if(e == null){
            throw new NotFoundException("not found");
        }
        else{
            employeeRepository.deleteById(id);
        }
    }

    public List<Employee> getByStreetNmae(String name){
        
    }
    
}
