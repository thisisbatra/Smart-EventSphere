package com.eventsphere.controller;


import com.eventsphere.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping
    public ResponseEntity<Vendor> registerVendor(@RequestBody Vendor vendor) {
        Vendor savedVendor = vendorService.registerVendor(vendor);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedVendor);
    }

    @GetMapping
    public ResponseEntity<List<Vendor>> getAllVendors() {
        List<Vendor> vendors = vendorService.getAllVendors();
        return ResponseEntity.ok(vendors);
    }

    @GetMapping("/service/{serviceType}")
    public ResponseEntity<List<Vendor>> getVendorsByServiceType(@PathVariable ServiceType serviceType) {
        List<Vendor> vendors = vendorService.getVendorsByServiceType(serviceType);
        return ResponseEntity.ok(vendors);
    }
}
