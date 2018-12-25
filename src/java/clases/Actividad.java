package clases;

public class Actividad {
    
    private int id;
    private String campo_clasificacion;
    private String campo_subclasificacion;
    private String equipo;
    private String codigo;
    private String tecnico_encargado;
    private String actividad;
    private String frecuencia;
    private String tiempo;
    private int criticidad;
    private String fecha_ini;
    private String fecha_fin;

    public int getId() 
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }

    public String getCampo_clasificacion() 
    {
        return campo_clasificacion;
    }

    public void setCampo_clasificacion(String campo_clasificacion)
    {
        this.campo_clasificacion = campo_clasificacion;
    }

    public String getCampo_subclasificacion()
    {
        return campo_subclasificacion;
    }

    public void setCampo_subclasificacion(String campo_subclasificacion) 
    {
        this.campo_subclasificacion = campo_subclasificacion;
    }

    public String getEquipo()
    {
        return equipo;
    }

    public void setEquipo(String equipo)
    {
        this.equipo = equipo;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getTecnico_encargado() 
    {
        return tecnico_encargado;
    }

    public void setTecnico_encargado(String tecnico_encargado)
    {
        this.tecnico_encargado = tecnico_encargado;
    }

    public String getActividad()
    {
        return actividad;
    }

    public void setActividad(String actividad)
    {
        this.actividad = actividad;
    }

    public String getFrecuencia() 
    {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) 
    {
        this.frecuencia = frecuencia;
    }

    public String getTiempo() 
    {
        return tiempo;
    }

    public void setTiempo(String tiempo) 
    {
        this.tiempo = tiempo;
    }

    public int getCriticidad()
    {
        return criticidad;
    }

    public void setCriticidad(int criticidad) 
    {
        this.criticidad = criticidad;
    }

    public String getFecha_ini()
    {
        return fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) 
    {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_fin()
    {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin)
    {
        this.fecha_fin = fecha_fin;
    }
   
}
