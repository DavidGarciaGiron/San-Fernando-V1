<%@page import="clases.Actividad"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<jsp:useBean id="prodDatos" class="clases.ActividadDatos" scope="request"/>

<%
    
    List l = prodDatos.recuperarActividades();
    Iterator i = l.iterator();
    
    Actividad acti;
    
%>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="public/main2.css"/>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
    	<div class="row">
            <div class="col-md-12" style="margin-top:20px;">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                                <h3 class="panel-title">Actividades</h3>
                        </div>
                        <div class="panel-body">
                            <form action="busqueda.jsp" method="post">
                                <div  class="form-group">
                                    <div class="col-md-10"><input type="text" class="form-control" placeholder="Buscar ..." name="nombreActividad" /></div>
                                    <div class=""><input type="submit" class="btn btn-primary col-md-2" value="Buscar"></div>
                                </div>
                            </form>
                            
                        </div>
                        <table class="table table-hover" id="dev-table">
                                <thead>
                                    <tr>
                                        <th>Codigo</th>
                                        <th>Nombre</th>
                                        <th>Stock</th>
                                        <th>Precio</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <% while(i.hasNext()){
                                        acti = (Actividad)i.next(); %>
                                    <tr>
                                        <td> <%= acti.getCodigo() %> </td>
                                       
                                    </tr>
                                    <% } %>
                                </tbody>
                         </table>
                   </div>
            </div>
	</div>
        <a href="dashboard.jsp"><button class="btn btn-danger">Ir al dashboard</button></a>                                
</div>