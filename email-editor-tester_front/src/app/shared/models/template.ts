export class Template {
  id?: number;
  name?: string;
  jsonData?: string;
  htmlData?: string;
  creationDate?: Date;

  constructor(
    name?: string,
    jsonData?: string,
    htmlData?: string,
    creationDate?: Date
  ) {
    this.name = name;
    this.jsonData = jsonData;
    this.htmlData = htmlData;
    this.creationDate = creationDate;
  }
}
