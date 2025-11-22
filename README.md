# 🍳 CookMaster – Sistema de Gestión de Recetas

CookMaster es una aplicación en Java diseñada para gestionar recetas culinarias de diferentes tipos: **Postres**, **Platos Fuertes** y **Bebidas**.  
El sistema implementa conceptos de **POO**, como herencia, polimorfismo, composición y uso de interfaces, junto con un diseño basado en el patrón **Builder** mediante la clase `RecetasBuilder`.

---

## 📌 Características principales

- Manejo de **usuarios**:
  - *Admin*: puede agregar, editar, eliminar y consultar recetas.
  - *Cocinero*: puede ver su registro y logearse.
  - *User*: clase base.

- Gestión completa de recetas:
  - Crear recetas de tipo **Postre**, **Plato Fuerte** o **Bebida**
  - Agregar ingredientes
  - Agregar pasos de preparación
  - Consultar la información completa de cada receta

- Uso del patrón **Builder**:
  - `Recetas` (interfaz)
  - `RecetasBuilder` (clase abstracta)
  - Clases concretas: `Postre`, `PlatoFuerte`, `Bebida`

---

## 🏗️ Arquitectura del proyecto

### **1. Interfaz `Recetas`**

Define la estructura básica que deben cumplir todas las recetas:

```java
void verListaRecetasGeneral();
void verListaPreparacion();
void verListaIngredientes();
void verListaPasos();
void definirCosto();
```

## 🏗️ Clase abstracta `RecetasBuilder`

Centraliza atributos y funcionalidades compartidas entre todas las recetas:

- **nombre**
- **costo**
- **ingredientes** (Lista)
- **pasos** (Lista)

Permite que cada receta implemente solo lo específico de su tipo.

---

## 🍽️ Clases hijas

Hereda de `RecetasBuilder`:

- **Postre**
- **PlatoFuerte**
- **Bebida**

Cada una contiene:

- Atributos únicos  
- Su propio constructor  
- Definición de costo  
- Métodos `agregarIngrediente()` y `agregarPaso()`  

---

## 🧩 Clases complementarias

- **Ingrediente**: representa un ingrediente con nombre, cantidad y prioridad.  
- **Paso**: describe un paso de preparación.  
- **User**, **Admin**, **Cocinero**: gestión de usuarios.  

---

## ▶️ Ejecución del programa

El archivo **`CookMaster.java`** incluye un ejemplo de uso:

```java
Postre postre = new Postre("Tiramisu", 45, 30.5, "Media", 350);
postre.agregarIngrediente(new Ingrediente("Cafe", 100.0, 2));
postre.agregarPaso(new Paso(1, "Mezclar los ingredientes."));
postre.agregarPaso(new Paso(2, "Refrigerar por 2 horas."));

System.out.println(postre.toString());
```

--- 

## Estructura del proyecto
```
com.mycompany.cookmaster/
│
├── CookMaster.java
├── Recetas.java
├── RecetasBuilder.java
│
├── Postre.java
├── PlatoFuerte.java
├── Bebida.java
│
├── Ingrediente.java
├── Paso.java
│
├── User.java
├── Admin.java
└── Cocinero.java
```
## Imagen de ejecución del sistema
## ![Imagen de Ejecución](Imagen%20de%20Ejecución.png)

## Diagrama de clases del sistema
[Diagrama de Clases (PDF)](Diagrama%20de%20clases%20CookMaster.pdf)


---

## Autores: Ashly Nicole Pérez López Y Miguel Santiago Castro Guerrero.
