package Final

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
}

class Game {
    var path = mutableListOf(Directions.START)

    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}

    val end = {
        path.add(Directions.END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }
}