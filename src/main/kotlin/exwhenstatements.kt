fun main(args: Array<String>) {


    print("Enter code")
    var code :Int = readLine()!!.toInt()
    when(code) {

        0-> println("Sh20 = 1GB for 1hr")
        1-> println("Data Deals")
        2-> println("Daily bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")
        5-> println("No expiry")
        6-> println("Video Bundles")

        else-> println("Invalid code")

    }
}