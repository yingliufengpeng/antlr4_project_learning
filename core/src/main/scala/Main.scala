import core.MyVisitor2
import generated.core.{MMLexer, MMParser}
import org.antlr.v4.runtime.{ANTLRFileStream, CommonTokenStream}

object Main {

  def main(args: Array[String]): Unit = {

    val classloader = Thread.currentThread().getContextClassLoader

    val fileName = classloader.getResource("input.txt").getFile

    val input = new ANTLRFileStream(fileName)

    val lexer = new MMLexer(input)

    val tokenStream = new CommonTokenStream(lexer)

    val parser = new MMParser(tokenStream)

    val tree = parser.start()

    val visitor = MyVisitor2


    visitor.visit(tree)



  }
}