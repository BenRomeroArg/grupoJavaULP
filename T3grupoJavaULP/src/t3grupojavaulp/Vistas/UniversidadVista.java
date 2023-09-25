package t3grupojavaulp.Vistas;

import java.util.TreeSet;
import t3grupojavaulp.accesoADatos.InscripcionData;

/**
 *
 * @author nikan
 */
public class UniversidadVista extends javax.swing.JFrame {

    public static TreeSet<InscripcionData> listaAlumnos = new TreeSet();

    public UniversidadVista() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmForAlumno = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMForMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jManejoInsc = new javax.swing.JMenuItem();
        jManipNotas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jOrdenarAlumnosMateria = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(612, 557));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jMenuBar2.setForeground(new java.awt.Color(102, 102, 102));
        jMenuBar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(317, 30));

        jMenu3.setText("Alumno");

        jmForAlumno.setText("Formulario Alumno");
        jmForAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmForAlumnoActionPerformed(evt);
            }
        });
        jMenu3.add(jmForAlumno);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Materia");
        jMenu4.add(jSeparator1);

        jMForMateria.setText("Formulario Materia");
        jMForMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMForMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMForMateria);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Administración");

        jManejoInsc.setText("Manejo Inscripciones");
        jManejoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManejoInscActionPerformed(evt);
            }
        });
        jMenu5.add(jManejoInsc);

        jManipNotas.setText("Manipulación de notas");
        jManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManipNotasActionPerformed(evt);
            }
        });
        jMenu5.add(jManipNotas);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Consultas");

        jOrdenarAlumnosMateria.setText("Alumnos por materia");
        jOrdenarAlumnosMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenarAlumnosMateriaActionPerformed(evt);
            }
        });
        jMenu6.add(jOrdenarAlumnosMateria);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("Salir");

        jMenuItem3.setText("Salir del sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmForAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmForAlumnoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        GestionAlumnosView gav = new GestionAlumnosView();
        gav.setVisible(true);
        Escritorio.add(gav);
        Escritorio.moveToFront(gav);
    }//GEN-LAST:event_jmForAlumnoActionPerformed

    private void jManejoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManejoInscActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        GestionInscripcionView giv = new GestionInscripcionView();
        giv.setVisible(true);
        Escritorio.add(giv);
        Escritorio.moveToFront(giv);
    }//GEN-LAST:event_jManejoInscActionPerformed

    private void jMForMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMForMateriaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        GestionMateriasView gmv = new GestionMateriasView();
        gmv.setVisible(true);
        Escritorio.add(gmv);
        Escritorio.moveToFront(gmv);
    }//GEN-LAST:event_jMForMateriaActionPerformed

    private void jOrdenarAlumnosMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrdenarAlumnosMateriaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsultaAlumnoPorMateriaView camV = new ConsultaAlumnoPorMateriaView();
        camV.setVisible(true);
        Escritorio.add(camV);
        Escritorio.moveToFront(camV);
    }//GEN-LAST:event_jOrdenarAlumnosMateriaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManipNotasActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        ManipulacionNotasView camV = new ManipulacionNotasView();
        camV.setVisible(true);
        Escritorio.add(camV);
        Escritorio.moveToFront(camV);

    }//GEN-LAST:event_jManipNotasActionPerformed

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
            java.util.logging.Logger.getLogger(UniversidadVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniversidadVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniversidadVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniversidadVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UniversidadVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem jMForMateria;
    private javax.swing.JMenuItem jManejoInsc;
    private javax.swing.JMenuItem jManipNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jOrdenarAlumnosMateria;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmForAlumno;
    // End of variables declaration//GEN-END:variables
}
