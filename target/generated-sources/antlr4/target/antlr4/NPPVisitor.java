// Generated from NPP.g4 by ANTLR 4.4

	//package target.antlr4;
	//System.out.println("Grammar started");
	// what ever you will write here will be placed at the top of the generated files like lexer, visitor, parser

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NPPParser#interfaceStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceStructure(@NotNull NPPParser.InterfaceStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(@NotNull NPPParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull NPPParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#bindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindings(@NotNull NPPParser.BindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#stateValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateValues(@NotNull NPPParser.StateValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#inputBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputBinding(@NotNull NPPParser.InputBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#attribValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribValue(@NotNull NPPParser.AttribValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#instanceAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceAttribute(@NotNull NPPParser.InstanceAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#actualName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualName(@NotNull NPPParser.ActualNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#outputBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputBinding(@NotNull NPPParser.OutputBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#yCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYCoordinate(@NotNull NPPParser.YCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#productExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductExpr(@NotNull NPPParser.ProductExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#potentialAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentialAttribute(@NotNull NPPParser.PotentialAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#parentClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentClass(@NotNull NPPParser.ParentClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull NPPParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#potential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotential(@NotNull NPPParser.PotentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#interfaceNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceNameList(@NotNull NPPParser.InterfaceNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#childNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildNodes(@NotNull NPPParser.ChildNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#abstractClassStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractClassStructure(@NotNull NPPParser.AbstractClassStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#parentNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentNodes(@NotNull NPPParser.ParentNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(@NotNull NPPParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull NPPParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#outputBindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputBindings(@NotNull NPPParser.OutputBindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull NPPParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#nodeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeName(@NotNull NPPParser.NodeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#formalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalName(@NotNull NPPParser.FormalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#instanceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceName(@NotNull NPPParser.InstanceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#interfaceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceElement(@NotNull NPPParser.InterfaceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull NPPParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#parentInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentInterfaces(@NotNull NPPParser.ParentInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#domainElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainElement(@NotNull NPPParser.DomainElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull NPPParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(@NotNull NPPParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#sumExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(@NotNull NPPParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#subtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype(@NotNull NPPParser.SubtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull NPPParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull NPPParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#interfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceName(@NotNull NPPParser.InterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull NPPParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#classInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstance(@NotNull NPPParser.ClassInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#stmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt1(@NotNull NPPParser.Stmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#fileStructureDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStructureDefn(@NotNull NPPParser.FileStructureDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(@NotNull NPPParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#basicNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicNode(@NotNull NPPParser.BasicNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#nodeAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAttribute(@NotNull NPPParser.NodeAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull NPPParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull NPPParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#superClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperClassName(@NotNull NPPParser.SuperClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#edgeInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInformation(@NotNull NPPParser.EdgeInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#attribName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribName(@NotNull NPPParser.AttribNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#inputBindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputBindings(@NotNull NPPParser.InputBindingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#xCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXCoordinate(@NotNull NPPParser.XCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(@NotNull NPPParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull NPPParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#tuple1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple1(@NotNull NPPParser.Tuple1Context ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull NPPParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NPPParser#classStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStructure(@NotNull NPPParser.ClassStructureContext ctx);
}