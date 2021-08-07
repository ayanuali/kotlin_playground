package Buildings

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
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

class Building<T: BaseBuildingMaterial> (val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded*buildingMaterial.numberNeeded

    fun build() {
        println("${buildingMaterial::class.simpleName} actualMaterialsNeeded ${actualMaterialsNeeded}")
    }
}