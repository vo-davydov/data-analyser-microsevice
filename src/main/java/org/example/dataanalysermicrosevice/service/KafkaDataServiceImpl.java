package org.example.dataanalysermicrosevice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dataanalysermicrosevice.model.Data;
import org.example.dataanalysermicrosevice.repository.DaraRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final DaraRepository daraRepository;

    @Override
    public void handle(Data data) {
        daraRepository.save(data);
        log.info("Data object {} saved", data);
    }


}
