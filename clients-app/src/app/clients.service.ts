import { Injectable } from '@angular/core';
import { Client } from './clients/client';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientsService {

  constructor(private http: HttpClient) {}

  getClient() : Client {
    let client = new Client();
    client.name = "Fulano de Tal";
    client.cpf = "000.000.000-00";

    return client;
  }

  save( client : Client ) : Observable<Client> {
    return this.http.post<Client>('http://localhost:8080/api/clients', client);
  }
}
