
import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class principal extends javax.swing.JFrame {
   

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jToolBar2 = new javax.swing.JToolBar();
        jToolBar1 = new javax.swing.JToolBar();
        jToolBar3 = new javax.swing.JToolBar();
        jToolBar4 = new javax.swing.JToolBar();
        jToolBar5 = new javax.swing.JToolBar();
        jToolBar6 = new javax.swing.JToolBar();
        iconoNuevoProyecto = new javax.swing.JButton();
        iconoGuardarProyecto = new javax.swing.JButton();
        iconoAnadirVideo = new javax.swing.JButton();
        iconoAnadirImagen = new javax.swing.JButton();
        jToolBar7 = new javax.swing.JToolBar();
        iconoPresentacion = new javax.swing.JButton();
        iconoAnadirCuadroTexto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVinetas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        panelEdicion = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        archivoNuevo = new javax.swing.JMenuItem();
        archivoAbrir = new javax.swing.JMenuItem();
        archivoGuardar = new javax.swing.JMenuItem();
        archivoSalir = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        edicionInsertar = new javax.swing.JMenu();
        edicionInsertarInsertarV = new javax.swing.JMenuItem();
        edicionInsertarImportarI = new javax.swing.JMenuItem();
        edicionInsertarAnadirVid = new javax.swing.JMenuItem();
        edicionInsertarAnadirIP = new javax.swing.JMenuItem();
        edicionInsertarAnadirA = new javax.swing.JMenuItem();
        edicionEliminarV = new javax.swing.JMenuItem();
        edicionFormatoT = new javax.swing.JMenuItem();
        edicionAnadirCT = new javax.swing.JMenuItem();
        menuPresentacion = new javax.swing.JMenu();
        presentacionVistaPrevia = new javax.swing.JMenuItem();
        presentacionPresentacionV = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        ayudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viñetas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar2.setRollover(true);

        jToolBar1.setRollover(true);

        jToolBar3.setRollover(true);

        jToolBar4.setRollover(true);

        jToolBar5.setRollover(true);

        jToolBar6.setRollover(true);

        iconoNuevoProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_New_Project.png"))); // NOI18N
        iconoNuevoProyecto.setToolTipText("Nuevo proyecto");
        iconoNuevoProyecto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoNuevoProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoNuevoProyecto.setFocusable(false);
        iconoNuevoProyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoNuevoProyecto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconoNuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoNuevoProyectoActionPerformed(evt);
            }
        });

        iconoGuardarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save the world.png"))); // NOI18N
        iconoGuardarProyecto.setToolTipText("Guardar proyecto");
        iconoGuardarProyecto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoGuardarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoGuardarProyecto.setFocusable(false);
        iconoGuardarProyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoGuardarProyecto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconoGuardarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoGuardarProyectoActionPerformed(evt);
            }
        });

        iconoAnadirVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/video.jpg"))); // NOI18N
        iconoAnadirVideo.setToolTipText("Añadir video");
        iconoAnadirVideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoAnadirVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoAnadirVideo.setFocusable(false);
        iconoAnadirVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoAnadirVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconoAnadirImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery.png"))); // NOI18N
        iconoAnadirImagen.setToolTipText("Añadir imagen");
        iconoAnadirImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoAnadirImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoAnadirImagen.setFocusable(false);
        iconoAnadirImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoAnadirImagen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconoAnadirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoAnadirImagenActionPerformed(evt);
            }
        });

        jToolBar7.setRollover(true);

        iconoPresentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation.jpg"))); // NOI18N
        iconoPresentacion.setToolTipText("Presentacion");
        iconoPresentacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoPresentacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoPresentacion.setFocusable(false);
        iconoPresentacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoPresentacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconoAnadirCuadroTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anadirCuadrotextp.png"))); // NOI18N
        iconoAnadirCuadroTexto.setToolTipText("Añadir cuadro de texto");
        iconoAnadirCuadroTexto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoAnadirCuadroTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoAnadirCuadroTexto.setFocusable(false);
        iconoAnadirCuadroTexto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoAnadirCuadroTexto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        listaVinetas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaVinetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(listaVinetas);

        jLabel1.setText("Seleccion de viñeta:");

        panelEdicion.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEdicionLayout = new javax.swing.GroupLayout(panelEdicion);
        panelEdicion.setLayout(panelEdicionLayout);
        panelEdicionLayout.setHorizontalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        panelEdicionLayout.setVerticalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");

        archivoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_New_Project.png")));

        archivoNuevo.setText("Nuevo proyecto");
        archivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoNuevo);

        archivoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abrir.png"))); // NOI18N
        archivoAbrir.setText("Abrir proyecto");
        archivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoAbrir);

        archivoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save the world.png"))); // NOI18N
        archivoGuardar.setText("Guardar proyecto");
        archivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoGuardar);

        archivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        archivoSalir.setText("Salir del programa");
        archivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoSalir);

        jMenuBar1.add(menuArchivo);

        menuEdicion.setText("Edicion");

        edicionInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insert.png"))); // NOI18N
        edicionInsertar.setText("Insertar");

        edicionInsertarInsertarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insert page.png"))); // NOI18N
        edicionInsertarInsertarV.setText("Insertar viñeta");
        edicionInsertar.add(edicionInsertarInsertarV);

        edicionInsertarImportarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery.png"))); // NOI18N
        edicionInsertarImportarI.setText("Importar Imagen");
        edicionInsertarImportarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionInsertarImportarIActionPerformed(evt);
            }
        });
        edicionInsertar.add(edicionInsertarImportarI);

        edicionInsertarAnadirVid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/video.jpg"))); // NOI18N
        edicionInsertarAnadirVid.setText("Añadir video");
        edicionInsertar.add(edicionInsertarAnadirVid);

        edicionInsertarAnadirIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen predefinida.jpg"))); // NOI18N
        edicionInsertarAnadirIP.setText("Añadir imagen predefinida");
        edicionInsertar.add(edicionInsertarAnadirIP);

        edicionInsertarAnadirA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animacion.jpg"))); // NOI18N
        edicionInsertarAnadirA.setText("Añadir animacion");
        edicionInsertar.add(edicionInsertarAnadirA);

        menuEdicion.add(edicionInsertar);

        edicionEliminarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminarV.png"))); // NOI18N
        edicionEliminarV.setText("Eliminar viñeta");
        menuEdicion.add(edicionEliminarV);

        edicionFormatoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/textbox.png"))); // NOI18N
        edicionFormatoT.setText("Formato de texto");
        menuEdicion.add(edicionFormatoT);

        edicionAnadirCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anadirCuadrotextp.png"))); // NOI18N
        edicionAnadirCT.setText("Añadir cuadro de texto");
        menuEdicion.add(edicionAnadirCT);

        jMenuBar1.add(menuEdicion);

        menuPresentacion.setText("Presentacion");

        presentacionVistaPrevia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista previa.png"))); // NOI18N
        presentacionVistaPrevia.setText("Visualizacion vista previa");
        presentacionVistaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentacionVistaPreviaActionPerformed(evt);
            }
        });
        menuPresentacion.add(presentacionVistaPrevia);

        presentacionPresentacionV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation.jpg"))); // NOI18N
        presentacionPresentacionV.setText("Presentacion viñetas");
        menuPresentacion.add(presentacionPresentacionV);

        jMenuBar1.add(menuPresentacion);

        menuAyuda.setText("Ayuda");

        ayudaAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda.png"))); // NOI18N
        ayudaAcercaDe.setText("Acerca de Viñetas.exe");
        menuAyuda.add(ayudaAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconoNuevoProyecto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoGuardarProyecto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoAnadirVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoAnadirImagen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoAnadirCuadroTexto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconoPresentacion)
                                .addGap(33, 33, 33)
                                .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconoNuevoProyecto)
                    .addComponent(iconoGuardarProyecto)
                    .addComponent(iconoAnadirVideo)
                    .addComponent(iconoAnadirImagen)
                    .addComponent(iconoPresentacion)
                    .addComponent(iconoAnadirCuadroTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoNuevoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);        
    }//GEN-LAST:event_archivoNuevoActionPerformed

    private void archivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoGuardarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this); 
    }//GEN-LAST:event_archivoGuardarActionPerformed

    private void presentacionVistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentacionVistaPreviaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentacionVistaPreviaActionPerformed

    private void iconoGuardarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoGuardarProyectoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
    }//GEN-LAST:event_iconoGuardarProyectoActionPerformed

    private void archivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_archivoSalirActionPerformed

    private void archivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoAbrirActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);   
    }//GEN-LAST:event_archivoAbrirActionPerformed

    private void edicionInsertarImportarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionInsertarImportarIActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
    }//GEN-LAST:event_edicionInsertarImportarIActionPerformed

    private void iconoNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoNuevoProyectoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
    }//GEN-LAST:event_iconoNuevoProyectoActionPerformed

    private void iconoAnadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoAnadirImagenActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
    }//GEN-LAST:event_iconoAnadirImagenActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem archivoAbrir;
    private javax.swing.JMenuItem archivoGuardar;
    private javax.swing.JMenuItem archivoNuevo;
    private javax.swing.JMenuItem archivoSalir;
    private javax.swing.JMenuItem ayudaAcercaDe;
    private javax.swing.JMenuItem edicionAnadirCT;
    private javax.swing.JMenuItem edicionEliminarV;
    private javax.swing.JMenuItem edicionFormatoT;
    private javax.swing.JMenu edicionInsertar;
    private javax.swing.JMenuItem edicionInsertarAnadirA;
    private javax.swing.JMenuItem edicionInsertarAnadirIP;
    private javax.swing.JMenuItem edicionInsertarAnadirVid;
    private javax.swing.JMenuItem edicionInsertarImportarI;
    private javax.swing.JMenuItem edicionInsertarInsertarV;
    private javax.swing.JButton iconoAnadirCuadroTexto;
    private javax.swing.JButton iconoAnadirImagen;
    private javax.swing.JButton iconoAnadirVideo;
    private javax.swing.JButton iconoGuardarProyecto;
    private javax.swing.JButton iconoNuevoProyecto;
    private javax.swing.JButton iconoPresentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JToolBar jToolBar7;
    private javax.swing.JList listaVinetas;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuPresentacion;
    private javax.swing.JPanel panelEdicion;
    private javax.swing.JMenuItem presentacionPresentacionV;
    private javax.swing.JMenuItem presentacionVistaPrevia;
    // End of variables declaration//GEN-END:variables
}
