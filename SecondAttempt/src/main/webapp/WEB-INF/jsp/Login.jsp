<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=request.getContextPath()%>/" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="scripts/skin/default/layer.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="scripts/jquery-1.12.0.min.js"></script>
    <script type="text/javascript" src="scripts/bootstrap.min.js"></script>
    <script type="text/javascript" src="scripts/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="scripts/trianglify.min.js"></script>
    <script type="text/javascript" src="scripts/layer.js"></script>
    <style>

    </style>
</head>

<body>
<div class="container">

    <form role="form" class="col-md-4 center-block" style="margin:120px auto 0 auto;float:none">
        <h1>login</h1>
        <div class="form-group">
            <label for="username">用户名</label>
            <input type="text" class="form-control" id="username" placeholder="Enter userName" style="padding:20px;">
        </div>
        <div class="form-group">
            <label for="password">密码</label>
            <input type="password" class="form-control" id="password" placeholder="Password" style="padding:20px;">
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" id="che"> 记住密码
            </label>
        </div>
        <div class="col-md-12" style="padding:0px;">
            <button type="button" class="btn btn-default btn-block" id="sub" style="padding:10px;">Sign in</button>
        </div>
        <div id="cc" style="padding-top:20px;text-align: center;"> </div>
    </form>
</div>
</body>
<script type="text/javascript">
    var h = window.innerHeight, w = window.innerWidth;
    // set up the base pattern
    var pattern = Trianglify({
        height: h,
        width: w,
        cell_size: 30 + Math.random() * 50});
    // png
    var png = document.createElement('img');
    $("body")[0].background=pattern.png();

    $("#sub").click(function(){
        var name = $("#username").val();
        var password = $("#password").val();
        $.get("/login",{username:name,password:password},function (text) {
                if(text==="2"){
                    layer.alert('用户名或密码错误', {
                        skin: 'layui-layer-lan'
                        ,closeBtn: 0
                        ,anim: 4 //动画类型
                    });
                }else{
                    window.location.href="/tree";
                }
        });


    })
    var msgArr = ["有事做有所期待，日子就是幸福的。",
        "生活如此难，要怎么过？一笑而过。",
        "碧波荡漾一抹香，茶不醉人人自醉。",
        "只要把心放宽，快乐其实很简单。",
        "生活不能等待别人来安排，要自己去争取与奋斗！",
        "每天都应该是有收获的，哪怕只是一句话。",
        "只要路是对的，就不怕路远。",
        "开心了就笑，不开心就过会再笑。",
        "生活的小处，总是藏有大观。",
        "总有一种期待，是家的味道。",
        "学会在浮躁中思考，你才知道在喧嚣中走向哪里。",
        "万家灯火中，总有一盏为你点亮。",
        "有时候、宁愿像个孩子，不肯看太多的事，听太多的不是，单纯的过一辈子多好！",
        "用心每一天，不忘初心，方能走远。",
        "即使没有翅膀，心也要飞翔。",
        "积一时之跬步，臻千里之遥程。",
        "不开心时，记得要让心情转个弯。",
        "偷偷挤进的一缕斜阳，送来满满的幸福。",
        "只要坚持，事情再小也挡不住宏大的梦。",
        "优等的心，不必华丽，但必须坚固。",
        "天再高，踮起脚尖就能更接近阳光！",
        "与未知的相遇，七分欢喜三分孤寂。",
        "有事做有所期待，日子就是幸福的。",
        "天时人事日相催，冬至阳生春又来",
        "一串淡然的心情，一份纯粹的快乐。"
    ];
    var index = parseInt(Math.random() * (msgArr.length - 1));
    var currentMsg = msgArr[index];
   $("#cc").html(currentMsg);

</script>
</html>