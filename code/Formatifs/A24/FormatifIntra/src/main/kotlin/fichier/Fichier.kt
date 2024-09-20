package fichier

import java.io.File




fun main() {
    val bg: Array<String> = arrayOf("allo", "salut", "ofds")
    lire()
    ecrire(bg)
}

/**
 * (1 point) Affiche dans la console le contenu du fichier message.txt qui se trouve dans le projet de départ.
 */
fun lire() {
    val lignes: List<String> = File("Message.txt").readLines()
    for(ligne in lignes){
        println(ligne)
    }
}

/**
 * (1 point) S’il n’y a pas 2 éléments dans le paramètre args, affiche un message d'erreur, et retourne la valeur -1.
 * (1 point) Crée un fichier dans le répertoire du projet, dont le nom sera déterminé par le premier argument.
 *           Par exemple, si l’argument est « pipo.txt » l’application crée le fichier dans le dossier du projet avec le
 *           nom « pipo.txt ».
 * (1 point) Le fichier aura comme contenu le texte contenu dans le 2ème élément qui est dans le paramètre args.
 * Si tout s'est bien passé, on retourne la valeur 1.
 */
fun ecrire(args: Array<String>): Int {

    if(args.count() != 2){
        println(IllegalArgumentException(""))
        return -1

    }
    else if(File(args[0]).createNewFile()){
        if(File(args[0]).canWrite()){
            File(args[0]).writeText(args[1])
            return 1
        }

    }
    return -1

}