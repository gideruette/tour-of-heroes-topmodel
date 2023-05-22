////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

import {DO_ID, DO_LIBELLE} from "@/domains";

export interface HeroDto {
    id?: number,
    name?: string
}

export const HeroDtoEntity = {
    id: {
        type: "field",
        name: "id",
        domain: DO_ID,
        isRequired: false,
        label: "heroes.hero.id"
    },
    name: {
        type: "field",
        name: "name",
        domain: DO_LIBELLE,
        isRequired: true,
        label: "heroes.hero.name"
    }
} as const
