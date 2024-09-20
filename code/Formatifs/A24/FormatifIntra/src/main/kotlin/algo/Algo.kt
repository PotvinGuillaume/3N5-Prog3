package algo

import kotlin.math.pow

fun main() {
    println(racineCarre(9.0))
}

/**
 * Tu dois faire un programme en Kotlin qui calcule la racine en base 2 d'un nombre, en te basant sur le pseudo-code fourni.
 *
 * (3 points) Tu dois traduire le pseudo-code fourni pour programmer la fonction racineCarre.
 * (1 point) Tu dois inclure toutes les annotations de type sur les variables.
 */
fun racineCarre(x: Double): Double {
    /*
        racineCarre(x qui est un nombre en virgule flottante)
          resultat est initialisé à 0,0
          Tant que (resultat + 1) * (resultat +1) est inférieur ou égal à x faire
                resultat++
          fin du tant que
          remplir un tableau appelé fractions avec les valeurs 0,1 puis 0,01 puis 0,001 puis 0,0001
          pour fraction dans fractions faire
              initialiser base avec la valeur de resultat
              pour chaque chiffre entre 0 et 9 inclus, faire
                  initialiser test avec la valeur de base + (fraction * chiffre)
                  si test multiplié par test est inférieur ou égal à x
                  alors on veut que resultat prenne la valeur de test
              fin du pour sur les chiffre

          fin du pour sur les fraction
          renvoyer resultat
     */
    var resultat: Double = 0.0
    while((resultat +1).pow(2) <= x){
        resultat++
    }
    val fractions: Array<Double> = arrayOf(0.1, 0.01, 0.001, 0.0001)
for(fraction in fractions) {
    var base: Double = resultat
    for(i: Int in 0..9){
        var test: Double = base + (fraction*i)
        if(test.pow(2) <= x){
            resultat = test
        }
    }
}



    return resultat
}