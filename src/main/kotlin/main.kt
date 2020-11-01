/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 1 : Gerez des choix et des conditions
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction utilisant la structure de controle "if" uniquement.
 * Celle-ci devra retourner le plus petit des deux nombres fournis en parametre.
 * De plus, le résultat devra etre multiplie par 10.
 *
 * - Creer une enumeration representant les trois couleurs primaires. Puis,
 * creer une fonction, retournant pour chaque couleur son nom au format String
 * en anglais (par exemple "RED")
 *
 * - Afficher le resultat de ces deux fonctions dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */
enum class Color{
    red,
    green,
    blue
}

fun convertColor(color: Color): String{
    when(color){
        Color.red -> return "RED"
        Color.blue -> return "BLUE"
        Color.green -> return "GREEN"
    }
}

fun min(a: Int, b: Int) = if(a < b) a*10 else b*10

fun main(args: Array<String>) {
    println("Hello Openclassrooms students !")


    val color: Color = Color.blue;
    println(convertColor(color))

    println(min(25, 23))
}