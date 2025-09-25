

## Patrón Composite (Compuesto)

### Idea principal

El **Composite Pattern** se usa cuando tienes **objetos que forman jerarquías**: algunos son **simples (hojas)** y otros son **compuestos (contenedores de otros objetos)**.
Lo bueno es que **todos se tratan igual**, gracias a una interfaz común.

 Ejemplo real:

* Una **empresa** tiene un **departamento principal** (compuesto).
* Dentro de él hay **subdepartamentos** (también compuestos) o **departamentos individuales** (hojas).
* Al final, puedo pedirle al **departamento principal** que muestre sus nombres y él mismo llama a todos sus hijos (recursividad).

---

###  Estructura del patrón

1. **Componente** → Interfaz o clase abstracta que define las operaciones comunes.

   * En tu caso: `Department` (con el método `printDepartmentName()`).

2. **Hoja (Leaf)** → Implementa el componente, representa un objeto simple.

   * Ej: `SalesDepartment`, `FinancialDepartment`.

3. **Composite** → Implementa el componente, pero **contiene otros componentes** (hijos).

   * Ej: `HeadDepartment` (tiene una lista de `Department`).

4. **Cliente** → Usa los objetos a través de la interfaz común, sin importar si son hojas o compuestos.

   * Ej: `CompositeApplication` con el `main`.

---

###  Ejemplo visual

Imagina un **árbol jerárquico**:

```
HeadDepartment
   ─ SalesDepartment
   ─ FinancialDepartment
   ─ HeadDepartment (subdepartamento)
        ─ SalesDepartment
        ─ FinancialDepartment
```

Cuando llamas a `printDepartmentName()` en el `HeadDepartment`, se van recorriendo e imprimiendo todos los hijos **sin importar si son simples o compuestos**.

---

###  Ventajas

* Manejas jerarquías de manera **clara y uniforme**.
* Puedes tratar objetos simples y compuestos de la **misma forma**.
* Fácil de extender: puedes crear nuevos tipos de `Department` y siguen funcionando.

---

###  Desventajas

* Puede ser **más complejo** si la jerarquía es muy grande.
* No siempre es necesario usarlo si la estructura es muy simple.

---

###  Cómo resumirlo en tu expo

Puedes decir algo como:


El patrón Composite permite representar jerarquías de objetos de manera que podamos tratar objetos individuales y grupos de objetos de la misma forma. En mi ejemplo, cada `Department` implementa la misma interfaz, ya sea un departamento simple como `SalesDepartment` o uno compuesto como `HeadDepartment`, que contiene otros departamentos. Esto me permite recorrerlos de forma uniforme, usando polimorfismo y recursividad.

