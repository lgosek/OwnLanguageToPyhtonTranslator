package pl.edu.agh.compilers.translator;

import pl.edu.agh.compilers.gramatykaBaseVisitor;
import pl.edu.agh.compilers.gramatykaParser;

import java.util.List;

public class TranslatorGramatykaVisitor extends gramatykaBaseVisitor<String> {

    private int indentationLevel = 0;

    @Override
    public String visitProgram (gramatykaParser.ProgramContext ctx) {
        StringBuilder programBuilder = new StringBuilder();
        programBuilder.append("# Generated File\n\n");
        programBuilder.append(visitChildren(ctx));

        return programBuilder.toString();
    }

    @Override
    public String visitAssigment (gramatykaParser.AssigmentContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.identifier().getText());
        stringBuilder.append(" ");
        stringBuilder.append(ctx.ASSIGN().getText());
        stringBuilder.append(" ");
        if(ctx.values() != null)
            stringBuilder.append(visitValues(ctx.values()));
        if(ctx.functionCall() != null)
            stringBuilder.append(visitFunctionCall(ctx.functionCall()));
        return  stringBuilder.toString();
    }

    @Override
    public String visitIdentifier (gramatykaParser.IdentifierContext ctx) {
//        return super.visitIdentifier(ctx);
        return ctx.getText();
    }

    @Override
    public String visitValue (gramatykaParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public String visitNumber (gramatykaParser.NumberContext ctx) {
//        return super.visitNumber(ctx);
        return ctx.getText();
    }

    @Override
    public String visitFunctionCall (gramatykaParser.FunctionCallContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(visitIdentifier(ctx.identifier()));
        stringBuilder.append(ctx.LPAR());
        if(ctx.arguments() != null)
            stringBuilder.append(visitArguments(ctx.arguments()));
        stringBuilder.append(ctx.RPAR());
        return stringBuilder.toString();
//        return super.visitFunctionCall(ctx);
    }

    @Override
    public String visitFunctionDeclaration (gramatykaParser.FunctionDeclarationContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("def ");
        builder.append(visitIdentifier(ctx.identifier()));
        builder.append("(");
        builder.append(visitArgumentsDeclaration(ctx.argumentsDeclaration()));
        builder.append(")");
        builder.append(":\n");
        this.indentationLevel += 1;
        builder.append(visitFunctionBody(ctx.functionBody()));
        this.indentationLevel -= 1;
        builder.append("\n");

        return builder.toString();
//        return super.visitFunctionDeclaration(ctx);
    }

    @Override
    public String visitValues (gramatykaParser.ValuesContext ctx) {
        return super.visitValues(ctx);
    }

    @Override
    public String visitArgumentsDeclaration (gramatykaParser.ArgumentsDeclarationContext ctx) {
//        return super.visitArgumentsDeclaration(ctx);
        return ctx.getText();
    }

    @Override
    public String visitArguments (gramatykaParser.ArgumentsContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(visitValues(ctx.values(0)));
        List<gramatykaParser.ValuesContext> values = ctx.values();
        for (int i = 1; i < values.size(); i++) {
            stringBuilder.append(ctx.COMMA(i-1));
            stringBuilder.append(" ");
            stringBuilder.append(visitValues(values.get(i)));
        }
        return stringBuilder.toString();
//        return super.visitArguments(ctx);
    }

    @Override
    public String visitFunctionBody (gramatykaParser.FunctionBodyContext ctx) {
        return super.visitFunctionBody(ctx);
//        return visitChildren(ctx);
    }

    @Override
    public String visitR_return (gramatykaParser.R_returnContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        this.addIndentation(stringBuilder);
        stringBuilder.append(ctx.RETURN().getText());
        stringBuilder.append(" ");
        stringBuilder.append(visitValues(ctx.values()));
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public String visitInstructions (gramatykaParser.InstructionsContext ctx) {
        return super.visitInstructions(ctx);
//        return visitChildren(ctx);
    }

    @Override
    public String visitInstruction (gramatykaParser.InstructionContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < this.indentationLevel; i++) {
//            stringBuilder.append("\t");
//        }
        this.addIndentation(stringBuilder);
        stringBuilder.append(super.visitInstruction(ctx));
        if(ctx.r_if() == null)
            stringBuilder.append("\n");
        return stringBuilder.toString();
//        return visitChildren(ctx);
    }

    @Override
    public String visitMathOperation (gramatykaParser.MathOperationContext ctx) {
        return super.visitMathOperation(ctx);
    }

    @Override
    public String visitOperand (gramatykaParser.OperandContext ctx) {
        return super.visitOperand(ctx);
    }

    @Override
    public String visitOperator (gramatykaParser.OperatorContext ctx) {
        return " " + ctx.getText() + " ";
    }

    @Override
    public String visitR_if (gramatykaParser.R_ifContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.IF());
        stringBuilder.append(" ");
        stringBuilder.append(visitLogicalOperation(ctx.logicalOperation()));
        stringBuilder.append(":\n");
        this.indentationLevel += 1;
        stringBuilder.append(visitInstructions(ctx.instructions()));
        this.indentationLevel -= 1;
        for (gramatykaParser.ElsifContext elsif: ctx.elsif()) {
            stringBuilder.append(visitElsif(elsif));
        }
        stringBuilder.append(visitR_else(ctx.r_else()));
        return stringBuilder.toString();

//        return super.visitR_if(ctx);
    }

    @Override
    public String visitElsif (gramatykaParser.ElsifContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        this.addIndentation(stringBuilder);
        stringBuilder.append("elif ");
        stringBuilder.append(visitLogicalOperation(ctx.logicalOperation()));
        stringBuilder.append(":\n");
        this.indentationLevel += 1;
        stringBuilder.append(visitInstructions(ctx.instructions()));
        this.indentationLevel -= 1;
        return stringBuilder.toString();

//        return super.visitElsif(ctx);
    }

    @Override
    public String visitR_else (gramatykaParser.R_elseContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        this.addIndentation(stringBuilder);
        stringBuilder.append(ctx.ELSE());
        stringBuilder.append(":\n");
        this.indentationLevel += 1;
        stringBuilder.append(visitInstructions(ctx.instructions()));
        this.indentationLevel -= 1;
        return stringBuilder.toString();

//        return super.visitR_else(ctx);
    }

    @Override
    public String visitLogicalOperation (gramatykaParser.LogicalOperationContext ctx) {
        return super.visitLogicalOperation(ctx);
    }

    @Override
    public String visitLogicalOperand (gramatykaParser.LogicalOperandContext ctx) {
        return super.visitLogicalOperand(ctx);
    }

    @Override
    public String visitLogicalOperator (gramatykaParser.LogicalOperatorContext ctx) {
//        return super.visitLogicalOperator(ctx);
        return " " + ctx.getText() + " ";
    }

    @Override
    public String visitR_while (gramatykaParser.R_whileContext ctx) {
        return super.visitR_while(ctx);
    }

    @Override
    public String visitR_for (gramatykaParser.R_forContext ctx) {
        return super.visitR_for(ctx);
    }

    @Override
    public String visitLoopBody (gramatykaParser.LoopBodyContext ctx) {
        return super.visitLoopBody(ctx);
    }

    @Override
    public String visitR_switch (gramatykaParser.R_switchContext ctx) {
        return super.visitR_switch(ctx);
    }

    @Override
    public String visitSwitchContent (gramatykaParser.SwitchContentContext ctx) {
        return super.visitSwitchContent(ctx);
    }

    @Override
    public String visitR_case (gramatykaParser.R_caseContext ctx) {
        return super.visitR_case(ctx);
    }

    @Override
    public String visitR_default (gramatykaParser.R_defaultContext ctx) {
        return super.visitR_default(ctx);
    }

    @Override
    protected String aggregateResult (String aggregate, String nextResult) {

        if (aggregate == null) {
            return nextResult;
        }

        if (nextResult == null) {
            return aggregate;
        }

        StringBuilder sb = new StringBuilder(aggregate);
        sb.append(nextResult);

        return sb.toString();
    }

    private void addIndentation(StringBuilder stringBuilder){
        for (int i = 0; i < this.indentationLevel; i++) {
            stringBuilder.append("\t");
        }
    }
}
