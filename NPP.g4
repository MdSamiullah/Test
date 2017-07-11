grammar NPP; // rename to distinguish from Expr.g4

@header{
	//package target.antlr4;
	//System.out.println("Grammar started");
	// what ever you will write here will be placed at the top of the generated files like lexer, visitor, parser
}
@members {
	//System.out.println("Grammar started");
	/* what ever you will write here will be placed at the body as a statement/series of statements/method/class
		of the generated files like lexer, parser
	*/
//	StringBuilder bufferTuple = new StringBuilder();
}

prog	: fileStructureDefn ;

fileStructureDefn returns [String str]
@init{StringBuilder bufferFileStructureDefn = new StringBuilder();}
@after{$str = bufferFileStructureDefn.toString();}
			:	classStructure {bufferFileStructureDefn.append($classStructure.str);}
			|	abstractClassStructure {bufferFileStructureDefn.append($abstractClassStructure.str);}
			|	interfaceStructure {bufferFileStructureDefn.append($interfaceStructure.str);}
			;

classStructure returns [String str]
@init{StringBuilder bufferClassStructure = new StringBuilder();}
@after{$str = bufferClassStructure.toString();}
			:	'class' className parentClass parentInterfaces '{' {bufferClassStructure.append("class " + $className.text + $parentClass.str + " " + $parentInterfaces.str + "\n{\n");} (classElement {bufferClassStructure.append($classElement.str + "\n");})* '}' {bufferClassStructure.append("}\n");}
			;

abstractClassStructure returns [String str]
@init{StringBuilder bufferAbstractClassStructue = new StringBuilder();}
@after{$str = bufferAbstractClassStructue.toString();}
			:	'abstract' 'class' className parentClass parentInterfaces '{' {bufferAbstractClassStructue.append("abstract class " + $className.text + $parentClass.str + " " + $parentInterfaces.str + "\n{\n");} (classElement {bufferAbstractClassStructue.append($classElement.str + "\n");})* '}' {bufferAbstractClassStructue.append("}\n");}
			;

interfaceStructure returns [String str]
@init{StringBuilder bufferInterfaceStructue = new StringBuilder();}
@after{$str = bufferInterfaceStructue.toString();}
			:	'interface' interfaceName parentInterfaces '{' {bufferInterfaceStructue.append("interface " + $interfaceName.text + $parentInterfaces.str + "\n{\n");} (interfaceElement {bufferInterfaceStructue.append($interfaceElement.str + "\n");})* '}' {bufferInterfaceStructue.append("}\n");}
			;

interfaceName: IDENTIFIER;

interfaceElement returns [String str]
@init{StringBuilder bufferInterfaceElement = new StringBuilder();}
@after{$str = bufferInterfaceElement.toString();}
				:	basicNode {bufferInterfaceElement.append($basicNode.str + "\n");}
				|  (attribute {bufferInterfaceElement.append($attribute.str + "\n");})+
				|  classInstance {bufferInterfaceElement.append($classInstance.str + "\n");}
				;

parentClass returns [String str]
@init{StringBuilder bufferParentClass = new StringBuilder();}
@after{$str = bufferParentClass.toString();}
			: 	'extends' superClassName {bufferParentClass.append("extends " + $superClassName.text + " ");}
			| {bufferParentClass.append("");}
			;

superClassName : IDENTIFIER;

parentInterfaces returns [String str]
@init{StringBuilder bufferParentInterfaces = new StringBuilder();}
@after{$str = bufferParentInterfaces.toString();}
			: 	'implements' interfaceNameList {bufferParentInterfaces.append("implements " + $interfaceNameList.str + " ");}
			|	{bufferParentInterfaces.append("");}
			;

interfaceNameList returns [String str]
@init{StringBuilder bufferInterfaceNameList = new StringBuilder();}
@after{$str = bufferInterfaceNameList.toString();}
				: interfaceName { bufferInterfaceNameList.append($interfaceName.text);} (',' interfaceName { bufferInterfaceNameList.append(", " + $interfaceName.text);})*
				;

className : IDENTIFIER;

classElement returns [String str]
@init{StringBuilder bufferClassElement = new StringBuilder();}
@after{$str = bufferClassElement.toString();}
			: domainElement {bufferClassElement.append($domainElement.str + "\n");}
			|  (attribute {bufferClassElement.append($attribute.str + "\n");})+
			|  classInstance {bufferClassElement.append($classInstance.str + "\n");}
			;

domainElement returns [String str]
@init{StringBuilder bufferDomainElement = new StringBuilder();}
@after{$str = bufferDomainElement.toString();}
			: basicNode {bufferDomainElement.append($basicNode.str + "\n");}
			|   potential {bufferDomainElement.append($potential.str + "\n");}
			;

classInstance returns [String str]
@init{StringBuilder bufferClassInstance = new StringBuilder();}
@after{$str = bufferClassInstance.toString();}

			: 'instance' instanceName ':' className '(' bindings ')' '{' { bufferClassInstance.append("instance " + $instanceName.text + " : " + $className.text + "(" + $bindings.str + ")\n{\n");} (instanceAttribute {bufferClassInstance.append($instanceAttribute.str + "\n");})* '}' {bufferClassInstance.append("}\n");}
			;

instanceName : IDENTIFIER;

instanceAttribute returns [String str]
@init{StringBuilder bufferInstanceAttribute = new StringBuilder();}
@after{$str = bufferInstanceAttribute.toString();}
				:	label {bufferInstanceAttribute.append($label.str);}
				|   position {bufferInstanceAttribute.append($position.str);}
				|	attribute {bufferInstanceAttribute.append($attribute.str);}
				;

bindings returns [String str]
@init{StringBuilder bufferBindings = new StringBuilder();}
@after{$str = bufferBindings.toString();}
		 : inputBindings {bufferBindings.append($inputBindings.str + " ");}
		 | inputBindings ';' outputBindings {bufferBindings.append($inputBindings.str + "; " + $outputBindings.str);}
		 |  ';' outputBindings {bufferBindings.append("; " + $outputBindings.str + " ");}
		 |
		 ;

inputBindings returns [String str]
@init{StringBuilder bufferInputBindings = new StringBuilder();}
@after{$str = bufferInputBindings.toString();}
				:
				inputBinding {bufferInputBindings.append($inputBinding.str);} (',' inputBinding {bufferInputBindings.append(", "+ $inputBinding.str);})*
				;
inputBinding returns [String str]
@init{StringBuilder bufferInputBinding = new StringBuilder();}
@after{$str = bufferInputBinding.toString();}
			:	formalName '=' actualName {bufferInputBinding.append($formalName.text + " = " + $actualName.text);}
			;

outputBindings returns [String str]
@init{StringBuilder bufferOutputBindings = new StringBuilder();}
@after{$str = bufferOutputBindings.toString();}
				:
				outputBinding {bufferOutputBindings.append($outputBinding.str);} (',' outputBinding {bufferOutputBindings.append(", "+ $outputBinding.str);})*
				;

outputBinding returns [String str]
@init{StringBuilder bufferOutputBinding = new StringBuilder();}
@after{$str = bufferOutputBinding.toString();}
			:	formalName '=' actualName {bufferOutputBinding.append($formalName.text + " = " + $actualName.text);}
			;

actualName : IDENTIFIER;
formalName : IDENTIFIER;

basicNode returns [String str]
@init{StringBuilder bufferBasicNode = new StringBuilder();}
@after{$str = bufferBasicNode.toString();}
			: 'node' nodeName '{' {bufferBasicNode.append("node " + $nodeName.text + "\n{\n");} (nodeAttribute {bufferBasicNode.append($nodeAttribute.str + "\n");})* '}' {bufferBasicNode.append("}\n");}
			| nodeType=('discrete' | 'continuous') 'node' nodeName '{' {bufferBasicNode.append($nodeType.text  + " node " + $nodeName.text + "\n{\n");} (nodeAttribute {bufferBasicNode.append($nodeAttribute.str + "\n");})* '}' {bufferBasicNode.append("}\n");}
			| 'decision' nodeName '{' {bufferBasicNode.append("decision " + $nodeName.text + "\n{\n");} (nodeAttribute {bufferBasicNode.append($nodeAttribute.str + "\n");})* '}' {bufferBasicNode.append("}\n");}
			| 'utility' nodeName '{' {bufferBasicNode.append("utility " + $nodeName.text + "\n{\n");} (nodeAttribute {bufferBasicNode.append($nodeAttribute.str + "\n");})* '}' {bufferBasicNode.append("}\n");}
			;

nodeName : IDENTIFIER ;

nodeAttribute returns [String str]
@init{StringBuilder bufferNodeAttribute = new StringBuilder();}
@after{$str = bufferNodeAttribute.toString();}
				: 	state {bufferNodeAttribute.append($state.str);}
				|	label {bufferNodeAttribute.append($label.str);}
				|   position {bufferNodeAttribute.append($position.str);}
				|	attribute {bufferNodeAttribute.append($attribute.str);}
				|   subtype {bufferNodeAttribute.append($subtype.str);}
				;

state returns [String str]
@init{StringBuilder bufferState = new StringBuilder();}
@after{$str = bufferState.toString();}
		: 'states' '=' '(' {bufferState.append("states = ( ");} (STRING {bufferState.append($STRING.text);})* ')' ';' {bufferState.append(" );");}
		;

label returns [String str]
@init{StringBuilder bufferLabel = new StringBuilder();}
@after{$str = bufferLabel.toString();}
		: 'label' '=' STRING ';' {bufferLabel.append("label = " + $STRING.text + ";\n");}
		;

position returns [String str]
@init{StringBuilder bufferPosition = new StringBuilder();}
@after{$str = bufferPosition.toString();}
		: 'position' '=' '(' xCoordinate yCoordinate ')' ';' {bufferPosition.append("position = (" + $xCoordinate.text + " " + $yCoordinate.text + " );\n");}
		;

xCoordinate : NUMBER ;
yCoordinate : NUMBER ;

subtype returns [String str]
@init{StringBuilder bufferSubtype = new StringBuilder();}
@after{$str = bufferSubtype.toString();}
		: 'subtype' '=' 'boolean' ';' {bufferSubtype.append("subtype = boolean");}
		| 'subtype' '=' 'label' ';' {bufferSubtype.append("subtype = label");}
		| 'subtype' '=' 'number' ';' stateValues {bufferSubtype.append("subtype = number");}
		| 'subtype' '=' 'interval' ';' stateValues {bufferSubtype.append("subtype = interval");}
		;

stateValues returns [String str]
@init{StringBuilder bufferStateValues = new StringBuilder();}
@after{$str = bufferStateValues.toString();}
			: 'state_values' '=' '(' {bufferStateValues.append("state_values = ( ");} (NUMBER {bufferStateValues.append($NUMBER.text+ " ");})* ')' ';' {bufferStateValues.append(" );\n");}
			;

potential returns [String str]
@init{StringBuilder bufferPotential = new StringBuilder();}
@after{$str = bufferPotential.toString();}
			: 'potential' '(' edgeInformation ')' '{' {bufferPotential.append("potential ( " + $edgeInformation.str + " )\n{\n");} (potentialAttribute {bufferPotential.append($potentialAttribute.str + "\n");})* '}' {bufferPotential.append("}\n");}
			;

edgeInformation returns [String str]
@init{StringBuilder bufferEdgeInformation = new StringBuilder();}
@after{$str = bufferEdgeInformation.toString();}
				: (childNodes) {bufferEdgeInformation.append($childNodes.str + " ");}
				| (childNodes '|' parentNodes) {bufferEdgeInformation.append($childNodes.str + " | " + $parentNodes.str);}
				;

childNodes returns [String str]
@init{StringBuilder bufferChildNodes = new StringBuilder();}
@after{$str = bufferChildNodes.toString();}
			: (IDENTIFIER {bufferChildNodes.append($IDENTIFIER.text + " ");})+;

parentNodes returns [String str]
@init{StringBuilder bufferParentNodes = new StringBuilder();}
@after{$str = bufferParentNodes.toString();}
			: (IDENTIFIER {bufferParentNodes.append($IDENTIFIER.text + " ");})+;

data returns [String str]
@init{StringBuilder bufferData = new StringBuilder();}
@after{$str = bufferData.toString();}
	: 'data' '=' '(' tuple ')' ';' {bufferData.append("data = ( " + $tuple.str + " );\n");}
	;

tuple returns [String str]
@init{StringBuilder bufferTuple = new StringBuilder();}
@after{$str = bufferTuple.toString();}
		: (NUMBER {bufferTuple.append($NUMBER.text + " ");})+
		| (tuple1 {bufferTuple.append($tuple1.str + " ");})+
		;

tuple1 returns [String str]
@init{StringBuilder bufferTuple1 = new StringBuilder();}
@after{$str = bufferTuple1.toString();}
		: '(' tuple ')' {bufferTuple1.append(" ( " + $tuple.str + " )");}
		;

potentialAttribute returns [String str]
@init{StringBuilder bufferPotentialAttribute = new StringBuilder();}
@after{$str = bufferPotentialAttribute.toString();}
					: 	data {bufferPotentialAttribute.append($data.str + "\n");}
					| 	attribute {bufferPotentialAttribute.append($attribute.str + "\n");}
					;

attribute returns [String str]
@init{StringBuilder bufferAttribute = new StringBuilder();}
@after{$str = bufferAttribute.toString();}
		: attribName '=' attribValue ';' {bufferAttribute.append($attribName.text + " = " + $attribValue.str + ";\n");}
		;

stmt1 returns [String str]
@init{StringBuilder bufferStmt1 = new StringBuilder();}
@after{$str = bufferStmt1.toString();}
		: 	stmt {bufferStmt1.append($stmt.text);}
 		|	'(' stmt ')' {bufferStmt1.append("( " + $stmt.text + ")");}
		;

stmt returns [String str]
@init{StringBuilder bufferStmt = new StringBuilder();}
@after{$str = bufferStmt.toString();}
		:	formula {bufferStmt.append($formula.text);}
		|	formula ',' stmt {bufferStmt.append($formula.text + ", " + $stmt.str);}
		|
		;

attribName : IDENTIFIER;

attribValue returns [String str]
@init{StringBuilder bufferAttributeValue = new StringBuilder();}
@after{$str = bufferAttributeValue.toString();}
			:	NUMBER {bufferAttributeValue.append($NUMBER.text + " ");}
			|	STRING {bufferAttributeValue.append($STRING.text + " ");}
			|	stmt1 {bufferAttributeValue.append($stmt1.str + " ");}
			| '(' {bufferAttributeValue.append("( ");} (NUMBER {bufferAttributeValue.append($NUMBER.text + " ");} )+ ')' {bufferAttributeValue.append(" )");}
			| '(' {bufferAttributeValue.append("( ");} (IDENTIFIER {bufferAttributeValue.append($IDENTIFIER.text + " ");})* ')' {bufferAttributeValue.append(" )");}
			| '(' ')' {bufferAttributeValue.append(" ( )");}
			 ;

MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
LESS: '<';
GRT: '>';
LE: '<=';
GE: '>=';
EE: '==';
NE: '!=';
IDENTIFIER : ([a-z]|[A-Z]|'_'|[$#@!\?]) ([a-zA-Z0-9]|'_'|[$#@!\?])* //{System.out.println("identifier found");}
			;
STRING: '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;
NUMBER : '-'?[0-9]+('.'[0-9]+)?('E'('-'|'')[0-9]+)?;
WS  :   [ \t\n\r]+ -> skip ;
NEWLINE:'\r'? '\n' ;

formula
  : expr
  ;

function_call
  : IDENTIFIER '(' ')'
  | IDENTIFIER '(' parameters ')'
  ;

parameters
  : parameter
  | parameters ',' parameter
  ;

parameter
  : formula
  ;

expr
    : boolExpr
    ;
boolExpr
    : sumExpr (('<' | '<=' | '>' | '>=' | '==' | '!=') sumExpr)*
    ;
sumExpr
    : productExpr (('-' | '+') productExpr)*
    ;
productExpr
    : primary (('/' | '*') primary)* ;

primary
  : literal
  | function_call
  | '(' formula ')'
  ;

literal
  : 'true'
  | 'false'
  |	NUMBER
  | STRING
  | IDENTIFIER
  ;
