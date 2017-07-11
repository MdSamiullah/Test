// Generated from NET.g4 by ANTLR 4.4

	//System.out.println("Grammar started");
	// what ever you will write here will be placed at the top of the generated files like lexer, visitor, parser

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NETParser}.
 */
public interface NETListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NETParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void enterNodeName(@NotNull NETParser.NodeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void exitNodeName(@NotNull NETParser.NodeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#formalName}.
	 * @param ctx the parse tree
	 */
	void enterFormalName(@NotNull NETParser.FormalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#formalName}.
	 * @param ctx the parse tree
	 */
	void exitFormalName(@NotNull NETParser.FormalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(@NotNull NETParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(@NotNull NETParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#classDefn}.
	 * @param ctx the parse tree
	 */
	void enterClassDefn(@NotNull NETParser.ClassDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#classDefn}.
	 * @param ctx the parse tree
	 */
	void exitClassDefn(@NotNull NETParser.ClassDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#instanceName}.
	 * @param ctx the parse tree
	 */
	void enterInstanceName(@NotNull NETParser.InstanceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#instanceName}.
	 * @param ctx the parse tree
	 */
	void exitInstanceName(@NotNull NETParser.InstanceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull NETParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull NETParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#bindings}.
	 * @param ctx the parse tree
	 */
	void enterBindings(@NotNull NETParser.BindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#bindings}.
	 * @param ctx the parse tree
	 */
	void exitBindings(@NotNull NETParser.BindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull NETParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull NETParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#stateValues}.
	 * @param ctx the parse tree
	 */
	void enterStateValues(@NotNull NETParser.StateValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#stateValues}.
	 * @param ctx the parse tree
	 */
	void exitStateValues(@NotNull NETParser.StateValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#inputBinding}.
	 * @param ctx the parse tree
	 */
	void enterInputBinding(@NotNull NETParser.InputBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#inputBinding}.
	 * @param ctx the parse tree
	 */
	void exitInputBinding(@NotNull NETParser.InputBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#attribValue}.
	 * @param ctx the parse tree
	 */
	void enterAttribValue(@NotNull NETParser.AttribValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#attribValue}.
	 * @param ctx the parse tree
	 */
	void exitAttribValue(@NotNull NETParser.AttribValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#domainElement}.
	 * @param ctx the parse tree
	 */
	void enterDomainElement(@NotNull NETParser.DomainElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#domainElement}.
	 * @param ctx the parse tree
	 */
	void exitDomainElement(@NotNull NETParser.DomainElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#instanceAttribute}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAttribute(@NotNull NETParser.InstanceAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#instanceAttribute}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAttribute(@NotNull NETParser.InstanceAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull NETParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull NETParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#actualName}.
	 * @param ctx the parse tree
	 */
	void enterActualName(@NotNull NETParser.ActualNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#actualName}.
	 * @param ctx the parse tree
	 */
	void exitActualName(@NotNull NETParser.ActualNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(@NotNull NETParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(@NotNull NETParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#outputBinding}.
	 * @param ctx the parse tree
	 */
	void enterOutputBinding(@NotNull NETParser.OutputBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#outputBinding}.
	 * @param ctx the parse tree
	 */
	void exitOutputBinding(@NotNull NETParser.OutputBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#yCoordinate}.
	 * @param ctx the parse tree
	 */
	void enterYCoordinate(@NotNull NETParser.YCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#yCoordinate}.
	 * @param ctx the parse tree
	 */
	void exitYCoordinate(@NotNull NETParser.YCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(@NotNull NETParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(@NotNull NETParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#productExpr}.
	 * @param ctx the parse tree
	 */
	void enterProductExpr(@NotNull NETParser.ProductExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#productExpr}.
	 * @param ctx the parse tree
	 */
	void exitProductExpr(@NotNull NETParser.ProductExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#subtype}.
	 * @param ctx the parse tree
	 */
	void enterSubtype(@NotNull NETParser.SubtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#subtype}.
	 * @param ctx the parse tree
	 */
	void exitSubtype(@NotNull NETParser.SubtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#potentialAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPotentialAttribute(@NotNull NETParser.PotentialAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#potentialAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPotentialAttribute(@NotNull NETParser.PotentialAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull NETParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull NETParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull NETParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull NETParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull NETParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull NETParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull NETParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull NETParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#classInstance}.
	 * @param ctx the parse tree
	 */
	void enterClassInstance(@NotNull NETParser.ClassInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#classInstance}.
	 * @param ctx the parse tree
	 */
	void exitClassInstance(@NotNull NETParser.ClassInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#potential}.
	 * @param ctx the parse tree
	 */
	void enterPotential(@NotNull NETParser.PotentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#potential}.
	 * @param ctx the parse tree
	 */
	void exitPotential(@NotNull NETParser.PotentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#stmt1}.
	 * @param ctx the parse tree
	 */
	void enterStmt1(@NotNull NETParser.Stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#stmt1}.
	 * @param ctx the parse tree
	 */
	void exitStmt1(@NotNull NETParser.Stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(@NotNull NETParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(@NotNull NETParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#basicNode}.
	 * @param ctx the parse tree
	 */
	void enterBasicNode(@NotNull NETParser.BasicNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#basicNode}.
	 * @param ctx the parse tree
	 */
	void exitBasicNode(@NotNull NETParser.BasicNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#nodeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNodeAttribute(@NotNull NETParser.NodeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#nodeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNodeAttribute(@NotNull NETParser.NodeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#childNodes}.
	 * @param ctx the parse tree
	 */
	void enterChildNodes(@NotNull NETParser.ChildNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#childNodes}.
	 * @param ctx the parse tree
	 */
	void exitChildNodes(@NotNull NETParser.ChildNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull NETParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull NETParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull NETParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull NETParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#edgeInformation}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInformation(@NotNull NETParser.EdgeInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#edgeInformation}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInformation(@NotNull NETParser.EdgeInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#attribName}.
	 * @param ctx the parse tree
	 */
	void enterAttribName(@NotNull NETParser.AttribNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#attribName}.
	 * @param ctx the parse tree
	 */
	void exitAttribName(@NotNull NETParser.AttribNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#inputBindings}.
	 * @param ctx the parse tree
	 */
	void enterInputBindings(@NotNull NETParser.InputBindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#inputBindings}.
	 * @param ctx the parse tree
	 */
	void exitInputBindings(@NotNull NETParser.InputBindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#xCoordinate}.
	 * @param ctx the parse tree
	 */
	void enterXCoordinate(@NotNull NETParser.XCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#xCoordinate}.
	 * @param ctx the parse tree
	 */
	void exitXCoordinate(@NotNull NETParser.XCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#parentNodes}.
	 * @param ctx the parse tree
	 */
	void enterParentNodes(@NotNull NETParser.ParentNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#parentNodes}.
	 * @param ctx the parse tree
	 */
	void exitParentNodes(@NotNull NETParser.ParentNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull NETParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull NETParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(@NotNull NETParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(@NotNull NETParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull NETParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull NETParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull NETParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull NETParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#tuple1}.
	 * @param ctx the parse tree
	 */
	void enterTuple1(@NotNull NETParser.Tuple1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#tuple1}.
	 * @param ctx the parse tree
	 */
	void exitTuple1(@NotNull NETParser.Tuple1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull NETParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull NETParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#outputBindings}.
	 * @param ctx the parse tree
	 */
	void enterOutputBindings(@NotNull NETParser.OutputBindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#outputBindings}.
	 * @param ctx the parse tree
	 */
	void exitOutputBindings(@NotNull NETParser.OutputBindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NETParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull NETParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NETParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull NETParser.PrimaryContext ctx);
}