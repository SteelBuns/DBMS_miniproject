package com.dairyfarm.details.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
@Entity
public class MedHistory implements Serializable {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Integer med_his;

    private Date conceive;
    private Date insemination;
    private String disease;
    private Integer drug_number;
    private Integer animal_number;
    private Integer used;
    private Date date_used;
    private String response;

    public MedHistory(){}

    public void setConceive(Date conceive) {
        this.conceive = conceive;
    }

    public void setInsemination(Date insemination) {
        this.insemination = insemination;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDrug_number(Integer drug_number) {
        this.drug_number = drug_number;
    }

    public void setAnimal_number(Integer animal_number) {
        this.animal_number = animal_number;
    }

    public void setDate_used(Date date_used) {
        this.date_used = date_used;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Integer getAnimal_number() {
        return animal_number;
    }

    public Date getConceive() {
        return conceive;
    }

    public Date getDate_used() {
        return date_used;
    }

    public Date getInsemination() {
        return insemination;
    }

    public Integer getDrug_number() {
        return drug_number;
    }

    public Integer getUsed() {
        return used;
    }

    public String getDisease() {
        return disease;
    }

    public String getResponse() {
        return response;
    }
}
