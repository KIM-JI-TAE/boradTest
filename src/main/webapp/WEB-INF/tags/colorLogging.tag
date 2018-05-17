<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="color" type="java.lang.String" required="true" %>
<%@attribute name="size" type="java.lang.Integer" required="false" %>


<c:set var="size" value="${size  == null ? 20 : size }"/>

<font color="${color}">
<c:forEach begin="1" end="${size}">
	<c:out value="="/>
</c:forEach>

</font>