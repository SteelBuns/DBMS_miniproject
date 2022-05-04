package com.dairyfarm.details.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity

public class Animals implements Serializable {



    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public g getGender() {
        return gender;
    }

    public void setGender(g gender) {
        this.gender = gender;
    }
@Id
    private Integer id;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public k getState() {
        return state;
    }

    public void setState(k state) {
        this.state = state;
    }

    private String breed;
    private Integer emp_id;
    private g gender;
    private String source;
    private k state;
    public enum g {
        f, m;
    }
    public enum k {
        lacation_period, gestation_period, dead, none;
    }
}
