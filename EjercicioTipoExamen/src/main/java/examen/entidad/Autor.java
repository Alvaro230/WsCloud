package examen.entidad;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("autor")
@Scope("prototype")
public class Autor extends Date{
	private int id;
	private String nombre;
	private int edad;
	
	
	public void sacarAño(Autor a){
		System.out.println("El año es: ");
		a.setEdad((a.getYear() + 1900));
		
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
