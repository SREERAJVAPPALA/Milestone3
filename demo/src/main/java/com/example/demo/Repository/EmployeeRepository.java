package main.java.com.example.demo.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    @Query("select e from Employee e where e.address.street = :name")
    public List<Employee> getByStreetNmae(String name);
    
}
