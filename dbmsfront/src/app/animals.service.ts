import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Animals } from './animals';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class AnimalsService {
  private apiServerUrl = '';

  constructor(private http: HttpClient){}

  public getAnimals(): Observable<Animals[]> {
    return this.http.get<Animals[]>(`${this.apiServerUrl}/animals/all`);
  }

  

  public addAnimal(animals: Animals): Observable<Animals> {
    return this.http.post<Animals>(`${this.apiServerUrl}/animals/add`, animals);
  }

  public updateAnimal(animals: Animals): Observable<Animals> {
    return this.http.put<Animals>(`${this.apiServerUrl}/animal/update`, animals);
  }

  public deleteAnimal(animalNumber: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/animal/delete/${animalNumber}`);
  }
  public findAnimalById(animalNumber: number): Observable<Animals> {
    return this.http.get<Animals>(`${this.apiServerUrl}/animal/find/${animalNumber}`);
  }
}