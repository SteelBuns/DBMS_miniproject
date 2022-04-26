package com.dairyfarm.details.model;

import com.fasterxml.jackson.core.JsonEncoding;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {




        @Column(name = "aadhar_number")
        private int aadharNumber;


        @Column(name = "age")
        private int age;

        @Column(name = "salary")
        private int salary;

        @Column(name = "join_date")
        private Date joinDate;

        @Column(name = "role")
        private String role;


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "emp_id")
        private int empId;

        public int getAadharNumber() {
                return aadharNumber;
        }

        public void setAadharNumber(int aadharNumber) {
                this.aadharNumber = aadharNumber;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public int getSalary() {
                return salary;
        }

        public void setSalary(int salary) {
                this.salary = salary;
        }

        public Date getJoinDate() {
                return joinDate;
        }

        public void setJoinDate(Date joinDate) {
                this.joinDate = joinDate;
        }

        public String getRole() {
                return role;
        }

        public void setRole(String role) {
                this.role = role;
        }

        public int getEmpId() {
                return empId;
        }

        public void setEmpId(int empId) {
                this.empId = empId;
        }
}
