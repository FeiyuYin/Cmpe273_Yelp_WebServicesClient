<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAllServicesProxyid" scope="session" class="Services.AllServicesProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAllServicesProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleAllServicesProxyid.getEndpoint();
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
        sampleAllServicesProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        Services.AllServices getAllServices10mtemp = sampleAllServicesProxyid.getAllServices();
if(getAllServices10mtemp == null){
%>
<%=getAllServices10mtemp %>
<%
}else{
        if(getAllServices10mtemp!= null){
        String tempreturnp11 = getAllServices10mtemp.toString();
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
        java.lang.String signUp13mtemp = sampleAllServicesProxyid.signUp(email_1idTemp,password_2idTemp,firstname_3idTemp,lastname_4idTemp,zipcode_5idTemp);
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
case 26:
        gotMethod = true;
        String email_6id=  request.getParameter("email29");
            java.lang.String email_6idTemp = null;
        if(!email_6id.equals("")){
         email_6idTemp  = email_6id;
        }
        String password_7id=  request.getParameter("password31");
            java.lang.String password_7idTemp = null;
        if(!password_7id.equals("")){
         password_7idTemp  = password_7id;
        }
        boolean signIn26mtemp = sampleAllServicesProxyid.signIn(email_6idTemp,password_7idTemp);
        String tempResultreturnp27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signIn26mtemp));
        %>
        <%= tempResultreturnp27 %>
        <%
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