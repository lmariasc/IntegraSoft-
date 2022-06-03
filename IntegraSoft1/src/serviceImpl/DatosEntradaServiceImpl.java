
package serviceImpl;

import conexion.conexion;
import static conexion.conexion.close;
import dominio.DatosEntrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Integrasoft
 */
public class DatosEntradaServiceImpl {
    private static final String SQL_SELECT = "SELECT * FROM datosEntrada";
    private static final String SQL_UPDATE = "UPDATE datosEntrada SET campo=?, valor=?, tipo_escenario=?, respuesta_aplicacion=?, coincide=?, respuesta_sistema=?"
            + " WHERE id_dato_entrada=?";
    private static final String SQL_DELETE = "DELETE FROM datosEntrada WHERE id_dato_entrada = ?";
    private static String SQL_CONSULTA = "SELECT * FROM datosEntrada WHERE id_dato_entrada = ?";
    private static final String SQL_INSERT = "INSERT INTO datosEntrada (id_caso_prueba, campo, valor, tipo_escenario, respuesta_aplicacion, coincide, respuesta_sistema)"
            + " VALUES (?,?,?,?,?,?,?)";
    
    public void guardar(DatosEntrada datosEntrada) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setLong  (1, datosEntrada.getIdDatosPrueba());
            stmt.setString(2, datosEntrada.getCampo());
            stmt.setString(3, datosEntrada.getValor());
            stmt.setString(4, datosEntrada.getTipoEscenario());
            stmt.setString(5, datosEntrada.getRespuestaAplicacion());
            stmt.setString(6, datosEntrada.getCoincide());
            stmt.setString(7, datosEntrada.getRespuestaSistema());           
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
    
    public void actualizar(DatosEntrada datosEntrada) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, datosEntrada.getCampo());
            stmt.setString(2, datosEntrada.getValor());
            stmt.setString(3, datosEntrada.getTipoEscenario());
            stmt.setString(4, datosEntrada.getRespuestaAplicacion());
            stmt.setString(5, datosEntrada.getCoincide());
            stmt.setString(6, datosEntrada.getRespuestaSistema());
            stmt.setLong(7, datosEntrada.getIdDatosEntrada());
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
    
    public DatosEntrada encontrarDatosEntrada (Long idDatosEntrada) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        DatosEntrada datosEntrada = null;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setLong(1, idDatosEntrada);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Long idDatoPrueba = rs.getLong("id_caso_prueba");
                String campo = rs.getString("campo");
                String valor = rs.getString("valor");
                String tipoEscenario = rs.getString("tipo_escenario");
                String respuestaAplicacion = rs.getString("respuesta_aplicacion");
                String coincide = rs.getString("coincide");
                String respuestaSistema = rs.getString("respuesta_sistema");
                datosEntrada = new DatosEntrada(idDatosEntrada, idDatoPrueba, campo, valor, tipoEscenario, respuestaAplicacion, coincide, respuestaSistema);
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
        return datosEntrada;
    }
   
    public List<DatosEntrada> listarDatosEntrada(Long idDatosPrueba) {
            Connection conn;
            PreparedStatement stmt;
            ResultSet rs;
            List<DatosEntrada> listaUsuario = new ArrayList<>();
            SQL_CONSULTA = "SELECT * FROM datosEntrada where id_caso_prueba = ?";
        try {
             conn= new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setLong(1,idDatosPrueba);
            rs = stmt.executeQuery();
            
            while(rs.next()){   
            DatosEntrada datosEntrada = new DatosEntrada();
                datosEntrada.setIdDatosEntrada(rs.getLong("id_dato_entrada"));
                datosEntrada.setIdDatosPrueba(rs.getLong("id_caso_prueba"));
                datosEntrada.setCampo(rs.getString("campo"));
                datosEntrada.setValor(rs.getString("valor"));
                datosEntrada.setTipoEscenario(rs.getString("tipo_escenario"));
                datosEntrada.setRespuestaAplicacion(rs.getString("respuesta_aplicacion"));
                datosEntrada.setCoincide(rs.getString("coincide"));
                datosEntrada.setRespuestaSistema(rs.getString("respuesta_sistema"));

                listaUsuario.add(datosEntrada);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosEntradaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuario;
    }

    public void eliminar(Long datosEntrada) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int FilaSelec = 0;
        try {
            conn = new conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setLong  (1, datosEntrada);
            FilaSelec = stmt.executeUpdate();
            System.out.println("Registro eliminado");
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
