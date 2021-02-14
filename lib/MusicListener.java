// Generated from Music.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MusicParser}.
 */
public interface MusicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MusicParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(MusicParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(MusicParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MusicParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MusicParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicParser#notes}.
	 * @param ctx the parse tree
	 */
	void enterNotes(MusicParser.NotesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicParser#notes}.
	 * @param ctx the parse tree
	 */
	void exitNotes(MusicParser.NotesContext ctx);
}