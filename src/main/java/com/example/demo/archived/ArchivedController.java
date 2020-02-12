package com.example.demo.archived;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/archived")

public class ArchivedController {
    @Autowired
    private final ArchivedService archivedService;
    public ArchivedController(ArchivedService archivedService) {
        this.archivedService = archivedService;
    }
    @GetMapping
    public List<Archive> getAllArchives(){
        return this.archivedService.getAllArchives();
    }
    @GetMapping ("/{id}")
    public Optional<Archive> getOneArchive(@PathVariable int id){
        return this.archivedService.getOneArchive(id);
    }
    @PostMapping
    public Archive postArchive(@RequestBody Archive newArchive){
        return archivedService.postArchive(newArchive);
    }

    @PatchMapping
    public Archive patchArchive(@RequestBody Archive patchedArchive){
        Archive archive = archivedService.getOneArchive(patchedArchive.getID()).orElseThrow(IllegalArgumentException::new);
        return archivedService.patchArchive(patchedArchive);
    }
    @DeleteMapping ("/{id}")
    public String deleteArchive(@PathVariable int id){
        Archive archive = archivedService.getOneArchive(id).orElseThrow(IllegalArgumentException::new);
        return archivedService.deleteArchive(id);
    }
}
