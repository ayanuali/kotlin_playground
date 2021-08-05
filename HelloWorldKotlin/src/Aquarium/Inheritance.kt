package Aquarium

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

interface FishAction1 {
    fun eat()
}

abstract class AquariumFish1: FishAction1 {
    override fun eat() {
        println("fish eat function")
    }
}