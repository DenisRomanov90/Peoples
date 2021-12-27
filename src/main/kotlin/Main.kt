fun main(args: Array<String>) {
val likes: Int = 121
val likes2: Int = 19
getNumb(likes)
getNumb(likes2)
}

fun getNumb(numb: Int){
    if (numb % 100 in 11..19){
        println("Понравилось $numb людям")
    }
    else if (numb % 10 == 1){
        println("Понравилось $numb человеку")
    }
    else println("Понравилось $numb людям")
}