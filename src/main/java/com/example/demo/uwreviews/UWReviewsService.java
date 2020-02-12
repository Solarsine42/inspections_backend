package com.example.demo.uwreviews;

import com.example.demo.addresses.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UWReviewsService {
    @Autowired
    private final UWReviewsRepository uwReviewsRepository;
    private Object newAddress;
    private Object Address;

    public UWReviewsService(UWReviewsRepository uwReviewsRepository) {
        this.uwReviewsRepository = uwReviewsRepository;
    }
    public List<UWReview> getAllUWReviews(){
        return this.uwReviewsRepository.findAll();
    }
    public Optional<UWReview> getOneUWReview(int id){
        return this.uwReviewsRepository.findById(id);
    }
    public UWReview postUWReview(UWReview newUWReview){
        return uwReviewsRepository.save(newUWReview);
    }
    public UWReview patchUWReview(UWReview patchedUWReview){
        return uwReviewsRepository.save(patchedUWReview);
    }
    public String deleteUWReview(int id){
        uwReviewsRepository.deleteById(id);
        return "ID " + id + " was removed.";
    }
}
