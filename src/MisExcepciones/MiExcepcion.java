package MisExcepciones;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiExcepcion extends Exception{
    private int codigoerror;
    
    public MiExcepcion(int codigoerror) {
        this.codigoerror = codigoerror;
    }
    
    public void crearArchivo(String mensaje){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        FileWriter fw = null;
        try {
            fw = new FileWriter("Errores.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(sdf.format(date));
            pw.println(mensaje);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(fw != null){
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    @Override
    public String getMessage(){
        String mensaje = "";
        switch(codigoerror){
            case 0: 
                mensaje = "ERROR(0): ERROR DE CONEXION";
                crearArchivo(mensaje);
                break;
            case 1:
                mensaje = "ERROR(1): Campo Nombre vacío";
                crearArchivo(mensaje);
                break;
            case 2:
                mensaje = "ERROR(2): Campo Apellido Paterno vacío";
                crearArchivo(mensaje);
                break;
            case 3:
                mensaje = "ERROR(3): Campo Apellido Materno vacío";
                crearArchivo(mensaje);
                break;
            case 4:
                mensaje = "ERROR(4): Campo Contrseña vacío";
                crearArchivo(mensaje);
                break;
            case 5:
                mensaje = "ERROR(5): Campo Verificar Contraseña vacío";
                crearArchivo(mensaje);
                break;
            case 6:
                mensaje = "ERROR(6): Campo Nombre de usuario vacío";
                crearArchivo(mensaje);
                break;
            case 7:
                mensaje = "ERROR(7): Campo Fecha vacío";
                crearArchivo(mensaje);
                break;
            case 8:
                mensaje = "ERROR(8): Las contraseñas no son iguales";
                crearArchivo(mensaje);
                break;
            case 9:    
                mensaje = "ERROR(9): Nombre de usuario ya registrado, intente otro nombre";
                crearArchivo(mensaje);
                break;
            case 10:
                mensaje = "ERROR(10): Usuario o Contraseña incorrecta";
                crearArchivo(mensaje);
                break;
            case 11:
                mensaje = "ERROR (11): Campo Serie vacío";
                crearArchivo(mensaje);
                break;
            case 12:
                mensaje = "ERROR (12): Campo Modelo vacío";
                crearArchivo(mensaje);
                break;
            case 13:
                mensaje = "ERROR (13): Campo Marca vacío";
                crearArchivo(mensaje);
                break;
            case 14:
                mensaje = "ERROR (14): Campo Departamento vacío";
                crearArchivo(mensaje);
                break;
            case 15:
                mensaje = "ERROR (15): Campo Fecha Ingreso vacío";
                crearArchivo(mensaje);
                break;
            case 16:
                mensaje = "ERROR (16): Campo Fecha Baja vacío";
                crearArchivo(mensaje);
                break;
            case 17:
                mensaje = "ERROR (17): Numero de serie ya registrado";
                crearArchivo(mensaje);
                break;
            case 18:
                mensaje = "ERROR (18): Busque el tractor por numero de serie";
                crearArchivo(mensaje);
                break;
            case 19:
                mensaje = "ERROR (19): No hay tractor registrado con esa serie";
                crearArchivo(mensaje);
                break;
            case 20:
                mensaje = "ERROR (20): El numero de serie ya se encuentra registrado";
                crearArchivo(mensaje);
                break;
            case 21:
                mensaje = "ERROR (21): Ocurrio un error al modificar el registro";
                crearArchivo(mensaje);
                break;
            case 22:
                mensaje = "ERROR (22): Ocurrio un error al registrar la baja";
                crearArchivo(mensaje);
                break;
            case 23:
                mensaje = "ERROR (23): No se ha seleccionado categoria";
                crearArchivo(mensaje);
                break;
            case 24:
                mensaje = "ERROR (24): Campo Uso vacío";
                crearArchivo(mensaje);
                break;
            case 25:
                mensaje = "ERROR (25): Modelo ya registrado";
                crearArchivo(mensaje);
                break;
            case 26:
                mensaje = "ERROR (26): No hay equipo registrado con ese modelo";
                crearArchivo(mensaje);
                break;
            case 27:
                mensaje = "ERROR (27): Busque el equipo por modelo";
                crearArchivo(mensaje);
                break;
            case 28:
                mensaje = "ERROR (28): RFC ya registrado";
                crearArchivo(mensaje);
                break;
            case 29:
                mensaje = "ERROR (29): Campo RFC vacio";
                crearArchivo(mensaje);
                break;
            case 30:
                mensaje = "ERROR (30): Campo Domicilio vacio";
                crearArchivo(mensaje);
                break;
            case 31:
                mensaje = "ERROR (31): Campo Correo vacio";
                crearArchivo(mensaje);
                break;
            case 32:
                mensaje = "ERROR (32): Cliente ya registrado";
                crearArchivo(mensaje);
                break;
            case 33:
                mensaje = "ERROR (33): Formato de RFC incorrecto";
                crearArchivo(mensaje);
                break;
            case 34:
                mensaje = "ERROR (34): Error al registrar";
                crearArchivo(mensaje);
                break;
            case 35:
                mensaje = "ERROR (35): Busque el cliente por RFC";
                crearArchivo(mensaje);
                break;
            case 36:
                mensaje = "ERROR (36): Cliente no registrado";
                crearArchivo(mensaje);
                break;
            case 37:
                mensaje = "ERROR (37): Campo CURP vacío";
                crearArchivo(mensaje);
                break;
            case 38:
                mensaje = "ERROR (38): Campo Numero de Seguro Social vacio";
                crearArchivo(mensaje);
                break;
            case 39:
                mensaje = "ERROR (39): Campo Salario Diario vacio";
                crearArchivo(mensaje);
                break;
            case 40:
                mensaje = "ERROR (40): Campo Salario Diario Integrado vacio";
                crearArchivo(mensaje);
                break;
            case 41:
                mensaje = "ERROR (41): Empleado ya registrado";
                crearArchivo(mensaje);
                break;
            case 42:
                mensaje = "ERROR (42): Busque el empleado por RFC";
                crearArchivo(mensaje);
                break;
            case 43:
                mensaje = "ERROR (43): Empleado no registrado";
                crearArchivo(mensaje);
                break;
            case 44:
                mensaje = "ERROR (44): Formato de CURP incorrecto";
                crearArchivo(mensaje);
                break;
            case 45:
                mensaje = "ERROR (45): Formato de Numero social incorrecto";
                crearArchivo(mensaje);
                break;
            case 46:
                mensaje = "ERROR (46): Seleccione tipo de usuario";
                crearArchivo(mensaje);
                break;
            case 47:
                mensaje = "ERROR (47): Campo Descripcion vacio";
                crearArchivo(mensaje);
                break;
            case 48:
                mensaje = "ERROR (48): Campo Cantidad vacio";
                crearArchivo(mensaje);
                break;
            case 49:
                mensaje = "ERROR (49): Campo Importe vacio";
                crearArchivo(mensaje);
                break;
            case 50:
                mensaje = "ERROR (50): Campo Iva vacio";
                crearArchivo(mensaje);
                break;
            case 51:
                mensaje = "ERROR (51): Campo Total vacio";
                crearArchivo(mensaje);
                break;
            case 52:
                mensaje = "ERROR (52): Ocurrio un error al generar factura";
                crearArchivo(mensaje);
                break;
            case 53:
                mensaje = "ERROR (53): Ocurrio un error al modificar factura";
                crearArchivo(mensaje);
                break;
            case 54:
                mensaje = "ERROR (54): Campo buscar vacio";
                crearArchivo(mensaje);
                break;
            case 55:
                mensaje = "ERROR (55): Folio no registrado";
                crearArchivo(mensaje);
                break;
            case 56:
                mensaje = "ERROR (56): Factura cancelada";
                crearArchivo(mensaje);
                break;
            case 57:
                mensaje = "ERROR (57): Campo Fecha Inicial Vacio";
                crearArchivo(mensaje);
                break;
            case 58:
                mensaje = "ERROR (58): Campo Fecha Final Vacio";
                crearArchivo(mensaje);
                break;
            case 59:
                mensaje = "ERROR (59): Seleccione tipo de gasto";
                crearArchivo(mensaje);
                break;
            case 60:
                mensaje = "ERROR (60): Campo Excento vacío";
                crearArchivo(mensaje);
                break;
            case 61:
                mensaje = "ERROR (61): Campo Gravado vacío";
                crearArchivo(mensaje);
                break;
            case 62:
                mensaje = "ERROR (62): Factura ya generada";
                crearArchivo(mensaje);
                break;
            case 63:
                mensaje = "ERROR (63): Campo Cuenta vacío";
                crearArchivo(mensaje);
                break;
            case 64:
                mensaje = "ERROR (64): Campo Numero de Cuenta vacío";
                crearArchivo(mensaje);
                break;
            case 65:
                mensaje = "ERROR (65): Formato de cuenta incorrecto";
                crearArchivo(mensaje);
                break;
            case 66:
                mensaje = "ERROR (66): Campo Fecha vacío";
                crearArchivo(mensaje);
                break;
            case 67:
                mensaje = "ERROR (67): Campo Numero de Poliza vacio";
                crearArchivo(mensaje);
                break;
            case 68:
                mensaje = "ERROR (68): Seleccione cuenta";
                crearArchivo(mensaje);
                break;
            case 69:
                mensaje = "ERROR (69): Debe haber almenos un cargo al debe o un abono al haber";
                crearArchivo(mensaje);
                break;
            case 70:
                mensaje = "ERROR (70): Error al eliminar registro";
                crearArchivo(mensaje);
                break;
        }
        
    return mensaje;
    }
}
