package com.pack.service;
import java.util.List;
import com.pack.model.BookSlot;

public interface SaveSlotService {
    void saveSlot(BookSlot bookSlot);

    List<BookSlot> findByDocid(int p);
}
