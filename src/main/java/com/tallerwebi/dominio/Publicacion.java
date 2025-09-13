package com.tallerwebi.dominio;


import javax.persistence.*;

@Entity
public class Publicacion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;



    @Column(length = 100, nullable = false)
    private String descripcion;


    @ManyToOne
    @JoinColumn(name = "usuario_id") // nombre de la columna FK
    private Usuario usuario;


    // getters y setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }


}
