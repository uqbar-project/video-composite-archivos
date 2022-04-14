package ar.edu.unsam.algo2.fileSystem

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class FileSystemSpec : DescribeSpec({
    isolationMode = IsolationMode.InstancePerTest
    describe("Test contenidos de un file system") {
        describe("Un archivo") {
            it("define su propio tamaño") {
                val archivo = Archivo(tamanio = 7.25)
                archivo.tamanio() `shouldBe` 7.25
            }
            it("es grande si pesa bastantes megabytes") {
                val archivoGrande = Archivo(tamanio = 5.01)
                archivoGrande.esGrande() `shouldBe` true
            }
            it("no es grande si no pesa lo suficiente") {
                val archivoChico = Archivo(tamanio = 5.0)
                archivoChico.esGrande() `shouldBe` false
            }
        }
        describe("Un directorio") {
            it("tiene como tamaño la suma de tamaño de sus elementos") {
                val directorio = Directorio().apply {
                    agregarElemento(Archivo(tamanio = 4.5))
                    agregarElemento(Directorio().apply {
                        agregarElemento(Archivo(tamanio = 1.0))
                        agregarElemento(Archivo(tamanio = 2.2))
                    })
                    agregarElemento(Archivo(tamanio = 3.8))
                }
                directorio.tamanio() `shouldBe` 11.5
            }
            it("es grande si tiene bastantes elementos") {
                val directorioGrande = Directorio().apply {
                    agregarElemento(Archivo(tamanio = 1.0))
                    agregarElemento(Archivo(tamanio = 1.0))
                    agregarElemento(Archivo(tamanio = 1.0))
                }
                directorioGrande.esGrande() `shouldBe` true
            }
            it("es grande si su tamaño es grande") {
                val directorioGrande = Directorio().apply {
                    agregarElemento(Archivo(tamanio = 12.0))
                }
                directorioGrande.esGrande() `shouldBe` true
            }
            it("no es grande si no tiene bastantes elementos ni tiene un gran tamaño") {
                val directorioChico = Directorio().apply {
                    agregarElemento(Archivo(tamanio = 4.0))
                    agregarElemento(Archivo(tamanio = 6.0))
                }
                directorioChico.esGrande() `shouldBe` false
            }
        }

    }
})

