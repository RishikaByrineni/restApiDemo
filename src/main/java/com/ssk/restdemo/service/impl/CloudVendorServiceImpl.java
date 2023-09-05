package com.ssk.restdemo.service.impl;

import com.ssk.restdemo.model.CloudVendor;
import com.ssk.restdemo.repository.CLoudVendorRepository;
import com.ssk.restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CLoudVendorRepository cLoudVendorRepository;
    public CloudVendorServiceImpl(CLoudVendorRepository cLoudVendorRepository) {
        this.cLoudVendorRepository = cLoudVendorRepository;
    }



    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cLoudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cLoudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId){
        cLoudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cLoudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cLoudVendorRepository.findAll();
    }
}
