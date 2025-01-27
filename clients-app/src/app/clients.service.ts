import { Injectable } from '@angular/core';
import { Client } from './clients/client';

@Injectable({
  providedIn: 'root'
})
export class ClientsService {

  constructor() { }

  getClient() : Client {
    let client = new Client();
    client.name = "Fulano de Tal";
    client.cpf = "000.000.000-00";

    return client;
  }
}
