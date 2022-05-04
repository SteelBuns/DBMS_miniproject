package com.dairyfarm.details.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Employee implements Serializable {
   @Id
   @Column(name="emp_id")
   private Integer id;
   @Column(name="aadhar_number")
   private Long aadhar_number;
   @Column(name="age")
   private Integer age;

   private Long salary;
   private Date join_date;
   private String role;

   public Employee() {}
   public Employee(Integer id,Long aadhar_number,Integer age,Long salary,Date join_date,String role)
   {
      this.id=id;
      this.aadhar_number=aadhar_number;
      this.age=age;
      this.salary=salary;
      this.join_date=join_date;
      this.role=role;
   }
   public Integer getEmp_id(){
      return id;
   }
   public Long getAadhar_number(){
      return aadhar_number;
   }
   public Integer getAge(){
      return age;
   }

   public Long getSalary() {
      return salary;
   }

   public Date getJoin_date() {
      return join_date;
   }

   public String getRole() {
      return role;
   }

   public void setAadhar_number(Long aadhar_number) {
      this.aadhar_number = aadhar_number;
   }

   public void setAge(Integer age) {
      this.age = age;
   }

   public void setEmp_id(Integer id) {
      this.id = id;
   }

   public void setJoin_date(Date join_date) {
      this.join_date = join_date;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public void setSalary(Long salary) {
      this.salary = salary;
   }
}
