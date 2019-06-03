<%--
  Created by IntelliJ IDEA.
  User: 叶落知秋
  Date: 2019/5/29
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath }/jq/jquery-3.3.1.min.js"></script>
    <title>test</title>
</head>
<body>
    <form action="${pageContext.request.contextPath }/json.action" method="post">
        First Name:<input type="text" name="firstName" maxlength="12" size="12"/> <br/>
        Last Name:<input type="text" name="lastName" maxlength="36" size="12"/> <br/>
        Gender:<br/>
        Male:<input type="radio" name="gender" value="1"/><br/>
        Female:<input type="radio" name="gender" value="0"/><br/>
        Favorite Food:<br/>
        Steak:<input type="checkbox" name="foods" value="Steak"/><br/>
        Pizza:<input type="checkbox" name="foods" value="Pizza"/><br/>
        Chicken:<input type="checkbox" name="foods" value="Chicken"/><br/>
        <textarea wrap="physical" cols="20" name="quote" rows="5">Enter your favorite quote!</textarea><br/>
        Select a Level of Education:<br/>
        <select name="education">
            <option value="Jr.High">Jr.High</option>
            <option value="HighSchool">HighSchool</option>
            <option value="College">College</option>
        </select><br/>
        Select your favorite time of day:<br/>
        <select size="3" name="tOfD">
            <option value="Morning">Morning</option>
            <option value="Day">Day</option>
            <option value="Night">Night</option>
        </select>

        <p><input type="submit"/></p>
    </form>
    <button id="btn">test</button>
</body>
<script>
    $("#btn").click(function(){
        alert("123456");
    });
</script>
</html>
