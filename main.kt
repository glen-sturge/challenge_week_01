import java.util.*

val read = Scanner(System.`in`)


// Constants
val PROV_CODES = arrayOf("AB", "BC", "MB", "NB", "NL", "NT", "NS", "NU", "ON", "PE", "QC", "SK", "YT")


// Functions? Almost everything is a function!
fun personCreate(): Person {
    // Create a Person() from inputs.

    // Get first name, validated not blank
    var fName: String
    while (true) {
        println("Enter First Name     : ")
        fName = readln()
        if (fName.isBlank()) {
            println("Error! Name cannot be blank.")
            continue
        } else break
    }

    // Get last name, validated not blank
    var lName: String
    while (true) {
        println("Enter Last Name      : ")
        lName = readln()
        if (lName.isBlank()) {
            println("Error! Name cannot be blank.")
            continue
        } else break
    }

    // Get age, validate > 0
    var age: Int
    while (true) {
        println("Enter Age            : ")
        age = read.nextInt()
        if (age <= 0) {
            println("Error! Must be a positive whole number.")
            continue
        } else break
    }

    // Get address with getAddress().
    val address = getAddress()

    // Return Created Person()
    return Person(fName, lName, age, address)

}


fun getAddress(): Address {

    // Get and validate street address not blank
    var street: String
    while (true) {
        println("Enter Street Address : ")
        street = readln()
        if (street.isBlank()) {
            println("Street Address Can't Be Blank!")
            continue
        } else {
            break
        }
    }

    // Get and validate city not blank
    var cityAdd: String
    while (true) {
        println("Enter City           : ")
        cityAdd = readln()
        if (cityAdd.isBlank()) {
            println("Street Address Can't Be Blank!")
            continue
        } else break
    }

    // Get and validate province code
    var provinceAdd: String
    while (true) {
        println(PROV_CODES.contentToString())
        println("Enter Province Code  : ")
        provinceAdd = readln().uppercase()
        if (PROV_CODES.contains(provinceAdd)) break else continue
    }

    // Get and validate postal code
    var postal: String
    while (true) {
        println("Enter Postal Code    : ")
        postal = readln()
        if ((postal.length == 6) && ((postal[0].isLetter()) && (postal[2].isLetter()) && (postal[4].isLetter()))) {
            if ((postal[1].isDigit()) && (postal[3].isDigit() && (postal[5].isDigit()))) {
                break
            } else {
                println("Error! Re-Enter Postal Code.")
                continue
            }
        }
    }

    // Get and validate phone number
    var phone: String
    while (true) {
        println("Enter Phone Number   : ")
        phone = readln()
        if ((phone.length == 10) && (isNumber(phone))) break else continue
    }
    return Address(street, cityAdd, provinceAdd, postal, phone)
}


fun isNumber(str: String) = try {
    str.toLong()
    true
} catch (e: NumberFormatException) {
    false
}


fun main() {

    // Add Person() to personList and printDetails() till user decides to stop.
    while (true) {
        var personList = arrayOf<Person>()
        personList = personList.plusElement(personCreate())

        var go: String
        while (true) {
            println("Would you like to add another?")
            go = readln().uppercase()
            if (go == "Y" || go == "N") {
                break
            } else {
                println("Error! Enter 'Y' or 'N'.")
                continue
                }
        }
        if (go == "Y") {
            println("Let's do it!.")
            println()
            continue
        } else {
            for (n in personList.indices) {
                personList[n].printDetails()
            }
            break
        }
    }

}


class Person (fName: String, lName: String, pAge: Int, pAddress: Address) {
    var firstName: String
    var lastName: String
    var age: Int
    var address: Address


    // initializer block
    init {
        firstName = fName.replaceFirstChar { it.uppercase() }
        lastName = lName.replaceFirstChar { it.uppercase() }
        age = pAge
        address = pAddress
    }

    fun printDetails() {
        println()
        println("Full Name : $firstName $lastName")
        println("Age       : $age")
        println()
        println("Address   :")
        address.print()
    }
}


class Address (streetAdd: String, cityAdd: String, provinceAdd: String, postalAdd: String, pPhone: String){

    var street: String
    var city: String
    var province: String
    var postal: String
    var phone: String

    // initializer block
    init {
        street = streetAdd
        city = cityAdd
        province = provinceAdd
        postal = postalAdd
        phone = pPhone
    }

    fun print() {
        println("$street\n$city, $province, $postal")
    }

}