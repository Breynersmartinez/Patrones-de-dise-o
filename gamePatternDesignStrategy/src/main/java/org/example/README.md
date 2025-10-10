
---

## 1. Diferencia general

| Versión original                                                           | Versión con patrón Strategy                                                                     |
| -------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| **Código lineal**, todo dentro de una misma clase.                         | **Código modular**, dividido en varias clases y roles.                                          |
| La forma de atacar está **fija** en la clase `Personaje`.                  | El ataque se **delegó** a una **interfaz (`EstrategiaAtaque`)**, permitiendo múltiples estilos. |
| Cambiar el tipo de ataque requería **modificar el código** de `Personaje`. | Ahora solo se **cambia el objeto de estrategia**, sin tocar la lógica del personaje.            |
| Difícil de escalar o extender (por ejemplo, agregar nuevos ataques).       | **Extensible:** puedes agregar nuevas estrategias de ataque fácilmente.                         |
| Lógica y presentación están mezcladas.                                     | La **lógica del juego y las estrategias están separadas**.                                      |

---

## 2. Qué patrón se aplicó: **Patrón Strategy**

**Idea principal:**
Permitir que el algoritmo (cómo se calcula el daño) sea intercambiable en tiempo de ejecución.

**Cómo se ve esto en tu código:**

```java
interface EstrategiaAtaque {
    int calcularDano();
    String getNombreEstrategia();
}
```

Luego tienes **estrategias concretas** como:

```java
class AtaqueAgresivo implements EstrategiaAtaque { ... }
class AtaqueDefensivo implements EstrategiaAtaque { ... }
class AtaqueCritico implements EstrategiaAtaque { ... }
```

Y finalmente, el **contexto** que las usa:

```java
class Personaje {
    private EstrategiaAtaque estrategia;

    public void atacar(Personaje oponente) {
        int dano = estrategia.calcularDano();
        ...
    }
}
```

Esto significa que **el comportamiento (estrategia) se puede cambiar en tiempo real** sin alterar la clase `Personaje`.

---

## 3. Qué se añadió en comparación con el ejercicio base

| Elemento nuevo                                                            | Propósito                                                                                       |
| ------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| **`EstrategiaAtaque` (interfaz)**                                         | Define la estructura común para todas las estrategias de ataque.                                |
| **Clases de ataque concretas (Agresivo, Defensivo, Balanceado, Crítico)** | Implementan distintos cálculos de daño sin afectar el resto del código.                         |
| **Atributo `EstrategiaAtaque estrategia` en `Personaje`**                 | Permite componer un personaje con una estrategia.                                               |
| **Método `setEstrategia()`**                                              | Permite cambiar la estrategia durante el juego.                                                 |
| **Interacción más rica en `JuegoLucha`**                                  | Cada jugador puede **elegir su estrategia inicial**.                                            |
| **Modularización del flujo de turnos (`turnoPersonaje`)**                 | Se encapsuló la lógica de un turno para evitar repetición de código.                            |
| **Separación lógica / presentación**                                      | Aunque sigue en consola, la estructura está más lista para migrar a una arquitectura por capas. |

---

## 4. Qué aporta el patrón Strategy al diseño

**Abierto para extensión, cerrado para modificación (Principio OCP):**
Puedes agregar más tipos de ataque sin tocar `Personaje` o `JuegoLucha`.

**Composición sobre herencia:**
`Personaje` **no hereda** comportamiento de ataque, sino que **tiene una estrategia** (composición).

**Mayor flexibilidad:**
Permite que cada personaje tenga su propio estilo de pelea e incluso lo cambie en tiempo real.

**Preparado para integración con otras capas o patrones:**
Si mañana agregas una interfaz gráfica, IA, o persistencia, la estructura modular lo soporta sin reescribir todo.

---

## 5. Qué puedes añadir después (siguiente paso)

Ahora que aplicaste **Strategy**, podrías integrar fácilmente:

* **Arquitectura en capas** (entity / service / strategy / ui).
* **Patrón Factory Method** → para crear personajes o estrategias según selección del usuario.
* **Patrón Observer** → para notificar cambios (por ejemplo, cuando un jugador muere o cambia su estrategia).

---

## En resumen

**Antes (básico):**

* Un solo modo de ataque (10–30).
* Lógica rígida dentro de la clase `Personaje`.


---
