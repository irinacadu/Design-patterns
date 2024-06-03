## Adapter

- Utilizamos este patrón cuando quremos reutilizar y adaptar una clase que proviene de otro proyecto.
- En nuestro ejemplo tenemos una clase *Zombie* que viene de otro programa. Podemos moficiar el código o crear una clase intermedia que adapte lo que ya tenemos.
- En la clase intermedia implementamos la interfaz *Enemy* y creamos dentro un objeto de la clase Zombie que pasaremos en el constructor.