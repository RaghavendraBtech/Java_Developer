<%@ page isELIgnored="false" import="java.util.*"%>
<h1>collection_array to model attribute</h1>
<b>fav colors are :: <%=Arrays.toString(((String[])request.getAttribute("favColors")))%></b><br>
<b>nick names are :: ${nickNames}</b><br>
<b>phone numbers are :: ${phoneNumbers}</b><br>
<b>id details are :: ${idDetails}</b>