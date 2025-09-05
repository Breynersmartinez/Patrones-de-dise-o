# Patrones de Diseño Creacionales - Explicación y Ejemplos

## 1. SINGLETON PATTERN 

### ¿Qué es?
Garantiza que una clase tenga **una sola instancia** en toda la aplicación y proporciona acceso global a ella.

### ¿Cuándo usarlo?
- Conexiones a base de datos
- Archivos de configuración
- Sistema de logging
- Cache de aplicación

### Ejemplo: Sistema de Logging
```java
public class Logger {
    private static Logger instance;
    private String logFile = "app.log";
    
    // Constructor privado - nadie puede crear instancias directamente
    private Logger() {
        System.out.println("Logger inicializado");
    }
    
    // Método para obtener la única instancia
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}

// Uso
Logger logger1 = Logger.getInstance();
Logger logger2 = Logger.getInstance();
System.out.println(logger1 == logger2); // true - misma instancia
```

### Ventajas:
-  Control total sobre la instancia
-  Acceso global
-  Inicialización perezosa (lazy loading)

### Desventajas:
-  Puede ser difícil de testear
-  Viola el principio de responsabilidad única

---

## 2. FACTORY METHOD PATTERN 

### ¿Qué es?
Crea objetos sin especificar exactamente qué clase usar. Las subclases deciden qué tipo de objeto crear.

### ¿Cuándo usarlo?
- No sabes exactamente qué tipo de objeto necesitas crear
- Quieres que el código sea extensible para nuevos tipos
- Necesitas desacoplar la creación del uso

### Ejemplo: Sistema de Notificaciones
```java
// Producto abstracto
abstract class Notificacion {
    public abstract void enviar(String mensaje);
}

// Productos concretos
class Email extends Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("📧 Email enviado: " + mensaje);
    }
}

class SMS extends Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("📱 SMS enviado: " + mensaje);
    }
}

// Factory abstracto
abstract class FabricaNotificacion {
    public abstract Notificacion crearNotificacion();
    
    // Método que usa el factory method
    public void notificar(String mensaje) {
        Notificacion notif = crearNotificacion();
        notif.enviar(mensaje);
    }
}

// Factory concreto
class FabricaEmail extends FabricaNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new Email();
    }
}

class FabricaSMS extends FabricaNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new SMS();
    }
}

// Uso
FabricaNotificacion fabrica = new FabricaEmail();
fabrica.notificar("¡Bienvenido!"); // 📧 Email enviado: ¡Bienvenido!
```

### Ventajas:
-  Código flexible y extensible
-  Desacopla la creación del uso
-  Fácil agregar nuevos tipos

### Desventajas:
-  Puede hacer el código más complejo
-  Requiere muchas clases

---

## 3. ABSTRACT FACTORY PATTERN 
### ¿Qué es?
Crea **familias completas** de objetos relacionados sin especificar sus clases concretas.

### ¿Cuándo usarlo?
- Necesitas crear grupos de objetos que trabajan juntos
- Quieres cambiar toda una familia de productos
- UI multiplataforma (Windows, Mac, Linux)

### Ejemplo: Interfaz Multiplataforma
```java
// Productos abstractos
interface Boton {
    void dibujar();
}

interface Ventana {
    void mostrar();
}

// Familia Windows
class BotonWindows implements Boton {
    public void dibujar() {
        System.out.println("🪟 Botón estilo Windows");
    }
}

class VentanaWindows implements Ventana {
    public void mostrar() {
        System.out.println("🪟 Ventana estilo Windows");
    }
}

// Familia Mac
class BotonMac implements Boton {
    public void dibujar() {
        System.out.println(" Botón estilo Mac");
    }
}

class VentanaMac implements Ventana {
    public void mostrar() {
        System.out.println(" Ventana estilo Mac");
    }
}

// Abstract Factory
interface FabricaUI {
    Boton crearBoton();
    Ventana crearVentana();
}

// Factories concretos
class FabricaWindows implements FabricaUI {
    public Boton crearBoton() {
        return new BotonWindows();
    }
    
    public Ventana crearVentana() {
        return new VentanaWindows();
    }
}

class FabricaMac implements FabricaUI {
    public Boton crearBoton() {
        return new BotonMac();
    }
    
    public Ventana crearVentana() {
        return new VentanaMac();
    }
}

// Uso
FabricaUI fabrica = new FabricaWindows();
Boton boton = fabrica.crearBoton();
Ventana ventana = fabrica.crearVentana();

boton.dibujar();   // 🪟 Botón estilo Windows
ventana.mostrar(); // 🪟 Ventana estilo Windows
```

### Ventajas:
-  Garantiza compatibilidad entre productos
-  Fácil cambio de familia completa
-  Separa código del cliente de implementaciones

### Desventajas:
-  Difícil agregar nuevos tipos de productos
-  Muchas interfaces y clases

---

## 4. BUILDER PATTERN 

### ¿Qué es?
Construye objetos complejos **paso a paso**, permitiendo crear diferentes representaciones del mismo objeto.

### ¿Cuándo usarlo?
- Objetos con muchos parámetros (más de 4-5)
- Muchos parámetros opcionales
- Construcción compleja en múltiples pasos
- Quieres un código más legible

### Ejemplo: Construcción de Casa
```java
class Casa {
    private String cimientos;
    private String paredes;
    private String techo;
    private boolean garaje;
    private boolean jardin;
    private boolean piscina;
    
    // Constructor privado
    private Casa(Builder builder) {
        this.cimientos = builder.cimientos;
        this.paredes = builder.paredes;
        this.techo = builder.techo;
        this.garaje = builder.garaje;
        this.jardin = builder.jardin;
        this.piscina = builder.piscina;
    }
    
    @Override
    public String toString() {
        return String.format("🏠 Casa con %s, %s, %s. Extras: garaje=%s, jardín=%s, piscina=%s",
            cimientos, paredes, techo, garaje, jardin, piscina);
    }
    
    // Builder interno
    public static class Builder {
        private String cimientos = "cimientos básicos";
        private String paredes = "paredes de ladrillo";
        private String techo = "techo de tejas";
        private boolean garaje = false;
        private boolean jardin = false;
        private boolean piscina = false;
        
        public Builder cimientos(String cimientos) {
            this.cimientos = cimientos;
            return this;
        }
        
        public Builder paredes(String paredes) {
            this.paredes = paredes;
            return this;
        }
        
        public Builder techo(String techo) {
            this.techo = techo;
            return this;
        }
        
        public Builder conGaraje() {
            this.garaje = true;
            return this;
        }
        
        public Builder conJardin() {
            this.jardin = true;
            return this;
        }
        
        public Builder conPiscina() {
            this.piscina = true;
            return this;
        }
        
        public Casa build() {
            return new Casa(this);
        }
    }
}

// Uso
Casa casaSimple = new Casa.Builder().build();

Casa casaLujo = new Casa.Builder()
    .cimientos("cimientos reforzados")
    .paredes("paredes de mármol")
    .techo("techo solar")
    .conGaraje()
    .conJardin()
    .conPiscina()
    .build();

System.out.println(casaSimple);
System.out.println(casaLujo);
```

### Ventajas:
-  Código muy legible
-  Control fino sobre la construcción
-  Puede crear diferentes representaciones
-  Evita constructores con muchos parámetros

### Desventajas:
- Más código para escribir
-  Puede ser excesivo para objetos simples

---

## 5. PROTOTYPE PATTERN 

### ¿Qué es?
Crea nuevos objetos **clonando** objetos existentes (prototipos) en lugar de crearlos desde cero.

### ¿Cuándo usarlo?
- Crear objetos es costoso (consultas BD, cálculos complejos)
- Quieres evitar subclases de Factory
- Necesitas copias de objetos con ligeras modificaciones
- Configuraciones complejas como plantillas

### Ejemplo: Plantillas de Documentos
```java
abstract class DocumentoPlantilla implements Cloneable {
    protected String titulo;
    protected String encabezado;
    protected String piesPagina;
    protected Date fechaCreacion;
    
    public DocumentoPlantilla(String titulo) {
        this.titulo = titulo;
        this.fechaCreacion = new Date();
        System.out.println("⏱️ Creando plantilla desde cero (proceso costoso)");
        // Simular proceso costoso
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
    
    public abstract DocumentoPlantilla clonar();
    
    public void personalizarContenido(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
        this.fechaCreacion = new Date(); // Nueva fecha de modificación
    }
    
    @Override
    public String toString() {
        return String.format("📄 %s (Creado: %s)", titulo, fechaCreacion);
    }
}

class PlantillaContrato extends DocumentoPlantilla {
    private String clausulasEspeciales;
    
    public PlantillaContrato() {
        super("Contrato Base");
        this.encabezado = "CONTRATO DE SERVICIOS";
        this.piesPagina = "Página {n} de {total}";
        this.clausulasEspeciales = "Cláusulas estándar aplicables";
    }
    
    @Override
    public PlantillaContrato clonar() {
        try {
            System.out.println(" Clonando plantilla (proceso rápido)");
            return (PlantillaContrato) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar", e);
        }
    }
    
    public void setClausulasEspeciales(String clausulas) {
        this.clausulasEspeciales = clausulas;
    }
}

// Uso
System.out.println("=== Creando plantilla original ===");
PlantillaContrato plantillaOriginal = new PlantillaContrato();

System.out.println("\n=== Creando copias ===");
PlantillaContrato contrato1 = plantillaOriginal.clonar();
contrato1.personalizarContenido("Contrato - Cliente A");

PlantillaContrato contrato2 = plantillaOriginal.clonar();
contrato2.personalizarContenido("Contrato - Cliente B");

System.out.println("\nResultados:");
System.out.println(plantillaOriginal);
System.out.println(contrato1);
System.out.println(contrato2);
```

### Ventajas:
-  Evita el costo de crear objetos desde cero
-  Más flexible que Factory Method
-  Puede clonar objetos sin conocer sus clases exactas
-  Útil para configuraciones complejas

### Desventajas:
-  Implementar clonación puede ser complejo
-  Clonación profunda vs superficial puede ser confusa
-  Cada clase debe implementar la interfaz de clonación

---

##  EN POCAS PALABRAS:

| Patrón | Propósito | Ejemplo típico |
|--------|-----------|----------------|
| **Singleton** | Una sola instancia | Logger, Conexión DB |
| **Factory Method** | Crear sin especificar clase | Sistema de notificaciones |
| **Abstract Factory** | Familias de objetos | UI multiplataforma |
| **Builder** | Construcción paso a paso | Objetos complejos |
| **Prototype** | Crear por clonación | Plantillas, configuraciones |

