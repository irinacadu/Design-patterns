## Patrones en el paquete

1. **[FACTORY][factory]**
    - Se utiliza en el caso en el que tenga una clase padre y muchas derivadas.
    - Se utiliza para crear instancias de objetos.
    - Se utilizan interfaces para poder crear herencias.

2. **[FACTORY METHOD][factory-method]**
   - Se utilizan clases abstractas de manera que forzamos la herencia, ya que una clase abstracta no puede ser instanciada.
   
3. **[ABSTRACT FACTORY][abstract-factory]**
   - Hay una clase padre y muchas clases derivadas. 
   - Cuando además de muchas instancias hay una familia es decir, cada uno de los objetos tiene el mismo padre pero además tiene sus propias características.
   - Por ejemplo tenemos la familia Mago y la familia Guerrero. Ambos implementan la interfaz Enemy, además ambos tienen armaduras y armas pero cada uno tiene unas
   necesidades distintas. Por eso utilizamos clase abstractas para que cada uno pueda tener la funcionalidad que se requiere.
   
[factory]: https://github.com/irinacadu/Design-patterns/blob/73362ef36d6aa5a3577b24e57c6f4393fe48172f/src/main/java/designPatterns/designPatterns/PatronesComportamiento/GeneralEntities/Magician.java#L4
[factory-method]: https://github.com/irinacadu/Design-patterns/blob/73362ef36d6aa5a3577b24e57c6f4393fe48172f/src/main/java/designPatterns/designPatterns/PatronesComportamiento/FactoryMethod/EntitiesFactoryMethod/MagicianFactoryMethodClass.java#L7
[abstract-factory]: https://github.com/irinacadu/Design-patterns/blob/10c02af821bf4648d7f22e31db4937170cabc671/src/main/java/designPatterns/designPatterns/PatronesComportamiento/AbstractFactory/MagicianAbstractFactory.java#L10
   