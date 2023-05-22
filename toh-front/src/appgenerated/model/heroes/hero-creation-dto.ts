////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

import {DO_LIBELLE} from "@/domains";

export interface HeroCreationDto {
    name?: string
}

export const HeroCreationDtoEntity = {
    name: {
        type: "field",
        name: "name",
        domain: DO_LIBELLE,
        isRequired: true,
        label: "heroes.hero.name"
    }
} as const
