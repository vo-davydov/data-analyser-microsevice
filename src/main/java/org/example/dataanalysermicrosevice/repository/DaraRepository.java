package org.example.dataanalysermicrosevice.repository;

import org.example.dataanalysermicrosevice.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaraRepository extends JpaRepository<Data, Long> {
}
