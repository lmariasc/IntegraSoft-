
package serviceImpl;

import conexion.conexion;
import static conexion.conexion.close;
import dominio.CasoPrueba;
import dominio.DatosEntrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author IntegraSoft
 */
public class CasoPruebaServiceImpl {
    private static final String SQL_SELECT = "SELECT * FROM caso_prueba";
    private static final String SQL_UPDATE = "UPDATE caso_prueba SET caso_uso=?, modulo_sistema =?, fecha_ejecucion=?, descripcion_caso_prueba=?, precondiciones=?, pasos_prueba=?, post_condiciones=?, defectos_desviaciones=?, veredicto=?, observaciones=?, probador=?, nombre=?, firma=?, fecha=?  WHERE id_caso_prueba=?";
    private static final String SQL_DELETE = "DELETE FROM caso_prueba WHERE id_caso_prueba = ?";
    private static String SQL_CONSULTA = "SELECT * FROM caso_prueba WHERE id_caso_prueba = ? AND version_ejecucion =?";
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
 
        public CasoPrueba encontrarCasoPrueba (Long idCasoPrueba, String versionEjecucion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CasoPrueba casoPrueba = null;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setLong(1, idCasoPrueba);
            stmt.setString(2, versionEjecucion);
            
            rs = stmt.executeQuery();
            while (rs.next()) {
                String casoUso = rs.getString("caso_uso");
                String moduloSistema = rs.getString("modulo_sistema");
                String fechaEjecucion = rs.getString("fecha_ejecucion");
                String respuestaAplicacion = rs.getString("descripcion_caso_prueba");
                String preCondiciones = rs.getString("preCondiciones");
                String pasosPrueba = rs.getString("pasos_Prueba");
                String postCondiciones = rs.getString("post_condiciones");
                String defectosDesviaciones = rs.getString("defectos_desviaciones");
                String veredicto = rs.getString("veredicto");
                String observaciones = rs.getString("observaciones");
                String probador = rs.getString("probador");
                String nombre = rs.getString("nombre");
                String firma = rs.getString("firma");
                String fecha = rs.getString("fecha");
                casoPrueba = new CasoPrueba(idCasoPrueba, casoUso, moduloSistema, versionEjecucion, fechaEjecucion, respuestaAplicacion, preCondiciones, pasosPrueba,postCondiciones,defectosDesviaciones,veredicto,observaciones,probador,nombre,firma,fecha);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return casoPrueba;
    }
        
        public void actualizarCasoPrueba(CasoPrueba casoPrueba) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, casoPrueba.getCasoUso());
            stmt.setString(2, casoPrueba.getModuloSistema());
            stmt.setString(3, casoPrueba.getFechaEjecucion());
            stmt.setString(4, casoPrueba.getDescripcionCasoPrueba());
            stmt.setString(5, casoPrueba.getPreCondiciones());
            stmt.setString(6, casoPrueba.getPasosPrueba());
            stmt.setString(7, casoPrueba.getPostCondiciones());
            stmt.setString(8, casoPrueba.getDefectosDesviaciones());
            stmt.setString(9, casoPrueba.getVeredicto());
            stmt.setString(10, casoPrueba.getObservaciones());
            stmt.setString(11, casoPrueba.getProbador());
            stmt.setString(12, casoPrueba.getNombre());
            stmt.setString(13, casoPrueba.getFirma());
            stmt.setString(14, casoPrueba.getFecha());
            stmt.setLong(15, casoPrueba.getIdCasoPrueba());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    public void eliminar(CasoPrueba casoPrueba) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setLong(1, casoPrueba.getIdCasoPrueba());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}  
