/* 1.1 Написать программу, выводящую информацию о вас (имя, фамилия, профессия).
   1.2 Объявить переменные всех вам известных типов и вывести все их значения на экран.
   1.3 Запросить на ввод строку, ввести произвольное значение с клавиатуры и вывести на экран результат работы всех
   рассмотреных методов работы со строками. */

fun main(args: Array<String>) {

    val a: Byte = -10
    val b: Short = 45
    val c: Int = -250
    val d: Long = 30000
    val e: Double = 3.14
    val f: Boolean = true
    val g: Boolean = false
    val h: Char = 'A'
    val i: String = "Time"
    val j: Float = 4.5f

    println("Ruslan")
    println("Semenov")
    println("Student")
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)

    print("Введите город: ")
    var city = readLine()
    println("Ваш город: $city")

    /* 2.1 Доработайте пример с циклом while (слайд 30) - преобразуйте его в бесконечный цикл с выходом, если введена
строчка “Exit”*/

    var inf = readLine()
    println(inf)
    while (inf != "Exit") {
        println("error")
    }
    println("Finised")

    /* 2.2 Доработайте пример с циклом for (слайд 36) - обработайте ситуацию с вводом отрицательного числа*/

    var count = 10
    var sum = readLine()
    for (i in 1..count) {
        sum += i
    }
    print(sum)

    /* 2.3 Доработайте пример с оператором if...else (слайд 45) - если пользователь вводит значение вне диапазона 0-100,
вывести  сообщение "Введено некорректное значение" и попросить повторить ввод (использовать цикл)*/

    var num = readLine()!!.toInt()
    if (num > 0 && num < 100) {
        println("Введено некорректное значение")
        println("Повторите ввод")
    } else {
        println("Вы ввели правельные данные")
    }

    /* 2.4 Реализуйте пульт дистанционного управления пользователь вводит номер канала, программа выводит название канала.
Выход из программы по вводу "0". Используйте массив*/

    val cannals = arrayOf("Выход из программы", "Первый канал", "Второй каннал", "Третьий каннал", "Четвёртый каннал")
    println(cannals[0])
    */

    /*2.5 С помощью оператора switch и циклов реализуйте программу, которая выводит меню:
    * 1. Ввести имя
    * 2. Ввести фамилию
    * 3. Ввести год рождения
    * 4. Ввести информацию
    * 0. Выход
Пользователь вводит в консоль номер пункта меню.
Первые три пункта принимают соответствующее значение в консоли. Вызов четвёртого пункта выводит в консоль сводную
информацию: "Имя: введеное имя, Фамилия: введеное фамилия, г.р.: введенный год"
При вызове нулевого пункта программа завершает работу*/

    val cannals = arrayOf("0. Выход", "1. Ввести имя", "2. Ввести фамилию", "3. Ввести год рождения", "4. Ввести информацию")

    for (information in cannals){
        println(information)
    }

    print("Выберете пункт: ")
    var choice = readLine()!!.toInt()

    /*val name = readLine()
    val surname = readLine()
    val birthday = readLine()!!.toInt()*/

    when (choice) {
        0 -> if (choice==0) {
            print("Завершение программы")}
        1 -> if (choice==1) {
            print("Ввести имя: ")
            val name = readLine()
            print("Ваше имя: $name")}
        2 -> if (choice==2) {
            print("Ввести фамилию: ")
            val surname = readLine()
            print("Ваше фамилия: $surname")}
        3 -> if (choice==3) {
            print("Ввести год рождения: ")
            val birthday = readLine()
            print("Ваше год рождения: $birthday")}
        4 -> if (choice==4) {
            print("Ввести имя: ")
            val name = readLine()
            print("Ввести фамилию: ")
            val surname = readLine()
            print("Ввести год рождения: ")
            val birthday = readLine()
            print("Имя: введеное имя: $name, Фамилия: $surname, г.р.: $birthday")
        }
    }

}
