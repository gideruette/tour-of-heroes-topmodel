import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { Location } from "@angular/common";

import { HeroDto } from "@/appgenerated/model/heroes/hero-dto";
import { HeroesService } from "@/appgenerated/api/heroes/heroes";

@Component({
  selector: "app-hero-detail",
  templateUrl: "./hero-detail.component.html",
  styleUrls: ["./hero-detail.component.css"]
})
export class HeroDetailComponent implements OnInit {
  hero: HeroDto | undefined;
  id: number;

  constructor(
    private route: ActivatedRoute,
    private heroesService: HeroesService,
    private location: Location
  ) {
    this.id = parseInt(this.route.snapshot.paramMap.get("id")!, 10);
  }

  ngOnInit(): void {
    this.getHero();
  }

  getHero(): void {
    this.heroesService.getHero(this.id).subscribe((hero) => (this.hero = hero));
  }

  goBack(): void {
    this.location.back();
  }

  save(): void {
    if (this.hero) {
      this.heroesService
        .updateHero(this.hero.id!, { name: this.hero.name })
        .subscribe(() => this.goBack());
    }
  }
}

/*
Copyright Google LLC. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at https://angular.io/license
*/
