create table BASE_Formacion (
	formacionId LONG not null primary key,
	companyId LONG,
	nombre VARCHAR(75) null
);

create table BASE_Institucion (
	institucionId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	formacionId LONG,
	RUC VARCHAR(75) null,
	codigoModular VARCHAR(75) null
);