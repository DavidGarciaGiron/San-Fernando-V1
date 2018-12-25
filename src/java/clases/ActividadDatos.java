package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ActividadDatos {
    
    Connection con;
    PreparedStatement listarActividades, agregarActividades,
            buscarActividadesId, buscarActividadesCampo,
            buscarActividadesSubCampo, buscarActividadesEquipo,
            buscarActividadesCodigo, buscarActividadesTecnicoEncargado,
            buscarActividadesCriticidad, buscarActividadesFechaIni;
    
    public Connection conexion () throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String cadena = "jdbc:mysql://localhost:3306/plan_mantenimiento_2019";
        String usuario = "root";
        String clave = "";
        
        Class.forName(driver);
        con = DriverManager.getConnection(cadena, usuario, clave);
        
        return con;
    }
    
    public List recuperarActividades () throws Exception {
        List l = new ArrayList();
        listarActividades = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades");
        ResultSet res = listarActividades.executeQuery();
        while(res.next()){
            Actividad acti = new Actividad();
            
            acti.setId(res.getInt("id"));
            acti.setCampo_clasificacion(res.getString("campo_clasificacion"));
            acti.setCampo_subclasificacion(res.getString("campo_subclasificacion"));
            acti.setEquipo(res.getString("equipo"));
            acti.setCodigo(res.getString("codigo"));
            acti.setTecnico_encargado(res.getString("tecnico_encargado"));
            acti.setActividad(res.getString("actividad"));
            acti.setFrecuencia(res.getString("frecuencia"));
            acti.setTiempo(res.getString("tiempo"));
            acti.setCriticidad(res.getInt("criticidad"));
            acti.setFecha_ini(res.getString("fecha_ini"));
            acti.setFecha_fin(res.getString("fecha_fin"));
            
            l.add(acti);
        }
        return l;
    }
    
    public void agregarActividades (Actividad acti) throws Exception {
        agregarActividades = conexion().prepareStatement("insert into actividades (id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin) values (?, ?, ?, ?, ?, ?, ? ,? ,?, ?, ?, ?)");
        agregarActividades.setInt(1, acti.getId());
        agregarActividades.setString(2, acti.getCampo_clasificacion());
        agregarActividades.setString(3, acti.getCampo_subclasificacion());
        agregarActividades.setString(4, acti.getEquipo());
        agregarActividades.setString(5, acti.getCodigo());
        agregarActividades.setString(6, acti.getTecnico_encargado());
        agregarActividades.setString(7, acti.getActividad());
        agregarActividades.setString(8, acti.getFrecuencia());
        agregarActividades.setString(9, acti.getTiempo());
        agregarActividades.setInt(10, acti.getCriticidad());
        agregarActividades.setString(11, acti.getFecha_ini());
        agregarActividades.setString(12, acti.getFecha_fin());
        
        agregarActividades.executeUpdate();
    }
    
    public List buscarActividadesId (int id) throws Exception {
        List l = new ArrayList();
        buscarActividadesId = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+id+"'");
        ResultSet res = buscarActividadesId.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }
    
    public List buscarActividadesCampo (String campo_clasificacion) throws Exception {
        List l = new ArrayList();
        buscarActividadesCampo = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+campo_clasificacion+"'");
        ResultSet res = buscarActividadesCampo.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }
    
        public List buscarActividadesSubCampo (String campo_subclasificacion) throws Exception {
        List l = new ArrayList();
        buscarActividadesSubCampo = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+campo_subclasificacion+"'");
        ResultSet res = buscarActividadesSubCampo.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }
        
        public List buscarActividadesEquipo (String equipo) throws Exception {
        List l = new ArrayList();
        buscarActividadesEquipo = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+equipo+"'");
        ResultSet res = buscarActividadesEquipo.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }
        
        public List buscarActividadesCodigo (String codigo) throws Exception {
        List l = new ArrayList();
        buscarActividadesCodigo = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+codigo+"'");
        ResultSet res = buscarActividadesCodigo.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }
    
        public List buscarActividadesTecnicoEncargado (String tecnico_encargado) throws Exception {
        List l = new ArrayList();
        buscarActividadesTecnicoEncargado = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+tecnico_encargado+"'");
        ResultSet res = buscarActividadesTecnicoEncargado.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }        
       
        public List buscarActividadesCriticidad (int criticidad) throws Exception {
        List l = new ArrayList();
        buscarActividadesCriticidad = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+criticidad+"'");
        ResultSet res = buscarActividadesCriticidad.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }                
        
        public List buscarActividadesFechaIni (int fecha_ini) throws Exception {
        List l = new ArrayList();
        buscarActividadesFechaIni = conexion().prepareStatement("select id, campo_clasificacion, campo_subclasificacion, equipo, codigo, tecnico_encargado, actividad, frecuencia, tiempo, criticidad, fecha_ini, fecha_fin from actividades where id = '"+fecha_ini+"'");
        ResultSet res = buscarActividadesFechaIni.executeQuery();
        
        while(res.next()){
            Actividad acti = new Actividad();

            acti.setId(res.getInt(1));
            acti.setCampo_clasificacion(res.getString(2));
            acti.setCampo_subclasificacion(res.getString(3));
            acti.setEquipo(res.getString(4));
            acti.setCodigo(res.getString(5));
            acti.setTecnico_encargado(res.getString(6));
            acti.setActividad(res.getString(7));
            acti.setFrecuencia(res.getString(8));
            acti.setTiempo(res.getString(9));
            acti.setCriticidad(res.getInt(10));
            acti.setFecha_ini(res.getString(11));
            acti.setFecha_fin(res.getString(12));       
            
            l.add(acti);          
        }             
        return l;      
    }              
        
}
