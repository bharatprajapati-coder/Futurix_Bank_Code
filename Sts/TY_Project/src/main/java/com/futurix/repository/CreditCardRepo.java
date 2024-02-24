package com.futurix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurix.entities.TblCreditCard;

public interface CreditCardRepo  extends JpaRepository<TblCreditCard, Integer>{

}
