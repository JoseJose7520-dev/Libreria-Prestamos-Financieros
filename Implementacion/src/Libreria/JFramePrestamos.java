
package Libreria;
/**
 * La clase {@code JFramePrestamos} implementa la interfaz gráfica de usuario (GUI) 
 * para interactuar con la clase {@code PrestamosFinancieros}. Permite al usuario
 * calcular:
 * 
 * <ul>
 *   <li>Interés simple</li>
 *   <li>Interés compuesto</li>
 *   <li>Monto final con interés simple</li>
 *   <li>Monto final con interés compuesto</li>
 *   <li>Pago mensual</li>
 * </ul>
 * 
 * <p>Presenta campos de entrada para capital, tasa y tiempo, y un combo box
 * para elegir el tipo de cálculo financiero a realizar. Muestra el resultado
 * en pantalla de forma clara y ordenada.
 * 
 * @author HP
 */

public class JFramePrestamos extends javax.swing.JFrame {
    /**
     * Constructor que inicializa los componentes de la ventana.
     */
    public JFramePrestamos() {
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

        lblTitulo = new javax.swing.JLabel();
        lblCapital = new javax.swing.JLabel();
        lblTasa = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblTipoCalculo = new javax.swing.JLabel();
        txtCapital = new javax.swing.JTextField();
        txtTasa = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        cbTipoCalculo = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        lblResultadoFinal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setText("Calculadora Prestamos Financieros");

        lblCapital.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblCapital.setText("Capital:");

        lblTasa.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblTasa.setText("Tasa (Decimal):");

        lblTiempo.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblTiempo.setText("Tiempo:");

        lblTipoCalculo.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblTipoCalculo.setText("Tipo Calculo:");

        cbTipoCalculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interés Simple", "Interés Compuesto", "Monto Final Simple", "Monto Final Compuesto", "Pago Mensual" }));
        cbTipoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoCalculoActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResultadoFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel1.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTasa)
                            .addComponent(lblCapital, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTiempo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoCalculo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcular)
                                    .addComponent(cbTipoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(lblResultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapital)
                    .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTasa)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTiempo)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoCalculo)
                            .addComponent(cbTipoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoCalculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoCalculoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
         try {
            double capital = Double.parseDouble(txtCapital.getText());
            double tasa = Double.parseDouble(txtTasa.getText());
            int tiempo = Integer.parseInt(txtTiempo.getText());
            String seleccion = (String) cbTipoCalculo.getSelectedItem();
            double resultado;

            switch (seleccion) {
                case "Interés Simple":
                    resultado = PrestamosFinancieros.calcularInteresSimple(capital, tasa, tiempo);
                    lblResultadoFinal.setText("Interés Simple: $" + String.format("%.2f", resultado));
                    break;
                case "Interés Compuesto":
                    resultado = PrestamosFinancieros.calcularInteresCompuesto(capital, tasa, tiempo);
                    lblResultadoFinal.setText("Interés Compuesto: $" + String.format("%.2f", resultado));
                    break;
                case "Monto Final Simple":
                    resultado = PrestamosFinancieros.calcularMontoFinalInteresSimple(capital, tasa, tiempo);
                    lblResultadoFinal.setText("Monto Final Simple: $" + String.format("%.2f", resultado));
                    break;
                case "Monto Final Compuesto":
                    resultado = PrestamosFinancieros.calcularMontoFinalInteresCompuesto(capital, tasa, tiempo);
                    lblResultadoFinal.setText("Monto Final Compuesto: $" + String.format("%.2f", resultado));
                    break;
                case "Pago Mensual":
                    double tasaMensual = PrestamosFinancieros.convertirTasaAnualAMensual(tasa);
                    resultado = PrestamosFinancieros.calcularPagoMensual(capital, tasaMensual, tiempo);
                    lblResultadoFinal.setText("Pago Mensual: $" + String.format("%.2f", resultado));
                    break;
                default:
                    lblResultadoFinal.setText("Seleccione un cálculo válido.");
            }

        } catch (NumberFormatException e) {
            lblResultadoFinal.setText("Error: Verifique sus entradas.");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * Método principal que inicia la aplicación de interfaz gráfica.
     * 
     * @param args argumentos de línea de comandos (no se usan en este programa)
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
            java.util.logging.Logger.getLogger(JFramePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbTipoCalculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCapital;
    private javax.swing.JLabel lblResultadoFinal;
    private javax.swing.JLabel lblTasa;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTipoCalculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtTasa;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
