import { Component, OnInit } from '@angular/core';
import { JsonService } from '../services/json/json.service';
import { Json } from '../shared/models/json';

@Component({
  selector: 'app-gallerie',
  templateUrl: './gallerie.component.html',
  styleUrls: ['./gallerie.component.css'],
})
export class GallerieComponent implements OnInit {
  json: Json = new Json();
  jsons: Json[] = [];

  constructor(private jsonSerice: JsonService) {}
  jsonLoad: any;

  blank() {
    this.jsonSerice.getJson(1).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  oneColumn() {
    this.jsonSerice.getJson(2).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  twoColumn() {
    this.jsonSerice.getJson(3).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  threeColumn() {
    this.jsonSerice.getJson(4).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  ngOnInit(): void {
    this.jsonSerice.getJson(2).subscribe((json) => {
      this.json = json;
    });
  }
  getAllJson() {
    return this.jsonSerice.getAllJson().subscribe((jsons) => {
      this.jsons = jsons;
      console.log(this.jsons);
    });
  }
}
