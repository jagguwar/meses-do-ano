fun main() {

    println("Digite o mês:")
    val mesInput = readLine()

    val listaMeses31 = listOf("janeiro", "março", "maio", "julho",
        "agosto", "outubro", "dezembro")

    val listaMeses30 = listOf("abril", "junho", "setembro", "novembro")

    val mes31 = "Este mês possui 31 dias"
    val mes30 = "Este mês possui 30 dias"
    val mes28 = "Este mês possui 28 dias"

    if (mesInput in listaMeses31) println(mes31)
    else if (mesInput in listaMeses30) println(mes30)
    else println(mes28)

}