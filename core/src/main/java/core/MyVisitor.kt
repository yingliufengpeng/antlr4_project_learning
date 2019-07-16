package core

import generated.core.MMBaseVisitor
import org.antlr.v4.runtime.tree.TerminalNode

object MyVisitor: MMBaseVisitor<String>() {

    override fun visitTerminal(node: TerminalNode?): String? {

        if (node != null) {
            println("访问到了叶子节点 ${node.text}")
        }


        val res = super.visitTerminal(node)

        return res
    }
}