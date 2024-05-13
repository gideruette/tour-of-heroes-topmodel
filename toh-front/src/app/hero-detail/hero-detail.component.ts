import { Location, NgIf, UpperCasePipe } from '@angular/common';
import { Component, Input, OnInit } from '@angular/core';

import { FormsModule } from '@angular/forms';
import { HeroService } from 'src/appgenerated/api/heroes/hero';
import { HeroDto } from 'src/appgenerated/model/heroes/hero-dto';

@Component({
  selector: 'app-hero-detail',
  templateUrl: './hero-detail.component.html',
  styleUrls: ['./hero-detail.component.css'],
  standalone: true,
  imports: [NgIf, FormsModule, UpperCasePipe],
})
export class HeroDetailComponent implements OnInit {
  hero: HeroDto | undefined;
  @Input() id!: number;

  constructor(private heroService: HeroService, private location: Location) {}

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
