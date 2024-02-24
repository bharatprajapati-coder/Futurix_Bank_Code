package com.futurix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurix.entities.TblSavingAccount;

public interface SavingAccountRepo extends JpaRepository<TblSavingAccount, Integer> {

}
