package com.eventsphere.repository;

import com.eventsphere.entity.Vendor;
import com.eventsphere.enums.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
    List<Vendor> findByServiceType(ServiceType serviceType);
}
