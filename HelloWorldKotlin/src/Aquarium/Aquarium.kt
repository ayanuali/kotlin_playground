package Aquarium

class Aquarium {
    //val makes the instance variables immutable, meaning you can't change once they have been assigned a value
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    var volume: Int
        get() = width * height * length / 1000
        //make it private if you don't want anyone to use this outside of this class
        //everything is public by defaul
        set(value) { height = (value*1000) / (width *length) }
}