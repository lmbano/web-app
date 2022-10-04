package com.interviewwebapp.controllers;
import com.interviewwebapp.models.LostItem;
import com.interviewwebapp.repos.LostItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LostItemController {

    @Autowired
    private LostItemRepository lostItemRepository;


    @GetMapping("/lost-item")
    public List<LostItem> getAllLostItems() {
        return lostItemRepository.findAll();
    }

    @GetMapping("/lost-item/{id}")
    public LostItem getLostItem(@PathVariable int id) throws LostItemNotFoundException {
        Optional<LostItem> lostItem = lostItemRepository.findById(id);

        if (lostItem.isEmpty())
            throw new LostItemNotFoundException("id-" + id);

        return lostItem.get();
    }




    @DeleteMapping("/lost-item/delete/{id}")
    public void deleteLostItem(@PathVariable int id) {
        lostItemRepository.deleteById(id);
    }




    @PutMapping("/lost-item/update/{id}")
    public ResponseEntity<Object> updateLostItem(@RequestBody LostItem lostItem, @PathVariable int id) {

        Optional<LostItem> lostItemOptional = lostItemRepository.findById(id);

        if (lostItemOptional.isEmpty())
            return ResponseEntity.notFound().build();

        lostItemRepository.save(lostItem);

        return ResponseEntity.noContent().build();
    }


    @PostMapping("/lost-item")
    public LostItem saveLostItem(
             @RequestBody LostItem lostItem)
    {
        return lostItemRepository.save(lostItem);
    }


    class LostItemNotFoundException extends Exception {

        LostItemNotFoundException() {

        }

        LostItemNotFoundException(String message) {
            super(message);
        }
        LostItemNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }



}

}
