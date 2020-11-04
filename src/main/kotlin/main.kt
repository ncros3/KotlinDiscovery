/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 3 : Decouvrez le Smart Cast
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, guessTheType, permettant de deviner et d'afficher
 * dans la console le type d'un objet passe en parametre.
 * Les types supportes seront Int, String, List, Boolean et Array
 *
 * - Afficher le resultat de cette fonction dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

fun guessTheType(obj: Any) = when(obj){
    is Int -> println("Int")
    is String -> println("String")
    is List<*> -> println("List")
    is Boolean -> println("Boolean")
    is Array<*> -> println("Array")
    else -> println("Object type not supported.")
}

fun main(args: Array<String>) {
    println("Hello Openclassrooms students !")

    val myInt: Int = 1
    guessTheType(myInt)

    val myString: String = "Lea"
    guessTheType(myString)

    val myList: List<*> = listOf("john", "mike", "pete")
    guessTheType(myList)

    val myArray: Array<*> = arrayOf(1, 2, 3, 4)
    guessTheType(myArray)
}