package com.belajarspring.candidatapp.entity;

import org.apache.juli.logging.Log;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_candidate")
public class Candidate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 100, nullable = false)
    String fullName;
    @Column(length = 255)
    String address;
    @Column(length = 50, unique = true)
    String phone;
    @Column(length = 100,unique = true)
    String email;
    @Column(length = 100)
    String position;
    @Column(length = 100000000)
    String photo;

    public Candidate (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
