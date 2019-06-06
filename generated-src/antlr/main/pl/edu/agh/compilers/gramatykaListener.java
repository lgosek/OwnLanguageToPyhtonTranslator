// Generated from gramatyka.g4 by ANTLR 4.7.1
package pl.edu.agh.compilers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatykaParser}.
 */
public interface gramatykaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramatykaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramatykaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(gramatykaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(gramatykaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gramatykaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gramatykaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(gramatykaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(gramatykaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(gramatykaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(gramatykaParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(gramatykaParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(gramatykaParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(gramatykaParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(gramatykaParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#argumentsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDeclaration(gramatykaParser.ArgumentsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#argumentsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDeclaration(gramatykaParser.ArgumentsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(gramatykaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(gramatykaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(gramatykaParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(gramatykaParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_return}.
	 * @param ctx the parse tree
	 */
	void enterR_return(gramatykaParser.R_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_return}.
	 * @param ctx the parse tree
	 */
	void exitR_return(gramatykaParser.R_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(gramatykaParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(gramatykaParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(gramatykaParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(gramatykaParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(gramatykaParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(gramatykaParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathOperation(gramatykaParser.MathOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathOperation(gramatykaParser.MathOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(gramatykaParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(gramatykaParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(gramatykaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(gramatykaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_if}.
	 * @param ctx the parse tree
	 */
	void enterR_if(gramatykaParser.R_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_if}.
	 * @param ctx the parse tree
	 */
	void exitR_if(gramatykaParser.R_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#elsif}.
	 * @param ctx the parse tree
	 */
	void enterElsif(gramatykaParser.ElsifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#elsif}.
	 * @param ctx the parse tree
	 */
	void exitElsif(gramatykaParser.ElsifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_else}.
	 * @param ctx the parse tree
	 */
	void enterR_else(gramatykaParser.R_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_else}.
	 * @param ctx the parse tree
	 */
	void exitR_else(gramatykaParser.R_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(gramatykaParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(gramatykaParser.LogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#logicalOperand}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperand(gramatykaParser.LogicalOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#logicalOperand}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperand(gramatykaParser.LogicalOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(gramatykaParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(gramatykaParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_while}.
	 * @param ctx the parse tree
	 */
	void enterR_while(gramatykaParser.R_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_while}.
	 * @param ctx the parse tree
	 */
	void exitR_while(gramatykaParser.R_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_for}.
	 * @param ctx the parse tree
	 */
	void enterR_for(gramatykaParser.R_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_for}.
	 * @param ctx the parse tree
	 */
	void exitR_for(gramatykaParser.R_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(gramatykaParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(gramatykaParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_switch}.
	 * @param ctx the parse tree
	 */
	void enterR_switch(gramatykaParser.R_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_switch}.
	 * @param ctx the parse tree
	 */
	void exitR_switch(gramatykaParser.R_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#switchContent}.
	 * @param ctx the parse tree
	 */
	void enterSwitchContent(gramatykaParser.SwitchContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#switchContent}.
	 * @param ctx the parse tree
	 */
	void exitSwitchContent(gramatykaParser.SwitchContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_case}.
	 * @param ctx the parse tree
	 */
	void enterR_case(gramatykaParser.R_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_case}.
	 * @param ctx the parse tree
	 */
	void exitR_case(gramatykaParser.R_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#r_default}.
	 * @param ctx the parse tree
	 */
	void enterR_default(gramatykaParser.R_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#r_default}.
	 * @param ctx the parse tree
	 */
	void exitR_default(gramatykaParser.R_defaultContext ctx);
}