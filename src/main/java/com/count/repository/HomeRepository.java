package com.count.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.count.domain.Record;

@Repository
public interface HomeRepository extends JpaRepository<Record, String> {

}
