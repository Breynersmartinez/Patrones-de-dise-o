## Abstract Factory

El Abstract Factory es un patrón que proporciona una interfaz para crear familias completas de objetos relacionados sin especificar sus clases concretas. Es como tener múltiples Factory Methods agrupados.

**Estructura básica:**
- Una interfaz abstracta declara métodos para crear cada tipo de producto
- Las fábricas concretas implementan estos métodos
- Cada fábrica concreta produce una familia completa de productos compatibles

**Ejemplo conceptual:**
Siguiendo con los documentos, podrías tener una `ModernUIFactory` que crea botones modernos, ventanas modernas, y menús modernos, mientras que una `ClassicUIFactory` crea la versión clásica de todos estos componentes.

##  clave



**Abstract Factory:**
- Crea FAMILIAS de objetos relacionados
- Usa composición para agrupar factories
- Una fábrica, múltiples productos relacionados

**Cuándo usar cada uno:**
- **Abstract Factory**: Cuando necesitas crear conjuntos completos de objetos que deben ser compatibles entre sí

