fun main(){

    var healthPoints = 97

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    var Auracolor = when(karma){
        in 0..5 -> println("red")
        in 6..10 ->println( "orange")
        in 11..15 -> println("purple")
        in 16..20 ->println( "green")
        else-> println(" no color" )

    }
    println(Auracolor)

}

