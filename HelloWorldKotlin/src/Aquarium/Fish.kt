package Aquarium

//volumeNeeded does not have val or var, so kotlin won't create a property for you
//kotlin creates constructor from this information
class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    

    init {
        if(friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    fun fishExample() {
        val fish = Fish(true, 20)
        println("Is this fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
    }
}