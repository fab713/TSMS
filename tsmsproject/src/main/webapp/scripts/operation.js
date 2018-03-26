function onload(){
	    if(document.forms[0].selectstatus.value == 1)
		{
			document.forms[0].classroom.value="";
			document.forms[0].classroom.style.display = "none";
			document.forms[0].workKindId.style.display = "block";
		}
		else
		{			
			document.forms[0].classroom.style.display = "block";
			document.forms[0].workKindId.style.display = "none";
		}
}
function openurl(action)
{
	document.forms[0].action = action;
	document.forms[0].submit();
}
