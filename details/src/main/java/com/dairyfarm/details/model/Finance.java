package com.dairyfarm.details.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
@Entity
public class Finance {
    public enum t {
        debit, credit;
    }
   @Id
    private Integer id;
    private Date date_time;
    private Double amount;
    private t trans_type;
    private Integer emp_id;
    private String type_of_trans;
    private String note;

    public Finance(){
    }
    public Finance(Integer id, Date date_time,Double amount,t trans_type,Integer emp_id,String type_of_trans,String note){
        this.id=id;
        this.date_time=date_time;
        this.amount=amount;
        this.trans_type=trans_type;
        this.emp_id=emp_id;
        this.type_of_trans=type_of_trans;
        this.note=note;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setTrans_type(t trans_type) {
        this.trans_type = trans_type;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public void setType_of_trans(String type_of_trans) {
        this.type_of_trans = type_of_trans;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public Date getDate_time() {
        return date_time;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public String getNote() {
        return note;
    }

    public String getType_of_trans() {
        return type_of_trans;
    }

    public t getTrans_type() {
        return trans_type;
    }
}
