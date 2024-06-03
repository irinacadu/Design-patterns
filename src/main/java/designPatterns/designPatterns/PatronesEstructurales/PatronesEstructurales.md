## Patrones estructurales

1. **[ADAPTER][adapterClass]**

   - Utilizamos este patrón cuando quremos reutilizar y adaptar una clase que proviene de otro proyecto.
   - En nuestro ejemplo tenemos una clase *Zombie* que viene de otro programa. Podemos moficiar el código o crear una clase intermedia que adapte lo que ya tenemos.
   - En la clase intermedia implementamos la interfaz *Enemy* y creamos dentro un objeto de la clase Zombie que pasaremos en el constructor.

2. **[BRIDGE][bridge]**

    - La forma de implementar las funcionalidades es distinta
    - Hay que separar la abstracción de la implementación. Si una clase ya está extendiendo de una clase abstracta y tenemos que implementar una interfaz en vez de pensar "Esta clase debe SER de esta interfaz" pensamos "Esta clase debe TENER esta interfaz"


[adapterClass]:https://github.com/irinacadu/Design-patterns/blob/a41c496c2c05a5bd53a835632e5247096ec7bab7/src/main/java/designPatterns/designPatterns/PatronesEstructurales/Adapter/AdapterClasses/ZombieAdapter.java#L6
[bridge]