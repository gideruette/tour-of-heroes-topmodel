﻿----
---- ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
----

-- =========================================================================================== 
--   Application Name	:	tourOfHeroes 
--   Script Name		:	02_create_tables.sql
--   Description		:	Script de création des tables.
-- =========================================================================================== 
/**
  * Création de la table HERO
 **/
create table HERO (
	HER_ID int8 generated by default as identity not null,
	HER_NAME varchar(100) not null,
	constraint PK_HERO primary key (HER_ID)
);

/**
  * Création de la table HERO_TYPE
 **/
create table HERO_TYPE (
	HTY_CODE varchar(3) not null,
	HTY_LIBELLE varchar(100) not null,
	constraint PK_HERO_TYPE primary key (HTY_CODE)
);

