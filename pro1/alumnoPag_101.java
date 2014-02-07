
public class alumnoPag_101 {
string nombre;
string apellido;
int añoDeNacimiento;
	
alumnoPag_101(String nombre,String apellido, int AñoDeNacimiento)
throws AñoFueraDeRangoException, Excepcion{
	if(nombre== null|| apellido==null)
		throws new exception("Argumentos no validos");
	if(añoDeNacimiento<1900 || añoDeNacimiento>2013)
		throws new AñoFueraDeRangoException("Demasiado joven o demasiado viejo");
	
	this.nombre=nombre;
	this.apellido=apellido;
	this.añoDeNacimiento=añoDeBNacimiento;


	}

public void setAñoDeNacimiento(int añoDeNAcimiento)throes añoFueraDeRangoException{
	if(añoDeNAcimiento<1900 || AñoDeNacimiento>2013)
		throe new añoFueraDeRangoException("demasiado joven o demasiado viejo");
	this.añoDeNacimiento=añoDeNacimiento;
}


}
