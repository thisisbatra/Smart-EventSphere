package com.eventsphere.service;


import com.eventsphere.entity.Vendor;
import com.eventsphere.enums.ServiceType;
import com.eventsphere.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    // Register a new vendor
    public Vendor registerVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    // Get all vendors
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    // Get vendors by service type
    public List<Vendor> getVendorsByServiceType(ServiceType serviceType) {
        return vendorRepository.findByServiceType(serviceType);
    }
}
