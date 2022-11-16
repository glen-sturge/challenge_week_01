/** Kotlin Variables & Data-Types Tutorial.
 *  Created by: Glen Sturge     Date: 2022-11-02.
 *  @ Keyin College, St. John's, NL.
*/

// Imports
//import java.util.*
//
//val read = Scanner(System.`in`)


/**
 *  1. Val vs Var
 *  =============
 */
// | Val is immutable. Can be set once & never changes. Var is mutable & can be changed as needed.
val someValue = "This Cannot Change."
var someOtherValue = "This Can Change."

// | Let's see it.
fun valVsVar() {
//    someValue = "Let's try it anyway for demonstration"     // See? (uncomment to demonstrate error)
    println(someValue)
    println(someOtherValue)
    someOtherValue = "This works!"
    println(someOtherValue)
    someOtherValue = "This too!"
    println(someOtherValue)
    someOtherValue = "and this!"
    println(someOtherValue)
//    someOtherValue = 1

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

/**
 * 2. Numbers - We have Byte, Short, Int, Long, Float, & Double.
 * =============================================================
 */

// |i. Byte is the smallest number data type. Its range is from -128 to 127.

fun byteDemo() {
    val myLowestByte = Byte.MIN_VALUE
    println("The lowest possible Byte is : $myLowestByte.")
    val myHighestByte = Byte.MAX_VALUE
    println("The highest possible Byte is : $myHighestByte.")

    var someByte: Byte = 123
    println("This Byte Value is : $someByte.")

//    someByte = 128      // Uh-Oh! Too High!    (uncomment to demonstrate error)
//    someByte = -129     // Uh-Oh! Too Low!  (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

// |ii. Short comes after Byte. Its range is -32768 to 32767.

fun shortDemo() {
    val mySmallestShort = Short.MIN_VALUE
    println("The lowest possible Short is : $mySmallestShort.")
    val myBiggestShort = Short.MAX_VALUE
    println("The highest possible Short is : $myBiggestShort.")

    var someShort: Short = 32_000       //Underscore chars are ignored! Makes for easy deciphering!
    println("This Short Value is : $someShort.")

//    someShort = 32768       // Uh-Oh! Too High!    (uncomment to demonstrate error)
//    someShort = -32769      // Uh-Oh! Too Low!    (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

// |iii. Int comes after Short. Its range is -2^31 to (2^31)-1.

fun intDemo() {
    val mySmallestInt = Int.MIN_VALUE
    println("The lowest possible Int is : $mySmallestInt.")
    val myBiggestInt = Int.MAX_VALUE
    println("The highest possible Int is : $myBiggestInt.")

    var someInt: Int = -2_147_483_000
    println("The Int Value is : $someInt.")
    someInt = 2_147_483_000
    println("The Int Value is : $someInt.")

//    someInt = 2_147_483_648      // Uh-Oh! Too High!    (uncomment to demonstrate error)
//    someInt = -2147483649       // Uh-Oh! Too Low!    (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

// |iv. Long comes after Int. It's a big mama-jama! Its range is -2^63 to (2^63)-1.
fun longDemo() {
    val mySmallestLong = Long.MIN_VALUE
    println("The lowest possible Long is : $mySmallestLong.")
    val myBiggestLong = Long.MAX_VALUE
    println("The highest possible Long is : $myBiggestLong.")

    var someLong: Long = -9_223_372_036_854_775_000L
    println("The Long Value is : $someLong.")
    someLong = 9_223_372_036_854_775_000
    println("The Long Value is : $someLong.")

//    someLong = 9_223_372_036_854_775_808       // Uh-Oh! Too High!    (uncomment to demonstrate error)
    /**The one below, unlike the others appears to exclude the min value.*/
//    someLong = -9_223_372_036_854_775_808      // Uh-Oh! Too Low!    (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

// |v. Float is the smaller decimal value, less precise than Double values.
fun floatDemo() {
    val mySmallestFloat = Float.MIN_VALUE
    println("The lowest possible Float is : $mySmallestFloat.")
    val myBiggestFloat = Float.MAX_VALUE
    println("The highest possible Float is : $myBiggestFloat.")

    var someFloat: Float = 1.4E-45F
    println("The Double Value is : $someFloat.")
    someFloat = 3.4028200E38F
    println("The Double Value is : $someFloat.")

    /**Different type of errors on these just outside their range. Check it out.*/
//    someFloat = 3.40282351E37F     // Uh-Oh! Too High!    (uncomment to demonstrate error)
//    someFloat = 1.5E-45F       // Uh-Oh! Too Low!    (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

// |vi. Double is the 'bigger' and more precise decimal value. Default for floating point numbers.
fun doubleDemo() {
    val mySmallestDouble = Double.MIN_VALUE
    println("The lowest possible Double is : $mySmallestDouble.")
    val myBiggestDouble = Double.MAX_VALUE
    println("The highest possible Double is : $myBiggestDouble.")

    var someDouble: Double = 4.9E-324
    println("The Double Value is : $someDouble.")
    someDouble = 1.7976931348623157E308
    println("The Double Value is : $someDouble.")

    //Again, check out these errors.
//    someDouble = 1.7976931348623158E308     // Uh-Oh! Too High!    (uncomment to demonstrate error)
//    someDouble = 4.91E-323                  // Uh-Oh! Too Low!    (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

/**
 * 3. Boolean values.
 * ==================
 */
// Straight forward. Works just like in any other programming language.
// True and False. Comparison logic.
// '&&' = 'and', '||' = 'or'.
// You can negate with !<booleanValue>.
// Other operators are as in python.
fun booleanDemo() {
    val boolValue = false
    println("First boolean              : $boolValue")
    val boolValue2 = true
    println("Second boolean             : $boolValue2")
    val boolValue3 = (boolValue && boolValue2)
    println("AND Comparison             : $boolValue3")
    val boolValue4 = (boolValue || boolValue2)
    println("OR Comparison              : $boolValue4")

    println("Not boolValue (not false)  : ${!boolValue}")       // Need curly braces to template an expression!
    println("1 > 0     (true)           : ${1 > 0}")
    println("1 >= 1    (true)           : ${1 >= 1}")
    println("1 < 0    (false)           : ${1 < 0}")
    println("1 <= 2    (true)           : ${1 <= 2}")
    println("1 == 0   (false)           : ${1 == 0}")
    println("1 != 0    (true)           : ${1 != 0}")
    println("!(1 == 0) (true)           : ${!(1 == 0)}")

    println("Press Enter to continue...")
    var holdScreen = readln()
}

/**
 * 4. Char values.
 * ==================
 */
// All english alpha characters. No numbers.
fun charDemo() {
    // Both Lower Case
    val char1: Char
    char1 = 'a'
    println("char1 : $char1")

    // And Upper Case
    val char2: Char
    char2 = 'Z'
    println("char2 : $char2")

    // But not numbers.
//    val char3: Char        // (uncomment to demonstrate error)
//    char3 = 4              // (uncomment to demonstrate error)

    // Also not Strings
//    val char4: Char       // (uncomment to demonstrate error)
//    char4 = "abc"         // (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

/**
 * 5. String values.
 * ==================
 */

fun stringDemo() {
    // Just like you'd expect.
    var firstStr: String
    firstStr = "abc"
    println("This is the first string  : $firstStr")

    //Can include numbers and special characters.
    var secondStr: String
    secondStr = "def123!%$"
    println("This is the second string : $secondStr")

    // Even a single character can also be assigned.
    var thirdStr: String
    thirdStr = "a"
    println("This is the third string  : $thirdStr")

    // Concatenate this way, called "template"
    println("Like this                 : $firstStr$secondStr$thirdStr")

    // Or this way, the 'old' way (but the ide won't like you, CONFORM!)
    println("Or like this              : " +firstStr +secondStr +thirdStr)

    // Can't be assigned as a number without quotes!
    val fourthStr: String
//    fourthStr = 4         // (uncomment to demonstrate error)

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}

/**
 * 5. Arrays.
 * ==================
 */
// Arrays can be thought of as lists.
// Some are uniform where all the data is the same type.
// Others can have mixed data types.

fun arrayDemo() {
    // An array of String types.
    val provinceCodes = arrayOf("AB", "BC", "MB", "NB", "NL", "NT", "NS", "NU", "ON", "PE", "QC", "SK", "YT")
    println(provinceCodes.contentToString())

    // An array of Ints
    val intArray = arrayOf(1, 4, 26, 30, 222, 1_000_000_000)
    println(intArray.contentToString())

    // An array of mixed data types
    val anArray = arrayOf("A", "Ab", 123, 12.2, false, true)
    println(anArray.contentToString())

    // Can combine them using the spread operator.
    val canArray = arrayOf(*provinceCodes, *intArray, *anArray)
    println(canArray.asList())      // .asList() is another method to output the contents of the Array.

    println()
    println("Press Enter to continue...")
    var holdScreen = readln()
}


fun main() {
    while (true) {
        menuSelect()

        var selection: Int = 0
        while (true) {
            println("Enter your selection followed by Enter key")
            var input = readln()
            try {
                selection = input.toInt()
            } catch(e: NumberFormatException) {
                println()
                println("Error! That wasn't a number!")
                println()
                continue
            }
            if (selection <= 0 || selection > 12) {
                println()
                println("Error! Selection out of range!")
                println()
                continue
            } else break
        }

        when (selection) {
            1 -> {
                valVsVar()
            }
            2 -> {
                byteDemo()
            }
            3 -> {
                shortDemo()
            }
            4 -> {
                intDemo()
            }
            5 -> {
                longDemo()
            }
            6 -> {
                floatDemo()
            }
            7 -> {
                doubleDemo()
            }
            8 -> {
                booleanDemo()
            }
            9 -> {
                charDemo()
            }
            10 -> {
                stringDemo()
            }
            11 -> {
                arrayDemo()
            }
            12 -> {
                println("Have a nice day!")
                break
            }
        }
    }

}


fun menuSelect() {
    println()
    println("================================================")
    println("=+=+ Welcome to the Kotlin Data-types Demo! +=+=")
    println("================================================")
    println("= ++++   Select your option from below.   ++++ =")
    println("================================================")
    println("=                                              =")
    println("=             1. Val vs Var.                   =")
    println("=             2. Byte data type                =")
    println("=             3. Short data type               =")
    println("=             4. Int data type                 =")
    println("=             5. Long data type                =")
    println("=             6. Float data type               =")
    println("=             7. Double data type              =")
    println("=             8. Boolean data type             =")
    println("=             9. Char data type                =")
    println("=            10. String data type              =")
    println("=            11. Array data type               =")
    println("=                                              =")
    println("=            12. (Quit)                        =")
    println("=                                              =")
    println("================================================")
    println()
}