<h2>Employees:</h2>
<ol>
    <ui:repeat value="#{employees.employeesFromDB}" var="employee">
        <li><h:link value="#{employee.name}" outcome="Employees?employeeId=#{employee.employeeId}" /></li>
    </ui:repeat>
</ol>
<h:form>
    <h:inputText value="#{employees.myEmployee.name}" required="true" />
    <h:commandButton value="Add new team" action="#{employees.createEmployee}" />
</h:form>
<h:link outcome="employees" value="MyBatis implementation"/>
<br/>