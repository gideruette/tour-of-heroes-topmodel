////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////


import { HttpClient, HttpParams } from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {HeroCreationDto} from "../../model/heroes/hero-creation-dto";
import {HeroDto} from "../../model/heroes/hero-dto";
import {HeroUpdateDto} from "../../model/heroes/hero-update-dto";
@Injectable({
    providedIn: 'root'
})
export class HeroService {

    constructor(private http: HttpClient) {}

    /**
     * @description Création d'un héro
     * @param heroUpdate Informations à modifier
     * @returns Liste des héros
     */
    addHero(heroUpdate: HeroCreationDto): Observable<HeroDto> {
        return this.http.post<HeroDto>(`/hero`, heroUpdate);
    }

    /**
     * @description Suppression d'un héro
     * @param herId Id technique du héro
     */
    deleteHero(herId: number): Observable<void> {
        return this.http.delete<void>(`/hero/${herId}`);
    }

    /**
     * @description Renvoie le détail d'un héro
     * @param herId Id technique du héro
     * @returns Liste des héros
     */
    getHero(herId: number): Observable<HeroDto> {
        return this.http.get<HeroDto>(`/hero/${herId}`);
    }

    /**
     * @description Renvoie la liste des héros filtrés avec le terme le cas échéant
     * @param term Terme de la recherche
     * @returns Liste des héros
     */
    getHeroes(term?: string, queryParams: any = {}): Observable<HeroDto[]> {
        if(term) {
            queryParams['term'] = term
        }

        const httpParams = new HttpParams({fromObject : queryParams});
        const httpOptions = { params: httpParams }

        return this.http.get<HeroDto[]>(`/hero`, httpOptions);
    }

    /**
     * @description Modification d'un héro
     * @param herId Id technique du héro
     * @param heroUpdate Informations à modifier
     * @returns Liste des héros
     */
    updateHero(herId: number, heroUpdate: HeroUpdateDto): Observable<HeroDto> {
        return this.http.patch<HeroDto>(`/hero/${herId}`, heroUpdate);
    }
}
