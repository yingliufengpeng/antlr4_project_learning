// Generated from core\MM.g4 by ANTLR 4.5

package generated.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MMParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MMParser.StartContext ctx);
}