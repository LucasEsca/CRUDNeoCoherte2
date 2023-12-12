
package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idCarrera = new javax.swing.JTextField();
        nombreCarrera = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnTraer = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(151, 151, 155));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("APLICACION DE GESTION UNIVERSITARIA");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de carrera:");

        idCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCarreraActionPerformed(evt);
            }
        });

        nombreCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(idCarrera))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(nombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(151, 151, 155));

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnTraer.setText("LEER");
        btnTraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("BORRAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnTraer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(110, 110, 110)
                .addComponent(btnEliminar)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre Carrera"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//________________________________________________________________________________________________
    //Crear
    public void agregar(String nombreCarrera) {
        //Definir la sentencia sql para insertar una carrera con un nombre proporcionado

        String sql = "INSERT INTO carreras (nombrecarrera) VALUES(?)";

        //Creamos la instancia de la clase Main para establecer la conexion a la base de datos
        Main con = new Main();

        //Establecemos la conexion
        Connection conexion = con.establecerConeccion();

        try {

            PreparedStatement preparedStatement = conexion.prepareStatement(sql);

            preparedStatement.setString(1, nombreCarrera);

            //Ejecutar la sentencia sql y obtenemos el numero de filas afectadas
            int filasAfectadas = preparedStatement.executeUpdate();

            //Comprobar si se agreggo o no el registro en nuestro software
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Carrera agregada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar la nueva carrera");
            }

            //Cerramos la declaración preparadas
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //_______________________________________________________________________________________________
    public void mostrar() {
        String sql = "SELECT * FROM carreras";

        //Creamos una instancia de la clase main para establecer la conexion a la base de datos
        Main con = new Main();

        Connection conexion = con.establecerConeccion();

        System.out.println(sql);

        //Creamos un modelo de tabla para almacenar los datos
        DefaultTableModel model = new DefaultTableModel();

        try {

            //Creamos una declaración para ejecutar la consulta SQL
            Statement st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            //Obtenemos la información de las colunmas de la consulta
            ResultSetMetaData metaData = rs.getMetaData();

            int numColumnas = metaData.getColumnCount();

            for (int column = 1; column <= numColumnas; column++) {
                model.addColumn(metaData.getColumnName(column));
            }

            //Agregamos las filas al modelo de la tabla
            while (rs.next()) {
                Object[] rowData = new Object[numColumnas];
                for (int i = 0; i < numColumnas; i++) {
                    //Obtenemos los datos de cada columna por indice (comience en 1)
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            //Asignamos el modelo de tabla al componente TablaDatos
            TablaDatos.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //_________________________________________________________________________________________
    //Actualizar
    //Obtenemos el id seleccionado
    public int obtenerIdSeleccionado() {
        //obtener la fila seleccionada en la tabla
        int filaSeleccionada = TablaDatos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
            return -1; //Retornamos un valor negativo para indicar que no se ha seleccionado nada
        }
        int id = (int) TablaDatos.getValueAt(filaSeleccionada, 0);
        return id;
    }

    public void modificar() {

        //Obtener el nuevo nombre de la carrera desde el campo de texto
        String nuevoNombre = nombreCarrera.getText();

        //Verificar si se proporcionó un nuevo nombre
        if (nuevoNombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nuevo nombre de carrera");
        } else {
            Main con = new Main();

            Connection conexion = con.establecerConeccion();

            if (conexion != null) {
                try {
                    //Obtener el id de la carrera seleccionada en la tabla
                    int idSeleccionado = obtenerIdSeleccionado();

                    if (idSeleccionado != -1) {
                        String sql = "UPDATE carreras SET nombrecarrera = ? WHERE id = ?";

                        PreparedStatement preparedStatement = conexion.prepareStatement(sql);

                        preparedStatement.setString(1, nuevoNombre);

                        preparedStatement.setInt(2, idSeleccionado);

                        //Ejecutar la actualización
                        int filasAfectadas = preparedStatement.executeUpdate();

                        if (filasAfectadas > 0) {
                            //La actualización fue exitosa
                            JOptionPane.showMessageDialog(null, "Nombre de la carrera actualizado exitosamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo modificar la carrera");
                        }
                        //Cerrar la setencia preparada
                        preparedStatement.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar la carrera");
                    }
                    //Cerramos la conexión
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al modificar el nombre carrera");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión");
            }
        }

    }
    //___________________________________________________________________________________________________________________
    
    //Eliminar
    public void eliminar(){
        int filaSeleccionada = TablaDatos.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }else{
            int idEliminar = (int) TablaDatos.getValueAt(filaSeleccionada, 0);
            
            String sql = "DELETE FROM carreras WHERE id = " + idEliminar;
            
            try{
                Main con = new Main();
                
                Connection conexion = con.establecerConeccion();
                
                Statement st = conexion.createStatement();
                
                int filasAfectadas = st.executeUpdate(sql);
                
                if(filasAfectadas > 0){
                    JOptionPane.showMessageDialog(null, "La carrera fue eliminada con exito");
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar la carrera");
                }
                st.close();
                conexion.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    
    //__________________________________________________________________________________________________________________

    public void nuevo() {
        nombreCarrera.setText("");
        nombreCarrera.requestFocus();
    }

    //_______________________________________________________________________________
//______________________________________________________________________________________________________________
    //Traemos y mostramos los registros en la tabla
    private void btnTraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerActionPerformed
    mostrar();
    }//GEN-LAST:event_btnTraerActionPerformed
//___________________________________________________________________________________________________________________________
    private void idCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCarreraActionPerformed
       
    }//GEN-LAST:event_idCarreraActionPerformed

    private void nombreCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCarreraActionPerformed
        
    }//GEN-LAST:event_nombreCarreraActionPerformed

    //agregamos registro
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombre = nombreCarrera.getText();
        agregar(nombre);
        mostrar();
        nuevo();
    }//GEN-LAST:event_btnCrearActionPerformed

    
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        modificar();
        mostrar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Carrera no seleccionada");
        } else {
            int id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            String nom = (String) TablaDatos.getValueAt(fila, 1);
            idCarrera.setText("" + id);
            nombreCarrera.setText(nom);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        mostrar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnTraer;
    private javax.swing.JTextField idCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreCarrera;
    // End of variables declaration//GEN-END:variables
}
