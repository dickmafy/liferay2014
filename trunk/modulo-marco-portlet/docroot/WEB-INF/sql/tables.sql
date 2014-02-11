create table marco_CarreraProfesional (
	carreraProfesionalorId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	familiaProfesionalId LONG,
	formacion INTEGER,
	nombre VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	duracionFechaInicio DATE null,
	duracionFechaFin DATE null,
	estado INTEGER
);

create table marco_FamiliaProfesional (
	familiaProfesionalId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	sector INTEGER,
	estado INTEGER
);