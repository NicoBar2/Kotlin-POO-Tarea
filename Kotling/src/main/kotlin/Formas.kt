interface Vehiculo {
    fun acelerar()
}

class Coche : Vehiculo {
    override fun acelerar() {
        println("Coche acelerando...")
    }
}

class Bicicleta : Vehiculo {
    override fun acelerar() {
        println("Bicicleta pedaleando...")
    }
}

abstract class Forma {
    abstract val area: Double
    abstract fun dibujar()
}

class Circulo(override val area: Double) : Forma() {
    override fun dibujar() {
        println("Dibujando círculo...")
    }
}

class Cuadrado(override val area: Double) : Forma() {
    override fun dibujar() {
        println("Dibujando cuadrado...")
    }
}
