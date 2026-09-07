
fun Total(Math: Double ,Database : Double , Programing : Double) : Double = Math + Database + Programing
fun  Average(Math: Double ,Database : Double , Programing : Double ) : Double = (Math + Database + Programing) / 3
fun  HighScore(Math: Double ,Database : Double , Programing : Double ) : Double {
    var Hscore : Double = Math
    if (Database > Hscore)
        Hscore = Database
    if (Programing > Hscore )
        Hscore = Programing
    return Hscore
}
fun main () {
    println("Lê Hoàng Vũ ")
    println("Mã sinh viên : 2415053122250 ")
    print("Nhập vào điểm Toán : ")
    val scoreMath = readln().toDouble()
    print("Nhập vào điểm Database : ")
    val scoreDatabase = readln().toDouble()
    print("Nhập vào điểm lập trình : ")
    val scorePrograming = readln().toDouble()
    println("1. Tính tổng điểm của sinh viên")
    println("Tổng điểm của sinh viên là ${Total(scoreMath,scoreDatabase,scorePrograming)}")
    println("2. Tính điểm trung bình của sinh viên")
    println("Điểm trung bình của sinh viên là ${Average(scoreMath,scoreDatabase,scorePrograming)}")
    println("3. Tìm điểm cao nhất của sinh viên")
    println("Điểm cao nhất của sinh viên là ${HighScore(scoreMath,scoreDatabase,scorePrograming)}")
    println("4. Kiểm tra kết quả sinh viên có đạt hay không")
    val GPA = Average(scoreMath,scoreDatabase,scorePrograming)
    if (GPA > 5.0)
        print("Kết quả của sinh viên là : Đạt ")
    else
        print("Kết quả của sinh viên là : Rớt môn ")
}
