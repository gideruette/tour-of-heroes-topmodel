import { HeroCreationDto } from '@/appgenerated/model/heroes/hero-creation-dto';
import { NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HeroService } from 'src/appgenerated/api/heroes/hero';
import { HeroDto } from 'src/appgenerated/model/heroes/hero-dto';

@Component({
    selector: 'app-heroes',
    templateUrl: './heroes.component.html',
    styleUrls: ['./heroes.component.css'],
    standalone: true,
    imports: [NgFor, RouterLink],
})
export class HeroesComponent implements OnInit {
  heroes: HeroDto[] = [];

  constructor(private heroService: HeroService) {}

  ngOnInit(): void {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroService.getHeroes().subscribe((heroes) => (this.heroes = heroes));
  }

  add(name: string): void {
    name = name.trim();
    if (!name) {
      return;
    }
    this.heroService.addHero({ name } as HeroCreationDto).subscribe((hero) => {
      this.heroes.push(hero);
    });
  }

  delete(hero: HeroDto): void {
    this.heroService.deleteHero(hero.id!).subscribe(() => this.getHeroes());
  }
}
