## Patrones estructurales

1. **[ADAPTER][adapterClass]**
   - Utilizamos este patrón cuando quremos reutilizar y adaptar una clase que proviene de otro proyecto.
   - En nuestro ejemplo, tenemos una clase *Zombie* que viene de otro programa. Podemos moficiar el código o crear una clase intermedia que adapte lo que ya tenemos.
   - En la clase intermedia implementamos la interfaz *Enemy* y creamos dentro un objeto de la clase Zombie que pasaremos en el constructor.

2. **[BRIDGE][bridge]**
    - Hay que separar la abstracción de la implementación. Si una clase ya está extendiendo de una clase abstracta y tenemos que implementar una interfaz en vez de pensar "Esta clase debe SER de esta interfaz" pensamos "Esta clase debe TENER esta interfaz"
      Asi que, en la clase abstracta de la que se hereda, añadiremos un parámetro de la [interfaz][interfaz]. De esta manera, las hijas de la clase abstracata la heredarán también y con ella sus métodos.
    - A partir de aquí crearemos una clase intermedia que si implemente la interfaz.
    - En la clase hija crearemos un constructor que modificará el valor del parámetro interfaz y creará un objeto de la clase intermedia.

3. **[COMPOSITE][composite]**
    - Tiene mucho que ver con la estructura de datos. 
    - Este patrón se basa en las estructura de datos de árboles y las funciones [recursivas] ya que tanto los árboles como este tipo de función se llaman a si mismos.
    - Son estructuras que se contienen a si mismas

4. **[DECORATOR]**
    - Cuando trabajamos con combinaciones y permutaciones los números pueden llegar a ser enormes. Solucionar la combinación de clases sin necesidad de crear muchas clases distintas.
    - Nos podemos imaginar una muñeca [matroska]

[adapterClass]:https://github.com/irinacadu/Design-patterns/blob/a41c496c2c05a5bd53a835632e5247096ec7bab7/src/main/java/designPatterns/designPatterns/PatronesEstructurales/Adapter/AdapterClasses/ZombieAdapter.java#L6
[bridge]:https://github.com/irinacadu/Design-patterns/blob/14f008340d5ed474a5d78906e91190689eabaecc/src/main/java/designPatterns/designPatterns/PatronesEstructurales/Bridge/Entities/Enemy.java#L8
[interfaz]:https://github.com/irinacadu/Design-patterns/blob/14f008340d5ed474a5d78906e91190689eabaecc/src/main/java/designPatterns/designPatterns/PatronesEstructurales/Bridge/Entities/Enemy.java#L8
[recursiva]:https://github.com/irinacadu/Design-patterns/blob/b7c5b3516cdf4f360b688e0fe8ddc44d1b6cc0ea/src/main/java/designPatterns/designPatterns/PatronesEstructurales/Composite/Container.java#L33
[composite]:https://github.com/irinacadu/Design-patterns/blob/b7c5b3516cdf4f360b688e0fe8ddc44d1b6cc0ea/src/main/java/designPatterns/designPatterns/PatronesEstructurales/Composite/Entities/BaseItem.java#L10
[matroska]: