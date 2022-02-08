fun main()
{
//    menggunakan when
    val day= 6 //tipe int

    val hari = when(day)
    {
       in 1 .. 5->"kerja"
        2->"senin"
        3->"selasa"
        4->"rabu"
        5->"kamis"
        6->"jumat"
        7->"sabtu"
        else->"hari tidak ada"
    }
    println(hari)
}