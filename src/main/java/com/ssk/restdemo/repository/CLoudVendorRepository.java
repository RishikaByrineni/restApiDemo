package com.ssk.restdemo.repository;

import com.ssk.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CLoudVendorRepository  extends JpaRepository<CloudVendor, String> {
}
