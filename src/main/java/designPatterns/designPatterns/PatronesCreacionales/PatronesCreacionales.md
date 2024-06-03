## Patrones en el paquete

1. **[FACTORY][factory]**
    - Se utiliza en el caso en el que tenga una clase padre y muchas derivadas.
    - Se utiliza para crear instancias de objetos.
    - Se utilizan interfaces para poder crear herencias.

2. **[FACTORY METHOD][factory-method]**
   - Se utilizan clases abstractas de manera que forzamos la herencia, ya que una clase abstracta no puede ser instanciada.
   
3. **[ABSTRACT FACTORY][abstract-factory]**
   - Hay una clase padre y muchas clases derivadas. 
   - Cuando además de muchas instancias hay una familia es decir, cada uno de los objetos tiene el mismo padre, pero además tiene sus propias características.
   - Por ejemplo tenemos la familia Mago y la familia Guerrero. Ambos implementan la interfaz Enemy, además ambos tienen armaduras y armas pero cada uno tiene unas
   necesidades distintas. Por eso utilizamos clases abstractas para que cada uno pueda tener la funcionalidad que se requiere.

4. **[BUILDER][builder]**
   - Teniendo en cuenta que muchos atributos no tienen por qué ser obligatorios, deberíamos poder crear objetos sin necesidad de añadir valores a cada uno de ellos.
   En vez de utilizar distintos constructores para establecer de cuantas maneras distintas se puede crear el objeto, utilizamos este patrón.
   *En este proyecto lo estamos haciendo "a mano" para ver el funcionamiento, pero con lombok se puede utilizar la anotación @Builder.*
   - Al hacerlo a mano tenemos que duplicar los atributos y eso es un inconveniente.
   - Para poder realizar el builder, en esta clase duplicada modificaremos los setters. En vez de que no devuelvan nada podemos hacer que devuelvan lo que queramos y además tratar los datos de manera que especifiquemos que es lo que van a hacer.
   - Pero tenemos una opción que, al seleccionar generar setters podemos elegir en *Template" la opción "Builder".
   - Tendremos que añadir un [método estático][estatico-builder] a la clase Enemy para poder general el builder y eñ método [build()][enemy-build] para poder construir el objeto.
   
5. **[PROTOTYPE][prototype]**
   - Lo utilizamos para hacer copias de un objeto de manera rápida y eficiente.
   - Para poder realizar copias de un objeto sin que afecte al objeto origen tenemos que implementar el método[ *clone()*]
   - Una de las características es que la entidad a clonar será abstracta y que esta entidad tendrá un [constructor] [constructor-prototype] que se pasa a sí mismo.
   - Los atributos de la clase padre deben ser protected para que los hijos puedan acceder a ellos.

6. **[SINGLETON][singleton]**
   - Los constructores serán privados y tendrá un campo estático de su propia clase. Para acceder a la instancia única se accederá a ese campo.
   - Muchas personas lo consideran un antipatrón.

[factory]: https://github.com/irinacadu/Design-patterns/blob/73362ef36d6aa5a3577b24e57c6f4393fe48172f/src/main/java/designPatterns/designPatterns/PatronesComportamiento/GeneralEntities/Magician.java#L4
[factory-method]: https://github.com/irinacadu/Design-patterns/blob/73362ef36d6aa5a3577b24e57c6f4393fe48172f/src/main/java/designPatterns/designPatterns/PatronesComportamiento/FactoryMethod/EntitiesFactoryMethod/MagicianFactoryMethodClass.java#L7
[abstract-factory]: https://github.com/irinacadu/Design-patterns/blob/10c02af821bf4648d7f22e31db4937170cabc671/src/main/java/designPatterns/designPatterns/PatronesComportamiento/AbstractFactory/MagicianAbstractFactory.java#L10
[builder]:https://github.com/irinacadu/Design-patterns/blob/f1e3824bd479d5ac8b33c0f9503a6ce877c97f84/src/main/java/designPatterns/designPatterns/PatronesCreacionales/Builder/EnemyBuilder.java#L3
[estatico-builder]: https://github.com/irinacadu/Design-patterns/blob/f1e3824bd479d5ac8b33c0f9503a6ce877c97f84/src/main/java/designPatterns/designPatterns/PatronesCreacionales/Builder/Enemy.java#L66
[enemy-build]:https://github.com/irinacadu/Design-patterns/blob/f1e3824bd479d5ac8b33c0f9503a6ce877c97f84/src/main/java/designPatterns/designPatterns/PatronesCreacionales/Builder/EnemyBuilder.java#L61
[metodo-clone]:https://github.com/irinacadu/Design-patterns/blob/16c7d4aef5180879d3306ba16379169f6fbfb445/src/main/java/designPatterns/designPatterns/PatronesCreacionales/Prototype/Warrior.java#L24
[prototype]: https://github.com/irinacadu/Design-patterns/blob/16c7d4aef5180879d3306ba16379169f6fbfb445/src/main/java/designPatterns/designPatterns/PatronesCreacionales/Prototype/Enemy.java#L3
[constructor-prototype]: https://github.com/irinacadu/Design-patterns/blob/16c7d4aef5180879d3306ba16379169f6fbfb445/src/main/java/designPatterns/designPatterns/PatronesCreacionales/Prototype/Warrior.java#L11
[singleton]