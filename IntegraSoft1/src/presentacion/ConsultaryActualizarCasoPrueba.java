
package presentacion;

import dominio.CasoPrueba;
import dominio.DatosEntrada;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import serviceImpl.CasoPruebaServiceImpl;
import serviceImpl.DatosEntradaServiceImpl;


/**
 *
 * @author Asus
 */
public class ConsultaryActualizarCasoPrueba extends javax.swing.JFrame {


        DefaultTableModel modelo;
        DatosEntrada datosEncontrados;
        CasoPrueba casoPruebaEncontrado;
        Long idDatosEntrada;
        Long idCasoPrueba;
       
  
    public ConsultaryActualizarCasoPrueba() {
        initComponents();
        camposBloqueados();
        EditarPrueba.setEnabled(false);
        GuardarCambios.setEnabled(false);
        limpiar.setEnabled(false);
        salir.setEnabled(false);
        Agregar.setEnabled(false);
        Editar.setEnabled(false);
        GuardarDatosE.setEnabled(false);
        Eliminar.setEnabled(false);
        EliminarPrueba.setEnabled(false);
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Datos Prueba");
        modelo.addColumn("Id Campo");
        modelo.addColumn("Campo");//Con este comando se le coloca el nombre a las columnas
        modelo.addColumn("Valor");
        modelo.addColumn("Tipo Escenario");
        modelo.addColumn("Respuesta de la Aplicacion");
        modelo.addColumn("Coincide");
        modelo.addColumn("Respuesta del Sistema");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        moduloSistema = new javax.swing.JTextField();
        versionEjecucion = new javax.swing.JTextField();
        fechaEjecucion = new javax.swing.JTextField();
        casoUso = new javax.swing.JTextField();
        GuardarCambios = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Campo = new javax.swing.JTextField();
        tipoEscenario = new javax.swing.JComboBox<>();
        Valor = new javax.swing.JTextField();
        coincide = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlbCasoPruebaN = new javax.swing.JLabel();
        veredicto = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        firma = new javax.swing.JTextField();
        probador = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        GuardarDatosE = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        CasoPruebaN = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        precondiciones = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        pasosPrueba = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        respuestaAplicacion = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        respuestaSistema = new javax.swing.JTextArea();
        Editar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        postCondiciones = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        defectosDesviaciones = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        Eliminar = new javax.swing.JButton();
        ConsultarPrueba = new javax.swing.JButton();
        EditarPrueba = new javax.swing.JButton();
        EliminarPrueba = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel2.setBackground(new java.awt.Color(30, 41, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1048, 606));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INFORMACIÓN GLOBAL DEL CASO DE PRUEBA");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono IntegraSoft.png"))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono carsystems (3) (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addComponent(jSeparator2)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 41, 57));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 640));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAR Y ACTUALIZAR CASO DE PRUEBA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono IntegraSoft.png"))); // NOI18N

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164)));

        jPanel3.setBackground(new java.awt.Color(30, 41, 57));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164)));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Caso de Prueba No°");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Caso de Uso ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripción del caso de Prueba");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de Ejecución");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Versión de Ejecución ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Modulo del Sistema ");

        moduloSistema.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        versionEjecucion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        fechaEjecucion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        casoUso.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        GuardarCambios.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        GuardarCambios.setText("Actualizar");
        GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        salir.setText("Salir");
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Información Global del Caso de Prueba");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator3.setForeground(new java.awt.Color(37, 196, 164));

        jSeparator4.setForeground(new java.awt.Color(37, 196, 164));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Caso de Prueba");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator7.setForeground(new java.awt.Color(37, 196, 164));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pasos de la Prueba ");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precondiciones");

        jSeparator8.setForeground(new java.awt.Color(37, 196, 164));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Datos de Entrada");

        jSeparator9.setForeground(new java.awt.Color(37, 196, 164));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Campo");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Post Condiciones");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Valor");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tipo de Escenario");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Respuesta esperada de la aplicación ");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Respuesta del sistema  ");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Coincide");

        Campo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        tipoEscenario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tipoEscenario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Correcto", "Incorrecto" }));

        Valor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        coincide.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        coincide.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Si", "No" }));

        jSeparator10.setForeground(new java.awt.Color(37, 196, 164));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Resultados de la Prueba");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Veredicto");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Defectos y Desviaciones");

        jlbCasoPruebaN.setBackground(new java.awt.Color(51, 0, 255));
        jlbCasoPruebaN.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlbCasoPruebaN.setForeground(new java.awt.Color(255, 255, 255));
        jlbCasoPruebaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jlbCasoPruebaNKeyReleased(evt);
            }
        });

        veredicto.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        veredicto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Paso", "Fallo" }));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Observaciones");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Probador");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Firma");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Nombre");

        firma.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        probador.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        nombre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        fecha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        Tabla.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Caso Prueba", "Id Campo", "Campo", "Valor", "Tipo Escenario", "Respuesta de la Aplicación", "Coincide", "Respuesta del Sistema "
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        GuardarDatosE.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        GuardarDatosE.setText("Guardar");
        GuardarDatosE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosEActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        CasoPruebaN.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        CasoPruebaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CasoPruebaNKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CasoPruebaNKeyTyped(evt);
            }
        });

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        descripcion.setRows(5);
        jScrollPane3.setViewportView(descripcion);

        precondiciones.setColumns(20);
        precondiciones.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        precondiciones.setRows(5);
        jScrollPane4.setViewportView(precondiciones);

        pasosPrueba.setColumns(20);
        pasosPrueba.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        pasosPrueba.setRows(5);
        jScrollPane5.setViewportView(pasosPrueba);

        respuestaAplicacion.setColumns(20);
        respuestaAplicacion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        respuestaAplicacion.setRows(5);
        jScrollPane6.setViewportView(respuestaAplicacion);

        respuestaSistema.setColumns(20);
        respuestaSistema.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        respuestaSistema.setRows(5);
        jScrollPane7.setViewportView(respuestaSistema);

        Editar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        postCondiciones.setColumns(20);
        postCondiciones.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        postCondiciones.setRows(5);
        jScrollPane8.setViewportView(postCondiciones);

        defectosDesviaciones.setColumns(20);
        defectosDesviaciones.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        defectosDesviaciones.setRows(5);
        jScrollPane9.setViewportView(defectosDesviaciones);

        observaciones.setColumns(20);
        observaciones.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        observaciones.setRows(5);
        jScrollPane10.setViewportView(observaciones);

        jSeparator12.setForeground(new java.awt.Color(37, 196, 164));

        jSeparator13.setForeground(new java.awt.Color(37, 196, 164));

        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        ConsultarPrueba.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ConsultarPrueba.setText("Consultar");
        ConsultarPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPruebaActionPerformed(evt);
            }
        });

        EditarPrueba.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EditarPrueba.setText("Editar");
        EditarPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPruebaActionPerformed(evt);
            }
        });

        EliminarPrueba.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EliminarPrueba.setText("Eliminar");
        EliminarPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPruebaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jSeparator10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbCasoPruebaN, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(459, 459, 459)
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(veredicto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(245, 245, 245)
                                    .addComponent(limpiar)
                                    .addGap(72, 72, 72)
                                    .addComponent(GuardarCambios)
                                    .addGap(85, 85, 85)
                                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(412, 412, 412)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel30)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel28)
                                                    .addComponent(jLabel31))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(probador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                                .addComponent(jScrollPane5)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(GuardarDatosE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                                .addComponent(jLabel21)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(coincide, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Campo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tipoEscenario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CasoPruebaN, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(casoUso)
                                    .addComponent(moduloSistema))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(versionEjecucion, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                            .addComponent(fechaEjecucion)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(ConsultarPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EditarPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EliminarPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)))))
                .addGap(0, 10, Short.MAX_VALUE))
            .addComponent(jSeparator4)
            .addComponent(jSeparator7)
            .addComponent(jSeparator3)
            .addComponent(jSeparator8)
            .addComponent(jSeparator9)
            .addComponent(jSeparator12)
            .addComponent(jSeparator13)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CasoPruebaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(casoUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(versionEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(moduloSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(fechaEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jlbCasoPruebaN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(tipoEscenario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(coincide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GuardarDatosE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(veredicto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(probador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(firma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        
        ventanaPrincipal.setVisible(true);
        
        this.dispose ();
    }//GEN-LAST:event_salirActionPerformed

    private void GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosActionPerformed
        //guardarcasoPrueba();
        validarCampos();
        actualizarCasoPrueba(idCasoPrueba);
    }//GEN-LAST:event_GuardarCambiosActionPerformed

    private void GuardarDatosEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosEActionPerformed
        
        if(GuardarDatosE.getText().equals("Guardar")){
            guardarDatosEntrada();
        }else if(GuardarDatosE.getText().equals("Actualizar")){
            if(actualizarDatosEntrada(idDatosEntrada)){
                GuardarDatosE.setText("Guardar");
            }
        }
        cargarDatosEntrada();
    }//GEN-LAST:event_GuardarDatosEActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        
        this.Campo.setText("");
        this.Valor.setText("");
        tipoEscenario.setSelectedItem("Seleccionar");
        this.respuestaAplicacion.setText("");
        coincide.setSelectedItem("Seleccionar");
        this.respuestaSistema.setText("");
    
    }//GEN-LAST:event_AgregarActionPerformed

    private void CasoPruebaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CasoPruebaNKeyTyped
        
        char b = evt.getKeyChar();
        if (CasoPruebaN.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_CasoPruebaNKeyTyped

    private void CasoPruebaNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CasoPruebaNKeyReleased
       String valor=CasoPruebaN.getText();
       jlbCasoPruebaN.setText(valor);
    }//GEN-LAST:event_CasoPruebaNKeyReleased

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        this.CasoPruebaN.setText("");
        this.casoUso.setText("");
        this.moduloSistema.setText("");
        this.versionEjecucion.setText("");
        this.fechaEjecucion.setText("");
        this.descripcion.setText("");
        this.precondiciones.setText("");
        this.pasosPrueba.setText("");
        this.postCondiciones.setText("");
        this.defectosDesviaciones.setText("");
        veredicto.setSelectedItem("Seleccionar");
        this.observaciones.setText("");
        this.probador.setText("");
        this.nombre.setText("");
        this.firma.setText("");
        this.fecha.setText("");
        
        this.jlbCasoPruebaN.setText("");
        this.Campo.setText("");
        this.Valor.setText("");
        tipoEscenario.setSelectedItem("Seleccionar");
        this.respuestaAplicacion.setText("");
        coincide.setSelectedItem("Seleccionar");
        this.respuestaSistema.setText("");
        modelo.getDataVector().removeAllElements();
        Tabla.updateUI();
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        
        int FilaSelec = Tabla.getSelectedRow();
        
        if (FilaSelec >= 0)
        {
        
        Campo.setText(Tabla.getValueAt(FilaSelec,0).toString());
        Valor.setText(Tabla.getValueAt(FilaSelec,1).toString());
        tipoEscenario.setSelectedItem(Tabla.getValueAt(FilaSelec,2).toString());
        respuestaAplicacion.setText(Tabla.getValueAt(FilaSelec,3).toString());
        coincide.setSelectedItem(Tabla.getValueAt(FilaSelec,4).toString());
        respuestaSistema.setText(Tabla.getValueAt(FilaSelec,5).toString());
        modelo.removeRow(FilaSelec);
        }
        else{
           JOptionPane.showMessageDialog(this, "fila no seleccionada");
        }
        
        
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        DatosEntradaServiceImpl datosEntradaServicio = new DatosEntradaServiceImpl();
        int FilaSelec = Tabla.getSelectedRow();
        
        if (FilaSelec >= 0)
        {
            idDatosEntrada = Long.parseLong(Tabla.getValueAt(FilaSelec,1).toString());
            datosEntradaServicio.eliminar(idDatosEntrada);
        
        JOptionPane.showMessageDialog(this, "se ha eliminado el registro Exitosamente");
        cargarDatosEntrada();
        }
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void jlbCasoPruebaNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlbCasoPruebaNKeyReleased
       
        //ListarDatosTabla(jlbCasoPruebaN.getText());
        
    }//GEN-LAST:event_jlbCasoPruebaNKeyReleased

    private void ConsultarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPruebaActionPerformed
        
        consultarCasoPrueba ();
        cargarDatosEntrada();
        EditarPrueba.setEnabled(true);
        camposBloqueados();
        //cargarDatosEntrada();
        
    }//GEN-LAST:event_ConsultarPruebaActionPerformed

    private void EditarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPruebaActionPerformed
        GuardarCambios.setEnabled(true);
        limpiar.setEnabled(true);
        salir.setEnabled(true);
        Agregar.setEnabled(true);
        Editar.setEnabled(true);
        GuardarDatosE.setEnabled(true);
        Eliminar.setEnabled(true);
        EliminarPrueba.setEnabled(true);
        camposHabilitados();
        
    }//GEN-LAST:event_EditarPruebaActionPerformed

    private void EliminarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPruebaActionPerformed
        eliminarCasoPrueba();
    }//GEN-LAST:event_EliminarPruebaActionPerformed
       
    public boolean validarCampos() {
            boolean camposValidados = true;
            if (CasoPruebaN.getText().equals("")){
                imprimirCampoVacio("Caso Prueba");
                camposValidados = false;
                CasoPruebaN.requestFocus();
            }else if(casoUso.getText().equals("")){
                imprimirCampoVacio("Caso de Uso");
                camposValidados = false;
                casoUso.requestFocus();
            }else if(moduloSistema.getText().equals("")){
                imprimirCampoVacio("Modulo Sistema");
                camposValidados = false;
                moduloSistema.requestFocus();
            }else if(versionEjecucion.getText().equals("")){
                imprimirCampoVacio("Version de Ejecucion");
                camposValidados = false;
                versionEjecucion.requestFocus();
            }else if(fechaEjecucion.getText().equals("")){
                imprimirCampoVacio("Fecha de Ejecucion");
                camposValidados = false;
                fechaEjecucion.requestFocus();
            }else if(descripcion.getText().equals("")){
                imprimirCampoVacio("Descripcion");
                camposValidados = false;
                descripcion.requestFocus();
            }else if(precondiciones.getText().equals("")){
                imprimirCampoVacio("Precondiciones");
                camposValidados = false;
                precondiciones.requestFocus();
            }else if(pasosPrueba.getText().equals("")){
                imprimirCampoVacio("Pasos Prueba");
                camposValidados = false;
                pasosPrueba.requestFocus();
            }else if(postCondiciones.getText().equals("")){
                imprimirCampoVacio("Post Condiciones");
                camposValidados = false;
                postCondiciones.requestFocus();
            }else if(defectosDesviaciones.getText().equals("")){
                imprimirCampoVacio("Defectos Desviacion");
                camposValidados = false;
                defectosDesviaciones.requestFocus();
            }else if(observaciones.getText().equals("")){
                imprimirCampoVacio("Observaciones");
                camposValidados = false;
                observaciones.requestFocus();
            }else if(probador.getText().equals("")){
                imprimirCampoVacio("Probador");
                camposValidados = false;
                probador.requestFocus();
            }else if(nombre.getText().equals("")){
                imprimirCampoVacio("Nombre");
                camposValidados = false;
                nombre.requestFocus();
            }else if(firma.getText().equals("")){
                imprimirCampoVacio("Firme");
                camposValidados = false;
                firma.requestFocus();
            }else if(fecha.getText().equals("")){
                imprimirCampoVacio("Fecha");
                camposValidados = false;
                fecha.requestFocus();
        } 
        return camposValidados;
        }
        public void imprimirCampoVacio(String campo){
            JOptionPane.showMessageDialog(null, "El campo "+campo+ " se encuentra vacío. Por favor, validar campo.", "Campo vacío", JOptionPane.ERROR_MESSAGE);
            }
    
    public void camposBloqueados() {
        casoUso.setEditable(false);
        moduloSistema.setEditable(false);
        fechaEjecucion.setEditable(false);
        descripcion.setEditable(false);
        precondiciones.setEditable(false);
        pasosPrueba.setEditable(false);
        postCondiciones.setEditable(false);
        defectosDesviaciones.setEditable(false);
        veredicto.setEnabled(false);
        observaciones.setEditable(false);
        probador.setEditable(false);
        nombre.setEditable(false);
        firma.setEditable(false);
        fecha.setEditable(false);
        
        jlbCasoPruebaN.setEnabled(false);
        Campo.setEditable(false);
        Valor.setEditable(false);
        tipoEscenario.setEnabled(false);
        respuestaAplicacion.setEditable(false);
        coincide.setEnabled(false);
        respuestaSistema.setEditable(false);
    }
        
        public void camposHabilitados() {
        casoUso.setEditable(true);
        moduloSistema.setEditable(true);
        fechaEjecucion.setEditable(true);
        descripcion.setEditable(true);
        precondiciones.setEditable(true);
        pasosPrueba.setEditable(true);
        postCondiciones.setEditable(true);
        defectosDesviaciones.setEditable(true);
        veredicto.setEnabled(true);
        observaciones.setEditable(true);
        probador.setEditable(true);
        nombre.setEditable(true);
        firma.setEditable(true);
        fecha.setEditable(true);
        
        jlbCasoPruebaN.setEnabled(true);
        Campo.setEditable(true);
        Valor.setEditable(true);
        tipoEscenario.setEnabled(true);
        respuestaAplicacion.setEditable(true);
        coincide.setEnabled(true);
        respuestaSistema.setEditable(true);
    }
    
    public void guardarDatosEntrada() {        
       DatosEntradaServiceImpl datosEntradaServicio = new DatosEntradaServiceImpl();

        DatosEntrada datosEntrada = new DatosEntrada(
                Long.parseLong(jlbCasoPruebaN.getText()),
                Campo.getText(),
                Valor.getText(), 
                tipoEscenario.getSelectedItem().toString(), 
                respuestaAplicacion.getText(),
                coincide.getSelectedItem().toString(),
                respuestaSistema.getText());
         datosEntradaServicio.guardar(datosEntrada);
   }
    
    public boolean actualizarDatosEntrada(Long idCampo){
        DatosEntradaServiceImpl datosEntradaServicio = new DatosEntradaServiceImpl();
        boolean actualizacion = false;
        try{
        DatosEntrada datosEntrada = new DatosEntrada(
                idDatosEntrada,
                Long.parseLong(jlbCasoPruebaN.getText()),
                Campo.getText(),
                Valor.getText(), 
                tipoEscenario.getSelectedItem().toString(), 
                respuestaAplicacion.getText(),
                coincide.getSelectedItem().toString(),
                respuestaSistema.getText());
         datosEntradaServicio.actualizar(datosEntrada);
            JOptionPane.showMessageDialog(this, "Campo actualizado correctamente.","Actualización de Caso de Prueba",JOptionPane.INFORMATION_MESSAGE);
            actualizacion =true;
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
        return actualizacion;
        }
    
    private void cargarDatosEntrada() {
        
        DatosEntradaServiceImpl datosEntradaServicio = new DatosEntradaServiceImpl();


        modelo = (DefaultTableModel) Tabla.getModel();

        List<DatosEntrada> datosEntrada = datosEntradaServicio.listarDatosEntrada(Long.parseLong(CasoPruebaN.getText()));
        int tamanoLista = datosEntrada.size(); //Tamaño de filas
        modelo.setRowCount(tamanoLista);//Se establecen la cantidad de filas

        for(int posicionFila = 0; posicionFila<tamanoLista;posicionFila++){
            Tabla.setValueAt(datosEntrada.get(posicionFila).getIdDatosPrueba(),posicionFila , 0);
            Tabla.setValueAt(datosEntrada.get(posicionFila).getIdDatosEntrada(),posicionFila , 1);
            Tabla.setValueAt(datosEntrada.get(posicionFila).getCampo(),posicionFila , 2);
            Tabla.setValueAt(datosEntrada.get(posicionFila).getValor(),posicionFila , 3);
            Tabla.setValueAt(datosEntrada.get(posicionFila).getTipoEscenario(),posicionFila , 4);
            Tabla.setValueAt(datosEntrada.get(posicionFila).getRespuestaAplicacion(),posicionFila , 5);
            Tabla.setValueAt(datosEntrada.get(posicionFila).getCoincide(),posicionFila , 6);
            Tabla.setValueAt(datosEntrada.get(posicionFila).getRespuestaSistema(),posicionFila , 7);
        }
                
    }
    public void guardarcasoPrueba() {
        CasoPruebaServiceImpl casoPruebaServicio = new CasoPruebaServiceImpl();

        CasoPrueba casoPrueba = new CasoPrueba(Long.parseLong(CasoPruebaN.getText()), 
                casoUso.getText(), 
                moduloSistema.getText(), 
                versionEjecucion.getText(), 
                fechaEjecucion.getText(),
                descripcion.getText(),
                precondiciones.getText(),
                pasosPrueba.getText(),
                postCondiciones.getText(),
                defectosDesviaciones.getText (),
                veredicto.getSelectedItem().toString (),
                observaciones.getText(),
                probador.getText(),
                nombre.getText(),
                firma.getText(),
                fecha.getText());
        casoPruebaServicio.guardar(casoPrueba);
    }
    
    public void consultarCasoPrueba (){
        
        CasoPruebaServiceImpl casoPruebaServicio = new CasoPruebaServiceImpl();
         
        this.casoPruebaEncontrado = casoPruebaServicio.encontrarCasoPrueba(Long.parseLong(CasoPruebaN.getText()), versionEjecucion.getText());          
          
          casoUso.setText(casoPruebaEncontrado.getCasoUso());
          moduloSistema.setText(casoPruebaEncontrado.getModuloSistema());
          fechaEjecucion.setText(casoPruebaEncontrado.getFechaEjecucion());
          descripcion.setText(casoPruebaEncontrado.getDescripcionCasoPrueba());
          precondiciones.setText(casoPruebaEncontrado.getPreCondiciones());
          pasosPrueba.setText(casoPruebaEncontrado.getPasosPrueba());
          postCondiciones.setText(casoPruebaEncontrado.getPostCondiciones());
          defectosDesviaciones.setText(casoPruebaEncontrado.getDefectosDesviaciones());
          veredicto.setSelectedItem(casoPruebaEncontrado.getVeredicto().toString());
          observaciones.setText(casoPruebaEncontrado.getObservaciones());
          probador.setText(casoPruebaEncontrado.getProbador());
          nombre.setText(casoPruebaEncontrado.getNombre());
          firma.setText(casoPruebaEncontrado.getFirma());
          fecha.setText(casoPruebaEncontrado.getFecha());
          
          JOptionPane.showMessageDialog(this, "Caso de prueba encontrado.","Consultar Caso de Prueba",JOptionPane.INFORMATION_MESSAGE);
    }
    
        public boolean actualizarCasoPrueba (Long idcasoprueba){
            
            CasoPruebaServiceImpl casoPruebaServicio = new CasoPruebaServiceImpl();
            boolean actualizacion = false;
        try{
        CasoPrueba casoPrueba = new CasoPrueba(
                Long.parseLong(CasoPruebaN.getText()),
                casoUso.getText(), 
                moduloSistema.getText(),  
                fechaEjecucion.getText(),
                descripcion.getText(),
                precondiciones.getText(),
                pasosPrueba.getText(),
                postCondiciones.getText(),
                defectosDesviaciones.getText (),
                veredicto.getSelectedItem().toString (),
                observaciones.getText(),
                probador.getText(),
                nombre.getText(),
                firma.getText(),
                fecha.getText());
            casoPruebaServicio.actualizarCasoPrueba(casoPrueba);
            JOptionPane.showMessageDialog(this, "Caso de prueba actualizado correctamente.","Actualización de Caso de Prueba",JOptionPane.INFORMATION_MESSAGE);
            actualizacion =true;
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
        return actualizacion;
        }
    
    public void eliminarCasoPrueba() {
        CasoPruebaServiceImpl casoPruebaServicio = new CasoPruebaServiceImpl();
        CasoPrueba casoPruebaEliminar = new CasoPrueba();
        casoPruebaEliminar.getIdCasoPrueba();
        int opcion = JOptionPane.showConfirmDialog(null, "<html><strong>Â¿EstÃ¡ seguro que desea eliminar el vehÃ­culo del sistema de informaciÃ³n?</strong></html>", "Eliminar vehÃ­culo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            casoPruebaServicio.eliminar(casoPruebaEliminar);
            JOptionPane.showMessageDialog(null, "<html><span style='color:DimGray'>VehÃ­culo eliminado correctamente.<strong> </strong></span> se encuentra por favor validar campo.</html>", "VehÃ­culo eliminado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            CasoPruebaN.selectAll();
            CasoPruebaN.requestFocus();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaryActualizarCasoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaryActualizarCasoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaryActualizarCasoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaryActualizarCasoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaryActualizarCasoPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Campo;
    private javax.swing.JTextField CasoPruebaN;
    private javax.swing.JButton ConsultarPrueba;
    private javax.swing.JButton Editar;
    private javax.swing.JButton EditarPrueba;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EliminarPrueba;
    private javax.swing.JButton GuardarCambios;
    private javax.swing.JButton GuardarDatosE;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Valor;
    private javax.swing.JTextField casoUso;
    private javax.swing.JComboBox<String> coincide;
    private javax.swing.JTextArea defectosDesviaciones;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField fechaEjecucion;
    private javax.swing.JTextField firma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jlbCasoPruebaN;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField moduloSistema;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JTextArea pasosPrueba;
    private javax.swing.JTextArea postCondiciones;
    private javax.swing.JTextArea precondiciones;
    private javax.swing.JTextField probador;
    private javax.swing.JTextArea respuestaAplicacion;
    private javax.swing.JTextArea respuestaSistema;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> tipoEscenario;
    private javax.swing.JComboBox<String> veredicto;
    private javax.swing.JTextField versionEjecucion;
    // End of variables declaration//GEN-END:variables


}
