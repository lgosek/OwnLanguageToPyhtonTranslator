// Generated from gramatyka.g4 by ANTLR 4.7.1
package pl.edu.agh.compilers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramatykaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramatykaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramatykaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(gramatykaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gramatykaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(gramatykaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(gramatykaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(gramatykaParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(gramatykaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#argumentsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsDeclaration(gramatykaParser.ArgumentsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(gramatykaParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(gramatykaParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_return(gramatykaParser.R_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(gramatykaParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(gramatykaParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(gramatykaParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#mathOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperation(gramatykaParser.MathOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(gramatykaParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(gramatykaParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_if(gramatykaParser.R_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#elsif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif(gramatykaParser.ElsifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_else(gramatykaParser.R_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperation(gramatykaParser.LogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#logicalOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperand(gramatykaParser.LogicalOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(gramatykaParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_while(gramatykaParser.R_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_for(gramatykaParser.R_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#loopBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBody(gramatykaParser.LoopBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_switch(gramatykaParser.R_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#switchContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchContent(gramatykaParser.SwitchContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_case(gramatykaParser.R_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#r_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_default(gramatykaParser.R_defaultContext ctx);
}