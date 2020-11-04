/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 2 : Iterez grace aux boucles
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, "while20Items", contenant une boucle "while" affichant
 * en message, l'index en cours d'iteration.
 * Cette boucle s'arretera au bout de 20 iterations.
 *
 * - Creer une fonction, "showArrayContent", contenant une boucle "for" affichant
 * en message, l'element du tableau de String en cours d'itération.
 * Ce tableau devra etre passe en parametre de cette fonction.
 *
 * - Afficher le resultat de ces deux fonctions dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

fun while20items(){
    var index = 0
    while(index<20){
        println("index : $index")
        index++
    }
}

fun showArrayContent(args: Array<Int>){
    for(i in args){
        println("Array content : $i")
    }
}

fun main(args: Array<String>) {
    println("Hello Openclassrooms students !")

    while20items()

    var stringArray = arrayOf(1, 2, 3, 4, 5)
    showArrayContent(stringArray);
}