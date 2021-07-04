package com.example.jazs20687nbp.Respository;

import com.example.jazs20687nbp.Model.GoldLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRepository extends JpaRepository<GoldLog, Integer> {
}
