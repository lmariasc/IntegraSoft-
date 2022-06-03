
package services;


import dominio.CasoPrueba;
import java.util.List;

/**
 *
 * @author IntegraSoft
 */
public interface CasoPruebaService {
    
    public void guardar(CasoPrueba casoPrueba);
    
    public void eliminar(CasoPrueba casoPrueba);
    
    public List<CasoPrueba> listarCasoPrueba();
    
    public CasoPrueba encontrarCasoPrueba (Long idCasoPrueba, String versionEjecucion);
    
    public void actualizar (CasoPrueba casoPrueba);
    
    public CasoPrueba encontrarregistroPrueba (String correo);
}

