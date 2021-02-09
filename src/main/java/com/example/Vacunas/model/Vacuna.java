package com.example.Vacunas.model;

import javax.persistence.*;
//Por ejemplo, si queremos que una clase sea persistente en base de datos, 
//le pondremos la anotación @Entity. A su atributo que haga de clave primaria 
//le pondremos @Id y @GeneratedValue(que no es este caso). 
//Todos los atributos de la clase anotada con @Entity se guardarán a su vez
//en base de datos, por lo que no es necesario anotarlos uno a uno
@Entity
@Table(name = "vacunas") //nombre de la tabla en la BD
public class Vacuna {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String nombre;
    private int dosis_pfizer;
    private int dosis_moderna;
    private int personas;
    public Vacuna() {
    }

    public Vacuna(int id, String nombre, int dosis_pfizer,int dosis_moderna,int personas) {
        this.id = id;
        this.nombre = nombre;
        this.dosis_pfizer = dosis_pfizer;
        this.dosis_moderna = dosis_moderna;
        this.personas = personas;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDosis_pfizer() {
		return dosis_pfizer;
	}

	public void setDosis_pfizer(int dosis_pfizer) {
		this.dosis_pfizer = dosis_pfizer;
	}

	public int getDosis_moderna() {
		return dosis_moderna;
	}

	public void setDosis_moderna(int dosis_moderna) {
		this.dosis_moderna = dosis_moderna;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}
   



}
