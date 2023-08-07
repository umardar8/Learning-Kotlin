fun main() {
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")
    val scoring = Scores()
    
    var lvlScore = 0
    
    // level 1
    lvlScore = 12
    P1.totalScore += lvlScore
    P1.personalBestScore = scoring.bestScore(P1.totalScore, P1.personalBestScore)
    
    lvlScore = 34
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.bestScore(P2.totalScore, P2.personalBestScore)
 
    // level 2
    lvlScore = 56
    P1.totalScore += lvlScore
    P1.personalBestScore = scoring.bestScore(P1.totalScore, P1.personalBestScore)
    
    lvlScore = 78
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.bestScore(P2.totalScore, P2.personalBestScore)

    // level 3
    lvlScore = 99
    P1.totalScore += lvlScore
    P1.personalBestScore = scoring.bestScore(P1.totalScore, P1.personalBestScore)
    
    lvlScore = 10
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.bestScore(P2.totalScore, P2.personalBestScore)
    
    if(P1.totalScore > P2.totalScore) {
        println("The winner is ${P1.fullName()} with a Total Score of ${P1.totalScore}")
        println("The Personal Best Score is ${P1.personalBestScore}")
    } else {
        println("The winner is ${P2.fullName()} with a Total Score of ${P2.totalScore}")
        println("The Personal Best Score is ${P2.personalBestScore}")
    }
    
}

class Player(val name: String, val surName: String) {

    var totalScore = 0
    var personalBestScore = 0
    fun fullName(): String {
        return "$name $surName"
    }
}

class Scores() {
    
    fun bestScore(current: Int, best: Int): Int {
        if(current > best) {
            return current
        }
        return best
    }
}