CREATE TABLE tipo_documento (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    tipo_documento VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    estado VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);