-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Profesor` (
  `idProfesor` INT NOT NULL,
  `nombreProfesor` VARCHAR(45) NULL,
  `apellidoProfesor` VARCHAR(45) NULL,
  `telefonoProfesor` VARCHAR(45) NULL,
  `correoProfesor` VARCHAR(45) NULL,
  `grupos` VARCHAR(45) NULL,
  `alumnos` VARCHAR(45) NULL,
  PRIMARY KEY (`idProfesor`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Alumno` (
  `idAlumno` INT NOT NULL,
  `nombreAlumno` VARCHAR(45) NULL,
  `apellidoAlumno` VARCHAR(45) NULL,
  `telefonoAlumno` VARCHAR(45) NULL,
  `correoAlumno` VARCHAR(45) NULL,
  PRIMARY KEY (`idAlumno`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`Calificación`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Calificación` (
  `idCalificación` INT NOT NULL,
  `calificación` VARCHAR(45) NULL,
  `fecha` VARCHAR(45) NULL,
  PRIMARY KEY (`idCalificación`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Posts` (
  `idPost` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPost`))
ENGINE = InnoDB;

INSERT INTO `mydb`.`Posts` (`idPost`) VALUES ('1');
INSERT INTO `mydb`.`Posts` (`idPost`) VALUES ('2');
INSERT INTO `mydb`.`Posts` (`idPost`) VALUES ('3');
INSERT INTO `mydb`.`Posts` (`idPost`) VALUES ('4');
INSERT INTO `mydb`.`Posts` (`idPost`) VALUES ('5');

-- -----------------------------------------------------
-- Table `mydb`.`Grupo/Grado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Clase` (
  `idClase` INT NOT NULL,
  `clase_name` VARCHAR(45) NULL,
  `clase_hrinicial` VARCHAR(45) NULL,
  `clase_hrfinal` VARCHAR(45) NULL,
  `clase_grado` VARCHAR(45) NULL,
  PRIMARY KEY (`idGrupo`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`sub_posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`sub_posts` (
  `idsub_post` INT NOT NULL,
  PRIMARY KEY (`idsub_post`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `usuario` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `tipoUsuario` BIT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`Materia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Materia` (
  `idMateria` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idMateria`))
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;