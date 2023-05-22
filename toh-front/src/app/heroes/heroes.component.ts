import { Component, OnInit } from '@angular/core';

import { HeroDto } from '@/appgenerated/model/heroes/hero-dto';
import { HeroesService } from '@/appgenerated/api/heroes/heroes';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {
  heroes: HeroDto[] = [];

  constructor(
    private heroesService: HeroesService) { }

  ngOnInit(): void {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroesService.searchHeroes()
    .subscribe(heroes => this.heroes = heroes);
  }

  add(name: string): void {
    name = name.trim();
    if (!name) { return; }
    this.heroesService.createHero({ name })
      .subscribe(hero => {
        this.heroes.push(hero);
      });
  }

  delete(hero: HeroDto): void {
    this.heroes = this.heroes.filter(h => h !== hero);
    this.heroesService.deleteHero(hero.id!).subscribe();
  }

}


/*
Copyright Google LLC. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at https://angular.io/license
*/
