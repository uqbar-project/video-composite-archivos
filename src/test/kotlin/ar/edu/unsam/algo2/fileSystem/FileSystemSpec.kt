package ar.edu.unsam.algo2.fileSystem

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class FileSystemSpec : DescribeSpec({
    isolationMode = IsolationMode.InstancePerTest
    describe("Test archivos") {
        describe("Un archivo") {
            it("define su propio tamaño") {
            }
            it("es grande si pesa bastantes megabytes") {
            }
        }
        describe("Un directorio") {
            it("define su tamaño en base a sus elementos contenidos") {
            }
            it("es grande si tiene bastantes elementos") {
            }
        }
    }
})

