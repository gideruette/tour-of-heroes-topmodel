import { HeroService } from '@/appgenerated/api/heroes/hero';
import { HeroDto } from '@/appgenerated/model/heroes/hero-dto';
import { Component, OnInit, signal } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HeroSearchComponent } from '../hero-search/hero-search.component';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
  standalone: true,
  imports: [RouterLink, HeroSearchComponent],
})
export class DashboardComponent implements OnInit {
  heroes = signal<HeroDto[]>([]); // Remplacer le signal par un array directement pour illustrer le comportement OnPush

  constructor(private heroService: HeroService) {}

  ngOnInit(): void {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroService
      .getHeroes()
      .subscribe((heroes) => this.heroes.set(heroes.slice(1, 5)));
  }
}
