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
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `grupos` VARCHAR(45) NULL,
  `alumnos` VARCHAR(45) NULL,
  PRIMARY KEY (`idProfesor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Alumno` (
  `idAlumno` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`idAlumno`))
ENGINE = InnoDB;

INSERT INTO `mydb`.`Calificación` (`idCalificación`,`calificación`,`fecha`) VALUES (1,'5','25feb2021');
INSERT INTO `mydb`.`Calificación` (`idCalificación`,`calificación`,`fecha`) VALUES (2,'8','13Abril2020');
INSERT INTO `mydb`.`Calificación` (`idCalificación`,`calificación`,`fecha`) VALUES (3,'10','10Enero2021');
INSERT INTO `mydb`.`Calificación` (`idCalificación`,`calificación`,`fecha`) VALUES (4,'9','16Sep2021');
INSERT INTO `mydb`.`Calificación` (`idCalificación`,`calificación`,`fecha`) VALUES (5,'7','21Feb2020');

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


-- -----------------------------------------------------
-- Table `mydb`.`Grupo/Grado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Grupo/Grado` (
  `idGrupo` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
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

INSERT INTO `mydb`.`Usuario` (`idUsuario`,`usuario`,`password`,`tipoUsuario`) VALUES (1,'cesaradrianer','p4ssw0rd',0);
INSERT INTO `mydb`.`Usuario` (`idUsuario`,`usuario`,`password`,`tipoUsuario`) VALUES (2,'eduvdz','p4ssw0rd',0);
INSERT INTO `mydb`.`Usuario` (`idUsuario`,`usuario`,`password`,`tipoUsuario`) VALUES (3,'juanjo','p4ssw0rd',0);
INSERT INTO `mydb`.`Usuario` (`idUsuario`,`usuario`,`password`,`tipoUsuario`) VALUES (4,'paosuarez','p4ssw0rd',0);
INSERT INTO `mydb`.`Usuario` (`idUsuario`,`usuario`,`password`,`tipoUsuario`) VALUES (5,'gutierritos','p4ssw0rd',0);

-- -----------------------------------------------------
-- Table `mydb`.`Materia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Materia` (
  `idMateria` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idMateria`))
ENGINE = InnoDB;

INSERT INTO `mydb`.`Materia` (`idMateria`,`nombre`) VALUES (1,'Álgebra');
INSERT INTO `mydb`.`Materia` (`idMateria`,`nombre`) VALUES (2,'Historia');
INSERT INTO `mydb`.`Materia` (`idMateria`,`nombre`) VALUES (3,'Geografía');
INSERT INTO `mydb`.`Materia` (`idMateria`,`nombre`) VALUES (4,'Química');
INSERT INTO `mydb`.`Materia` (`idMateria`,`nombre`) VALUES (5,'Inglés');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


