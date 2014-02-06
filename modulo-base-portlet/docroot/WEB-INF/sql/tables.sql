create table BASE_Institucion (
	institucionId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	codigoId VARCHAR(75) null,
	nombre VARCHAR(75) null
);