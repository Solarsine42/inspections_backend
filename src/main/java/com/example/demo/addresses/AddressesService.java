package com.example.demo.addresses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class AddressesService {

    @Autowired
    private final AddressesRepository addressesRepository;
    private Object newAddress;
    private Object Address;

    public AddressesService(AddressesRepository addressesRepository){
        this.addressesRepository = addressesRepository;
    }
    public List<Address> getAllAddresses(){
        return this.addressesRepository.findAll();
    }
    public Optional<Address> getOneAddress(int id){
        return this.addressesRepository.findById(id);
    }
}
