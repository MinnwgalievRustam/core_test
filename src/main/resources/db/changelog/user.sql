CREATE TABLE `citros_db`.`users`
(
    `id`        BIGINT      NOT NULL AUTO_INCREMENT,
    `surname`   VARCHAR(45) NOT NULL,
    `name`      VARCHAR(45) NOT NULL,
    `last_name` VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);
create table user
(
    user_id   BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    surname   varchar(255),
    name      varchar(125),
    last_name varchar(125),
    job_title varchar(255)
);
create table assignment
(
    assignment_id     BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    subject_order     varchar(255),
    author_order_id   bigint not null,
    executor_order_id bigint not null,
    sign_control      varchar(255),
    sign_performance  varchar(255),
    text_order        text,
    FOREIGN KEY (author_order_id) references user (user_id),
    FOREIGN KEY (executor_order_id) references user (user_id)
);

