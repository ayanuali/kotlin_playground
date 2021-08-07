package Aquarium.Generics

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