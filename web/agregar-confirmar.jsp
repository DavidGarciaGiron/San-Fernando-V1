<jsp:useBean id="prodDatos" class="clases.ProductoDatos" scope="request" />
<jsp:useBean id="prod" class="clases.Producto" scope="page"/>
<jsp:setProperty name="prod" property="*" />
<%
    String codigo = request.getParameter("codigo");
    String nombre = request.getParameter("nombre");
    int stock = Integer.parseInt(request.getParameter("stock"));
    double precio = Double.parseDouble(request.getParameter("precio"));
    
    prodDatos.agregarProductos(prod);
%>
    
<jsp:forward page="dashboard.jsp"/>
