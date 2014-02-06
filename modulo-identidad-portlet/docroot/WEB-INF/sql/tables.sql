create table ID_Persona (
	personaId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	codigoId VARCHAR(75) null,
	nombres VARCHAR(75) null,
	apellidoPaterno VARCHAR(75) null,
	apellidoMaterno VARCHAR(75) null,
	genero BOOLEAN,
	estadoCivil INTEGER,
	fechaNacimiento DATE null,
	ubigeoNacimiento VARCHAR(75) null
);