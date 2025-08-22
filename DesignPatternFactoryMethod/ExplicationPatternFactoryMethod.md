## Factory Method

El Factory Method es un patrón creacional que proporciona una interfaz para crear objetos, pero permite 
a las subclases decidir qué clase instanciar. En lugar de llamar directamente al constructor, 
delegas la creación a un método "factory".

**Estructura básica:**
- Una clase abstracta define el método factory
- Las subclases concretas implementan el método factory
- Cada subclase decide qué tipo específico de objeto crear

**Ejemplo conceptual:**
Imagina una aplicación que maneja diferentes tipos de documentos. En lugar de tener código 
como `new PDFDocument()` o `new WordDocument()` esparcido por toda la aplicación, 
tienes una clase `DocumentCreator` con subclases como `PDFCreator` y `WordCreator`, 
cada una implementando el método `createDocument()`.


##  clave

**Factory Method:**
- Se enfoca en crear UN tipo de objeto
- Usa herencia para decidir qué objeto crear
- Una clase, un producto
- 
  **Cuándo usar cada uno:**
- **Factory Method**: Cuando necesitas flexibilidad para crear diferentes variantes de un mismo tipo de objeto