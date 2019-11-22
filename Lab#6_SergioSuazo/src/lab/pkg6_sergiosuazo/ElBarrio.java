
package lab.pkg6_sergiosuazo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ElBarrio extends javax.swing.JFrame {
    static ArrayList<Producto> inventario;
    static String cotizacion=("      Supermercado El Barrio      \n"
            + "Factura # \n"
            + "Produc.   Cant   Precio\n");

    static int cont=1;
    static Inventario i = new Inventario("./Bebidas");
    public ElBarrio() {
        initComponents();
        inventario=new ArrayList<>();
        i.cargarArchivo();
        inventario=i.getInventario();
        String nombre,marca,region,colorante="";
        int codigo,precio,cantidad,azucar,alcohol,lote;
        Date fecha; 
        
        for (int j = 0; j < inventario.size(); j++) {
            nombre=inventario.get(j).getNombre();
            marca=inventario.get(j).getMarca();
            region=inventario.get(j).getRegion();
            colorante=inventario.get(j).getColorante();
            codigo=inventario.get(j).getCodigo();
            precio=inventario.get(j).getPrecio();
            cantidad=inventario.get(j).getCantidad();
            azucar=inventario.get(j).getAzucar();
            alcohol=inventario.get(j).getAlcohol();
            lote=inventario.get(j).getLote();
            fecha=inventario.get(j).getFecha();
            
            Object[]newrow ={nombre,marca,region,colorante,codigo,precio,cantidad,azucar,alcohol,lote,fecha};
            DefaultTableModel modelo=(DefaultTableModel) jt_inventario.getModel();
            modelo.addRow(newrow);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cotizacion = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_cotizacion = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_inventario = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        js_precio = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        js_cantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        js_azucar = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        js_alcohol = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dc_fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        js_lote = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        cb_region = new javax.swing.JComboBox<>();
        cb_azul = new javax.swing.JCheckBox();
        cb_rojo = new javax.swing.JCheckBox();
        cb_verde = new javax.swing.JCheckBox();
        cb_amarillo = new javax.swing.JCheckBox();
        cb_blanco = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_cotizacion = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jl_cotizacion.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_cotizacion);

        jLabel12.setText("Elija los productos que desea comprar");

        jButton8.setText("Agregar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Cotizar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CotizacionLayout = new javax.swing.GroupLayout(Cotizacion.getContentPane());
        Cotizacion.getContentPane().setLayout(CotizacionLayout);
        CotizacionLayout.setHorizontalGroup(
            CotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CotizacionLayout.createSequentialGroup()
                .addGroup(CotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CotizacionLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CotizacionLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(CotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CotizacionLayout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9))
                            .addComponent(jLabel12))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        CotizacionLayout.setVerticalGroup(
            CotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CotizacionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(CotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jt_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Region", "Colorizante", "Codigo", "Precio", "Cantidad", "Azucar (En Oz.)", "Alcohol %", "Lote", "Fecha de Vencimiento"
            }
        ));
        jScrollPane2.setViewportView(jt_inventario);

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario", jPanel1);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Codigo: ");

        jLabel4.setText("Precio:  ");

        js_precio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        js_precio.setToolTipText("");

        jLabel5.setText("Cantidad: ");

        js_cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel6.setText("Cantidad de Azucar: ");

        js_azucar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel7.setText("Porcentaje de Alcohol: ");

        js_alcohol.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jButton2.setText("Agregar Al Inventario");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel8.setText("Fecha de Vencimiento");

        jLabel10.setText("Lote: ");

        js_lote.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel11.setText("Region");

        cb_region.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nacional", "internacional" }));

        cb_azul.setText("Azul-4");

        cb_rojo.setText("Rojo-69");

        cb_verde.setText("Verde-420");

        cb_amarillo.setText("Amarillo-77");

        cb_blanco.setText("Blanco-07");

        jLabel13.setText("Colorantes: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombre)
                                    .addComponent(tf_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_marca)
                                    .addComponent(cb_region, 0, 157, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(js_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(js_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(js_azucar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(js_alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(cb_azul)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_rojo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_verde)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_amarillo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_blanco)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(js_lote, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cb_region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(js_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(js_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(js_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(js_azucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(js_alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dc_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_azul)
                    .addComponent(cb_rojo)
                    .addComponent(cb_verde)
                    .addComponent(cb_amarillo)
                    .addComponent(cb_blanco))
                .addGap(46, 46, 46)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("Agregar Producto", jPanel2);

        ta_cotizacion.setColumns(20);
        ta_cotizacion.setRows(5);
        jScrollPane1.setViewportView(ta_cotizacion);

        jButton3.setText("Crear Cotizacion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Limpiar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cotizacion", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
        String nombre,marca,region,colorante="";
        int codigo,precio,cantidad,azucar,alcohol,lote;
        Date fecha;
        
        nombre=tf_nombre.getText();
        marca=tf_marca.getText();
        codigo=Integer.parseInt(tf_codigo.getText());
        region=cb_region.getSelectedItem().toString();
        precio=(Integer)js_precio.getValue();
        cantidad=(Integer)js_cantidad.getValue();
        azucar=(Integer)js_azucar.getValue();
        alcohol=(Integer)js_alcohol.getValue();
        lote=(Integer)js_lote.getValue();
        fecha=dc_fecha.getDate();
            if(cb_azul.isSelected())
            {
                colorante+="Azul-4 ,";
            }
            if(cb_rojo.isSelected())
            {
                colorante+="Rojo-69 ,";
            }
            if(cb_verde.isSelected())
            {
                colorante+="Verde-420 ,";
            }
            if(cb_amarillo.isSelected())
            {
                colorante+="Amarillo-77 ,";
            }
            if(cb_blanco.isSelected())
            {
                colorante+="Blanco-07 ,";
            }
        Producto p=new Producto(nombre, marca, region, colorante, codigo, precio, cantidad, azucar, alcohol, lote, fecha);

        i.getInventario().add(p);
        i.escribirArchivo();
        Object[]newrow ={nombre,marca,region,colorante,codigo,precio,cantidad,azucar,alcohol,lote,fecha};
        DefaultTableModel modelo=(DefaultTableModel) jt_inventario.getModel();
        modelo.addRow(newrow);
        jt_inventario.setModel(modelo);
        JOptionPane.showMessageDialog(this, "Se agrego la bebida exitosamente");
        tf_nombre.setText("");
        tf_marca.setText("");
        tf_codigo.setText("");
        cb_region.setSelectedItem(0);
        js_precio.setValue(0);
        js_cantidad.setValue(0);
        js_azucar.setValue(0);
        js_alcohol.setValue(0);
        js_lote.setValue(0);
        dc_fecha.setDate(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Cotizacion.setVisible(true);
        Cotizacion.pack();
        DefaultListModel m = (DefaultListModel)jl_cotizacion.getModel();
        for (int i = 0; i < 10; i++) {
           m.addElement(inventario.get(i)); 
        }
       jl_cotizacion.setModel(m);
        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        if(jl_cotizacion.getSelectedIndex()>=0)
        {
            int pos=jl_cotizacion.getSelectedIndex();
            int cantidad;
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad a agregar: "));
            int total;
            String producto;
            total=inventario.get(pos).getPrecio();
            producto=inventario.get(pos).getNombre();
            cotizacion+=producto+"   "+cantidad+"     "+String.valueOf(total)+"\n";
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun producto");
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        ta_cotizacion.setText(cotizacion);
        
    }//GEN-LAST:event_jButton9MouseClicked

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
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElBarrio().setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Cotizacion;
    private javax.swing.JCheckBox cb_amarillo;
    private javax.swing.JCheckBox cb_azul;
    private javax.swing.JCheckBox cb_blanco;
    private javax.swing.JComboBox<String> cb_region;
    private javax.swing.JCheckBox cb_rojo;
    private javax.swing.JCheckBox cb_verde;
    private com.toedter.calendar.JDateChooser dc_fecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jl_cotizacion;
    private javax.swing.JSpinner js_alcohol;
    private javax.swing.JSpinner js_azucar;
    private javax.swing.JSpinner js_cantidad;
    private javax.swing.JSpinner js_lote;
    private javax.swing.JSpinner js_precio;
    private javax.swing.JTable jt_inventario;
    private javax.swing.JTextArea ta_cotizacion;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables

}
