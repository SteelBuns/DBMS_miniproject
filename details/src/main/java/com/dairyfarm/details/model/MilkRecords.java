package com.dairyfarm.details.model;

import com.fasterxml.jackson.core.JsonEncoding;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="milk_records")
public class MilkRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_number")
    private int animalNumber;

    @Column(name = "milk_quantity")
    private int milkQuantity;

    @Column(name = "SNF")
    private int snf;

    @Column(name = "fat")
    private int fat;

    @Column(name = "shift")
    private String shift;

    @Column(name = "dateof")
    private Date dateof;

    @Column(name = "type_of_milk")
    private String typeOfMilk;

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(int milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public int getSnf() {
        return snf;
    }

    public void setSnf(int snf) {
        this.snf = snf;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Date getDateof() {
        return dateof;
    }

    public void setDateof(Date dateof) {
        this.dateof = dateof;
    }

    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }
}
