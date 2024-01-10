import { Location } from "@angular/common";
import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";

import { HeroService } from "src/appgenerated/api/heroes/hero";
import { HeroDto } from "src/appgenerated/model/heroes/hero-dto";

@Component({
  selector: 'app-hero-detail',
  templateUrl: './hero-detail.component.html',
  styleUrls: [ './hero-detail.component.css' ]
})
export class HeroDetailComponent implements OnInit {
  hero: HeroDto | undefined;
  id: number;

  constructor(
    private route: ActivatedRoute,
    private heroService: HeroService,
    private location: Location
    ) {
      this.id = parseInt(this.route.snapshot.paramMap.get("id")!, 10);
    }

  ngOnInit(): void {
    this.getHero();
  }

  getHero(): void {
    this.heroService.getHero(this.id).subscribe((hero) => (this.hero = hero));
  }

  goBack(): void {
    this.location.back();
  }

  save(): void {
    if (this.hero) {
      this.heroService
      .updateHero(this.hero.id!, { name: this.hero.name })
      .subscribe(() => this.goBack());
    }
  }
}
