package com.eventsphere.entity;

import com.eventsphere.enums.ServiceType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vendors")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ServiceType serviceType; // CATERING, PHOTOGRAPHY, DECOR, MUSIC, VENUE, OTHER

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn(name = "vendor_user_id", nullable = false)
    private User vendorUser;

    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    public Vendor() {
    }

    public Vendor(Long id, String name, ServiceType serviceType, Double price, User vendorUser, List<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.serviceType = serviceType;
        this.price = price;
        this.vendorUser = vendorUser;
        this.bookings = bookings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public User getVendorUser() {
        return vendorUser;
    }

    public void setVendorUser(User vendorUser) {
        this.vendorUser = vendorUser;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serviceType=" + serviceType +
                ", price=" + price +
                ", vendorUser=" + vendorUser +
                ", bookings=" + bookings +
                '}';
    }
}
