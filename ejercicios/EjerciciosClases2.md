# Ejercicio: Clase Genérica en Java - ListaGenérica

## 1. Definición de la Clase ListaGenerica

Crea una nueva clase llamada `ListaGenerica` con un parámetro de tipo genérico `T`.

## 2. Atributos de la Clase

Declara un array de tipo genérico `T` llamado `elementos` para almacenar los elementos de la lista.
Declara un entero `tamaño` para llevar el registro del número de elementos en la lista.
Declara una constante `CAPACIDAD_INICIAL` con un valor de 10.

## 3. Constructor

Crea un constructor que inicialice el array `elementos` con la capacidad inicial y establezca el tamaño inicial en 0.

## 4. Método `agregarElemento`

Implementa un método público llamado `agregarElemento` que tome un parámetro de tipo `T` y lo añada a la lista.
Asegúrate de verificar y aumentar la capacidad del array si es necesario.

## 5. Método `obtenerElemento`

Implementa un método público llamado `obtenerElemento` que tome un índice como parámetro y devuelva el elemento en esa posición.
Lanza una excepción `IndexOutOfBoundsException` si el índice está fuera de los límites de la lista.

## 6. Método `contieneElemento`

Implementa un método público llamado `contieneElemento` que tome un parámetro de tipo `T` y devuelva `true` si el elemento está presente en la lista, y `false` en caso contrario.

## 7. Método Privado `asegurarCapacidad`

Implementa un método privado llamado `asegurarCapacidad` que duplica la capacidad del array si el tamaño actual alcanza la capacidad máxima.

## 8. Método `main` para Pruebas

En el método `main`, crea instancias de `ListaGenerica` para almacenar elementos de tipo `Integer` y `String`.
Agrega elementos a las listas, obtén elementos en posiciones específicas y verifica la presencia de elementos en las listas.


# Ejercicio: Clase Genérica en Java - PilaGenérica

## 1. Definición de la Clase PilaGenerica

Crea una nueva clase llamada `PilaGenerica` con un parámetro de tipo genérico `T`.

## 2. Atributos de la Clase

Declara un array de tipo genérico `T` llamado `elementos` para almacenar los elementos de la pila.

## 3. Constructor

Crea un constructor que inicialice el array `elementos` con la capacidad inicial y establezca el tamaño inicial en 0.

## 4. Método `push`

Implementa un método público llamado `push` que tome un parámetro de tipo `T` y lo añada a la pila.

## 5. Método `pop`

Implementa un método público llamado `pop` que elimine y devuelva el elemento en la cima de la pila.

## 6. Método `top`

Implementa un método público llamado `top` que devuelva el elemento en la cima de la pila sin eliminarlo.

## 7. Método `isEmpty`

Implementa un método público llamado `isEmpty` que devuelva `true` si la pila está vacía, y `false` en caso contrario.

## 8. Método `main` para Pruebas

En el método `main`, crea instancias de `PilaGenerica` para almacenar elementos de tipo `Integer` y `String`.

Agrega elementos a las pilas, desapila elementos, obtén la cima de las pilas y verifica si las pilas están vacías.


# Ejercicio: Clase Genérica en Java - Obtener datos de un Map

## 1. Definición de la Clase ObtenerDatosMap

Recibira un Map con diferentes tipos de datos, debe de crear un metodo que reciba el Map y la clave, y devuelva el valor de la clave.


# **Ejercicio: Sistema de Gestión de Vehículos**

## **Descripción**

El objetivo de este ejercicio es desarrollar un sistema para gestionar una flota de vehículos utilizando **interfaces**. Se deberán implementar diferentes tipos de vehículos (automóviles, bicicletas, camiones) y gestionar sus funcionalidades específicas, como acelerar, transportar carga o realizar mantenimiento.

## **Interfaces**

### `Vehiculo`
- **Descripción**: Interfaz base para todos los vehículos.
- **Métodos**:
  - `acelerar()`: Permite al vehículo aumentar su velocidad.
  - `detener()`: Permite al vehículo detenerse.

### `TransportePasajeros`
- **Descripción**: Interfaz para vehículos que transportan pasajeros.
- **Métodos**:
  - `cargarPasajeros(int cantidad)`: Permite cargar pasajeros en el vehículo.
  - `descargarPasajeros(int cantidad)`: Permite descargar pasajeros del vehículo.

### `TransporteCarga`
- **Descripción**: Interfaz para vehículos que transportan carga.
- **Métodos**:
  - `cargarCarga(double peso)`: Permite cargar peso en el vehículo.
  - `descargarCarga(double peso)`: Permite descargar peso del vehículo.

## **Clases**

### `VehiculoBase` (implementa `Vehiculo`)
- **Descripción**: Clase base para representar un vehículo genérico.
- **Atributos**:
  - `marca`: Marca del vehículo.
  - `modelo`: Modelo del vehículo.
  - `velocidad`: Velocidad actual del vehículo.
- **Métodos**:
  - Implementación genérica de los métodos `acelerar` y `detener`.

### `Automovil` (extiende `VehiculoBase`, implementa `TransportePasajeros`)
- **Descripción**: Representa un automóvil que transporta pasajeros.
- **Atributos**:
  - `capacidadPasajeros`: Capacidad máxima de pasajeros.
  - `pasajerosActuales`: Número actual de pasajeros en el vehículo.
- **Métodos**:
  - Implementación de los métodos de `TransportePasajeros`.

### `Camion` (extiende `VehiculoBase`, implementa `TransporteCarga`)
- **Descripción**: Representa un camión que transporta carga.
- **Atributos**:
  - `capacidadCarga`: Capacidad máxima de carga en toneladas.
  - `cargaActual`: Peso actual de la carga transportada.
- **Métodos**:
  - Implementación de los métodos de `TransporteCarga`.

### `Bicicleta` (extiende `VehiculoBase`)
- **Descripción**: Representa una bicicleta. No transporta carga ni pasajeros.
- **Atributos**:
  - `tipo`: Tipo de bicicleta (e.g., montaña, carretera).
- **Métodos**:
  - Uso genérico de los métodos de `Vehiculo`.

### `Camioneta` (extiende `VehiculoBase`, implementa `TransportePasajeros`, `TransporteCarga`)
- **Descripción**: Representa una camioneta que puede transportar tanto pasajeros como carga.
- **Atributos**:
  - `capacidadPasajeros`: Capacidad máxima de pasajeros.
  - `capacidadCarga`: Capacidad máxima de carga en toneladas.
  - `pasajerosActuales`: Número actual de pasajeros.
  - `cargaActual`: Peso actual de la carga transportada.
- **Métodos**:
  - Implementación de los métodos de ambas interfaces.

## **Funcionalidad Principal**

En la clase `Main`, se deberá:

1. Crear instancias de las clases `Automovil`, `Camion`, `Bicicleta` y `Camioneta`.
2. Simular acciones específicas, como:
   - Acelerar y detener vehículos.
   - Cargar y descargar pasajeros en automóviles y camionetas.
   - Cargar y descargar carga en camiones y camionetas.
3. Mostrar los estados actuales de cada vehículo después de realizar las acciones (e.g., velocidad, carga actual, pasajeros actuales).
4. Demostrar cómo la camioneta puede desempeñar funciones de transporte tanto de carga como de pasajeros.