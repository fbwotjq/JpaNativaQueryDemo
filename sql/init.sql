CREATE TABLE `user` (
	`id`						BIGINT		 	NOT NULL AUTO_INCREMENT,
	`name`						VARCHAR(20)		NOT NULL,
	`password`					VARCHAR(20)		NOT NULL,
	`created_date`					DATETIME		NOT NULL,
	PRIMARY KEY(id)
)
COLLATE='utf8_general_ci'
ENGINE=INNODB;

INSERT INTO `user` (`name`, `password`, `created_date`) VALUES ('fbwotjq1', '1234', NOW());
INSERT INTO `user` (`name`, `password`, `created_date`) VALUES ('fbwotjq2', '1234', NOW());
INSERT INTO `user` (`name`, `password`, `created_date`) VALUES ('fbwotjq3', '1234', NOW());
INSERT INTO `user` (`name`, `password`, `created_date`) VALUES ('fbwotjq4', '1234', NOW());
INSERT INTO `user` (`name`, `password`, `created_date`) VALUES ('fbwotjq5', '1234', NOW());