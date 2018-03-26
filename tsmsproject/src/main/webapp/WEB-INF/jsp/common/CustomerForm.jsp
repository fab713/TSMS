<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>  
<% String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<base href="<%=basePath%>"/>    
      
<tiles:insertDefinition name="defaultTemplate">  
  
    <tiles:putAttribute name="title" value="心情印记时光轴" />  
    <tiles:putAttribute name="heads">  
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
        <title>时光轴</title>  
        <style>  
/*          *{margin:0;padding:0} */  
            .box{width:960px;height:300px;margin:100px auto;position:relative;z-index:1;}   
            body{font-size:14px;font-family:"微软雅黑"; background-attachment:fixed;z-index:0;}  
            .box{margin:1px auto;position:relative;z-index:1;}  
              
            /*内容发布区域*/  
            .box .boxcenter{width:500px;height:200px;background:#4e8f86;position:absolute;top:80px;left:180px;border:1px solid green;border-radius:6px;}  
            .box .boxcenter .boxc_t{height:30px;line-height:30px;color:gold;}  
            .box .boxcenter .boxc_c{width:460px;height:100px;border:1px solid #A6C8FF;margin:8px auto;text-indent:10px;box-shadow:0 0 4px #A6C8FF;}  
            .box .boxcenter .boxc_b{width:80px;height:30px;position:absolute;right:10px;bottom:8px;}  
            .box .boxcenter .boxc_b a{font-size:14px;color:#fff;line-height:30px;background:#3bbfb4;border-radius:6px;display:block;text-align:center;text-decoration:none;}  
            .box .boxcenter .boxc_b a:hover{background:#2C8E86;}  
            .box .timeline{width:60px;height:100%;position:absolute;top:100px;left:80px;border-right:3px solid yellow;}  
            .timeline .timeline_t{width:50px;height:50px;border-radius:50%;border:2px solid white;background:url("images/day_yuan.gif") no-repeat;background-size:100%;}  
            .timeline .nextbox{width:380px;height:80px;position:absolute;top:260px;left:60px;}  
            .a{width:380px;height:80px;background:#4e8f86;border-radius:6px;margin-top:30px;font-size:16px;line-height:20px;text-indent:20px;word-break:break-all;position:relative;left:6px;}  
            .a .b{width:6px;height:6px;border-radius:50%;border:2px solid #fff;background:#9DCFE1;position:absolute;top:35px;left:-10px;}  
            #time{font-size:20px;color:gold;}  
            #hour{font-size:12px;color:gold;}  
        </style>  
    </tiles:putAttribute>  
  
    <tiles:putAttribute name="body">  
        <div class="box" style="width:100%;height:100%;background-image: url(images/record_back.jpg);">  
            <!--内容发布区域-->  
            <div class="boxcenter" >  
                <div class="boxc_t"><h4>   随便说点什么吧...</h4></div>  
                <div class="boxc_c" contenteditable="true" id="aa" style="color:black;font-size:19px;"></div>  
                <div class="boxc_b"><a>发布</a></div>  
            </div>  
            <!--时光轴线-->  
            <div class="timeline">  
                <div class="timeline_t">  
                </div>  
                <div class="nextbox" style="color:black;font-size:19px;"></div>  
            </div>  
        </div>  
    </tiles:putAttribute>  
      
    <tiles:putAttribute name="scripts">  
      
        <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>  
          
        <script type="text/javascript">     
            $(function(){  
                $(".box").find(".boxc_b").click(function(){  
                    var center = $(".boxc_c").text();//.appendTo("nextbox");  
                    if(center==""){  
                        alert("嘻嘻，请写下你此时的心情吧...");  
                        return;  
                    }  
                    $(".nextbox").prepend("<div class='a'>"+  
                        "<div class='b'></div>"+"<br/>"+  
                        "<span id='time'>  "+year+"-"+  
                        month+"-"+  
                        day+"  "+  
                        "<span id='hour'>"+hour+":"+min+"</span>"+  
                        "</span>"+  
                        "<br>"+  
                        "<p style='padding:4px'>"+center+"</p>"+  
                        "</div>");  
                    $(".boxc_c").text("");    
                });  
                //alert(1);  
                $(".boxc_c").keydown(function(event){                     
                    var len =$(".boxc_c").text().length;              
                    if(len > 70){  
                    alert("够了，别写了，哪儿那么多话啊...");                   
                    }  
                });  
              
                var dateDom = new Date();  
                //获取本地时间，年月日时分  
                var year = dateDom.getFullYear();  
                var month = dateDom.getMonth()+1;  
                var day = dateDom.getDate();  
                var hour = dateDom.getHours();  
                var min = dateDom.getMinutes();  
            });  
        </script>  
    </tiles:putAttribute>  
</tiles:insertDefinition>  