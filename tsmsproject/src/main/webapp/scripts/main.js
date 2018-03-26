navHover = function() { 
var lis = document.getElementById("navmenu").getElementsByTagName("li"); 
for (var i=0; i<lis.length; i++) { 
lis[i].onmouseover=function() { 
this.className+=" iehover"; 
} 
lis[i].onmouseout=function() { 
this.className=this.className.replace(new RegExp(" iehover\\b"), ""); 
} 
} 
} 
if (window.attachEvent) window.attachEvent("onload", navHover); 


var request;
var resourceId='';
var targetId='';
function init(request,resourceId,targetId){
	request = request;
	resourceId = resourceId; 
	targetId = targetId;
}
function getItemCategoryList(request,resourceId,targetId,context){
	init(request,resourceId,targetId);
    var workKindId = document.getElementById(resourceId).value;
    var url = context + '/questionbank/questionbank/itemcategorylist.do?workKindId='+escape(workKindId);
    if(window.XMLHttpRequest){
         request = new XMLHttpRequest();
    }else if(window.ActiveXObject){
         request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    if(request){
         request.open("GET",url,true);
         request.onreadystatechange=callBack;
         request.send(null);
    }
}
        
function callBack(){
    if(request.readyState == 4){
    	 if(request.status == 200){
         	  parseMessage();
         }else{
              alert('errormessages:'+request.statusText);
         }
    }
}
        
function parseMessage(){
    var xmlDoc=request.responseXML.documentElement;    
	var xSel=xmlDoc.getElementsByTagName('select');
    var select_root=document.getElementById(targetId);
    select_root.options.length=0;
    select_root.add(new Option("-select-",0));
    for(var i=0;i<xSel.length;i++){
         var xValues = xSel[i].getElementsByTagName("values")[0].firstChild.data;
         var xText = xSel[i].getElementsByTagName("text")[0].firstChild.data;
         var option=new Option(xText,xValues);
         try{
              select_root.add(option);
         }catch(e){
         }
    }
}




