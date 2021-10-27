fun main(args: Array<String>) {
        var num = 0
        var impar = 0
        var par = 0
        var cont = 1

        while(cont <= 10) {
            print("Digite 10 números para definirmos quantos são pares e quantos são ímpares: ")
            num = readLine()!!.toInt()
            cont += 1
            if (num % 2 == 0) {
                par++
            } else {
                impar++
            }
        }
        println("Os números pares foram: $par" +
                "\nOs números ímpares foram: $impar")
}
