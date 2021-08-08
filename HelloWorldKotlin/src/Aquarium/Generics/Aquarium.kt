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
class Aquarium<out T: WaterSupply> (val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        //check, throws exception if water supply needs processing, otherwise it will continue to the next
        //statement
//        check(!waterSupply.needsProcessed) {"water supply needs processed"}
        if(waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }

    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaner()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean ${aquarium.waterSupply.needsProcessed}")
}

fun genericExample() {
//    val aquarium = Aquarium<TapWater>(TapWater())
//    aquarium.waterSupply.addChemicalCleaner()
//
//    val aquarium4 = Aquarium(LakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()
//    val cleaner = TapWaterCleaner()
    val aquarium: Aquarium<TapWater> = Aquarium(TapWater())
//    aquarium.addWater(cleaner)
//    addItemTo(aquarium)
//    isWaterClean(aquarium)
    aquarium.hasWaterSupplyOfType<TapWater>()
}