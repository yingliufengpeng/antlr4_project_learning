package core

import generated.core.{MMBaseVisitor, MMParser}
import org.antlr.v4.runtime.tree.TerminalNode

object MyVisitor2 extends MMBaseVisitor[String] {
  override def visitTerminal(node: TerminalNode): String = {

    println(s"访问叶子节点${node.getText}")
    super.visitTerminal(node)

  }
}
