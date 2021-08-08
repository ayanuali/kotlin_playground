package Buildings

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
    isSmallBuilding(Building(Brick()))
}

fun labels() {
    loop@ for (i in 1..100){
        for (i in 1..100) {
            if(i > 10) break@loop
            //breaks here and goes back to labeled loop
        }
    }
}

open class BaseBuildingMaterial() {
    open val numberNeeded: Int = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if(building.actualMaterialsNeeded < 500)
        println("small building")
    else
        println("large building")
}

class Building<T: BaseBuildingMaterial> (val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded*buildingMaterial.numberNeeded

    fun build() {
        println("${buildingMaterial::class.simpleName} actualMaterialsNeeded ${actualMaterialsNeeded}")
    }
}