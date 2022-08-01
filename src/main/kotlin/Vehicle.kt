
open abstract class Vehicle() {

    abstract fun entrancePrice(price_Vehicle: Int)
    abstract fun hourPrice(price_Hour: Int)
}
private var entryHour=0
fun getentryHour():Int{
    return entryHour
}
fun setentryHour(EntryHour : Int){

    entryHour = EntryHour
}
fun entrancePrice() {}
fun hourPrice() {}