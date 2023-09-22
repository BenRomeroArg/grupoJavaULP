package t3grupojavaulp.Vistas;

import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import t3grupojavaulp.Entidades.Alumno;
import t3grupojavaulp.accesoADatos.AlumnoData;

/**
 *
 * @author Ignacio C.
 */
public class GestionAlumnosView extends javax.swing.JInternalFrame {

    private AlumnoData alData = new AlumnoData();
    private Alumno alumno;

    public GestionAlumnosView() {
        initComponents();
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbActualizar.setEnabled(false);
    }

    private void clearFields() {
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jbEstado.setSelected(false);
        jDateChooser1.setDate(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbEstado = new javax.swing.JRadioButton();
        jtNombre = new javax.swing.JTextField();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jbActualizar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alumnos");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alumno");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Documento:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Apellido:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Nombre:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Estado:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Fecha de nacimiento:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);
        jPanel1.add(filler1);

        jbActualizar.setText("Editar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbActualizar);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbEstado)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscar)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbEstado)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        jbGuardar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbActualizar.setEnabled(true);

       
        try {
            int dni = Integer.parseInt(jtDocumento.getText());
            Alumno busqueda = alData.buscarAlumnoPorDni(dni);

            jtApellido.setText(busqueda.getApellido());
            jtNombre.setText(busqueda.getNombre());
            jbEstado.setSelected(busqueda.isEstado());
            jDateChooser1.setDate(busqueda.getFechaNacimiento());

            jtDocumento.setEditable(false);
            jtApellido.setEditable(false);
            jtNombre.setEditable(false);
            jbEstado.setEnabled(false);
            jDateChooser1.setEnabled(false);

            jbNuevo.setEnabled(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El campo dni esta vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
            jtDocumento.setText("");
            jbGuardar.setEnabled(false);
            jbEliminar.setEnabled(false);
            jbActualizar.setEnabled(false);
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "El dni no esta registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            jtDocumento.setText("");
            jbGuardar.setEnabled(false);
            jbEliminar.setEnabled(false);
            jbActualizar.setEnabled(false);
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(jtDocumento.getText());
            String apellido = jtApellido.getText();
            String nombre = jtNombre.getText();
            boolean estado = jbEstado.isSelected();
            Date fecha = new java.sql.Date(jDateChooser1.getDate().getTime());
            alumno = new Alumno(dni, nombre, apellido, fecha, estado);
            alData.guardarAlumno(alumno);
            // Limpiar campos
            clearFields();
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Formulario incompleto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        clearFields();
        jbNuevo.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        jtDocumento.setEditable(false);
        jtApellido.setEditable(true);
        jtNombre.setEditable(true);
        jbEstado.setEnabled(true);
        jDateChooser1.setEnabled(true);
        jbNuevo.setEnabled(false);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            int dni = Integer.parseInt(jtDocumento.getText());
            Alumno id = alData.buscarAlumnoPorDni(dni);
            int idAlumno = id.getIdAlumno();

            String apellido = jtApellido.getText();
            String nombre = jtNombre.getText();
            boolean estado = jbEstado.isSelected();
            Date fecha = new java.sql.Date(jDateChooser1.getDate().getTime());
            alumno = new Alumno(idAlumno, dni, nombre, apellido, fecha, estado);
            alData.modificarAlumno(alumno);
            // Limpiar campos
            clearFields();
            jbNuevo.setEnabled(true);
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Formulario incompleto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(jtDocumento.getText());
            Alumno id = alData.buscarAlumnoPorDni(dni);
            boolean estado = id.isEstado();
            int idAlumno = id.getIdAlumno();
            alData.eliminarAlumno(idAlumno);

            if (estado == false) {
                JOptionPane.showMessageDialog(null, "SE ELIMINO CON EXITO", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }

            clearFields();
            jbNuevo.setEnabled(true);
            jtDocumento.setEditable(true);
            jtApellido.setEditable(true);
            jtNombre.setEditable(true);
            jbEstado.setEnabled(true);
            jDateChooser1.setEnabled(true);

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No exite el registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            clearFields();
            jbNuevo.setEnabled(true);
            jtDocumento.setEditable(true);
            jtApellido.setEditable(true);
            jtNombre.setEditable(true);
            jbEstado.setEnabled(true);
            jDateChooser1.setEnabled(true);

        }

    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JRadioButton jbEstado;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
