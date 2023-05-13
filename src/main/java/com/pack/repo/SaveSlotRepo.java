package com.pack.repo;

import com.pack.model.BookSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaveSlotRepo extends JpaRepository<BookSlot, Integer> {

List<BookSlot> findByDocid(int docid);
}
