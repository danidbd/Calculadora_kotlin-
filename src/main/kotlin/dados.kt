package org.example

data class dados(val n1: Int, val n2: Int?){
    fun mostrarDados() {
        println("Dados do RetornoFuncConsole:")
        println("n1: $n1")
        println("n2: $n2")
    }
}
