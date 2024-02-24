package com.futurix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurix.entities.TblCard;

public interface CardRepo extends JpaRepository<TblCard, Integer> {

}
