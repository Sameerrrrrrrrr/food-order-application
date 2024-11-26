package com.example.foodordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.foodordering.model.FinalOrder;
@Repository
public interface FinalOrderRepository extends JpaRepository<FinalOrder, Long>{

}
