package com.dairyfarm.details.model;

import javax.persistence.*;
import java.sql.Date;
@Entity
public class MilkRecords {
    public enum s {
        am, pm;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Integer milkrec;
    private Integer milk_quantity;
    private Double snf;
    private Double fat;
    private s shift;
    private Date dateof;
    private String type_of_milk;

    private Integer animal_number;

    public MilkRecords(){
    }
    public void MilkRecords( Integer milk_quantity,Double snf, Double fat, s shift, Date dateof,String type_of_milk,Integer animal_number)
    {
        this.milk_quantity=milk_quantity;
        this.snf=snf;
        this.fat=fat;
        this.shift=shift;
        this.dateof=dateof;
        this.type_of_milk=type_of_milk;
        this.animal_number=animal_number;
    }

    public void setMilk_quantity(Integer milk_quantity) {
        this.milk_quantity = milk_quantity;
    }

    public void setSnf(Double snf) {
        this.snf = snf;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public void setShift(s shift) {
        this.shift = shift;
    }

    public void setDateof(Date dateof) {
        this.dateof = dateof;
    }

    public void setType_of_milk(String type_of_milk) {
        this.type_of_milk = type_of_milk;
    }

    public void setAnimal_number(Integer animal_number) {
        this.animal_number = animal_number;
    }

    public Integer getAnimal_number() {
        return animal_number;
    }

    public Date getDateof() {
        return dateof;
    }

    public Double getFat() {
        return fat;
    }

    public Double getSnf() {
        return snf;
    }

    public Integer getMilk_quantity() {
        return milk_quantity;
    }

    public s getShift() {
        return shift;
    }

    public String getType_of_milk() {
        return type_of_milk;
    }
}
