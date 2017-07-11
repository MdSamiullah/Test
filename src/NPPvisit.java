/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import java.util.HashMap;
import java.util.Map;

import components.*;

import org.antlr.v4.runtime.misc.NotNull;
	
public class NPPvisit extends NETPlusPlusBaseVisitor<String> {
	public ClassDefn classNode; // = new ClassDefn();
	
	public String parentClassList = "";
	public String parentInterfaceList = "";
	
	Attribute tempAttribute;
	BasicNode tempBasicNode;
	Instance tempInstance;
	Potential tempPotential;
	
	/* since attribute is a common component for class, node, potential and class instance
	 *  we should keep track of the current meta component (class = 0, node = 1, pot = 2, class ins = 3)
	 */
	int metaComponentIndex = 0;
	
	// state : 'states' '=' '(' STRING* ')' ';';
		@Override public String visitState(  NETPlusPlusParser.StateContext ctx)  
		{ 
			String str = ctx.str;
			
			String statesValues = ctx.STRING().toString().replaceAll("[,]", "");
			statesValues = "( " + statesValues.substring(1,  statesValues.length()-1) + " )"; 
			
			tempAttribute = new Attribute("states", statesValues);
			
			if(metaComponentIndex == 1) tempBasicNode.insertAttribute(tempAttribute);
			else if(metaComponentIndex == 3) tempInstance.insertAttribute(tempAttribute);
			
			
			return visitChildren(ctx); 
		}
		
		// attribute : attribName '=' attribValue ';' ;
		@Override public String visitAttribute(  NETPlusPlusParser.AttributeContext ctx)  
		{ 
			tempAttribute = new Attribute(ctx.attribName.getText(), ctx.attribValue.str);
			if(metaComponentIndex == 0){
				if(ctx.attribName.getText().equalsIgnoreCase("inputs")) {classNode.insertInputs(ctx.attribValue.str);}
				else if (ctx.attribName.getText().equalsIgnoreCase("outputs")) {classNode.insertOutputs(ctx.attribValue.str);}
				else	classNode.insertAttribute(tempAttribute);
			}	else if(metaComponentIndex == 1){
				tempBasicNode.insertAttribute(tempAttribute);
			}	else if(metaComponentIndex == 2){
				tempPotential.insertAttribute(tempAttribute);
			}	else if(metaComponentIndex == 3){
				tempInstance.insertAttribute(tempAttribute);
			}
			
			return visitChildren(ctx); 
		}
		
		// classInstance : 'instance' instanceName ':' className bindings '{' instanceAttributes '}';
		@Override public String visitClassInstance(  NETPlusPlusParser.ClassInstanceContext ctx)  
		{ 
			metaComponentIndex = 3;
			
			if( ctx.bindings.inputBindings!= null && ctx.bindings.outputBindings != null){
				tempInstance = new Instance(ctx.instanceName.getText(), ctx.className.getText(), ctx.bindings.inputBindings.str + "; ", ctx.bindings.outputBindings.str);
			}
			else if(ctx.bindings.outputBindings == null){			
				tempInstance = new Instance(ctx.instanceName.getText(), ctx.className.getText(), ctx.bindings.inputBindings.str, "");
			}
			else if(ctx.bindings.inputBindings == null){
				tempInstance = new Instance(ctx.instanceName.getText(), ctx.className.getText(), "; ", ctx.bindings.outputBindings.str);
			}
			
			classNode.insertInstance(tempInstance);
					
			String strTest = ctx.str;
			
			return visitChildren(ctx);
		}
		
		// potential : 'potential' '(' edgeInformation ')' '{' (potentialAttribute) '}';
		@Override public String visitPotential(  NETPlusPlusParser.PotentialContext ctx)  
		{ 
			metaComponentIndex = 2;
			
			String str = ctx.edgeInformation.str;
			
			String child = str.split("[|]")[0];
			String parent = "";
			if(str.split("[|]").length>1) {parent = str.split("[|]")[1];}
			
			if(ctx.potentialAttribute.data != null){	
				tempPotential = new Potential(ctx.edgeInformation.str, child, parent, ctx.potentialAttribute.data.str);
			}
			else tempPotential = new Potential(ctx.edgeInformation.str, child, parent, "");
			
			classNode.insertPotential(tempPotential);
			
			return visitChildren(ctx); 
		}
		
		// basicNode : 'node' nodeName '{' nodeAttribute* '}' | 'node' nodeType=('discrete' | 'continuous') nodeName '{' nodeAttribute* '}' | 'decision' nodeName '{' nodeAttribute* '}' | 'utility' nodeName '{' nodeAttribute* '}' ;
		@Override public String visitBasicNode(  NETPlusPlusParser.BasicNodeContext ctx)  
		{ 
			metaComponentIndex = 1;
			
			if(ctx.nodeType != null){
				tempBasicNode = new BasicNode(ctx.nodeName.getText(), ctx.nodeType.getText() + " node");
			}
				
			else {
				String tempStr = ctx.str;
				String typeStr;
				
				tempStr = tempStr.split(" ")[0];
				
				if(tempStr.equalsIgnoreCase("node")){
					tempBasicNode = new BasicNode(ctx.nodeName.getText(), "discrete node");
				}
				else if(tempStr.equalsIgnoreCase("decision")) tempBasicNode = new BasicNode(ctx.nodeName.getText(), "decision");
				else if (tempStr.equalsIgnoreCase("utility")) tempBasicNode = new BasicNode(ctx.nodeName.getText(), "utility");
			}
			
			classNode.insertBasicNode(tempBasicNode);
			
			return visitChildren(ctx); 
		}
			
	// label : 'label' '=' STRING ';';
		@Override public String visitLabel(  NETPlusPlusParser.LabelContext ctx)  
		{ 
			tempAttribute = new Attribute("label", ctx.STRING.getText());
			
			if(metaComponentIndex == 1) tempBasicNode.insertAttribute(tempAttribute);
			else if(metaComponentIndex == 3) tempInstance.insertAttribute(tempAttribute);
			
			return visitChildren(ctx); 
		}
				
		// position : 'position' '=' '(' xCoordinate yCoordinate ')' ';';
		@Override public String visitPosition(  NETPlusPlusParser.PositionContext ctx)  
		{ 
			String str = ctx.str;
			
			tempAttribute = new Attribute("position", "( "+ ctx.xCoordinate.getText() + " " + ctx.yCoordinate.getText() + " )");
			
			if(metaComponentIndex == 1) tempBasicNode.insertAttribute(tempAttribute);
			else if(metaComponentIndex == 3) tempInstance.insertAttribute(tempAttribute);
			
			return visitChildren(ctx); 
		}
		
		//fileStructureDefn : classStructure | abstractClassStructure | interfaceStructure;
		@Override public String visitFileStructureDefn(  NETPlusPlusParser.FileStructureDefnContext ctx)  
		{ 	
			return visitChildren(ctx); 
		}
		
		// classStructure: 'class' className parentClass parentInterfaces '{' (classElement )* '}'
		@Override public String visitClassStructure( NETPlusPlusParser.ClassStructureContext ctx) 
		{ 
			metaComponentIndex = 0; // this will be 0 for class, abstract class and interface. Since
									// for a signle file no two of them will occur simultaneously
			
			String className = ctx.className.getText();
			String strTest = ctx.str;
			
			classNode = new ClassDefn(className, 2);
			
			//		my plan is to update the components of classNode on the fly. If it does not work,
			//      then same type of global components can be created and later can be assigned here.
			
			return visitChildren(ctx); 
		}
		
		
		// abstractClassStructure: 'abstract' 'class' className parentClass parentInterfaces '{' (classElement )* '}'
		@Override public String visitAbstractClassStructure( NETPlusPlusParser.AbstractClassStructureContext ctx) 
		{ 
			metaComponentIndex = 0; // this will be 0 for class, abstract class and interface. Since
			// for a signle file no two of them will occur simultaneously

			String abstractClassName = ctx.className.getText();
			String strTest = ctx.str;
			
			classNode = new ClassDefn(abstractClassName, 1);
			
			return visitChildren(ctx); 
		}
		
		
		@Override public String visitInterfaceStructure( NETPlusPlusParser.InterfaceStructureContext ctx) 
		{ 
			metaComponentIndex = 0; // this will be 0 for class, abstract class and interface. Since
			// for a signle file no two of them will occur simultaneously

			String interfaceName = ctx.interfaceName.getText();
			String strTest = ctx.str;
			
			classNode = new ClassDefn(interfaceName, 0);
			
			return visitChildren(ctx); 
		}
		
		
		@Override public String visitInterfaceNameList( NETPlusPlusParser.InterfaceNameListContext ctx) 
		{ 
			return visitChildren(ctx); 
		}
		
		
		@Override public String visitInterfaceElement( NETPlusPlusParser.InterfaceElementContext ctx) 
		{ 
			return visitChildren(ctx); 
		}
		
		// parentClass : 'extends' superClassName
		@Override public String visitParentClass( NETPlusPlusParser.ParentClassContext ctx) 
		{ 
			if(ctx.superClassName != null)
				parentClassList = ctx.superClassName().getText();
			
			return visitChildren(ctx); 
		}
		
		// parentClass : 'implements' interfaceNameList
		@Override public String visitParentInterfaces( NETPlusPlusParser.ParentInterfacesContext ctx) 
		{ 
			if(ctx.interfaceNameList != null)
				parentInterfaceList = ctx.interfaceNameList.getText();
			return visitChildren(ctx); 
		}
		
		// stateValues : 'state_values' '=' '(' NUMBER* ')' ';';
		@Override public String visitStateValues(  NETPlusPlusParser.StateValuesContext ctx)  
		{ 
			String str = ctx.str;
			
			String statesValues = ctx.NUMBER().toString();
			statesValues = "( " + statesValues.substring(1,  statesValues.length()-1) + " )";
			
			statesValues = statesValues.replaceAll("[,]", "");
			
			tempAttribute = new Attribute("state_values", statesValues);
			
			if(metaComponentIndex == 1) tempBasicNode.insertAttribute(tempAttribute);
			else if(metaComponentIndex == 3) tempInstance.insertAttribute(tempAttribute);
			
			return visitChildren(ctx); 
		}
		
		// subtype : 'subtype' '=' 'boolean' ';' | 'subtype' '=' 'label' ';' | 'subtype' '=' 'number' ';' stateValues | 'subtype' '=' 'interval' ';' stateValues ;
		@Override public String visitSubtype(  NETPlusPlusParser.SubtypeContext ctx)  
		{ 
			String str = ctx.str;
			
			str = str.split(" ")[2];
			
			tempAttribute = new Attribute("subtype", str);
			
			if(metaComponentIndex == 1) tempBasicNode.insertAttribute(tempAttribute);
			else if(metaComponentIndex == 3) tempInstance.insertAttribute(tempAttribute);
			
			return visitChildren(ctx); 
		}
	
	// nodeName : IDENTIFIER ;
	@Override public String visitNodeName(  NETPlusPlusParser.NodeNameContext ctx) 
	{ 
		return visitChildren(ctx); 
	}
	
	// formalName : IDENTIFIER;
	@Override public String visitFormalName(  NETPlusPlusParser.FormalNameContext ctx) 
	{ 
		return visitChildren(ctx); 
	}
	
	// data : 'data' '=' '(' tuple ')' ';';
	@Override public String visitData(  NETPlusPlusParser.DataContext ctx)  
	{  
		String str = ctx.str;
		
		// it is kind of attribute for potential. So it data insertion can also be managed from here
		return visitChildren(ctx); 
	}
	
	@Override public String visitInstanceName(  NETPlusPlusParser.InstanceNameContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitFunction_call(  NETPlusPlusParser.Function_callContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	// bindings : '(' ')' | '(' inputBindings ')' | '(' inputBindings ';' outputBindings')' | '(' ';' outputBindings')'	 ;
	@Override public String visitBindings(  NETPlusPlusParser.BindingsContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitClassName(  NETPlusPlusParser.ClassNameContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	// attribValue : STRING |	NUMBER | '(' NUMBER+ ')' | '(' IDENTIFIER+')' | '(' ')'  ;
	@Override public String visitAttribValue(  NETPlusPlusParser.AttribValueContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	// domainElement : basicNode |   potential ;
	@Override public String visitDomainElement(  NETPlusPlusParser.DomainElementContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}

	@Override public String visitLiteral(  NETPlusPlusParser.LiteralContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitActualName(  NETPlusPlusParser.ActualNameContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	// tuple : (NUMBER)+ | (tuple1)+  ;
	@Override public String visitTuple(  NETPlusPlusParser.TupleContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	// tuple1 : '(' tuple ')' ;
	@Override public String visitTuple1(  NETPlusPlusParser.Tuple1Context ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitYCoordinate(  NETPlusPlusParser.YCoordinateContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitSumExpr(  NETPlusPlusParser.SumExprContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitProductExpr(  NETPlusPlusParser.ProductExprContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	// potentialAttribute : data |	modelAttributes ;
	@Override public String visitPotentialAttribute(  NETPlusPlusParser.PotentialAttributeContext ctx)  
	{
		metaComponentIndex = 2;
		
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitParameter(  NETPlusPlusParser.ParameterContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitExpr(  NETPlusPlusParser.ExprContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitStmt1(  NETPlusPlusParser.Stmt1Context ctx)  
	{ 
		
		return visitChildren(ctx); 
	}
	
	// classElement : domainElement |  attribute+ |  classInstance ;
	@Override public String visitClassElement(  NETPlusPlusParser.ClassElementContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}

	
	// nodeAttribute : 	state |	label |   position |	attribute |   subtype ;
	@Override public String visitNodeAttribute(  NETPlusPlusParser.NodeAttributeContext ctx) 
	{ 
		
		return visitChildren(ctx); 
	}
	
	// instanceAttribute : 	label |   position |	attribute ;
	@Override public String visitInstanceAttribute(  NETPlusPlusParser.InstanceAttributeContext ctx) 
	{ 
		metaComponentIndex = 3;
		
		return visitChildren(ctx); 
	}
	
	// childNodes : IDENTIFIER+;
	@Override public String visitChildNodes(  NETPlusPlusParser.ChildNodesContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitProg(  NETPlusPlusParser.ProgContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	// edgeInformation : (childNodes) | (childNodes '|' parentNodes) ;
	@Override public String visitEdgeInformation(  NETPlusPlusParser.EdgeInformationContext ctx)  
	{ 
		
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitAttribName(  NETPlusPlusParser.AttribNameContext ctx)  
	{ 
		
		return visitChildren(ctx); 
	}
	
	// inputBindings : inputBinding (',' inputBinding )*			
	@Override public String visitInputBindings(  NETPlusPlusParser.InputBindingsContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	// inputBinding : formalName '=' actualName ;
		@Override public String visitInputBinding(  NETPlusPlusParser.InputBindingContext ctx)  
		{ 
			String str = ctx.str;
			
			return visitChildren(ctx); 
		}
	
	
	@Override public String visitXCoordinate(  NETPlusPlusParser.XCoordinateContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	// parentNodes : IDENTIFIER+;
	@Override public String visitParentNodes(  NETPlusPlusParser.ParentNodesContext ctx)  
	{ 
		
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitFormula(  NETPlusPlusParser.FormulaContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitBoolExpr(  NETPlusPlusParser.BoolExprContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitParameters(  NETPlusPlusParser.ParametersContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	
	@Override public String visitStmt(  NETPlusPlusParser.StmtContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	// outputBindings : outputBinding (',' outputBinding )*
	@Override public String visitOutputBindings(  NETPlusPlusParser.OutputBindingsContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	// outputBinding : actualName '=' formalName ;
	@Override public String visitOutputBinding(  NETPlusPlusParser.OutputBindingContext ctx)  
	{ 
		String str = ctx.str;
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitPrimary(  NETPlusPlusParser.PrimaryContext ctx)  
	{ 
		return visitChildren(ctx); 
	}
	
	@Override
	public String toString(){
		int numOfTab = 1;
		classNode.printCode(numOfTab);
		return classNode.toString();
	}
	
}


/*
 Each class has a unique name, so make a map from class/interface/abs_class name to its components
  component analysis of a class:
  class consists of some elements 
  element are all string convertible or store-able in a string
  Make a hash map from string to string (component name to component value i.e representing string)
  Component names could be overlapping, so name should be unique to avoid map collision
  
  Class components are: [domain element, attributes, class instances]
  Each domain element : [a list of basic nodes, a list of potentials]
  						basic node [unique name, type, nodeAttributes => same as class instance]
  							type [discrete node, continuous node, decision, utility => any one, convertible to string]
  							
  						potential [edge information, potentialAttribute]
  							edge: [child nodes, parent nodes]
  								child nodes : nullable (might be empty) list of IDs convertible to string
  								parent nodes : nullable (might be empty) list of IDs convertible to string
  							potentialAttribute:   [1 (or more is supported) data, attributes (a set of attributes) same as instance and basic nodes]
  								data: tuple : may be convertible to a single string
  								modelAttrib: [either stmt1, list of identifiers]
  
  Each domain attribute
  
  Each domain class instance: [unique names, bindings, instance attributes]
  							unique names
  							bindings
  									input bindings = might be an empty string
  									output bindings = might be an empty string
  							instance attributes: [might be more than one. and I think each needs to have separate access. hence an array needs to be prepared for this]
  												state = collection of strings -> 1 string possible
  												label = a string
  												position = 2 numbers -> 1 string possible
  												attribute [name, value]
  														name [uniq for the instance]
  														value [string, list of number, list of ID or empty to be convertible to string]
  												subtype [type value like boolean/label, number/interval]
  														stateValues: list of numbers, to be converted to string
  												
  	Some global strings can track class name, instance name, node name and etc while 
  	updating elements/components during traversing the tree. and at the end of such traversal, 
  	these can be used to store in the corresponding mapping entry
  
  For displaying:
  
  a file starts with class with no space
  { and } with no space
  in the class there are some nodes and/or instances and/or potentials
  Their definition starts with 1 tab
  
  need to take care about data only. May be 2 tabs
  
  
 * */
 