create table BASE_Institucion (
	institucionId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	RUC VARCHAR(75) null,
	codigoModular VARCHAR(75) null
);