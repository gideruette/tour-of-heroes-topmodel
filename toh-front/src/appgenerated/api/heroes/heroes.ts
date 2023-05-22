////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////


import {HttpClient, HttpParams} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {HeroCreationDto} from "../../model/heroes/hero-creation-dto";
import {HeroDto} from "../../model/heroes/hero-dto";
import {HeroUpdateDto} from "../../model/heroes/hero-update-dto";
@Injectable({
    providedIn: 'root'
})
export class HeroesService {

    constructor(private http: HttpClient) {}

    /**
     * Création d'un héro
     * @param heroUpdate Informations à modifier
     * @param options Options pour 'fetch'.
     * @returns Liste des héros
     */
    createHero(heroUpdate: HeroCreationDto): Observable<HeroDto> {
        return this.http.post<HeroDto>(`/heroes`, heroUpdate);
    }

    /**
     * Suppression d'un héro
     * @param herId Id technique du héro
     * @param options Options pour 'fetch'.
     */
    deleteHero(herId: number): Observable<void> {
        return this.http.delete<void>(`/heroes/${herId}`);
    }

    /**
     * Renvoie le détail d'un héro
     * @param herId Id technique du héro
     * @param options Options pour 'fetch'.
     * @returns Liste des héros
     */
    getHero(herId: number): Observable<HeroDto> {
        return this.http.get<HeroDto>(`/heroes/${herId}`);
    }

    /**
     * Renvoie la liste des héros filtrés avec le terme le cas échéant
     * @param term Terme de la recherche
     * @param options Options pour 'fetch'.
     * @returns Liste des héros
     */
    searchHeroes(term?: string, queryParams: any = {}): Observable<HeroDto[]> {
        if(term) {
            queryParams['term'] = term
        }

        const httpParams = new HttpParams({fromObject : queryParams});
        const httpOptions = { params: httpParams }

        return this.http.get<HeroDto[]>(`/heroes`, httpOptions);
    }

    /**
     * Modification d'un héro
     * @param herId Id technique du héro
     * @param heroUpdate Informations à modifier
     * @param options Options pour 'fetch'.
     * @returns Liste des héros
     */
    updateHero(herId: number, heroUpdate: HeroUpdateDto): Observable<HeroDto> {
        return this.http.patch<HeroDto>(`/heroes/${herId}`, heroUpdate);
    }
}
