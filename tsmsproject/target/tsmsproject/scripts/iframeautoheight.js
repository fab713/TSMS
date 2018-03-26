    function reinitIframe(){
    var iframe = document.getElementById("iframeautoheight");
    try{
    var bHeight = iframe.contentWindow.document.body.scrollHeight;
    var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
    var height = Math.max(bHeight, dHeight);
    iframe.height =  height;
    }catch (ex){}
    }
    window.setInterval("reinitIframe()", 1000);
    
    
    function reinitIframe2(){
    var iframe2 = document.getElementById("iframe2autoheight");
    try{
    var bHeight = iframe2.document.body.scrollHeight;
    var dHeight = iframe2.contentWindow.document.documentElement.scrollHeight;
    var eHeight = document.body.clientHeight-120;
    var height = Math.max(bHeight, dHeight,eHeight);
     
    iframe2.height =  document.body.clientHeight-122;
    }catch (ex){}
    }
    window.setInterval("reinitIframe2()", 1000);