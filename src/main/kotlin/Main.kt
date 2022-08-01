fun main(args: Array<String>) {
println("1.add   2.remove    q.close menu")
    var start= readLine().toString()
    while (start!="q"||start!="Q")
    if (start=="1")
    {
        println("1.car      2.bike")
        var select= readLine()?.toInt()
        when(select){
            1->car()
            2->bike()
            else->continue
        }
    }

    }
