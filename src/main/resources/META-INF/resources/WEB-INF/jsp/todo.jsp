   <%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>

	<div class="container">
		<h1> Enter Todos Details</h1>
		<form:form method="post" modelAttribute="todo">
		<fieldset class="mb-3">	
		          <form:label path="description">Description</form:label>
				 <form:input type="text" path="description" required="required"/>
				 <form:errors path="description" cssClass="text-warning"/>
				<span class="text-warning">Enter at least 10 characters</span>
		</fieldset>	
		<fieldset class="mb-3">	
		          <form:label path="targetDate">Target Date</form:label>
				 <form:input type="text" path="targetDate" required="required"/>
				 <form:errors path="targetDate" cssClass="text-warning"/>
				
		</fieldset>						 
								<%--<form:errors  path="description" cssClass="error" />--%>
								  <%-- Custom error message for minimum length validation --%>
                <form:input type="hidden" path="id"/>
				<form:input type="hidden" path="done"/>
				<input type="submit" class="btn btn-success"/>
				

			
			</form:form>
		</div>
		 <%@ include file="common/footer.jspf" %>
	<script>
        $(document).ready(function() {
            $('#targetDate').datepicker({
                format: 'yyyy-mm-dd',
               
            });
        });
    </script>
<