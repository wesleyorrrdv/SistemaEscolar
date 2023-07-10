fun main() {
    print("Escreva uma Nota: ")

    var nota = readLine()?.toIntOrNull()?: return
    if (nota >= 5 && nota < 10 ){
        println("Aluno Aprovado")

    }else if (nota <= 4){
        println("Aluno Reprovado")
    }
    else{
        println("Erro Tente Novamente")
    }


}