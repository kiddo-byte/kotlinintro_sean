fun main(args: Array<String>) {

    print("Select an option")
    var code: Int = readLine()!!.toInt()
    print(code)

    if (code == 1) {
        print("Sh20 = 1gb for 1h")
    } else if (code == 2) {
        print("Data deals")
    } else if (code == 3) {
        print("Daily bundles")
    }
}