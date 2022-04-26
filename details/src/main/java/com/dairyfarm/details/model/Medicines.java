package com.dairyfarm.details.model;

import com.fasterxml.jackson.core.JsonEncoding;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="medicines")
public class Medicines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drug_number")
    private int drugNumber;

    @Column(name = "cost")
    private int cost;

    @Column(name = "date_time")
    private Date dateTime;

    @Column(name = "doe")
    private Date doe;

    @Column(name = "name")
    private String name;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "quantity")
    private int quantity;

    public int getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(int drugNumber) {
        this.drugNumber = drugNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDoe() {
        return doe;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
