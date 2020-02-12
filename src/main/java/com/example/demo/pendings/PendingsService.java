package com.example.demo.pendings;

import com.example.demo.addresses.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PendingsService {

    @Autowired
    private final PendingsRepository pendingsRepository;
    private Object newPending;
    private Object Pending;


    public PendingsService(PendingsRepository pendingsRepository) {
        this.pendingsRepository = pendingsRepository;
    }
    public List<Pending> getAllPendings(){
        return this.pendingsRepository.findAll();
    }
    public Optional<Pending> getOnePending(int id){
        return this.pendingsRepository.findById(id);
    }
    public Pending postPending(Pending newPending){
        return pendingsRepository.save(newPending);
    }
    public Pending patchPending(Pending patchedPending){
        return pendingsRepository.save(patchedPending);
    }
    public String deletePending(int id){
        pendingsRepository.deleteById(id);
        return "ID " + id + " was removed.";
    }
}
