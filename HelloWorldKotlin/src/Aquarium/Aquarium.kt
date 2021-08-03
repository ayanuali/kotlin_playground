package Aquarium

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    //val makes the instance variables immutable, meaning you can't change once they have been assigned a value
    //member variables
//    var width: Int = 20
//    var height: Int = 40
//    var length: Int = 100

    //properties get initialized in the order which they defined
    var volume: Int
        get() = width * height * length / 1000
        //make it private if you don't want anyone to use this outside of this class
        //everything is public by defaul
        set(value) { height = (value*1000) / (width *length) }

    var water = volume * 0.9

    constructor(numberOfPish: Int): this() {
        val water = numberOfPish * 2000
        val tank = water + water*0.1
        height = (tank / (length * width)).toInt()
    }
}