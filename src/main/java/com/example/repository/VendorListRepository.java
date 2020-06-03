package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.VendorList;

@Repository("vendorListRepository")
public interface VendorListRepository extends JpaRepository<VendorList, Long> {

}
