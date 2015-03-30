create table user(
	id int  IDENTITY primary key,
	name varchar(20) not null,
	email varchar(40),
	phone varchar(20),
	status int 
);