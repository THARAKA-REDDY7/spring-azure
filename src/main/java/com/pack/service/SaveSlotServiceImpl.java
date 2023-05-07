package com.pack.service;

import com.pack.model.BookSlot;
import com.pack.repo.SaveSlotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SaveSlotServiceImpl implements SaveSlotService{
    @Autowired
    private SaveSlotRepo saveSlotRepo;
    @Override
    public void saveSlot(BookSlot bookSlot) {
        saveSlotRepo.save(bookSlot);

    }
}
