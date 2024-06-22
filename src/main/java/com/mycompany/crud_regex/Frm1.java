
package com.mycompany.crud_regex;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CristianOlivera1
 */
public class Frm1 extends javax.swing.JFrame {
    private DefaultTableModel dtm;
    private Object[] columna= new Object[5];
 
    public Frm1() {
        initComponents();
        //Jframe en el centro 
        this.setLocationRelativeTo(null);
        dtm =(DefaultTableModel)tPersonas.getModel();
        
        //Copiar a txtfield al hacer click a una fila del jtable
         tPersonas.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
            int selectedRow = tPersonas.getSelectedRow();
            if (selectedRow != -1) {
            txtDni.setText(tPersonas.getValueAt(selectedRow, 0).toString());
            txtNombre.setText(tPersonas.getValueAt(selectedRow, 1).toString());
            txtApellido.setText(tPersonas.getValueAt(selectedRow, 2).toString());
            txtCorreo.setText(tPersonas.getValueAt(selectedRow, 3).toString());
            txtTelefono.setText(tPersonas.getValueAt(selectedRow, 4).toString());
        }
    }
});
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 255));
        kGradientPanel1.setkGradientFocus(550);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(0, 231, 221));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btnEliminar.setBackground(new java.awt.Color(0, 231, 221));
        btnEliminar.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 231, 221));
        btnActualizar.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 231, 221));
        btnRegistrar.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar-40.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel11.setText("TELEFONO");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel6.setText("APELLIDO");

        txtCorreo.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel13.setText("CORREO");

        txtDni.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtDni.setToolTipText("");

        lbl.setBackground(new java.awt.Color(255, 255, 255));
        lbl.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        lbl.setText("DNI");

        txtNombre.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRE");

        lblNombre.setText(".");

        lblApellido.setText(".");

        lblTelefono.setText(".");

        lblDni.setText(".");

        lblCorreo.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblCorreo.setText(".");

        btnCrear.setBackground(new java.awt.Color(0, 231, 221));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crear.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl)
                                    .addComponent(jLabel13)
                                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 81, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(341, 341, 341))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrear)
                                .addGap(32, 32, 32)
                                .addComponent(btnRegistrar)
                                .addGap(37, 37, 37)
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)))
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblApellido)
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDni)
                                        .addGap(66, 66, 66))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(66, 66, 66)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(lblCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tPersonas.setBackground(new java.awt.Color(2, 255, 245));
        tPersonas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "CORREO", "TELEFONO"
            }
        ));
        tPersonas.setGridColor(new java.awt.Color(204, 204, 204));
        tPersonas.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tPersonas);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //button para eliminar 
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if(tPersonas.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"no ha seleccionado ningun registro de la tabla");
        }else{
            dtm.removeRow(tPersonas.getSelectedRow());
        }
        //limpiar todos los text field
        limpiarTxt();
        //limpiar los labels y tambien establecer sus colores normales a los textFelds
         limpiarLbl_ColorTxt();
    }//GEN-LAST:event_btnEliminarActionPerformed
    //button para actualizar
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int selectedRow = tPersonas.getSelectedRow();

        String tempValueDni=txtDni.getText();

        boolean allFieldsValid = true;

        if(Helpers.verifyPattern("^[0-9]{8}$", tempValueDni)){

            txtDni.setBackground(new Color(255, 255, 255));
            lblDni.setText("...");
            lblDni.setForeground(Color.black);
            //columna[0]= txtDni.getText().trim();

        }else{
            txtDni.setBackground(new Color(255, 161, 161));
            lblDni.setText("Formato Incorrecto");
            lblDni.setForeground(Color.red);
            allFieldsValid = false;
        }

        String tempValueNombre=txtNombre.getText();

        if(Helpers.verifyPattern("^([a-zA-Z]\s?)+([a-zA-Z]+)?$", tempValueNombre)){

            txtNombre.setBackground(new Color(255, 255, 255));
            lblNombre.setText("...");
            lblNombre.setForeground(Color.black);

            //columna[1]= txtNombre.getText().trim();

        }else{
            txtNombre.setBackground(new Color(255, 161, 161));
            lblNombre.setText("Formato Incorrecto");
            lblNombre.setForeground(Color.red);
            allFieldsValid = false;
        }
        String tempValueApellido=txtApellido.getText();

        if(Helpers.verifyPattern("^([a-zA-Z]\s?)+([a-zA-Z]+)?$", tempValueApellido)){

            txtApellido.setBackground(new Color(255, 255, 255));
            lblApellido.setText("...");
            lblApellido.setForeground(Color.black);
            //columna[2]= txtApellido.getText().trim();

        }else{
            txtApellido.setBackground(new Color(255, 161, 161));
            lblApellido.setText("Formato Incorrecto");
            lblApellido.setForeground(Color.red);
            allFieldsValid = false;
        }
        String tempValueTelefono=txtTelefono.getText();

        if(Helpers.verifyPattern("^9\\d{8}$", tempValueTelefono)){

            txtTelefono.setBackground(new Color(255, 255, 255));
            lblTelefono.setText("...");
            lblTelefono.setForeground(Color.black);
            // columna[4]= txtTelefono.getText().trim();

        }else{
            txtTelefono.setBackground(new Color(255, 161, 161));
            lblTelefono.setText("Formato Incorrecto");
            lblTelefono.setForeground(Color.red);
            allFieldsValid = false;
        }

        String tempValueCorreo=txtCorreo.getText();

        if(Helpers.verifyPattern("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", tempValueCorreo)){

            txtCorreo.setBackground(new Color(255, 255, 255));
            lblCorreo.setText("...");
            lblCorreo.setForeground(Color.black);
            //   columna[3]= txtCorreo.getText().trim();

        }else{
            txtCorreo.setBackground(new Color(255, 161, 161));
            lblCorreo.setText("Formato Incorrecto");
            lblCorreo.setForeground(Color.red);
            allFieldsValid = false;
        }
        // dtm.addRow(columna);
        //limpiarTxt(); tambien puede hir aqui
        if (allFieldsValid) {

            if (selectedRow != -1) {
                String newDni = txtDni.getText().trim();
                String newNombre = txtNombre.getText().trim();
                String newApellido = txtApellido.getText().trim();
                String newCorreo = txtCorreo.getText().trim();
                String newTelefono = txtTelefono.getText().trim();

                tPersonas.setValueAt(newDni, selectedRow, 0);
                tPersonas.setValueAt(newNombre, selectedRow, 1);
                tPersonas.setValueAt(newApellido, selectedRow, 2);
                tPersonas.setValueAt(newCorreo, selectedRow, 3);
                tPersonas.setValueAt(newTelefono, selectedRow, 4);

                // Limpiar los campos
                 limpiarTxt();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Si algún campo es inválido, no agregar la fila y notificar al usuario
            JOptionPane.showMessageDialog(this, "Por favor, corrija los campos resaltados en rojo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed
    //button para registrar
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String tempValueDni=txtDni.getText();

        boolean allFieldsValid = true;

        if(Helpers.verifyPattern("^[0-9]{8}$", tempValueDni)){

            txtDni.setBackground(new Color(255, 255, 255));
            lblDni.setText("...");
            lblDni.setForeground(Color.black);
            //columna[0]= txtDni.getText().trim();

        }else{
            txtDni.setBackground(new Color(255, 161, 161));
            lblDni.setText("Formato Incorrecto");
            lblDni.setForeground(Color.red);
            allFieldsValid = false;
        }

        String tempValueNombre=txtNombre.getText();

        if(Helpers.verifyPattern("^([a-zA-Z]\s?)+([a-zA-Z]+)?$", tempValueNombre)){
            txtNombre.setBackground(new Color(255, 255, 255));
            lblNombre.setText("...");
            lblNombre.setForeground(Color.black);

            //columna[1]= txtNombre.getText().trim();

        }else{
            txtNombre.setBackground(new Color(255, 161, 161));
            lblNombre.setText("Formato Incorrecto");
            lblNombre.setForeground(Color.red);
            allFieldsValid = false;
        }
        String tempValueApellido=txtApellido.getText();

        if(Helpers.verifyPattern("^([a-zA-Z]\s?)+([a-zA-Z]+)?$", tempValueApellido)){

            txtApellido.setBackground(new Color(255, 255, 255));
            lblApellido.setText("...");
            lblApellido.setForeground(Color.black);
            //columna[2]= txtApellido.getText().trim();

        }else{
            txtApellido.setBackground(new Color(255, 161, 161));
            lblApellido.setText("Formato Incorrecto");
            lblApellido.setForeground(Color.red);
            allFieldsValid = false;
        }
        String tempValueTelefono=txtTelefono.getText();

        if(Helpers.verifyPattern("^9\\d{8}$", tempValueTelefono)){

            txtTelefono.setBackground(new Color(255, 255, 255));
            lblTelefono.setText("...");
            lblTelefono.setForeground(Color.black);
            // columna[4]= txtTelefono.getText().trim();

        }else{
            txtTelefono.setBackground(new Color(255, 161, 161));
            lblTelefono.setText("Formato Incorrecto");
            lblTelefono.setForeground(Color.red);
            allFieldsValid = false;
        }

        String tempValueCorreo=txtCorreo.getText();

        if(Helpers.verifyPattern("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", tempValueCorreo)){

            txtCorreo.setBackground(new Color(255, 255, 255));
            lblCorreo.setText("...");
            lblCorreo.setForeground(Color.black);
            //   columna[3]= txtCorreo.getText().trim();

        }else{
            txtCorreo.setBackground(new Color(255, 161, 161));
            lblCorreo.setText("Formato Incorrecto");
            lblCorreo.setForeground(Color.red);
            allFieldsValid = false;
        }
        // dtm.addRow(columna);
        
        if (allFieldsValid) {
            // Si todos los campos son válidos, agregar la fila al JTable
            columna[0]= txtDni.getText().trim();
            columna[1]= txtNombre.getText().trim();
            columna[2]= txtApellido.getText().trim();
            columna[3]= txtCorreo.getText().trim();
            columna[4]= txtTelefono.getText().trim();
            dtm.addRow(columna);

            // Limpiar los campos
             limpiarTxt();
        } else {
            // Si algún campo es inválido, no agregar la fila y notificar al usuario
            JOptionPane.showMessageDialog(this, "Por favor, corrija los campos resaltados en rojo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed
    //button para crear
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

           // Limpiar los campos
           limpiarTxt();
           limpiarLbl_ColorTxt();
    }//GEN-LAST:event_btnCrearActionPerformed
public void limpiarTxt(){
             txtDni.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtCorreo.setText("");
            txtTelefono.setText(""); 
}
public void limpiarLbl_ColorTxt(){
             lblDni.setText("");
            lblNombre.setText("");
            lblApellido.setText("");
            lblCorreo.setText("");
            lblTelefono.setText("");
            
             txtDni.setBackground(Color.white);
             txtNombre.setBackground(Color.white);
             txtApellido.setBackground(Color.white);
             txtCorreo.setBackground(Color.white);
             txtTelefono.setBackground(Color.white);
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
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tPersonas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
