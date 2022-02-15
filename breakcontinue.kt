//fun main()
//{
//    var index:Int = 1
//
//    while(index <= 10)
//    {
//        if(index == 5)
//        {
//
//    //    index++ //continue
//    //    println(index)
//    //    continue
//        break
//}
//     println(index)
//        index++
//    }
//}

fun main() {
    var index: Int = 1

    var students = arrayOf<String>("a", "b", "c", "d", "e", "f")

    for (student in students) {
        if (student == "d") {
          continue
        }
        println(student)
//        continue
    }
}
