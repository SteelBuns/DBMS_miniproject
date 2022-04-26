package com.dairyfarm.details.model;

import com.fasterxml.jackson.core.JsonEncoding;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="finance")
public class Finance {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date_time")
    private Date dateTime;

    @Column(name = "amount")
    private int amount;

    @Column(name = "trans_type")
    private String transType;

    @Column(name = "emp_id")
    private Date empId;

    @Column(name = "trans_details")
    private String transDetails;

    @Column(name = "note")
    private String note;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public Date getEmpId() {
        return empId;
    }

    public void setEmpId(Date empId) {
        this.empId = empId;
    }

    public String getTransDetails() {
        return transDetails;
    }

    public void setTransDetails(String transDetails) {
        this.transDetails = transDetails;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
