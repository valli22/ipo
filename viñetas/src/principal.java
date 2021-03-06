


import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

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

    public static ArrayList<JEditorPane> panes = new ArrayList<>();
    public static JEditorPane currentPane;
    public static int i = 0;
    int capacity=0;
    int i2 = 0;
    static int vinetaEliminada=-1;

    public static DefaultListModel getVinetas() {
        return vinetas;
    }


    public principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/logo.jpg")).getImage());
        this.getContentPane().setBackground(Color.getHSBColor(138, 40, 77));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        iconoNuevoProyecto = new javax.swing.JButton();
        iconoGuardarProyecto = new javax.swing.JButton();
        iconoAnadirVideo = new javax.swing.JButton();
        iconoAnadirImagen = new javax.swing.JButton();
        iconoPresentacion = new javax.swing.JButton();
        iconoAnadirCuadroTexto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vinetas = new DefaultListModel<>();
        listaVinetas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        panelEditable = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        currentPane = jEditorPane1;
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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viñetas v 1.1");
        setBackground(new java.awt.Color(153, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        iconoNuevoProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main_New_Project.png"))); // NOI18N
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

        iconoGuardarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save the world.png"))); // NOI18N
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

        iconoAnadirVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/video.jpg"))); // NOI18N
        iconoAnadirVideo.setToolTipText("Añadir video");
        iconoAnadirVideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoAnadirVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoAnadirVideo.setFocusable(false);
        iconoAnadirVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoAnadirVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconoAnadirVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoAnadirVideoActionPerformed(evt);
            }
        });

        iconoAnadirImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gallery.png"))); // NOI18N
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

        iconoPresentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presentation.jpg"))); // NOI18N
        iconoPresentacion.setToolTipText("Presentacion");
        iconoPresentacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoPresentacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoPresentacion.setFocusable(false);
        iconoPresentacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoPresentacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconoPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoPresentacionActionPerformed(evt);
            }
        });

        iconoAnadirCuadroTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadirCuadrotextp.png"))); // NOI18N
        iconoAnadirCuadroTexto.setToolTipText("Añadir cuadro de texto");
        iconoAnadirCuadroTexto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconoAnadirCuadroTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoAnadirCuadroTexto.setFocusable(false);
        iconoAnadirCuadroTexto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconoAnadirCuadroTexto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconoAnadirCuadroTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconoAnadirCuadroTextoActionPerformed(evt);
            }
        });

        listaVinetas.setModel(vinetas);
        listaVinetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaVinetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaVinetasMouseClicked(evt);
            }
        });
        listaVinetas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaVinetasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(listaVinetas);

        jLabel1.setText("Seleccion de viñeta:");

        jEditorPane1.setEditable(false);
        panelEditable.setViewportView(jEditorPane1);

        menuArchivo.setText("Archivo");

        archivoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main_New_Project.png"))); // NOI18N

        archivoNuevo.setText("Nuevo proyecto");
        archivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoNuevo);

        archivoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrir.png"))); // NOI18N
        archivoAbrir.setText("Abrir proyecto");
        archivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoAbrir);

        archivoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save the world.png"))); // NOI18N
        archivoGuardar.setText("Guardar proyecto");
        archivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoGuardar);

        archivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        archivoSalir.setText("Salir del programa");
        archivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoSalir);

        jMenuBar1.add(menuArchivo);

        menuEdicion.setText("Edicion");

        edicionInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert.png"))); // NOI18N
        edicionInsertar.setText("Insertar");

        edicionInsertarInsertarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert page.png"))); // NOI18N
        edicionInsertarInsertarV.setText("Insertar viñeta");
        edicionInsertarInsertarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionInsertarInsertarVActionPerformed(evt);
            }
        });
        edicionInsertar.add(edicionInsertarInsertarV);

        edicionInsertarImportarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gallery.png"))); // NOI18N
        edicionInsertarImportarI.setText("Importar Imagen");
        edicionInsertarImportarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionInsertarImportarIActionPerformed(evt);
            }
        });
        edicionInsertar.add(edicionInsertarImportarI);

        edicionInsertarAnadirVid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/video.jpg"))); // NOI18N
        edicionInsertarAnadirVid.setText("Añadir video");
        edicionInsertarAnadirVid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionInsertarAnadirVidActionPerformed(evt);
            }
        });
        edicionInsertar.add(edicionInsertarAnadirVid);

        edicionInsertarAnadirIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagen predefinida.jpg"))); // NOI18N
        edicionInsertarAnadirIP.setText("Añadir imagen predefinida");
        edicionInsertarAnadirIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionInsertarAnadirIPActionPerformed(evt);
            }
        });
        edicionInsertar.add(edicionInsertarAnadirIP);

        edicionInsertarAnadirA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/animacion.jpg"))); // NOI18N
        edicionInsertarAnadirA.setText("Añadir animacion");
        edicionInsertarAnadirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionInsertarAnadirAActionPerformed(evt);
            }
        });
        edicionInsertar.add(edicionInsertarAnadirA);

        menuEdicion.add(edicionInsertar);

        edicionEliminarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminarV.png"))); // NOI18N
        edicionEliminarV.setText("Eliminar viñeta");
        edicionEliminarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionEliminarVActionPerformed(evt);
            }
        });
        menuEdicion.add(edicionEliminarV);

        edicionFormatoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/textbox.png"))); // NOI18N
        edicionFormatoT.setText("Formato de texto");
        edicionFormatoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionFormatoTActionPerformed(evt);
            }
        });
        menuEdicion.add(edicionFormatoT);

        edicionAnadirCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadirCuadrotextp.png"))); // NOI18N
        edicionAnadirCT.setText("Añadir cuadro de texto");
        edicionAnadirCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionAnadirCTActionPerformed(evt);
            }
        });
        menuEdicion.add(edicionAnadirCT);

        jMenuBar1.add(menuEdicion);

        menuPresentacion.setText("Presentacion");

        presentacionVistaPrevia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vista previa.png"))); // NOI18N
        presentacionVistaPrevia.setText("Visualizacion vista previa");
        presentacionVistaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentacionVistaPreviaActionPerformed(evt);
            }
        });
        menuPresentacion.add(presentacionVistaPrevia);

        presentacionPresentacionV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presentation.jpg"))); // NOI18N
        presentacionPresentacionV.setText("Presentacion viñetas");
        presentacionPresentacionV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentacionPresentacionVActionPerformed(evt);
            }
        });
        menuPresentacion.add(presentacionPresentacionV);

        jMenuBar1.add(menuPresentacion);

        menuAyuda.setText("Ayuda");

        ayudaAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda.png"))); // NOI18N
        ayudaAcercaDe.setText("Acerca de Viñetas.exe");
        ayudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaAcercaDeActionPerformed(evt);
            }
        });
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconoNuevoProyecto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoGuardarProyecto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoAnadirVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoAnadirImagen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoAnadirCuadroTexto))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconoPresentacion)
                                .addGap(0, 1021, Short.MAX_VALUE))
                            .addComponent(panelEditable)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(panelEditable)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoNuevoActionPerformed
        vinetas.removeAllElements();
        i=1;
        capacity=1;
        vinetas.addElement("Viñeta "+i);
        listaVinetas.setSelectedIndex(0);
        panes = new ArrayList<JEditorPane>();
        jEditorPane1.removeAll();
        panes.add(jEditorPane1);
        currentPane = panes.get(0);
        panelEditable.setViewportView(currentPane);
    }//GEN-LAST:event_archivoNuevoActionPerformed

    private void archivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoGuardarActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("IPO","ipo");
        chooser.setFileFilter(filtroImagen);
        chooser.setDialogTitle("Guardar proyecto");
        chooser.showSaveDialog(this); 
    }//GEN-LAST:event_archivoGuardarActionPerformed

    private void presentacionVistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentacionVistaPreviaActionPerformed
        VistaPrevia vista = new VistaPrevia();
        vista.setVisible(true);
        vista.repaint();
        vista.getContentPane().setVisible(true);
    }//GEN-LAST:event_presentacionVistaPreviaActionPerformed

    private void iconoGuardarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoGuardarProyectoActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("IPO","ipo");
        chooser.setFileFilter(filtroImagen);
        chooser.setDialogTitle("Guardar proyecto");
        chooser.showSaveDialog(this);
    }//GEN-LAST:event_iconoGuardarProyectoActionPerformed

    private void archivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_archivoSalirActionPerformed

    private void archivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoAbrirActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("IPO","ipo");
        chooser.setFileFilter(filtroImagen);
        chooser.setDialogTitle("Abrir proyecto");
        chooser.showOpenDialog(this);   
    }//GEN-LAST:event_archivoAbrirActionPerformed

    private void edicionInsertarImportarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionInsertarImportarIActionPerformed
        if(capacity >= 1){
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
            chooser.setFileFilter(filtroImagen);
            chooser.setDialogTitle("Importar imagen");
            int seleccion = chooser.showOpenDialog(chooser);
            if (seleccion == JFileChooser.APPROVE_OPTION){
                File fichero = chooser.getSelectedFile();
                String adr = fichero.getAbsolutePath();
                JLabel etiqueta = new JLabel();
                ImageIcon imageIcon = new ImageIcon(adr);
                etiqueta.setIcon(imageIcon);
                etiqueta.setLocation(100,100);
                etiqueta.setSize(imageIcon.getIconWidth(),imageIcon.getIconHeight());
                currentPane.add(etiqueta);
                currentPane.repaint();
            }
        } else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_edicionInsertarImportarIActionPerformed

    private void iconoNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoNuevoProyectoActionPerformed
       vinetas.removeAllElements();
        i=1;
        capacity=1;
        vinetas.addElement("Viñeta "+i);
        listaVinetas.setSelectedIndex(0);
        panes = new ArrayList<JEditorPane>();
        jEditorPane1.removeAll();
        panes.add(jEditorPane1);
        currentPane = panes.get(0);
        panelEditable.setViewportView(currentPane);
    }//GEN-LAST:event_iconoNuevoProyectoActionPerformed

    private void iconoAnadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoAnadirImagenActionPerformed
        if (capacity >= 1){
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
            chooser.setFileFilter(filtroImagen);
            chooser.setDialogTitle("Importar imagen");
            int seleccion = chooser.showOpenDialog(chooser);
            if (seleccion == JFileChooser.APPROVE_OPTION){
                File fichero = chooser.getSelectedFile();
                String adr = fichero.getAbsolutePath();
                JLabel etiqueta = new JLabel();
                ImageIcon imageIcon = new ImageIcon(adr);
                etiqueta.setIcon(imageIcon);
                etiqueta.setLocation(100,100);
                etiqueta.setSize(imageIcon.getIconWidth(),imageIcon.getIconHeight());
                currentPane.add(etiqueta);
                currentPane.repaint();
            }
        } else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_iconoAnadirImagenActionPerformed

    private void edicionFormatoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionFormatoTActionPerformed
        Ventana opciones = new Ventana();
        opciones.setVisible(true);
    }//GEN-LAST:event_edicionFormatoTActionPerformed

    private void edicionInsertarInsertarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionInsertarInsertarVActionPerformed
        if (capacity>=1){
            i++;
            capacity+=1;
            vinetas.addElement("Viñeta "+i);
            listaVinetas.setSelectedIndex(0);
            panes.add(new JEditorPane());
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_edicionInsertarInsertarVActionPerformed

    private void edicionInsertarAnadirIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionInsertarAnadirIPActionPerformed
        if(capacity>=1){
            new ImagenPredef().setVisible(true);
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_edicionInsertarAnadirIPActionPerformed

    private void edicionEliminarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionEliminarVActionPerformed
        if (capacity >= 1){    
            new vinetaEliminar().setVisible(true);
            capacity-=1;
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "No hay viñetas");
        }
    }//GEN-LAST:event_edicionEliminarVActionPerformed

    private void presentacionPresentacionVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentacionPresentacionVActionPerformed
        Frame principal = null;
        JDialog dialogo = new JDialog(principal,"Presentacion");
        presentacion panel = new presentacion();
        dialogo.setSize(1070, 550);
        dialogo.add(panel);
        dialogo.setVisible(true);
    }//GEN-LAST:event_presentacionPresentacionVActionPerformed

    private void ayudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaAcercaDeActionPerformed
        Frame principal = null;
        JDialog dialogo = new JDialog(principal,"Ayuda");
        ayuda panel = new ayuda();
        dialogo.setSize(500, 300);
        dialogo.add(panel);
        dialogo.setVisible(true);
    }//GEN-LAST:event_ayudaAcercaDeActionPerformed

    private void iconoPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoPresentacionActionPerformed
        Frame principal = null;
        JDialog dialogo = new JDialog(principal,"Presentacion");
        presentacion panel = new presentacion();
        dialogo.setSize(1070, 550);
        dialogo.add(panel);
        dialogo.setVisible(true);
    }//GEN-LAST:event_iconoPresentacionActionPerformed

    private void edicionInsertarAnadirVidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionInsertarAnadirVidActionPerformed
        if(capacity>=1){
        new AñadirVideoPredef().setVisible(true);
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_edicionInsertarAnadirVidActionPerformed

    private void edicionInsertarAnadirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionInsertarAnadirAActionPerformed

        if(capacity>=1){
            if (i2 == 0) {
                JLabel etiqueta = new JLabel();
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/numerogif.gif"));
                etiqueta.setIcon(imageIcon);
                imageIcon.setImageObserver(etiqueta);
                etiqueta.setText("");
                etiqueta.setLocation(550, 220);
                etiqueta.setSize(207,165);
                etiqueta.setVisible(true);
                currentPane.add(etiqueta);
                currentPane.repaint();
                i2++;
            } else {
                JLabel etiqueta = new JLabel();
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/duke-v4.gif"));
                etiqueta.setIcon(imageIcon);
                imageIcon.setImageObserver(etiqueta);
                etiqueta.setText("");
                etiqueta.setLocation(950, 400);
                etiqueta.setSize(226,242);
                etiqueta.setVisible(true);
                currentPane.add(etiqueta);
                currentPane.repaint();
            }
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");

        }
    }//GEN-LAST:event_edicionInsertarAnadirAActionPerformed

    private void iconoAnadirVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoAnadirVideoActionPerformed
        if (capacity>=1){
        new AñadirVideoPredef().setVisible(true);
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_iconoAnadirVideoActionPerformed

    private void iconoAnadirCuadroTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconoAnadirCuadroTextoActionPerformed
        if (capacity>=1){
            new texto().setVisible(true);
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_iconoAnadirCuadroTextoActionPerformed

    private void edicionAnadirCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionAnadirCTActionPerformed
        if (capacity>=1){
            new texto().setVisible(true);
        }else {
            javax.swing.JOptionPane. showMessageDialog (this, "Debe crear un proyecto antes");
        }
    }//GEN-LAST:event_edicionAnadirCTActionPerformed

    private void listaVinetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaVinetasMouseClicked
        int selected = listaVinetas.getSelectedIndex();
        currentPane = panes.get(selected);
        panelEditable.setViewportView(currentPane);
    }//GEN-LAST:event_listaVinetasMouseClicked

    private void listaVinetasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaVinetasKeyPressed
        
    }//GEN-LAST:event_listaVinetasKeyPressed
    
    
            
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
    private javax.swing.JDialog jDialog1;
    public static javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JList listaVinetas;
    static private DefaultListModel vinetas;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuPresentacion;
    private javax.swing.JScrollPane panelEditable;
    private javax.swing.JMenuItem presentacionPresentacionV;
    private javax.swing.JMenuItem presentacionVistaPrevia;
    // End of variables declaration//GEN-END:variables
}
