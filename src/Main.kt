fun main() {
    var l=interesting("i love my dad")
    var k=modulus(16,10)
    println(k)
    var f=add(23, 32, 43, 31)
    println(f)
    var a=greetings("Naima")
    return(a)

}
fun greetings(name:String) {
    println("Hello $name")
}
fun add(b:Int, c:Int, d:Int, e:Int):Int {
    var sum=b+c+d+e
    return(sum)
}
fun modulus(q:Int,h:Int):Int{
    var quotient=q%h
    return(quotient)
}
fun interesting(sentence:String) {
    println(sentence)
}
