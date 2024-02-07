package org.example

public class Menu (val calculo: Calculo) {

    private fun interacaoMenuDoisInteiros():dados{
        var n1:Int = 0
        var n2:Int = 0
        println()
        println("Digite o n1:")
        n1 = Integer.valueOf(readLine())
        println("digite o n2:" )
        n2 = Integer.valueOf(readLine())

        var retorno = dados(n1, n2)

        return retorno

    }

    private fun interacaoMenuUmInteiro(): dados{
        var n1: Int = 0
        println()
        n1 = Integer.valueOf(readLine())

        var retorno = dados(n1, null)
        return retorno
    }

    fun executarOperacao(n: String?){
        when (n){
            "1" -> {
                val (n1, n2)= interacaoMenuDoisInteiros()
                var resultado = calculo.soma (n1,n2?:0)
                imprimirResultado(resultado)
            }
            "2"->{
                val(n1,n2:Int?)= interacaoMenuDoisInteiros()
                var resultado = calculo.subtracao(n1,n2?:0)
                imprimirResultado(resultado)
            }
            "3"->{
                val (n1,n2) = interacaoMenuDoisInteiros()
                var resultado = calculo.divisao(n1,n2?:0)
                imprimirResultado(resultado)
            }
            "4"-> {
                val (n1,n2)=interacaoMenuDoisInteiros()
                var resultado = calculo.multiplicacao(n1,n2?:0)
                imprimirResultado(resultado)
            }
            else-> {
                println("fim")
            }
        }
    }
    fun imprimirResultado(resultado:Int){
        println("")
        println("Resutado: $resultado")
        println("")
    }
    fun menu(){
        var escolha : String?=""
        do{
            println("Escolha a operação:")
            println("");
            println("[1] — Soma")
            println("[2] — Subtração")
            println("[3] — Divisão")
            println("[4] — Multiplicação")
            println("");
            println("Digite a opção: ")
            escolha= readLine()
            executarOperacao(escolha)

        }while (escolha!="7")
    }
}