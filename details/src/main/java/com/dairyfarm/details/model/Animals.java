package com.dairyfarm.details.model;

import com.fasterxml.jackson.core.JsonEncoding;

import javax.persistence.*;

@Entity
@Table(name="animals")
public class Animals {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "animal_number")
        private int animalNumber;

        @Column(name = "source")
        private String source;

        @Column(name = "gender")
        private String gender;

        @Column(name = "breed")
        private String breed;

        @Column(name = "state")
        private String state;

        @Column(name = "emp_id")
        private int empId;

        public int getAnimalNumber() {
                return animalNumber;
        }

        public void setAnimalNumber(int animalNumber) {
                this.animalNumber = animalNumber;
        }

        public String getSource() {
                return source;
        }

        public void setSource(String source) {
                this.source = source;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getBreed() {
                return breed;
        }

        public void setBreed(String breed) {
                this.breed = breed;
        }

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
        }

        public int getEmpId() {
                return empId;
        }

        public void setEmpId(int empId) {
                this.empId = empId;
        }
}
