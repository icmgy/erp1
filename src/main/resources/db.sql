create table goods
(
	id int auto_increment
		primary key,
	name varchar(64) not null,
	price double null,
	remain int null,
	constraint goods_name_uindex
		unique (name)
)
engine=InnoDB
;

create table goods_person_map
(
	id int auto_increment
		primary key,
	goods_name varchar(64) null,
	person_name varchar(64) null,
	price double null
)
engine=InnoDB
;

create table `order`
(
	id int auto_increment
		primary key,
	createTime datetime default CURRENT_TIMESTAMP null,
	amount double null,
	send_time datetime default CURRENT_TIMESTAMP null,
	is_sent tinyint(1) default '0' null,
	is_pay tinyint(1) default '0' null
)
engine=InnoDB
;

create table order_element
(
	id int auto_increment
		primary key,
	order_id int null,
	count int null,
	goods_person_mapping_id int null
)
engine=InnoDB
;

create table person
(
	id int auto_increment
		primary key,
	name varchar(64) not null,
	address varchar(124) null,
	phone varchar(32) null,
	constraint person_name_uindex
		unique (name)
)
engine=InnoDB
;

