import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public employees: Employee[] = [];

  constructor(private employeeService: EmployeeService) { }


  public getEmployees(): void {
    this.employeeService.getEmployees().subscribe
    (response: Employee[])=>{
      this.employees= response;

    },
    ()
  }
}



