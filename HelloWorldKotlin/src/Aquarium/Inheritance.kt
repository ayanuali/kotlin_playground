package Aquarium

//interface AquariumAction {
//    fun eat()
//    fun jump()
//    fun clean()
//    fun catchFish()
//    fun swim() {
//        println("swim")
//    }
//}
//
//interface FishAction1 {
//    fun eat()
//}
//
//abstract class AquariumFish1: FishAction1 {
//    override fun eat() {
//        println("fish eat function")
//    }
//}

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus2()
    println("fish color ${pleco.color}")
    pleco.eat()
}

interface FishAction2 {
    fun eat()
}

interface FishColor2 {
    val color: String
}

class Plecostomus2(fishColor2: FishColor2 = GoldColor):
    FishAction2 by PrintingFishAction("eat algae"),
    FishColor2 by GoldColor

object GoldColor: FishColor2 {
    override val color: String
        get() = "gold color"
}

object RedColor: FishColor2 {
    override val color: String
        get() = "red color"
}

class PrintingFishAction(val food: String): FishAction2 {
    override fun eat() {
        println(food)
    }
}