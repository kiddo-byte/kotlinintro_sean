fun main(args: Array<String>) {

    print("Enter the score")
    var score :Int = readLine()!!.toInt()
    print(score)

    if (score >= 80) {
        print(",Grade = A,Congratulations")
    }
    else if (score >= 70) {
        print(",Grade = B")
    }
    else if (score >= 60) {
        print(",Grade = C")
    }
    else if (score >= 50) {
        print(",Grade = D")
    }
    else if (score < 50) {
        print(",Grade = E,Repeat the exam")
    }
}