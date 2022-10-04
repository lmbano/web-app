package com.interviewwebapp.repos;

import com.interviewwebapp.models.LostItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LostItemRepository  extends JpaRepository<LostItem, Integer> {

    //List<LostItem> findAll();

}
