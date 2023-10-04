CREATE TABLE `bdejercicio3`.`productos` (
  `codigoproducto` INT NOT NULL,
  `producto` VARCHAR(45) NULL,
  `preciounitario` DOUBLE NULL,
  `stock` INT NULL,
  PRIMARY KEY (`codigoproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;