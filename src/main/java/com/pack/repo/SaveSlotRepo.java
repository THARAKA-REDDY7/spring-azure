package com.pack.repo;

import com.pack.model.BookSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveSlotRepo extends JpaRepository<BookSlot, Integer> {
}
