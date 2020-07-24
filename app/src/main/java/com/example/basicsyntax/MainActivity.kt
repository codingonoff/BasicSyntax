package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.ArithmeticException
import java.lang.IllegalStateException

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//    var a = 2.32
//    var b = 2.43
//    var now = 19
//    when(now){
//      in 10..19 -> { Log.d("when", "10대 입니다..")}
//      !in 10..19 ->{Log.d("when", "10대가 아닙니다.")}
//      else->{Log.d("when", "나이를 알수 없습니다.")}
//    }

//    var era = if (a < b) {
//      Log.d("result", "2019 류현진이 이겼습니다.")
//      a
//    }else{
//      Log.d("result", "2019 류현진이 이겼습니다.")
//      b
//    }
//    Log.d("result", "2019에서 가장 높은 era는${era}입니다.")
    val list: List<Int> = listOf(1, 2, 3, 4, 5)  // immutable 불변자료구조.
    Log.d("list", "list${list}")
    //list.add(6)  // error
    val list1 = list.plus(6) //
    Log.d("list", "newlist${list1}")
////// mutable List : Read-Only lis
    var list2: MutableList<Int> = mutableListOf(10, 20, 30, 40, 50)
    list2.add(60)
    Log.d("list", "mutablelist${list2}")
    //loop
    for (index in 0 until list2.size) {
      Log.d("list", "set ${list2.get(index)}입니다.")
    }

    // immutable Map
    val map1 = mapOf(1 to "one", 2 to "two", 4 to "four")
    val map2 = map1.plus(3 to "three")
    Log.d("map1", "immutableMap${map1}")
    Log.d("map2", "immutableMap${map2}")
    for ((k, v) in map2) {
//      println("$k -> $v")
      Log.d("map", "$k -> $v")
    }

//    mutalbe Map
    var map3 = mutableMapOf<Int, String>(1 to "one", 2 to "two")
    map3.put(3, "three")
    Log.d("mutableMap", "map3${map3}")

//    map3.clear()
//    Log.d("mutableMap", "map3${map3}")
    Log.d("mutableMap", "키1 값은 ${map3.get(1)}입니다.")
    map3.clear()
//    immutable Set
    var set1 = setOf("jan", "feb", "mar")
    var set2 = set1.plus("jan")
    Log.d("set", "immutableSet1 ${set1}")
    Log.d("set", "immutableSet2 ${set2}")

    var result = 1
    while (result < 100) {
      result += result
      Log.d("while", "${result}")
    }
    Log.d("while", "${result}")
    //function
//function - when 문장을 return 하는 fun
    fun transform(color: String): Int {
      return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param vales")
      }
    }
    Log.d("color", "${transform("Green")}")
    // if 표현식
    fun foo(param: Int) {
      val res = if (param == 1) {
        "one"
      } else if (param == 2) {
        "two"
      } else {
        "three"
      }
      Log.d("res", "res->${res}")
    }
    foo(1)
    //들여쓰기 자동 정렬 <ctrl>+<alt>+<l>
    fun main(){
      Log.d("main", "Hello world!!!")
    }
    main()

    fun printSum(a:Int, b:Int): Unit{
      Log.d("calc","sum of ${ a + b}")
    }
    printSum(1,2)

    fun subtract(a:Int, b:Int):Int{
      return a-b
    }
    Log.d("subtract", "subtract ${subtract(10,20)}")
  }
}
