package com.futurix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurix.entities.TblCurrentAccount;

public interface CurrentRepo  extends JpaRepository<TblCurrentAccount, Integer>{
		
}
