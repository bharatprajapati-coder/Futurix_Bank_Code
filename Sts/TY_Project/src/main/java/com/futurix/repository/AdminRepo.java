package com.futurix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurix.entities.TblAdmin;

public interface AdminRepo extends JpaRepository<TblAdmin, Integer> {

}
