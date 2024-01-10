----
---- ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
----

-- =========================================================================================== 
--   Application Name	:	tourOfHeroes 
--   Script Name		:	05_init_data.sql
--   Description		:	Script d'insertion des données de références
-- ===========================================================================================
/**		Initialisation de la table HERO		**/
INSERT INTO HERO(HER_NAME) VALUES('Wonder Woman');
INSERT INTO HERO(HER_NAME) VALUES('Super Player');

/**		Initialisation de la table HERO_TYPE		**/
INSERT INTO HERO_TYPE(HTY_CODE, HTY_LIBELLE) VALUES('HUM', 'Humain');
INSERT INTO HERO_TYPE(HTY_CODE, HTY_LIBELLE) VALUES('EXT', 'Extra terrestre');

