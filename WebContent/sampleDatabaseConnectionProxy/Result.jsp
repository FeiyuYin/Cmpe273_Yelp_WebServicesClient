<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleDatabaseConnectionProxyid" scope="session" class="Connection.DatabaseConnectionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleDatabaseConnectionProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleDatabaseConnectionProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleDatabaseConnectionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        Connection.DatabaseConnection getDatabaseConnection10mtemp = sampleDatabaseConnectionProxyid.getDatabaseConnection();
if(getDatabaseConnection10mtemp == null){
%>
<%=getDatabaseConnection10mtemp %>
<%
}else{
        if(getDatabaseConnection10mtemp!= null){
        String tempreturnp11 = getDatabaseConnection10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String email_1id=  request.getParameter("email16");
            java.lang.String email_1idTemp = null;
        if(!email_1id.equals("")){
         email_1idTemp  = email_1id;
        }
        String password_2id=  request.getParameter("password18");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        String firstname_3id=  request.getParameter("firstname20");
            java.lang.String firstname_3idTemp = null;
        if(!firstname_3id.equals("")){
         firstname_3idTemp  = firstname_3id;
        }
        String lastname_4id=  request.getParameter("lastname22");
            java.lang.String lastname_4idTemp = null;
        if(!lastname_4id.equals("")){
         lastname_4idTemp  = lastname_4id;
        }
        String zipcode_5id=  request.getParameter("zipcode24");
            java.lang.String zipcode_5idTemp = null;
        if(!zipcode_5id.equals("")){
         zipcode_5idTemp  = zipcode_5id;
        }
        java.lang.String signUp13mtemp = sampleDatabaseConnectionProxyid.signUp(email_1idTemp,password_2idTemp,firstname_3idTemp,lastname_4idTemp,zipcode_5idTemp);
if(signUp13mtemp == null){
%>
<%=signUp13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signUp13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>