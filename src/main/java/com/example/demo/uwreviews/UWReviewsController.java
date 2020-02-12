package com.example.demo.uwreviews;

import com.example.demo.archived.Archive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/uwreviews")

public class UWReviewsController {
    @Autowired
    private final UWReviewsService uwReviewsService;
    public UWReviewsController(UWReviewsService uwReviewsService) {
        this.uwReviewsService = uwReviewsService;
    }

    @GetMapping
    public List<UWReview> getAllUWReviews(){
        return this.uwReviewsService.getAllUWReviews();
    }
    @GetMapping ("/{id}")
    public Optional<UWReview> getOneUWReview(@PathVariable int id){
        return this.uwReviewsService.getOneUWReview(id);
    }
    @PostMapping
    public UWReview postUWReview(@RequestBody UWReview newUWReview){
        return uwReviewsService.postUWReview(newUWReview);
    }
    @PatchMapping
    public UWReview patchUWReview(@RequestBody UWReview patchedUWReview){
        UWReview uwReview = this.uwReviewsService.getOneUWReview(patchedUWReview.getID()).orElseThrow(IllegalArgumentException::new);
        return this.uwReviewsService.patchUWReview(patchedUWReview);
    }
    @DeleteMapping ("/{id}")
    public String deleteUWReview(@PathVariable int id){
        UWReview address = this.uwReviewsService.getOneUWReview(id).orElseThrow(IllegalArgumentException::new);
        return uwReviewsService.deleteUWReview(id);
    }
}
