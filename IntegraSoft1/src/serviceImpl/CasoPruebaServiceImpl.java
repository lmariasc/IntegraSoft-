
package serviceImpl;

import conexion.conexion;
import static conexion.conexion.close;
import dominio.CasoPrueba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author IntegraSoft
 */
public class CasoPruebaServiceImpl {
    private static final String SQL_SELECT = "SELECT * FROM caso_prueba";
    private static final String SQL_UPDATE = "UPDATE caso_prueba SET caso_uso=?, modulo_sistema =?, version_ejecucion=?, fecha_ejecucion=?, descripcion_caso_prueba=?, precondiciones=?, pasos_prueba=?, post_condiciones=?, defectos_desviaciones=?, veredicto=?, observaciones=?, probador=?, nombre=?, firma=?, fecha=?";
    private static final String SQL_DELETE = "DELETE FROM caso_prueba WHERE id_caso_prueba = ?";
    private static String SQL_CONSULTA = "SELECT * FROM caso_prueba WHERE id_caso_prueba = ? ";
    private static final String SQL_INSERT = "INSERT INTO caso_prueba (id_caso_prueba, caso_uso, modulo_sistema, version_ejecucion, fecha_ejecucion, descripcion_caso_prueba, precondiciones, pasos_prueba, post_condiciones, defectos_desviaciones, veredicto, observaciones, probador, nombre, firma, fecha)"
            + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    public void guardar(CasoPrueba casoPrueba) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setLong  (1, casoPrueba.getIdCasoPrueba());
            stmt.setString(2, casoPrueba.getCasoUso());
            stmt.setString(3, casoPrueba.getModuloSistema());
            stmt.setString(4, casoPrueba.getVersionEjecucion());
            stmt.setString(5, casoPrueba.getFechaEjecucion());
            stmt.setString(6, casoPrueba.getDescripcionCasoPrueba());
            stmt.setString(7, casoPrueba.getPreCondiciones());
            stmt.setString(8, casoPrueba.getPasosPrueba());
            stmt.setString(9, casoPrueba.getPostCondiciones());
            stmt.setString(10, casoPrueba.getDefectosDesviaciones());
            stmt.setString(11, casoPrueba.getVeredicto());
            stmt.setString(12, casoPrueba.getObservaciones());
            stmt.setString(13, casoPrueba.getProbador());
            stmt.setString(14, casoPrueba.getNombre());
            stmt.setString(15, casoPrueba.getFirma());
            stmt.setString(16, casoPrueba.getFecha());
            
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
 
}  
