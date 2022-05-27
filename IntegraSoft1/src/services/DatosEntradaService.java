
package services;

import dominio.DatosEntrada;
import java.util.List;

/**
 *
 * @author Integrasoft
 */
public interface DatosEntradaService {
    
    public void guardar(DatosEntrada datosEntrada);
    
    public void eliminar(DatosEntrada datosEntrada);
    
    public List<DatosEntrada> listarDatosEntrada();
    
    public DatosEntrada encontrarDatosEntrada (Long idDatosEntrada, Long idCasoPrueba);
    
    public void actualizar (DatosEntrada datosEntrada);
    
    public DatosEntrada encontrarregistroPrueba (String correo); 
}
