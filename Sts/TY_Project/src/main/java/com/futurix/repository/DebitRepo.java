package com.futurix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurix.entities.TblDebitCard;

public interface DebitRepo extends JpaRepository<TblDebitCard, Integer>{
}