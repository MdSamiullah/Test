// Generated from NET.g4 by ANTLR 4.4

	//System.out.println("Grammar started");
	// what ever you will write here will be placed at the top of the generated files like lexer, visitor, parser

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NETParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NETVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NETParser#nodeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeName(@NotNull NETParser.NodeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#formalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalName(@NotNull NETParser.FormalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(@NotNull NETParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#classDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefn(@NotNull NETParser.ClassDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#instanceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceName(@NotNull NETParser.InstanceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull NETParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#bindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindings(@NotNull NETParser.BindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull NETParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#stateValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateValues(@NotNull NETParser.StateValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#inputBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputBinding(@NotNull NETParser.InputBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#attribValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribValue(@NotNull NETParser.AttribValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#domainElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainElement(@NotNull NETParser.DomainElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#instanceAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceAttribute(@NotNull NETParser.InstanceAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull NETParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#actualName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualName(@NotNull NETParser.ActualNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(@NotNull NETParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#outputBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputBinding(@NotNull NETParser.OutputBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#yCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYCoordinate(@NotNull NETParser.YCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#sumExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(@NotNull NETParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#productExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductExpr(@NotNull NETParser.ProductExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#subtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype(@NotNull NETParser.SubtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#potentialAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentialAttribute(@NotNull NETParser.PotentialAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull NETParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull NETParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull NETParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull NETParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#classInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstance(@NotNull NETParser.ClassInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#potential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotential(@NotNull NETParser.PotentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#stmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt1(@NotNull NETParser.Stmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(@NotNull NETParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#basicNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicNode(@NotNull NETParser.BasicNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#nodeAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAttribute(@NotNull NETParser.NodeAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#childNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildNodes(@NotNull NETParser.ChildNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull NETParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull NETParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#edgeInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInformation(@NotNull NETParser.EdgeInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#attribName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribName(@NotNull NETParser.AttribNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#inputBindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputBindings(@NotNull NETParser.InputBindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#xCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXCoordinate(@NotNull NETParser.XCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#parentNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentNodes(@NotNull NETParser.ParentNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(@NotNull NETParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(@NotNull NETParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull NETParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull NETParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#tuple1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple1(@NotNull NETParser.Tuple1Context ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull NETParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#outputBindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputBindings(@NotNull NETParser.OutputBindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NETParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull NETParser.PrimaryContext ctx);
}