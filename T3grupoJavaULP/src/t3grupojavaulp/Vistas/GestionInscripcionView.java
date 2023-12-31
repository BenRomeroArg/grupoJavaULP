package t3grupojavaulp.Vistas;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import t3grupojavaulp.Entidades.Alumno;
import t3grupojavaulp.Entidades.Inscripcion;
import t3grupojavaulp.Entidades.Materia;
import t3grupojavaulp.accesoADatos.AlumnoData;
import t3grupojavaulp.accesoADatos.InscripcionData;
import t3grupojavaulp.accesoADatos.MateriaData;

/**
 *
 * @author HP
 */
public class GestionInscripcionView extends javax.swing.JInternalFrame {

    private ButtonGroup grupoRadio = new ButtonGroup();
    private AlumnoData aluData = new AlumnoData();
    private InscripcionData inscData = new InscripcionData();
    private MateriaData matData = new MateriaData();
    private Materia materia;
    private Alumno alumno;

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int x, int y) {
            return false; //Ninguna celda editable
        }
    };


    public GestionInscripcionView() {
        initComponents();
        rellenarComboBox();
        armarCabecera();
        grupoRadio.add(jrbInscriptas);
        grupoRadio.add(jrbNoInscriptas);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaAlumnos = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(406, 350));
        setPreferredSize(new java.awt.Dimension(489, 467));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccionar un alumno:");

        jcbAlumnos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("  Listado de Materias");

        jrbInscriptas.setText("Materias Inscriptas");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setText("Materias no Inscriptas");
        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jtTablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaAlumnos);

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular Inscripcion");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbInscribir)
                .addGap(18, 18, 18)
                .addComponent(jbAnular)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jrbInscriptas)
                        .addGap(46, 46, 46)
                        .addComponent(jrbNoInscriptas)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbAnular)
                    .addComponent(jbInscribir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        //jrbNoInscriptas.setSelected(false);
        jbInscribir.setEnabled(false);
        jbAnular.setEnabled(true);
        cargarTablaInscriptas();
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

        int filaSeleccionada = jtTablaAlumnos.getSelectedRow();
        int idMateria = (Integer) jtTablaAlumnos.getValueAt(filaSeleccionada, 0);
        Alumno alumno = (Alumno) jcbAlumnos.getSelectedItem();
        materia = matData.buscarMateria(idMateria);
        
        // Crear una instancia de Inscripcion con los datos
        Inscripcion insc = new Inscripcion(alumno, materia, -1);  //VER PARA QUE LO CARGUE COMO NULL Y NO CERO . por ej un IF si es cero ponga NULL
        
        //metodo para guardar
        inscData.guardarInscripcion(insc);
        
        //Actualizar tabla
        cargarTablaNoInscriptas();
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed

        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        cargarTablaNoInscriptas();
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        if (jrbInscriptas.isSelected()) {

            cargarTablaInscriptas();
        } else if (jrbNoInscriptas.isSelected()) {

            cargarTablaNoInscriptas();
        }
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed

        int filaSeleccionada = jtTablaAlumnos.getSelectedRow();
        if (filaSeleccionada >= 0) { // Asegurarse de que se haya seleccionado una fila
            int idMateria = (Integer) jtTablaAlumnos.getValueAt(filaSeleccionada, 0);
            Alumno alumno = (Alumno) jcbAlumnos.getSelectedItem();
            materia = matData.buscarMateria(idMateria);

            // Crear una instancia de Inscripcion con los datos
            Inscripcion insc = new Inscripcion(alumno, materia);

            // método para borrar la inscripción
            inscData.borrarInscripcionMateriaAlumno(alumno.getIdAlumno(), materia.getIdMateria());

            // Actualizar la tabla
            cargarTablaInscriptas();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccioná una fila para anular una inscripción.");
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");
        jtTablaAlumnos.setModel(modelo);
        jtTablaAlumnos.getTableHeader().setReorderingAllowed(false);
        jtTablaAlumnos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void rellenarComboBox() {
        jcbAlumnos.removeAllItems();
        ArrayList<Alumno> aluList = aluData.listarAlumnos();
        for (Alumno a : aluList) {
            jcbAlumnos.addItem(a);
        }
    }

    private void cargarTablaInscriptas() {
        modelo.setRowCount(0); //Vaciar tabla
        Alumno alumnoSeleccionado = (Alumno) jcbAlumnos.getSelectedItem();
        ArrayList<Materia> listaMaterias = inscData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());

        for (Materia m : listaMaterias) {
            double nota = inscData.getNotaAlumnoMateria(alumnoSeleccionado.getIdAlumno(), m.getIdMateria());
            Object[] row;
            if (nota != -1) {
                row = new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria(), nota};
            } else {
                row = new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria(), null};
            }
            modelo.addRow(row);
        }
    }

    private void cargarTablaNoInscriptas() {
        modelo.setRowCount(0); //Vaciar tabla
        Alumno alumnoSeleccionado = (Alumno) jcbAlumnos.getSelectedItem();
        ArrayList<Materia> listaMaterias = inscData.obtenerMateriasNOCursadas(alumnoSeleccionado.getIdAlumno());

        for (Materia m : listaMaterias) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria(), null});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcbAlumnos;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtTablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
