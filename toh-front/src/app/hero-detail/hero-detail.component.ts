import { Location, NgIf, UpperCasePipe } from '@angular/common';
import {
  Component,
  InputSignal,
  OnInit,
  Signal,
  WritableSignal,
  computed,
  input,
  signal,
} from '@angular/core';

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
  hero: WritableSignal<HeroDto | undefined>;
  heroName: Signal<string | undefined>;
  id: InputSignal<number> = input.required<number>();
  constructor(
    private readonly heroService: HeroService,
    private readonly location: Location
  ) {
    this.hero = signal(undefined);
    this.heroName = computed(() => this.hero()?.name);
  }

  ngOnInit(): void {
    this.getHero();
  }

  getHero(): void {
    this.heroService
      .getHero(this.id())
      .subscribe((hero) => this.hero.set(hero));
  }

  goBack(): void {
    this.location.back();
  }

  save(): void {
    const hero = this.hero();
    if (hero) {
      this.heroService
        .updateHero(this.id(), { name: hero.name })
        .subscribe(() => this.goBack());
    }
  }

  nameChanged(name: any) {
    this.hero.set({ ...this.hero(), name });
  }
}
