
public class alumnoPag_101 {
string nombre;
string apellido;
int a�oDeNacimiento;
	
alumnoPag_101(String nombre,String apellido, int A�oDeNacimiento)
throws A�oFueraDeRangoException, Excepcion{
	if(nombre== null|| apellido==null)
		throws new exception("Argumentos no validos");
	if(a�oDeNacimiento<1900 || a�oDeNacimiento>2013)
		throws new A�oFueraDeRangoException("Demasiado joven o demasiado viejo");
	
	this.nombre=nombre;
	this.apellido=apellido;
	this.a�oDeNacimiento=a�oDeBNacimiento;


	}

public void setA�oDeNacimiento(int a�oDeNAcimiento)throes a�oFueraDeRangoException{
	if(a�oDeNAcimiento<1900 || A�oDeNacimiento>2013)
		throe new a�oFueraDeRangoException("demasiado joven o demasiado viejo");
	this.a�oDeNacimiento=a�oDeNacimiento;
}


}
