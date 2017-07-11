class SpearGrazeCattle
{
    inputs = (Input_Basal Input_Cover Season Duration Input_Dead PalSumCattle);
    outputs = (Output_Cover Output_Basal Output_Dead);
    node_size = (100 55);
    HR_DBN_Num_Slices = "5";
    HR_Utility_Link = "63";
    HR_Probabilistic_Link = "63";
    HR_Functional_Link = "63";
    
    instance BACG : BasalAdultCoverGraze (DPal = DPal, LPal = LPal, Duration = Duration; BACG_CR = CR, BACG_DR = DR, BACG_SBR = SBR, BACG_HBR = HBR, BACG_SAR = SAR, BACG_HAR = HAR)
    {
	label = "BACG";
	position = (393 291);
	HR_LinkGroupInstance = "[BACG_HBR;Output_Basal:-4][BACG_DR;Output_Dead:-4][BACG_CR;Output_Cover:-4]";
	HR_isCollapsed = "true";
	HR_Desc = "";
	HR_HTML_Desc = "";
	HR_InterfaceNode_size = "100,55";
	HR_InterfaceNode_placement = "horizontal";
	HR_Group = "0";
    }

    node Duration
    {
	label = "Duration";
	position = (604 29);
	states = ("" "" "");
	subtype = interval;
	state_values = (0 10 60 90);
	HR_LinkGroup = "[BACG (BACG)_Duration:0]";
	HR_Desc = "";
	HR_State_2 = "";
	HR_State_1 = "";
	HR_State_0 = "";
	HR_LinkMode = "[CR:0][BR:0][SR:0][CR_1:0][DR:0][Duration:0]";
	HR_Group = "0";
    }

    node Season
    {
	label = "Season";
	position = (410 28);
	states = ("Spring" "Summer" "Autumn" "Winter");
	HR_LinkGroup = "[LPal:0]";
	HR_LinkControlPoints = "";
	HR_Desc = "";
	HR_State_1 = "";
	HR_State_0 = "";
	HR_State_2 = "";
	HR_State_3 = "";
	HR_HTML_Desc = "";
	HR_LinkMode = "[C13:0][C14:0][C16:0][C17:0][C18:0][Temp:0][Rain:0][C22:0][C24:0][C23:0][C26:0][C28:0][SP:0][SI:0][C15:0][CGR:0][BADR:0][CDR:0][BGR:0][Season:0][GP:0][SPR:0][C1:0][LPal:0]";
	HR_Group = "0";
    }

    potential (Duration)
    {
	data = (( 1 1 1 )
			( 1 1 1 ));
    }

    potential (Season)
    {
	data = ( 1 1 1 1 );
    }

    potential (Input_Cover)
    {
	data = ( 1 1 1 1 1 1 1 );
    }

    potential (Input_Basal)
    {
    model_data = ( Input_Adults * (1 - CBAR) + if(x>y, "hello", "yello"));
	data = ( 1 1 1 1 1 1 1 );
    }

    potential (CSumIndex | PalSumCattle)
    {
	model_nodes = (PalSumCattle);
	model_data  = ( 5,
			4,
			3,
			2,
			1 );
    }
} % class SpearGrazeCattle
