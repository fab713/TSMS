var isie = (window.navigator.userAgent.indexOf("MSIE")>0);

function util_getEventObject(event)
{
  if(isie)
    return event.srcElement;
  else
    return event.target;
}

function util_cancelBrowserEvt(event)
{
    if (event==null)
    { // alert("ERROR:  EVENT OBJECT IS NULL WHEN TRYING TO CANCEL EVENT.");
      return;
    }

    if(isie)
    {
        event.cancelBubble=true;
        event.returnValue=false;
    }
    else
    {
        event.stopPropagation();
        event.preventDefault();
    }
    
    return false;
}
function setactionurl(action){
	   document.forms[0].action=action;
	   document.forms[0].submit();
	   //alert(action);
}

function setactionurlnosubmit(action){
	   document.forms[0].action=action;
	   //document.forms[0].submit(); 
	   //alert(action);
}

function urllocation(action){
	//alert(action);
	window.location.href=action;
}

function seteventrecaction(action){
	   document.forms[0].action=action;
	   document.forms[0].submit(); 
	   //alert(action);
}

function setactionaftersubmit(action,oldaction){
	   document.forms[0].action=action;
	   document.forms[0].submit();
	   document.forms[0].action=oldaction;
}
