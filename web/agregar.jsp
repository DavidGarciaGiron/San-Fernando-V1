<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="https://fonts.googleapis.com/css?family=Libre+Franklin" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<style>
   body{ background-image:url("https://hdwallsource.com/img/2014/9/blur-26347-27038-hd-wallpapers.jpg"); background-repeat:no-repeat; background-position:center; background-size:cover; padding:25px;}
   
   input:focus{
        outline: none;
    }
    
    form{
        width: 35%;
        margin-left:auto;
        margin-right:auto;
        padding:50px;
        background:whitesmoke;
        border-radius:5px;
        position:relative;
        font-family: 'Libre Franklin', sans-serif;
    }

    form > div {
        float:left;margin-bottom:30px;
    }
    form > div > p{
        font-size: 12px;margin-bottom: 3px;
    }
    form > div > input{
        font-size:12px;letter-spacing:1px;padding:  5px;border: 0;background:  whitesmoke;border-bottom: 1px solid silver;width: 100%;color: gray;
    }

    form > p:last-of-type{
        text-align: center;padding-top: 50px;display:  table;width: 100%;color:white;
    }

    form > p:last-of-type > a{
        cursor:pointer;border:0;
        padding: 10px 25px;
        background:  silver;
        border-radius:  28px;
        font-size: 12px; 
    }

    .term{
        padding-top:40px;display: flex;width:  100%;align-items:  center;
    }

    .term > i{
        cursor:pointer;width:20px;
    }

    .term > span{
        font-size:12px;
    }

    /* delete */
    form > a:last-of-type{
        position:absolute;
        bottom: 10px;
        right: 15px;
        font-size:  10px;
        letter-spacing:  1px;
        font-style: italic;
    }
</style>
<div style="display:flex;width:100%;">
    <form action="agregar-confirmar.jsp" method="post">
        <div style="width:100%;">
            <p>Nombre</p>
            <input type="text" name="nombre" placeholder="Ingrese el nombre del producto" autofocus="">
        </div>
        <div style="width:100%;">
            <p>Codigo</p>
            <input type="text" name="codigo" placeholder="Ingrese el codigo del producto">
        </div>

        <div style="width:47%;">
            <p>PRECIO</p>
            <input type="text" name="precio" placeholder="Ingrese el precio del producto">
        </div>
        <div style="width:47%;margin-left:6%">
            <p>STOK</p>
            <input type="text" name="stock" placeholder="Ingrese el stock del producto">
        </div>
        <p>
            <input type="submit" value="REGISTRAR PRODUCTO" class="btn btn-primary">
        </p>
        
    </form>
</div>
<center>
    <a href="dashboard.jsp"><button class="btn btn-danger">Ir al dashboard</button></a>
</center>