package org.example.dataanalysermicrosevice.service;

import org.example.dataanalysermicrosevice.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}
