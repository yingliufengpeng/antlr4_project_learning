import core.MyVisitor
import generated.core.MMBaseVisitor
import generated.core.MMLexer
import generated.core.MMParser
import org.antlr.v4.runtime.ANTLRFileStream
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import sun.misc.OSEnvironment
import java.io.File


fun main(args: Array<String>) {

//    val input2 = ANTLRInputStream("NN + nn")
//    println("cwd is ${System.getProperty("user.dir")}")

    val classloader = Thread.currentThread().contextClassLoader

    val fileName = classloader.getResource("input.txt").file

    val input = ANTLRFileStream(fileName)

    val lexer = MMLexer(input)

    val tokenStream = CommonTokenStream(lexer)

    val parser = MMParser(tokenStream)

    val tree = parser.start()

    val visitor = MyVisitor


    visitor.visit(tree)



}