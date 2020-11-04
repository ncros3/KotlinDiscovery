import java.security.KeyStore

/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 4 : Maitrisez les exceptions
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, isUserOld(), retournant vrai si l'age fournit en parametre
 * est superieur a 65. Sinon, cette fonction renverra faux.
 * En revanche, vous devrez lever une exception differente si :
 *  * l'age est inferieur a 0 ("too young !")
 *  * l'age est superieur a 100 ("too old !")
 *
 * - Afficher le resultat de cette fonction dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */
fun isUserOld(age: Int): Boolean{
    if(age<0) throw Exception("Invalid age < 0")
    else if(age>100) throw Exception("Invalid age>100")
    else if(age>65) return true
    else return false
}

fun main(args: Array<String>) {
    println("Hello Openclassrooms students !")

    var age = 70
    try {
        isUserOld(age)
    }catch(e: Exception){
        println(e.message)
    }
}