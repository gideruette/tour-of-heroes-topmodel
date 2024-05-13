import { HeroService } from '@/appgenerated/api/heroes/hero';
import { HeroDto } from '@/appgenerated/model/heroes/hero-dto';
import { Component, OnInit } from '@angular/core';
import { HeroSearchComponent } from '../hero-search/hero-search.component';
import { RouterLink } from '@angular/router';
import { NgFor } from '@angular/common';

@Component({
    selector: 'app-dashboard',
    templateUrl: './dashboard.component.html',
    styleUrls: ['./dashboard.component.css'],
    standalone: true,
    imports: [NgFor, RouterLink, HeroSearchComponent]
})
export class DashboardComponent implements OnInit {
  heroes: HeroDto[] = [];

  constructor(private heroService: HeroService) { }

  ngOnInit(): void {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroService.getHeroes()
      .subscribe(heroes => this.heroes = heroes.slice(1, 5));
  }
}
