
---

##  **Patrones de Diseño (Design Patterns)**

Los patrones de diseño se clasifican en **tres categorías principales** según la clasificación de la “Banda de los Cuatro” (GoF):

---

### 1 **Patrones Creacionales**

Se enfocan en **cómo crear objetos** de forma flexible y reutilizable.

| Patrón               | Explicación breve                                                                                              |
| -------------------- | -------------------------------------------------------------------------------------------------------------- |
| **Singleton**        | Garantiza que exista **solo una instancia** de una clase y proporciona un punto global de acceso a ella.       |
| **Factory Method**   | Define una **interfaz** para crear objetos, pero permite a las subclases decidir qué clase instanciar.         |
| **Abstract Factory** | Proporciona una **interfaz para crear familias** de objetos relacionados sin especificar sus clases concretas. |
| **Builder**          | Permite **crear objetos complejos paso a paso**, separando su construcción de su representación final.         |
| **Prototype**        | Crea nuevos objetos **copiando** un objeto existente (clonación).                                              |

---

### 2 **Patrones Estructurales**

Se centran en **cómo se organizan y relacionan las clases y objetos**.

| Patrón        | Explicación breve                                                                               |
| ------------- | ----------------------------------------------------------------------------------------------- |
| **Adapter**   | Permite que dos clases con **interfaces diferentes trabajen juntas** adaptando una a la otra.   |
| **Bridge**    | Separa una abstracción de su implementación para que ambas puedan variar independientemente.    |
| **Composite** | Organiza objetos en **estructuras jerárquicas** como árboles para tratarlos de forma uniforme.  |
| **Decorator** | Añade **funcionalidades extra** a un objeto de forma dinámica sin modificar su código original. |
| **Facade**    | Proporciona una **interfaz simple** a un conjunto complejo de clases o subsistemas.             |
| **Flyweight** | Reduce el uso de memoria compartiendo objetos que son similares.                                |
| **Proxy**     | Actúa como un **sustituto** para controlar el acceso a otro objeto.                             |

---

### 3 **Patrones de Comportamiento**

Se enfocan en **cómo interactúan y se comunican los objetos**.

| Patrón                      | Explicación breve                                                                           |
| --------------------------- | ------------------------------------------------------------------------------------------- |
| **Chain of Responsibility** | Pasa una solicitud a través de una **cadena de manejadores** hasta que uno la procese.      |
| **Command**                 | Encapsula una solicitud como un objeto para ejecutarla más tarde o deshacerla.              |
| **Interpreter**             | Define una forma de **interpretar un lenguaje o expresiones**.                              |
| **Iterator**                | Permite recorrer una colección sin exponer su estructura interna.                           |
| **Mediator**                | Centraliza la comunicación entre objetos para reducir dependencias directas.                |
| **Memento**                 | Guarda el **estado** de un objeto para restaurarlo después.                                 |
| **Observer**                | Un objeto **notifica automáticamente** a otros cuando cambia su estado.                     |
| **State**                   | Cambia el comportamiento de un objeto según su **estado interno**.                          |
| **Strategy**                | Define **diferentes algoritmos** y los intercambia en tiempo de ejecución.                  |
| **Template Method**         | Define el esqueleto de un algoritmo, dejando que las subclases completen pasos específicos. |
| **Visitor**                 | Permite agregar operaciones a objetos sin cambiar su clase.                                 |

---


Sitios recomendados:

https://refactoring.guru/es/design-patterns

https://sourcemaking.com/design_patterns



