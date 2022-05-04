package com.dairyfarm.details.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
@Entity
public class Medicines {

    @Id
    private Integer drug_number;
    private Double cost;
    private String purpose;
    private Date doe;
    private Date purchase_date;
    private Integer quantity;
    private String name;

    public Medicines(){}
    public void Medicines(Integer drug_number,Double cost, String purpose, Date doe, Date purchase_date,Integer quantity,String name){
        this.drug_number = drug_number;
        this.cost=cost;
        this.purpose=purpose;
        this.doe=doe;
        this.purchase_date=purchase_date;
        this.quantity=quantity;
        this.name=name;
    }

    public void setDrug_number(Integer drug_number) {
        this.drug_number = drug_number;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDrug_number() {
        return drug_number;
    }

    public Date getDoe() {
        return doe;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }
}
