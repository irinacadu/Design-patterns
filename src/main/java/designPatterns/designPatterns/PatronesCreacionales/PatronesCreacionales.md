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
   - Tendremos que añadir un método estático a la clase Enemy para poder general el builder y eñ método build() para poder construir el objeto.
   
[factory]: https://github.com/irinacadu/Design-patterns/blob/73362ef36d6aa5a3577b24e57c6f4393fe48172f/src/main/java/designPatterns/designPatterns/PatronesComportamiento/GeneralEntities/Magician.java#L4
[factory-method]: https://github.com/irinacadu/Design-patterns/blob/73362ef36d6aa5a3577b24e57c6f4393fe48172f/src/main/java/designPatterns/designPatterns/PatronesComportamiento/FactoryMethod/EntitiesFactoryMethod/MagicianFactoryMethodClass.java#L7
[abstract-factory]: https://github.com/irinacadu/Design-patterns/blob/10c02af821bf4648d7f22e31db4937170cabc671/src/main/java/designPatterns/designPatterns/PatronesComportamiento/AbstractFactory/MagicianAbstractFactory.java#L10
[builder]:
   