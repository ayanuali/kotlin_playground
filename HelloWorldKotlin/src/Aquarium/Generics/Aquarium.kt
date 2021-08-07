package Aquarium.Generics

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaner() {
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false) {

}

class LakeWater: WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

//Any? means any type and null, if you remove ?, null is not allowed anymore
class Aquarium<T: WaterSupply> (val waterSupply: T) {
    fun addWater() {
        //check, throws exception if water supply needs processing, otherwise it will continue to the next
        //statement
        check(!waterSupply.needsProcessed) {"water supply needs processed"}

        println("adding water from $waterSupply")
    }
}

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.waterSupply.addChemicalCleaner()

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}