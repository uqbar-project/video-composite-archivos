package ar.edu.unsam.algo2.fileSystem

interface Contenido {
    fun esGrande(): Boolean
    fun tamanio(): Double
}

class Archivo(var tamanio: Double = 0.0) : Contenido {
    override fun esGrande() = tamanio > 5
    override fun tamanio() = tamanio
}

class Directorio : Contenido {
    var elementos = mutableListOf<Contenido>()

    fun agregarElemento(elemento: Contenido) {
        elementos.add(elemento)
    }

    override fun esGrande() =
        this.tamanio() > 10 || elementos.size > 2

    override fun tamanio() =
        elementos.sumOf { it.tamanio() }
}