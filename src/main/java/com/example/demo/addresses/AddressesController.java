package com.example.demo.addresses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/addresses")

public class AddressesController {
    @Autowired
    private final AddressesService addressesService;
    public AddressesController(AddressesService addressesService) {
        this.addressesService = addressesService;
    }

    @GetMapping
    public List<Address> getAllAddresses(){
        return this.addressesService.getAllAddresses();
    }
    @GetMapping ("/{id}")
    public Optional<Address> getOneAddress(@PathVariable int id){
        return this.addressesService.getOneAddress(id);
    }
}
