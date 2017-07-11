// Generated from NPP.g4 by ANTLR 4.4

	//package target.antlr4;
	//System.out.println("Grammar started");
	// what ever you will write here will be placed at the top of the generated files like lexer, visitor, parser

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NPPParser}.
 */
public interface NPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NPPParser#interfaceStructure}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceStructure(@NotNull NPPParser.InterfaceStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#interfaceStructure}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceStructure(@NotNull NPPParser.InterfaceStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(@NotNull NPPParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(@NotNull NPPParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull NPPParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull NPPParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#bindings}.
	 * @param ctx the parse tree
	 */
	void enterBindings(@NotNull NPPParser.BindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#bindings}.
	 * @param ctx the parse tree
	 */
	void exitBindings(@NotNull NPPParser.BindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#stateValues}.
	 * @param ctx the parse tree
	 */
	void enterStateValues(@NotNull NPPParser.StateValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#stateValues}.
	 * @param ctx the parse tree
	 */
	void exitStateValues(@NotNull NPPParser.StateValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#inputBinding}.
	 * @param ctx the parse tree
	 */
	void enterInputBinding(@NotNull NPPParser.InputBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#inputBinding}.
	 * @param ctx the parse tree
	 */
	void exitInputBinding(@NotNull NPPParser.InputBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#attribValue}.
	 * @param ctx the parse tree
	 */
	void enterAttribValue(@NotNull NPPParser.AttribValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#attribValue}.
	 * @param ctx the parse tree
	 */
	void exitAttribValue(@NotNull NPPParser.AttribValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#instanceAttribute}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAttribute(@NotNull NPPParser.InstanceAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#instanceAttribute}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAttribute(@NotNull NPPParser.InstanceAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#actualName}.
	 * @param ctx the parse tree
	 */
	void enterActualName(@NotNull NPPParser.ActualNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#actualName}.
	 * @param ctx the parse tree
	 */
	void exitActualName(@NotNull NPPParser.ActualNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#outputBinding}.
	 * @param ctx the parse tree
	 */
	void enterOutputBinding(@NotNull NPPParser.OutputBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#outputBinding}.
	 * @param ctx the parse tree
	 */
	void exitOutputBinding(@NotNull NPPParser.OutputBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#yCoordinate}.
	 * @param ctx the parse tree
	 */
	void enterYCoordinate(@NotNull NPPParser.YCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#yCoordinate}.
	 * @param ctx the parse tree
	 */
	void exitYCoordinate(@NotNull NPPParser.YCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#productExpr}.
	 * @param ctx the parse tree
	 */
	void enterProductExpr(@NotNull NPPParser.ProductExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#productExpr}.
	 * @param ctx the parse tree
	 */
	void exitProductExpr(@NotNull NPPParser.ProductExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#potentialAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPotentialAttribute(@NotNull NPPParser.PotentialAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#potentialAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPotentialAttribute(@NotNull NPPParser.PotentialAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#parentClass}.
	 * @param ctx the parse tree
	 */
	void enterParentClass(@NotNull NPPParser.ParentClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#parentClass}.
	 * @param ctx the parse tree
	 */
	void exitParentClass(@NotNull NPPParser.ParentClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull NPPParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull NPPParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#potential}.
	 * @param ctx the parse tree
	 */
	void enterPotential(@NotNull NPPParser.PotentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#potential}.
	 * @param ctx the parse tree
	 */
	void exitPotential(@NotNull NPPParser.PotentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#interfaceNameList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceNameList(@NotNull NPPParser.InterfaceNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#interfaceNameList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceNameList(@NotNull NPPParser.InterfaceNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#childNodes}.
	 * @param ctx the parse tree
	 */
	void enterChildNodes(@NotNull NPPParser.ChildNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#childNodes}.
	 * @param ctx the parse tree
	 */
	void exitChildNodes(@NotNull NPPParser.ChildNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#abstractClassStructure}.
	 * @param ctx the parse tree
	 */
	void enterAbstractClassStructure(@NotNull NPPParser.AbstractClassStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#abstractClassStructure}.
	 * @param ctx the parse tree
	 */
	void exitAbstractClassStructure(@NotNull NPPParser.AbstractClassStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#parentNodes}.
	 * @param ctx the parse tree
	 */
	void enterParentNodes(@NotNull NPPParser.ParentNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#parentNodes}.
	 * @param ctx the parse tree
	 */
	void exitParentNodes(@NotNull NPPParser.ParentNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(@NotNull NPPParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(@NotNull NPPParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull NPPParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull NPPParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#outputBindings}.
	 * @param ctx the parse tree
	 */
	void enterOutputBindings(@NotNull NPPParser.OutputBindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#outputBindings}.
	 * @param ctx the parse tree
	 */
	void exitOutputBindings(@NotNull NPPParser.OutputBindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull NPPParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull NPPParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void enterNodeName(@NotNull NPPParser.NodeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void exitNodeName(@NotNull NPPParser.NodeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#formalName}.
	 * @param ctx the parse tree
	 */
	void enterFormalName(@NotNull NPPParser.FormalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#formalName}.
	 * @param ctx the parse tree
	 */
	void exitFormalName(@NotNull NPPParser.FormalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#instanceName}.
	 * @param ctx the parse tree
	 */
	void enterInstanceName(@NotNull NPPParser.InstanceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#instanceName}.
	 * @param ctx the parse tree
	 */
	void exitInstanceName(@NotNull NPPParser.InstanceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#interfaceElement}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceElement(@NotNull NPPParser.InterfaceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#interfaceElement}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceElement(@NotNull NPPParser.InterfaceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull NPPParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull NPPParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#parentInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterParentInterfaces(@NotNull NPPParser.ParentInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#parentInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitParentInterfaces(@NotNull NPPParser.ParentInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#domainElement}.
	 * @param ctx the parse tree
	 */
	void enterDomainElement(@NotNull NPPParser.DomainElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#domainElement}.
	 * @param ctx the parse tree
	 */
	void exitDomainElement(@NotNull NPPParser.DomainElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull NPPParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull NPPParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(@NotNull NPPParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(@NotNull NPPParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(@NotNull NPPParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(@NotNull NPPParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#subtype}.
	 * @param ctx the parse tree
	 */
	void enterSubtype(@NotNull NPPParser.SubtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#subtype}.
	 * @param ctx the parse tree
	 */
	void exitSubtype(@NotNull NPPParser.SubtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull NPPParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull NPPParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull NPPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull NPPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(@NotNull NPPParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(@NotNull NPPParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull NPPParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull NPPParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#classInstance}.
	 * @param ctx the parse tree
	 */
	void enterClassInstance(@NotNull NPPParser.ClassInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#classInstance}.
	 * @param ctx the parse tree
	 */
	void exitClassInstance(@NotNull NPPParser.ClassInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#stmt1}.
	 * @param ctx the parse tree
	 */
	void enterStmt1(@NotNull NPPParser.Stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#stmt1}.
	 * @param ctx the parse tree
	 */
	void exitStmt1(@NotNull NPPParser.Stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#fileStructureDefn}.
	 * @param ctx the parse tree
	 */
	void enterFileStructureDefn(@NotNull NPPParser.FileStructureDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#fileStructureDefn}.
	 * @param ctx the parse tree
	 */
	void exitFileStructureDefn(@NotNull NPPParser.FileStructureDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(@NotNull NPPParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(@NotNull NPPParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#basicNode}.
	 * @param ctx the parse tree
	 */
	void enterBasicNode(@NotNull NPPParser.BasicNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#basicNode}.
	 * @param ctx the parse tree
	 */
	void exitBasicNode(@NotNull NPPParser.BasicNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#nodeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNodeAttribute(@NotNull NPPParser.NodeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#nodeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNodeAttribute(@NotNull NPPParser.NodeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull NPPParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull NPPParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull NPPParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull NPPParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#superClassName}.
	 * @param ctx the parse tree
	 */
	void enterSuperClassName(@NotNull NPPParser.SuperClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#superClassName}.
	 * @param ctx the parse tree
	 */
	void exitSuperClassName(@NotNull NPPParser.SuperClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#edgeInformation}.
	 * @param ctx the parse tree
	 */
	void enterEdgeInformation(@NotNull NPPParser.EdgeInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#edgeInformation}.
	 * @param ctx the parse tree
	 */
	void exitEdgeInformation(@NotNull NPPParser.EdgeInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#attribName}.
	 * @param ctx the parse tree
	 */
	void enterAttribName(@NotNull NPPParser.AttribNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#attribName}.
	 * @param ctx the parse tree
	 */
	void exitAttribName(@NotNull NPPParser.AttribNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#inputBindings}.
	 * @param ctx the parse tree
	 */
	void enterInputBindings(@NotNull NPPParser.InputBindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#inputBindings}.
	 * @param ctx the parse tree
	 */
	void exitInputBindings(@NotNull NPPParser.InputBindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#xCoordinate}.
	 * @param ctx the parse tree
	 */
	void enterXCoordinate(@NotNull NPPParser.XCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#xCoordinate}.
	 * @param ctx the parse tree
	 */
	void exitXCoordinate(@NotNull NPPParser.XCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull NPPParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull NPPParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull NPPParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull NPPParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#tuple1}.
	 * @param ctx the parse tree
	 */
	void enterTuple1(@NotNull NPPParser.Tuple1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#tuple1}.
	 * @param ctx the parse tree
	 */
	void exitTuple1(@NotNull NPPParser.Tuple1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull NPPParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull NPPParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPPParser#classStructure}.
	 * @param ctx the parse tree
	 */
	void enterClassStructure(@NotNull NPPParser.ClassStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPPParser#classStructure}.
	 * @param ctx the parse tree
	 */
	void exitClassStructure(@NotNull NPPParser.ClassStructureContext ctx);
}