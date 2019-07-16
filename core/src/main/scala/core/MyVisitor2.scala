package core

import generated.core.{MMBaseVisitor, MMParser}
import org.antlr.v4.runtime.tree.TerminalNode

/**
  * test
  */
object MyVisitor2 extends MMBaseVisitor[String] {
  override def visitTerminal(node: TerminalNode): String = {

    println(s"访问叶子节点${node.getText}")
    super.visitTerminal(node)

  }

  /**
    *
    *
    * <p>The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.</p>
    */
  override def visitStart(ctx: MMParser.StartContext): String = {
    // visitStart 访问的是一个节点,然后默认的情况下改走的是该节点的visitChildren相关的方法!!!

    println("visitStart!!!")
    super.visitStart(ctx)
  }
}
