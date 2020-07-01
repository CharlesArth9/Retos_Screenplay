package exceptions;

public class ErrorAlDiligenciarDatos extends AssertionError{
    public ErrorAlDiligenciarDatos(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
