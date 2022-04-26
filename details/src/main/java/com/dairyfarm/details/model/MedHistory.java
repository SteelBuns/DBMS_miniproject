package com.dairyfarm.details.model;

import com.fasterxml.jackson.core.JsonEncoding;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="med_history")
public class MedHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_number")
    private int animalNumber;

    @Column(name = "drug_number")
    private int drugNumber;

    @Column(name = "conceive")
    private Date conceive;

    @Column(name = "insemination")
    private Date insemination;

    @Column(name = "disease")
    private String disease;

    @Column(name = "used")
    private int used;

    @Column(name = "date_used")
    private Date dateUsed;

    @Column(name = "response")
    private String response;

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public int getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(int drugNumber) {
        this.drugNumber = drugNumber;
    }

    public Date getConceive() {
        return conceive;
    }

    public void setConceive(Date conceive) {
        this.conceive = conceive;
    }

    public Date getInsemination() {
        return insemination;
    }

    public void setInsemination(Date insemination) {
        this.insemination = insemination;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public Date getDateUsed() {
        return dateUsed;
    }

    public void setDateUsed(Date dateUsed) {
        this.dateUsed = dateUsed;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
