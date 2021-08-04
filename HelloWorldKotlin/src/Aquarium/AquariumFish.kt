package Aquarium

abstract class AquariumFish() {
    abstract val color: String
}

class Shark : AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("eat() function from Shark")
    }
}

class Plecostomus : AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat function from Plecostomus")
    }
}

interface FishAction {
    fun eat()
}