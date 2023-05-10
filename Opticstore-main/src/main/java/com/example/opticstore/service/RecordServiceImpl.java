package com.example.opticstore.service;

import com.example.opticstore.model.Record;
import com.example.opticstore.repository.RecordRepository;
import com.example.opticstore.web.dto.RecordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private RecordRepository recordRepository;


    @Override
    public void save(Record record) {
        recordRepository.save(record);
    }
}
