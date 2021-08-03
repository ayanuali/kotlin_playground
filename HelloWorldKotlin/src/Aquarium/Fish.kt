package Aquarium

//volumeNeeded does not have val or var, so kotlin won't create a property for you
//kotlin creates constructor from this information
class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        println("first init block")
    }

    constructor(): this(true, 9) {
        println("running secondary constructor")
    }

    init {
        if(friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    //good kotlin classes define only one constructor
    fun fishExample() {
        val fish = Fish(true, 20)
        println("Is this fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
    }

    init {
        println("last init block")
    }
}