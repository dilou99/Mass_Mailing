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

  constructor(private jsonService: JsonService) {}
  jsonLoad: any;

  blank() {
    this.jsonService.getJson(1).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  oneColumn() {
    this.jsonService.getJson(2).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  twoColumn() {
    this.jsonService.getJson(3).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  threeColumn() {
    this.jsonService.getJson(4).subscribe((json) => {
      this.jsonLoad = json.jsonData;
    });
  }
  ngOnInit(): void {
    this.jsonService.getJson(2).subscribe((json) => {
      this.json = json;
    });
  }
  getAllJson() {
    return this.jsonService.getAllJson().subscribe((jsons) => {
      this.jsons = jsons;
      console.log(this.jsons);
    });
  }
}
