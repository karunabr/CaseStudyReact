package com.hsm.healthservicemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.hsm.healthservicemanagement.entity.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address,Integer>{

}
