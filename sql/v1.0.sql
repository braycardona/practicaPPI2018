DROP DATABASE IF EXISTS COLSEVI;

CREATE DATABASE COLSEVI;

CREATE TABLE tipo_documento(
	id_tipo_documento INT AUTO_INCREMENT,
    nombre VARCHAR (30) NOT NULL,
    descripcion VARCHAR (30) NOT NULL,
    PRIMARY KEY(id_tipo_documento)
);

CREATE TABLE persona(
	id_persona INT AUTO_INCREMENT,
    tipo_doc INT NOT NULL,
    documento VARCHAR (30) NOT NULL,
    genero VARCHAR (1) NOT NULL,
    nombre VARCHAR(60),
    apellido VARCHAR(60),
    PRIMARY KEY(id_persona),
	UNIQUE (documento),
    CONSTRAINT fk_tipoDocPersona FOREIGN KEY (tipo_doc)
	REFERENCES tipo_documento(id_tipo_documento)
);

CREATE TABLE usuario(
	id_usuario INT AUTO_INCREMENT,
	usuario VARCHAR(40) NOT NULL,
    id_persona INT NOT NULL,
    clave VARCHAR(80) NOT NULL,
    estado VARCHAR(1) NOT NULL,
    correo VARCHAR(50) NOT NULL,
    primer_login VARCHAR(1) NOT NULL,
	PRIMARY KEY(id_usuario),
    UNIQUE (usuario),
    CONSTRAINT fk_Persona FOREIGN KEY (id_persona)
	REFERENCES persona(id_persona)
);

CREATE TABLE pagina(
	id_pagina INT AUTO_INCREMENT,
    codigo VARCHAR (30) NOT NULL,
    url VARCHAR (50) NOT NULL,
    nombre VARCHAR (50) NOT NULL,
    icono VARCHAR (50),
    padrePagina INT,
    PRIMARY KEY(id_pagina),
    CONSTRAINT fk_PaginaPadre FOREIGN KEY (padrePagina)
	REFERENCES pagina(id_pagina)
);

CREATE TABLE rol(
	id_rol INT AUTO_INCREMENT,
    nombre_rol VARCHAR(40) NOT NULL,
    codigo_rol VARCHAR(80) NOT NULL,
	PRIMARY KEY(id_rol),
	REFERENCES pagina(id_pagina)
);

CREATE TABLE pagina_x_rol(
	id_rol INT NOT NULL,
    id_pagina INT NOT NULL,
	PRIMARY KEY(id_rol, id_pagina),
    CONSTRAINT fk_idrolpagina FOREIGN KEY (id_rol)
	REFERENCES rol(id_rol),
    CONSTRAINT fk_paginaId FOREIGN KEY (id_pagina)
	REFERENCES pagina(id_pagina)
);

CREATE TABLE usuario_x_rol(
	id_rol INT NOT NULL,
    id_usuario INT NOT NULL,
	PRIMARY KEY(id_rol, id_usuario),
    CONSTRAINT fk_idrol FOREIGN KEY (id_rol)
	REFERENCES rol(id_rol),
    CONSTRAINT fk_UxPersona FOREIGN KEY (id_usuario)
	REFERENCES usuario(id_usuario)
);

CREATE TABLE establecimiento(
	id_establecimiento INT AUTO_INCREMENT,
    nombre VARCHAR (30) NOT NULL,
    descripcion VARCHAR (30) NOT NULL,
    hora_inicio VARCHAR(7),
    hora_fin VARCHAR(7),
    id_direccion INT,
    id_telefono INT,
    id_correo INT,
    PRIMARY KEY(id_establecimiento)
);

CREATE TABLE tipo_telefono(
	id_tipo_telefono INT AUTO_INCREMENT,
    nombre VARCHAR (20) NOT NULL,
	descripcion VARCHAR (40) NOT NULL,
    PRIMARY KEY(id_tipo_telefono)
);

CREATE TABLE telefono(
	id_telefono INT AUTO_INCREMENT,
    telefono INT  NOT NULL,
    id_tipo_telefono INT NOT NULL,
    id_persona INT DEFAULT NULL,
	CONSTRAINT fk_tipo_telefono FOREIGN KEY (id_tipo_telefono)
    REFERENCES tipo_telefono(id_tipo_telefono),
    CONSTRAINT fk_id_persona_telefono FOREIGN KEY (id_persona)
    REFERENCES persona(id_persona),
    PRIMARY KEY(id_telefono)
);

CREATE TABLE direccion(
	id_direccion INT AUTO_INCREMENT,
    id_persona INT DEFAULT NULL,
	direccion VARCHAR (20) NOT NULL,
    barrio VARCHAR (20),
    descripcion VARCHAR (40),
    CONSTRAINT fk_id_persona_direccion FOREIGN KEY (id_persona)
    REFERENCES persona(id_persona),
    PRIMARY KEY(id_direccion)
);

CREATE TABLE correo(
	id_correo INT AUTO_INCREMENT,
    id_persona INT DEFAULT NULL,
    CONSTRAINT fk_id_persona_correo FOREIGN KEY (id_persona)
    REFERENCES persona(id_persona),
	correo VARCHAR (50) NOT NULL,
    PRIMARY KEY(id_correo)
);

ALTER TABLE establecimiento ADD CONSTRAINT fk_id_direccion FOREIGN KEY (id_direccion)
REFERENCES direccion(id_direccion);
ALTER TABLE establecimiento ADD CONSTRAINT fk_id_telefono FOREIGN KEY (id_telefono)
REFERENCES telefono(id_telefono);
ALTER TABLE establecimiento ADD CONSTRAINT fk_id_correo FOREIGN KEY (id_correo)
REFERENCES correo(id_correo);

CREATE TABLE tipo_proveedor(
    id_tipo_proveedor INT AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_tipo_proveedor)
);

CREATE TABLE proveedor (
	id_proveedor INT AUTO_INCREMENT,
	id_direccion INT,
    id_tipo_proveedor INT,
    id_telefono INT,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(80) NOT NULL,
    PRIMARY KEY(id_proveedor),
    CONSTRAINT fk_direccionProveedor FOREIGN KEY (id_direccion) REFERENCES direccion(id_direccion),
    CONSTRAINT fk_tipo_proveedor FOREIGN KEY (id_tipo_proveedor) REFERENCES tipo_proveedor(id_tipo_proveedor),
    CONSTRAINT fk_telefono_proveedor FOREIGN KEY (id_telefono) REFERENCES telefono(id_telefono)
);

CREATE TABLE compra(
	id_compra INT AUTO_INCREMENT,
    id_proveedor INT NOT NULL,
    id_establecimiento INT,
    valor DECIMAL(12,2) NOT NULL,
    fecha_compra DATETIME NOT NULL,
    pagado BOOLEAN DEFAULT FALSE,
    motivo VARCHAR(200),
    PRIMARY KEY(id_compra),
    CONSTRAINT fk_compra_establecimiento FOREIGN KEY (id_establecimiento) REFERENCES establecimiento(id_establecimiento)
	CONSTRAINT fk_compra_proveedor FOREIGN KEY (id_proveedor) REFERENCES proveedor(id_proveedor)
);

CREATE TABLE tipo_peso(
    id_tipo_peso INT AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(80) DEFAULT NULL,
    PRIMARY KEY(id_tipo_peso)
);

CREATE TABLE clasificar_ingrediente(
	id_clasificar_ingrediente INT AUTO_INCREMENT,
    nombre VARCHAR(40),
    descripcion VARCHAR(150),
    PRIMARY KEY(id_clasificar_ingrediente)
);

CREATE TABLE ingrediente(
    id_ingrediente INT AUTO_INCREMENT,
    id_clasificar_ingrediente INT,
	nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(80) DEFAULT NULL,
    PRIMARY KEY(id_ingrediente),
    CONSTRAINT fk_IngClasificar FOREIGN KEY (id_clasificar_ingrediente) REFERENCES clasificar_ingrediente(id_clasificar_ingrediente)
);

CREATE TABLE compra_x_ingrediente(
	id_compra INT,
    id_ingrediente INT,
    id_tipo_peso INT NOT NULL,
    lote INT AUTO_INCREMENT,
    fecha_vencimiento DATETIME,
    cantidad INT,
    PRIMARY KEY(lote,id_compra,id_ingrediente),
	CONSTRAINT fk_comprasXIngrediente FOREIGN KEY (id_compra) REFERENCES compra(id_compra),
    CONSTRAINT fk_comprasXIngrediente2 FOREIGN KEY (id_ingrediente) REFERENCES ingrediente(id_ingrediente),
    CONSTRAINT fk_comprasXIngrediente3 FOREIGN KEY (id_tipo_peso) REFERENCES tipo_peso(id_tipo_peso)
);

ALTER TABLE compra_x_ingrediente AUTO_INCREMENT = 1000;

CREATE TABLE tipo_producto(
    id_tipo_producto INT AUTO_INCREMENT,
    padre INT DEFAULT NULL,
	nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(80) DEFAULT NULL,
    PRIMARY KEY(id_tipo_producto),
    CONSTRAINT fk_id_tipo_producto FOREIGN KEY (padre) REFERENCES tipo_producto(id_tipo_producto)
);

CREATE TABLE producto(
    id_producto INT AUTO_INCREMENT,
    id_tipo_producto INT,
    referencia VARCHAR(8) DEFAULT NULL,
	nombre VARCHAR(40) NOT NULL,
    descripcion VARCHAR(120) DEFAULT NULL,
    costo DECIMAL(12,2),
    venta DECIMAL(12,2),
    imagen VARCHAR (50) DEFAULT 'imagenFotoProducto.jpg',
    PRIMARY KEY(id_producto),
    UNIQUE (referencia),
    CONSTRAINT fk_tipo_producto_Producto FOREIGN KEY (id_tipo_producto) REFERENCES tipo_producto(id_tipo_producto)
);


CREATE TABLE ingrediente_x_producto(
    id_ingrediente INT,
	id_producto INT,
	cantidad INT,
	id_tipo_peso INT,
    PRIMARY KEY(id_ingrediente,id_producto),
    CONSTRAINT fk_producto_ingrediente FOREIGN KEY (id_producto) REFERENCES tipo_producto(id_tipo_producto),
    CONSTRAINT fk_ingredienteProducto FOREIGN KEY (id_ingrediente) REFERENCES ingrediente(id_ingrediente),
    CONSTRAINT fk_ingredienteProdTipe FOREIGN KEY (id_tipo_peso) REFERENCES tipo_peso(id_tipo_peso)
);

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE pagina ;

CREATE TABLE pagina(
	id_pagina INT AUTO_INCREMENT,
    codigo VARCHAR (30) NOT NULL,
    url VARCHAR (50) NOT NULL,
    nombre VARCHAR (50) NOT NULL,
    icono VARCHAR (50),
    padrePagina INT,
    CONSTRAINT fk_PaginaPadre FOREIGN KEY (padrePagina)
	REFERENCES pagina(id_pagina),
    PRIMARY KEY(id_pagina)
);

SET FOREIGN_KEY_CHECKS = 1;


CREATE TABLE receta(
    id_receta INT AUTO_INCREMENT,
	id_producto INT,
    preparacion VARCHAR(2000),
    PRIMARY KEY(id_receta),
    CONSTRAINT fk_recetaProducto FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE catalogo(
    id_catalogo INT AUTO_INCREMENT,
	id_establecimiento INT,
    nombre VARCHAR(50),
    descripcion VARCHAR(80),
    vigente BOOLEAN DEFAULT FALSE,
    PRIMARY KEY(id_catalogo),
    CONSTRAINT fk_establecimientoCatalogo FOREIGN KEY (id_establecimiento) REFERENCES establecimiento(id_establecimiento)
);

CREATE TABLE catalogo_x_producto(
    id_catalogo INT,
	id_producto INT,
    PRIMARY KEY(id_catalogo,id_producto),
    CONSTRAINT fk_producto_catalogo FOREIGN KEY (id_producto) REFERENCES producto(id_producto),
    CONSTRAINT fk_catalogoProductoCatalogo FOREIGN KEY (id_catalogo) REFERENCES catalogo(id_catalogo)
);

CREATE TABLE estado_pedido(
    id_estado_pedido INT AUTO_INCREMENT,
	nombre VARCHAR(30) NOT NULL,
    descripcion VARCHAR(70) DEFAULT NULL,
    PRIMARY KEY(id_estado_pedido)
);

CREATE TABLE pedido(
    id_pedido INT AUTO_INCREMENT,
	id_persona INT,
    id_estado_pedido INT,
    total DECIMAL(12,2) DEFAULT NULL,
    fecha_pedido  DATETIME,
    pagado BOOLEAN DEFAULT false,
    PRIMARY KEY(id_pedido),
    CONSTRAINT fk_personaPedido FOREIGN KEY (id_persona) REFERENCES persona(id_persona),
    CONSTRAINT fk_estadoPedido FOREIGN KEY (id_estado_pedido) REFERENCES estado_pedido(id_estado_pedido)
);

CREATE TABLE detalle_pedido(
    id_detalle_pedido INT AUTO_INCREMENT,
	id_pedido INT,
    id_producto INT,
    cantidad INT NOT NULL,
    sub_total DECIMAL(12,2) DEFAULT NULL,
    PRIMARY KEY(id_detalle_pedido),
    CONSTRAINT fk_secuenciaPedido FOREIGN KEY (id_pedido) REFERENCES pedido(id_pedido),
    CONSTRAINT fk_detalleProductoPed FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);