/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p2lab6_oliveriraheta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Oliver Iraheta
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() throws IOException, Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_newusu = new javax.swing.JDialog();
        tf_newEdad = new javax.swing.JTextField();
        pf_newContra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jp_ar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_newNombreAr = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jb_agregar = new javax.swing.JButton();
        tf_newUser = new javax.swing.JTextField();
        jd_Artista = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ArtistaLanza = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jb_ingresar = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();
        jb_new = new javax.swing.JButton();

        tf_newEdad.setText("\"Edad\"");
        tf_newEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_newEdadMouseClicked(evt);
            }
        });

        pf_newContra.setText("jPasswordField1");
        pf_newContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_newContraMouseClicked(evt);
            }
        });

        jLabel4.setText("Username");

        jLabel5.setText("Edad");

        jLabel6.setText("Password");

        jLabel7.setText("Nombre Artistico");

        tf_newNombreAr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_newNombreArMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_arLayout = new javax.swing.GroupLayout(jp_ar);
        jp_ar.setLayout(jp_arLayout);
        jp_arLayout.setHorizontalGroup(
            jp_arLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_arLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_newNombreAr, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_arLayout.setVerticalGroup(
            jp_arLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_arLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jp_arLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_newNombreAr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jToggleButton1.setText("Artista");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jb_agregar.setText("Agregar");
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });

        tf_newUser.setText("\"USERNAME\"");
        tf_newUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_newUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_newusuLayout = new javax.swing.GroupLayout(jd_newusu.getContentPane());
        jd_newusu.getContentPane().setLayout(jd_newusuLayout);
        jd_newusuLayout.setHorizontalGroup(
            jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_newusuLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_newusuLayout.createSequentialGroup()
                        .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_newusuLayout.createSequentialGroup()
                                .addComponent(tf_newEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jd_newusuLayout.createSequentialGroup()
                        .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf_newContra, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_newUser, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jd_newusuLayout.createSequentialGroup()
                                    .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75))
                                .addComponent(jp_ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(195, Short.MAX_VALUE))))
        );
        jd_newusuLayout.setVerticalGroup(
            jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_newusuLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_newUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_newContra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_newusuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_newEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Lanzamiento");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Albumes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Singles");
        treeNode1.add(treeNode2);
        jt_ArtistaLanza.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_ArtistaLanza);

        jButton1.setText("Lanzamiento");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ArtistaLayout = new javax.swing.GroupLayout(jd_Artista.getContentPane());
        jd_Artista.getContentPane().setLayout(jd_ArtistaLayout);
        jd_ArtistaLayout.setHorizontalGroup(
            jd_ArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ArtistaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jd_ArtistaLayout.setVerticalGroup(
            jd_ArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ArtistaLayout.createSequentialGroup()
                .addGroup(jd_ArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ArtistaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ArtistaLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SPOTIFY");

        tf_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_userMouseClicked(evt);
            }
        });

        jLabel2.setText("Contraseña");

        jLabel3.setText("Usuario");

        jb_ingresar.setText("Ingresar");
        jb_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ingresarMouseClicked(evt);
            }
        });

        pf_password.setText("jPasswordField1");
        pf_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_passwordMouseClicked(evt);
            }
        });

        jb_new.setText("Crear Usuario");
        jb_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_newMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_user, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(pf_password))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_new)
                        .addGap(38, 38, 38)
                        .addComponent(jb_ingresar)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_ingresar)
                    .addComponent(jb_new))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(231, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_newMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        jp_ar.setVisible(false);
        jd_newusu.pack();
        jd_newusu.setLocationRelativeTo(this);
        jd_newusu.setVisible(true);
    }//GEN-LAST:event_jb_newMouseClicked

    private void jb_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarMouseClicked
        // TODO add your handling code here:
        boolean existe = false;
        int tipo = 0;
        for (Usuario u : usuarios) {
            if (u.getUser().equals(tf_user.getText()) && u.getPassword().equals(pf_password.getText())) {
                existe = true;
                if (u instanceof Artista) {
                    tipo = 1;
                }
            }
        }
        if (existe) {
            user = tf_user.getText();
            this.setVisible(false);
            if (tipo == 1) {
                jd_Artista.pack();
                jd_Artista.setLocationRelativeTo(this);
                llenarJTartista();
                jd_Artista.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(this, "NO EXISTE");
        }
    }//GEN-LAST:event_jb_ingresarMouseClicked

    private void pf_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_passwordMouseClicked
        // TODO add your handling code here:
        pf_password.setText("");
    }//GEN-LAST:event_pf_passwordMouseClicked

    private void tf_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_userMouseClicked
        // TODO add your handling code here:
        tf_user.setText("");

    }//GEN-LAST:event_tf_userMouseClicked

    private void pf_newContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_newContraMouseClicked
        // TODO add your handling code here:
        pf_newContra.setText("");
    }//GEN-LAST:event_pf_newContraMouseClicked

    private void tf_newEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_newEdadMouseClicked
        tf_newEdad.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_newEdadMouseClicked

    private void tf_newNombreArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_newNombreArMouseClicked
        // TODO add your handling code here:
        tf_newNombreAr.setText("");
    }//GEN-LAST:event_tf_newNombreArMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            jp_ar.setVisible(true);
        } else {
            jp_ar.setVisible(false);
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        // TODO add your handling code here:
        try {
            if (jToggleButton1.isSelected()) {
                usuarios.add(new Artista(tf_newNombreAr.getText(), tf_newUser.getText(), pf_newContra.getText(), Integer.parseInt(tf_newEdad.getText()), true));
            } else {
                usuarios.add(new Cliente(tf_newUser.getText(), pf_newContra.getText(), Integer.parseInt(tf_newEdad.getText()), false));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_newusu, e);
        }

        JOptionPane.showMessageDialog(jd_newusu, "AGREGADO");
        try {
            escribirBitacora();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_newusu.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jToggleButton1.setSelected(false);
        try {
            escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_agregarMouseClicked

    private void tf_newUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_newUserMouseClicked
        tf_newUser.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_newUserMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        int opc = Integer.parseInt(JOptionPane.showInputDialog("1. Album   2. Single"));
        String continuar = "s";
        String titulo = JOptionPane.showInputDialog(jd_Artista, "Titulo de la publicacion");
        String fecha = JOptionPane.showInputDialog(jd_Artista, "Fecha de lanzamiento");

        Album album = new Album(titulo, fecha, 0);

        while (continuar.equals("s")) {
            String tituloCan = JOptionPane.showInputDialog(jd_Artista, "Titulo de la Cancion");
            String duracion = JOptionPane.showInputDialog(jd_Artista, "Duracion de la cancion");
            Cancion cancion = new Cancion(tituloCan, duracion, titulo);
            canciones.add(cancion);

            if (opc == 2) {
                canciones.add(cancion);
                continuar = "n";
                Single single = new Single(cancion, titulo, fecha, 0);
                lanzamientos.add(single);
            } else {
                album.getCanciones().add(cancion);
                continuar = JOptionPane.showInputDialog("Seguir agregando s/n");
            }
        }
        if (opc == 1) {
            lanzamientos.add(album);
        }
        llenarJTartista();
    }//GEN-LAST:event_jButton1MouseClicked

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_ingresar;
    private javax.swing.JButton jb_new;
    private javax.swing.JDialog jd_Artista;
    private javax.swing.JDialog jd_newusu;
    private javax.swing.JPanel jp_ar;
    private javax.swing.JTree jt_ArtistaLanza;
    private javax.swing.JPasswordField pf_newContra;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_newEdad;
    private javax.swing.JTextField tf_newNombreAr;
    private javax.swing.JTextField tf_newUser;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
    public ArrayList<Usuario> usuarios = new ArrayList();
    public ArrayList<Cancion> canciones = new ArrayList();
    public ArrayList<Lanzamiento> lanzamientos = new ArrayList();
    public String user = "";

    public void cargarArchivo() throws FileNotFoundException, IOException, Exception {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("./Usuarios.txt");
            if (archivo.exists()) {
            }
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] userToken = linea.split("\\|");
                if (userToken[3].equals("Cliente")) {
                    usuarios.add(new Cliente(userToken[0], userToken[1], Integer.parseInt(userToken[2]), false));
                } else {
                    usuarios.add(new Artista(userToken[3], userToken[0], userToken[1], Integer.parseInt(userToken[2]), true));
                }

            }
        } catch (FileNotFoundException e) {
        }
        br.close();
        fr.close();
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter("./Usuarios.txt", false);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < usuarios.size(); i++) {

                bw.write(usuarios.get(i).getUser() + "|");
                bw.write(usuarios.get(i).getPassword() + "|");
                bw.write(usuarios.get(i).getEdad() + "|");
                if (usuarios.get(i) instanceof Artista) {
                    bw.write(((Artista) usuarios.get(i)).getNameAr() + "\n");
                } else {
                    bw.write("Cliente\n");
                }

            }
            bw.flush();
        } catch (IOException ex) {
        }
        bw.close();
        fw.close();
    }

    public void escribirBitacora() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter("./Bitacora.txt", false);
            bw = new BufferedWriter(fw);

            bw.write(new Date() + "|");
            bw.write(tf_newUser.getText() + "|");
            if (jToggleButton1.isSelected()) {
                bw.write("Artista\n");
            } else {
                bw.write("Cliente\n");
            }

            bw.flush();
        } catch (IOException ex) {
        }
        bw.close();
        fw.close();

    }

    public void llenarJTartista() {
        DefaultTreeModel modelo = (DefaultTreeModel) jt_ArtistaLanza.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo.getRoot();
        for (Lanzamiento lan : lanzamientos) {
            if (lan instanceof Album) {
                DefaultMutableTreeNode child = (DefaultMutableTreeNode) root.getChildAt(0);
                child.add(new DefaultMutableTreeNode(lan));
            } else {
                DefaultMutableTreeNode child = (DefaultMutableTreeNode) root.getChildAt(1);
                child.add(new DefaultMutableTreeNode(lan));
            }
        }
        jt_ArtistaLanza.setModel(modelo);
    }

}
