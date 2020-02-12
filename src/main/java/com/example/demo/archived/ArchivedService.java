package com.example.demo.archived;

import com.example.demo.addresses.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ArchivedService {
    @Autowired
    private final ArchivedRepository archivedRepository;
    private Object newArchive;
    private Object Archive;


    public ArchivedService(ArchivedRepository archivedRepository) {
        this.archivedRepository = archivedRepository;
    }
    public List<Archive> getAllArchives(){
        return this.archivedRepository.findAll();
    }
    public Optional<Archive> getOneArchive(int id){
        return this.archivedRepository.findById(id);
    }
    public Archive postArchive(Archive newArchive){
        return archivedRepository.save(newArchive);
    }
    public Archive patchArchive(Archive patchedArchive){
        return archivedRepository.save(patchedArchive);
    }
    public String deleteArchive(int id){
        archivedRepository.deleteById(id);
        return "ID " + id + " was removed.";}
}
