// Generated from core\MM.g4 by ANTLR 4.5

package generated.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MMParser}.
 */
public interface MMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MMParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MMParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MMParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MMParser.StartContext ctx);
}