fun main(args: Array<String>){

    /*
        variable var dan val,
        var -> dapat di isi kembali nilainya
        val -> tidak dapat di isi kembali nilai konstan

        Tipe data :
        String = "nama negara"
        Int    = 32
        Double  = 22.4
        Boolean = true or false
        Float = 0.6
        Char = h,j,k , ...
     */
//================================  contoh variable dengan var  ================

    var name = "Daebak"
    var lastName = "Dariyu"
    println("$name dan $lastName")

//=========================== contoh variable dengan val ===================

    val pi:Double = 3.14  // tipe data double
    val umur:Int = 24   // tipe data integer

    println("nilai dari bilangan pi adalah $pi dan saya berumur $umur")

//================================= variable boolean =====

    var myBool = true
    var newBool:Boolean? = null
    newBool = true

    println("nilai boolean $newBool")

//========================== variable float ==============

    var myFloat: Float? = null
    myFloat = 0.5F
    println("Nilai Float $myFloat")

//======================== variable char =============

    // chara dengan petik satu 'M' string dengan petik 2 "Ma"
    var myChar = 'm'
    var newChar:Char? = null
    newChar = 'S'
    println("nilai chara $myChar")
    println("nilai chara $newChar dan $myChar")

    
}