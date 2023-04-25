export class Json {
  id?: number;
  name?: string;
  jsonData?: string;

  constructor(id?: number, name?: string, jsonData?: string) {
    this.id = id;
    this.name = name;
    this.jsonData = jsonData;
  }
}
