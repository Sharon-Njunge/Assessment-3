fun main() {
    val car = Car("Toyota", "Jeep", "brown", 70)
    car.carry(78)
    car.identity()
    println( car.calculateParkingFees(4))


    val bus = Bus("Audi", "Isuzu", "black", 10)
    println(bus.maxTripFare(150.55))
    println(bus.calculateParkingFees(6))



}
open class Car(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int){
        if(people <= capacity){
            println("carrying $people passengers")
        }
        else{
            var x = people - capacity
            println("over capacity by $x people")
        }

    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours: Int):Int{
        var multiply = hours * 20
        return multiply
    }
}

class Bus(make: String, model:String, color:String, capacity:Int): Car(make, model, color, capacity){
    fun maxTripFare(fare: Double):Double{
        var x = fare * capacity
        return x

    }
    override fun calculateParkingFees(hours: Int):Int{
        var multiply = hours * 5
        return multiply
    }
}

