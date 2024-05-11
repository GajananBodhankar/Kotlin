//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
var num=0
    for (i in 1..10 step 2){
        println("$i - "+(++num))
    }
    println()
}