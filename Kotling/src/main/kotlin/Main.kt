fun main() {

    val persona1 = Persona("JC", 33, "Ingeniero")
    val persona2 = Persona("Sofia", 29, "Doctora")
    persona1.mostrarDescripcion()
    persona2.mostrarDescripcion()

    val animales: List<Animal> = listOf(Perro(), Gato())
    for (animal in animales) {
        animal.hacerSonido()
    }

    val coche = Coche()
    val bicicleta = Bicicleta()
    val circulo = Circulo(25.0)
    val cuadrado = Cuadrado(16.0)
    coche.acelerar()
    bicicleta.acelerar()
    circulo.dibujar()
    cuadrado.dibujar()
}
