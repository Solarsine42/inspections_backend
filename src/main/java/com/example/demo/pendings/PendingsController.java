package com.example.demo.pendings;

import com.example.demo.archived.Archive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pending")

public class PendingsController {
    @Autowired
    private final PendingsService pendingsService;
    public PendingsController(PendingsService pendingsService) {
        this.pendingsService = pendingsService;
    }
    @GetMapping
    public List<Pending> getAllPendings(){
        return this.pendingsService.getAllPendings();
    }
    @GetMapping ("/{id}")
    public Optional<Pending> getOnePending(@PathVariable int id){
        return this.pendingsService.getOnePending(id);
    }
    @PostMapping
    public Pending postPending(@RequestBody Pending newPending){
        return pendingsService.postPending(newPending);
    }
    @PatchMapping
    public Pending patchPending(@RequestBody Pending patchedPending){
        Pending pending = pendingsService.getOnePending(patchedPending.getID()).orElseThrow(IllegalArgumentException::new);
        return this.pendingsService.patchPending(patchedPending);
    }
    @DeleteMapping ("/{id}")
    public String deletePending(@PathVariable int id){
        Pending address = pendingsService.getOnePending(id).orElseThrow(IllegalArgumentException::new);
        return pendingsService.deletePending(id);
    }


}
