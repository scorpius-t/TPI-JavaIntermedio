
create database TPIArgProgJavaInt
use tpiArgProgJavaInt

DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
  idCli int primary key identity(1,1),
  cuit varchar(40) NOT NULL,
  razonS varchar(40) NOT NULL,
  nom varchar(60) NOT NULL,
  ape varchar(50) NOT NULL,
  dire varchar(60) NOT NULL,
  cel varchar(40) NOT NULL,
  mail varchar(60) NOT NULL,
  contrato varchar(30) NOT NULL,
  altaCliente date NOT NULL,
  ) 

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO cliente (cuit, razonS, nom, ape, dire, cel, mail, contrato, altaCliente) VALUES
( '23', 'n', 'b', 'f', 'e', 's', 'g', 'f', '2023-11-19'),
( '23', 'we', 'we', 'we', 'we', 'we', 'we', 'we', '2023-11-19'),
( '27266384471', 'corralon jujuy', 'noemi', 'maldonado', 'jujuy 123', '3816787878', 'mmmmmmmm@gmail.com', '1', '2023-11-21'),
( '27064121303', 'DESPENSA AGU Y MATY', 'ANGELA ', 'CAMACHO', 'AYACUCHO 293', '543814020202', 'DDDDDDDDDDDD@CPM', 'HSDTR', '2023-11-21'),
( '20231162259', 'EXPRESO RIVADAVIA', 'NADIA', 'ROJAS', 'BS AS 345', '543815695847', 'DDDDDDDDDDDDDDDD', 'HPLACASEXT', '2023-11-21'),
( '20231165593', 'EXPRESO bISONTE', 'JULIAN', 'TELLO', 'PV 2 DEABRIL 123', '381641456925', 'DDDDDDDDDDDDDDD', 'HPLACASEXT', '2023-11-21'),
( '207845699875', 'La vaca', 'noelia', 'guzman', 'florida 20', '5438356415265', 'ddddddddddddd', 'SOFWIND', '2023-11-21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientecontrato`
--

DROP TABLE IF EXISTS clientecontrato;
CREATE TABLE clientecontrato (
  idCliContrato int primary key identity(1,1),
  idCliente int FOREIGN KEY REFERENCES cliente(idCli),
  idSoporte int not null,
  altaContrato date NOT NULL,
  ) 

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS empleado;
CREATE TABLE empleado (
  idEmpleado int NOT NULL  primary key identity(1,1),
  cuitEmpleado varchar(20) NOT NULL unique,
  nomEmpleado varchar(40) NOT NULL,
  apeEmpleado varchar(40) NOT NULL,
  direEmpleado varchar(50) NOT NULL,
  celEmpleado varchar(12) NOT NULL,
  mailEmpleado varchar(50) NOT NULL,
  altaEmpleado date NOT NULL,
  areaEmpleado varchar(40) NOT NULL,
  
) 

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO empleado (cuitEmpleado, nomEmpleado, apeEmpleado, direEmpleado, celEmpleado, mailEmpleado, altaEmpleado, areaEmpleado) VALUES
( '45', 'eeee', 'rrrrrrrrr', 'ttttttttt', 'yyyyyyyy', 'uuuuuuuu', '2023-11-19', 'rrhh'),
( '20256398742', 'Ricardo', 'correa', 'san juan 230', '3816747474', 'mail@gmail.com', '2023-11-20', 'rrhh'),
( '1', '', '', '', '', '', '2023-11-20', ''),
( '2', '', '', '', '', '', '2023-11-20', ''),
( '3', '', '', '', '', '', '2023-11-20', ''),
( '4', '', '', '', '', '', '2023-11-20', ''),
( 'dfdff', 'afdddddd', 'ddddddddddd', 'dddddddddddddddddd', 'eeeee', 'dddddddddddddddd', '2023-11-20', 'tecnico'),
( '27266384488', 'sss', 'dddddddddd', 'ssssssssssssssss', 'sdsds', 'sddddddd', '2023-11-20', 'tecnico'),
( '27266384489', 'nelida', 'hernandez', 'la rioja 100', '3816407565', 'hdhdhhhdahda.gmai.com', '2023-11-21', 'RRHH');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidente`
--

DROP TABLE IF EXISTS incidente;
CREATE TABLE incidente (
  idIncidente int  NOT NULL primary key identity(1,1),
  idEmpleado int FOREIGN KEY REFERENCES empleado(idEmpleado),
  idCliente int FOREIGN KEY REFERENCES cliente(idCli),
  idSoporte int NOT NULL,
  idTecnico int NOT NULL,
  altaIncidente date NOT NULL,
  fechaResolucion varchar(15) NOT NULL,
  horaColchon varchar(15) NOT NULL,
  estadoIncidente varchar(15) NOT NULL,
  
) 

--
-- Volcado de datos para la tabla `incidente`
--

INSERT INTO incidente (idEmpleado, idCliente, idSoporte, idTecnico, altaIncidente, fechaResolucion, horaColchon, estadoIncidente) VALUES
( 1, 1, 1, 1, '2023-11-20', '', 'sddd', 'dd'),
( 3, 4, 2, 2, '2023-11-21', '', '10/25/2023', 'activo'),
( 1, 2, 3, 1, '2023-11-21', '25/11/23', '2', 'REPORTADO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `soporte`
--

DROP TABLE IF EXISTS soporte;
CREATE TABLE soporte (
  idSoporte int not null primary key identity(1,1),
  codSoporte varchar(12) NOT NULL unique,
  tipoSoporte varchar(20) NOT NULL,
  desSoporte varchar(50) NOT NULL,
  altaSoporte date NOT NULL,
  tmpRespSoporte varchar(20) NOT NULL,
  complejidadSoporte varchar(10) NOT NULL,
  estadoSoporte varchar(10) NOT NULL,
  
) 

--
-- Volcado de datos para la tabla `soporte`
--

INSERT INTO soporte (codSoporte, tipoSoporte, desSoporte, altaSoporte, tmpRespSoporte, complejidadSoporte, estadoSoporte) VALUES
( 'a', 'soft', 'instala', '2023-11-20', '6', 'alta', 'dispnible'),
( 'b', 'soft', 'formateo de pc instalacion paqueteoffice', '2023-11-20', '6hs', 'media', 'disponible'),
( 'c', 'hard', 'cambio de placa madher', '2023-11-20', '2hs', 'baja', 'disponible'),
( 'HPLACASEXT', 'HARDWARE', 'CAMBIO DE PLACA EXTERNA', '2023-11-21', '2HS', 'BAJA', 'DISPONIBLE'),
( 'SINSTRESART', 'SOFT', 'INSTALACION COMPLETA DE SOFT', '2023-11-21', '5HS', 'ALTA', 'DISPONIBLE'),
( 'HPLACAINT', 'SOFT', 'CAMBIO DE PLACA SONIDO', '2023-11-21', '4', 'BAJA', 'DISPONIBLE'),
( 'd', '', '', '2023-11-21', '', '', ''),
( 'SOFWIND', 'SOFT', 'INSTALACION DEL SO', '2023-11-21', '6', 'BAJA', 'DISPONIBLE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnico`
--

DROP TABLE IF EXISTS tecnico;
CREATE TABLE tecnico (
  idTecnico int NOT NULL primary key identity(1,1),
  cuitEmpleado varchar(20)FOREIGN KEY REFERENCES empleado(cuitEmpleado),
  codSoporte varchar(12) FOREIGN KEY REFERENCES soporte(codSoporte),
  tituloTecnico varchar(40) NOT NULL,
  dispoTecnico varchar(20) NOT NULL,
  altaTecnico date NOT NULL,
  estadoTecnico varchar(10) NOT NULL,
  
) 

--
-- Volcado de datos para la tabla `tecnico`
--

INSERT INTO tecnico (cuitEmpleado, codSoporte, tituloTecnico, dispoTecnico, altaTecnico, estadoTecnico) VALUES
('1', 'a', 'ingeniero', 'mar y mier 9 a 22', '2023-11-19', 'activo'),
( '2', 'b', 'dd', 'ddd', '2023-11-21', 'ddd'),
( '27266384488', 'HPLACASEXT', 'ING EN SISTEMAS', 'FULL TIME', '2023-11-21', 'ACTIVO'),
( '27266384489', 'c', 'TECNICO ELECTRICISTA', 'PART TIME', '2023-11-21', 'ACTIVO'),
( '3', 'HPLACAINT', 'ELECTRICISTA', 'PART TIME', '2023-11-21', 'INACTIVO');




select * from empleado
select * from cliente