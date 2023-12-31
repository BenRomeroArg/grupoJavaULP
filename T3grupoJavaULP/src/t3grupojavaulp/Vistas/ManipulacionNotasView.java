
package t3grupojavaulp.Vistas;

//import com.sun.tools.javac.tree.JCTree;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import t3grupojavaulp.Entidades.Alumno;
import t3grupojavaulp.Entidades.Inscripcion;
import t3grupojavaulp.accesoADatos.AlumnoData;
import t3grupojavaulp.accesoADatos.InscripcionData;
import t3grupojavaulp.accesoADatos.MateriaData;

/**
 *
 * @author HP
 */
public class ManipulacionNotasView extends javax.swing.JInternalFrame {

    private AlumnoData aluData = new AlumnoData();
    private MateriaData matData = new MateriaData();
    private InscripcionData inscData = new InscripcionData();
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int x, int y) {
            return y == 3; //Ninguna celda editable salvo la columna 4 (porque empieza a contar del 0)
        }
    };

    public ManipulacionNotasView() {
        initComponents();
        rellenarComboBox();
        armarCabecera();
        cargarTablaInscriptas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumnos = new javax.swing.JComboBox();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(380, 420));
        setPreferredSize(new java.awt.Dimension(489, 449));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de notas");

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMaterias);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione un alumno: ");

        jcAlumnos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int aluId = ((Alumno) jcAlumnos.getSelectedItem()).getIdAlumno();
        
        // Extraemos las inscripciones de la tabla.
        for (int i = 0; i < modelo.getRowCount(); i++) {
            try {
                int idMateria = (int) modelo.getValueAt(i, 0);
                double nota = Double.parseDouble(modelo.getValueAt(i, 3).toString());
                inscData.actualizarNota(aluId, idMateria, nota);
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Formato de nota incorrecto: "+ex.getMessage(), "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Nota actualizada!");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
        if (jcAlumnos.getSelectedItem() != null) {
            cargarTablaInscriptas();
        }
    }//GEN-LAST:event_jcAlumnosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    
    private void rellenarComboBox() {
        jcAlumnos.removeAllItems();
        ArrayList<Alumno> aluList = aluData.listarAlumnos();
        for (Alumno a : aluList) {
            jcAlumnos.addItem(a);
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Codigo Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");
        modelo.addColumn("Codigo Inscripción");
        jtMaterias.setModel(modelo);
        jtMaterias.removeColumn(jtMaterias.getColumnModel().getColumn(4)); // Ocultar columna del codigo de inscripcion.
        jtMaterias.getTableHeader().setReorderingAllowed(false); //Inhabilita movimiento de columnas.
    }
    
     private void cargarTablaInscriptas() {
        modelo.setRowCount(0); //Vaciar tabla
        Alumno alumnoSeleccionado = (Alumno) jcAlumnos.getSelectedItem();
        ArrayList<Inscripcion> inscripciones = inscData.obtenerInscripcionesPorAlumno(alumnoSeleccionado.getIdAlumno());

        for (Inscripcion i : inscripciones) {
            try {
                double nota = i.getNota();
                Object[] row;
                if (nota != -1) {
                    row = new Object[]{i.getMateria().getIdMateria(), i.getMateria().getNombre(), i.getMateria().getAnioMateria(), nota, i.getIdInscripcion()};
                } else {
                    row = new Object[]{i.getMateria().getIdMateria(), i.getMateria().getNombre(), i.getMateria().getAnioMateria(), null, i.getIdInscripcion()};
                }
                modelo.addRow(row);
            } catch (Exception ex) {
                continue; // La materia fue eliminada de la base de datos, asi que la ignoramos.
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcAlumnos;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
}
