package main.java.com.example.demo.Controller;

import main.java.com.example.demo.Service.AddressService;

@RestController
public class AddressController {
    @Auotowired
    private AddressService addressService;

    @PostMapping("/addresses")
    public ResponseEntity<Address> createAddress(@RequestBody Address address){
        return ResponseEntity<Address>(addressService.createAddress(address),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Address>> getAll()
    {
        List<Address> ll = addressService.getAll();
        return ResponseEntity<Address>(ll,HttpStatus.OK);
    }

    
}
