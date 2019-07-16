import core.MyVisitor
import generated.core.MMBaseVisitor
import generated.core.MMLexer
import generated.core.MMParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream


fun main(args: Array<String>) {

    val input = ANTLRInputStream("M")

    val lexer = MMLexer(input)

    val tokenStream = CommonTokenStream(lexer)

    val parser = MMParser(tokenStream)

    val tree = parser.start()

    val visitor = MyVisitor


    visitor.visit(tree)



}