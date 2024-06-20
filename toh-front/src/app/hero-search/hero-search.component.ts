import { Component, OnInit } from '@angular/core';

import { Subject } from 'rxjs';

import { debounceTime, distinctUntilChanged, switchMap } from 'rxjs/operators';

import { HeroService } from '@/appgenerated/api/heroes/hero';
import { HeroDto } from '@/appgenerated/model/heroes/hero-dto';
import { AsyncPipe } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-hero-search',
  templateUrl: './hero-search.component.html',
  styleUrls: ['./hero-search.component.css'],
  standalone: true,
  imports: [RouterLink, AsyncPipe],
})
export class HeroSearchComponent implements OnInit {
  heroes!: HeroDto[];
  private searchTerms = new Subject<string>();

  constructor(private heroService: HeroService) {}

  // Push a search term into the observable stream.
  search(term: string): void {
    this.searchTerms.next(term);
  }

  ngOnInit(): void {
    this.searchTerms
      .pipe(
        // wait 300ms after each keystroke before considering the term
        debounceTime(300),

        // ignore new term if same as previous term
        distinctUntilChanged(),

        // switch to new search observable each time the term changes
        switchMap((term: string) => this.heroService.getHeroes(term))
      )
      .subscribe((heroes) => (this.heroes = heroes));
  }
}
