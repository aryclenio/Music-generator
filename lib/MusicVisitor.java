// Generated from Music.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MusicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MusicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MusicParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(MusicParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MusicParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicParser#metro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetro(MusicParser.MetroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicParser#notes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotes(MusicParser.NotesContext ctx);
}