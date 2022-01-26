-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-11-2021 a las 12:27:21
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelparadise`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `numeroTelefono` int(9) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `localidad` varchar(40) NOT NULL,
  `correo_electronico` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`dni`, `nombre`, `apellido`, `numeroTelefono`, `direccion`, `localidad`, `correo_electronico`, `password`) VALUES
('11223344E', 'Alberto', 'Fuentes', 653431242, 'Plaza', 'Ruecas', 'alberto@gmail.com', 'Alberto05%'),
('22334455E', 'Oscar', 'Campos', 627391371, 'Plaza', 'Villanueva de la serena', '', ''),
('22337353O', 'Pol', 'Barcadi', 629342413, 'Garcilaso', 'Don Benito', 'pol@gmail.com', 'Polbacardi05%'),
('54332929Y', 'Alejandro', 'Ramos', 653763404, 'San juan de ribera, 4', 'Ruecas', 'hola', '123'),
('66443322E', 'Juan Antonio', 'Alvarez', 622835293, 'Santiago', 'Villanueva de la serena', '', ''),
('99887733E', 'Encarna', 'Balsera', 683924134, 'Calle mayor', 'Don Benito', 'encarna@gmail.com', 'Encarna06%');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Camas` int(11) NOT NULL,
  `Baños` int(11) NOT NULL,
  `Dimension` int(11) NOT NULL,
  `Jacuzzi` int(11) NOT NULL,
  `precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`id`, `Nombre`, `Camas`, `Baños`, `Dimension`, `Jacuzzi`, `precio`) VALUES
(1, 'Habitacion Individual', 1, 1, 50, 0, 49),
(2, 'Habitacion Doble', 1, 1, 75, 0, 88),
(3, 'Habitacion Twin', 2, 1, 80, 0, 79),
(4, 'Suite', 1, 1, 150, 1, 149);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `id` int(11) NOT NULL,
  `fecha_Reserva` date DEFAULT current_timestamp(),
  `fecha_entrada` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `dni_cliente` varchar(9) NOT NULL,
  `id_habitacion` int(11) NOT NULL DEFAULT 1,
  `dias` int(11) NOT NULL,
  `preciototal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`id`, `fecha_Reserva`, `fecha_entrada`, `fecha_salida`, `dni_cliente`, `id_habitacion`, `dias`, `preciototal`) VALUES
(18, '2021-11-02', '2021-12-10', '2021-12-15', '54332929Y', 4, 5, 745),
(21, '2021-11-04', '2021-12-15', '2021-12-20', '11223344E', 2, 5, 440),
(23, '2021-11-07', '2021-12-10', '2021-12-15', '54332929Y', 1, 5, 245);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_dni_cliente` (`dni_cliente`),
  ADD KEY `fk_id_habitaciones` (`id_habitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `fk_dni_cliente` FOREIGN KEY (`dni_cliente`) REFERENCES `clientes` (`dni`),
  ADD CONSTRAINT `fk_id_habitaciones` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
