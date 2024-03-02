
package principal;


public class MovimientoUni extends javax.swing.JPanel {
    private double velocidad;
    private double distanciaI;
     private double distanciaF;
    private double tiempo;

    public MovimientoUni() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        etqVelocidad = new javax.swing.JLabel();
        campoVelocidad = new javax.swing.JTextField();
        etqDistancia = new javax.swing.JLabel();
        campoDistanciaI = new javax.swing.JTextField();
        etqTiempo = new javax.swing.JLabel();
        campoTiempo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        etqResultado = new javax.swing.JLabel();
        etqDistancia1 = new javax.swing.JLabel();
        campoDistanciaF = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONE LA OPCIÓN A CALCULAR");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("2. Distancia I.");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("1. Velocidad.");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("3. Distancia F.");

        comboBox.setBackground(new java.awt.Color(255, 255, 255));
        comboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboBox.setForeground(new java.awt.Color(0, 0, 0));
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        comboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("4. Tiempo.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        etqVelocidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        etqVelocidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqVelocidad.setText("Velocidad:");

        campoVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        campoVelocidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        campoVelocidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etqDistancia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqDistancia.setForeground(new java.awt.Color(0, 0, 0));
        etqDistancia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqDistancia.setText("Distancia I:");

        campoDistanciaI.setBackground(new java.awt.Color(255, 255, 255));
        campoDistanciaI.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoDistanciaI.setForeground(new java.awt.Color(0, 0, 0));
        campoDistanciaI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etqTiempo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqTiempo.setForeground(new java.awt.Color(0, 0, 0));
        etqTiempo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqTiempo.setText("Tiempo:");

        campoTiempo.setBackground(new java.awt.Color(255, 255, 255));
        campoTiempo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoTiempo.setForeground(new java.awt.Color(0, 0, 0));
        campoTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcular.setBackground(new java.awt.Color(0, 102, 204));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        etqResultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqResultado.setForeground(new java.awt.Color(0, 0, 0));
        etqResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqResultado.setText("0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(etqResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(etqResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        etqDistancia1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqDistancia1.setForeground(new java.awt.Color(0, 0, 0));
        etqDistancia1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqDistancia1.setText("Distancia F:");

        campoDistanciaF.setBackground(new java.awt.Color(255, 255, 255));
        campoDistanciaF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoDistanciaF.setForeground(new java.awt.Color(0, 0, 0));
        campoDistanciaF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(etqDistancia)
                                        .addComponent(etqVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(etqDistancia1)
                                        .addComponent(etqTiempo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campoVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoDistanciaF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(campoDistanciaI, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(campoTiempo, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDistanciaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDistanciaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDistancia1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        int opcion = comboBox.getSelectedIndex();
        
        switch(opcion){
            case 0:
                campoVelocidad.setEnabled(false);
                campoDistanciaI.setEnabled(true);
                campoDistanciaF.setEnabled(true);
                campoTiempo.setEnabled(true);
                
                break; 
            case 1: 
                campoVelocidad.setEnabled(true);
                campoDistanciaI.setEnabled(false);
                campoDistanciaF.setEnabled(true);
                campoTiempo.setEnabled(true);
                break;
            case 2: 
                campoVelocidad.setEnabled(true);
                campoDistanciaI.setEnabled(true);
                campoDistanciaF.setEnabled(false);
                campoTiempo.setEnabled(true);
                break;
                
            case 3: 
                campoVelocidad.setEnabled(true);
                campoDistanciaI.setEnabled(true);
                campoDistanciaF.setEnabled(true);
                campoTiempo.setEnabled(false);
                break;
        }   
    }//GEN-LAST:event_comboBoxActionPerformed

    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
         int opcion = comboBox.getSelectedIndex();
        try {
             switch(opcion){
                case 0:
                    distanciaI = Double.parseDouble(campoDistanciaI.getText());
                    distanciaF = Double.parseDouble(campoDistanciaF.getText());
                    tiempo = Double.parseDouble(campoTiempo.getText());
                    velocidad = (distanciaF-distanciaI)/tiempo;
                    
                    etqResultado.setText("Velocidad: " + String.format("%.2f", velocidad));
                    System.out.println("La velocidad es: " + velocidad);
                    break;
                case 1:
                    distanciaF = Double.parseDouble(campoDistanciaF.getText());
                    velocidad = Double.parseDouble(campoVelocidad.getText());
                    tiempo = Double.parseDouble(campoTiempo.getText());
                    distanciaI = distanciaF - velocidad * tiempo;
                    etqResultado.setText("Distancia Inicial: " + String.format("%.2f", distanciaI));
                    System.out.println("La Distancia Inicial es: " + distanciaI);
                    break;
                case 2:
                    distanciaI = Double.parseDouble(campoDistanciaI.getText());
                    velocidad = Double.parseDouble(campoVelocidad.getText());
                    tiempo = Double.parseDouble(campoTiempo.getText());
                    distanciaF = distanciaI + velocidad * tiempo; 
                    etqResultado.setText("Distancia Final: " + String.format("%.2f", distanciaF));
                    System.out.println("La Distancia Final es: " + distanciaF);
                    break;
                case 3:
                    distanciaI = Double.parseDouble(campoDistanciaI.getText());
                    distanciaF = Double.parseDouble(campoDistanciaF.getText());
                    velocidad = Double.parseDouble(campoVelocidad.getText());
                    tiempo = (distanciaF -distanciaI)/velocidad;
                    etqResultado.setText("Tiempo: " + String.format("%.2f", tiempo));
                    System.out.println("El Tiempo es: " + tiempo);
                    break;                       
            }
        }catch (NumberFormatException e) {
            System.out.println("Error en los valores.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField campoDistanciaF;
    private javax.swing.JTextField campoDistanciaI;
    private javax.swing.JTextField campoTiempo;
    private javax.swing.JTextField campoVelocidad;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel etqDistancia;
    private javax.swing.JLabel etqDistancia1;
    private javax.swing.JLabel etqResultado;
    private javax.swing.JLabel etqTiempo;
    private javax.swing.JLabel etqVelocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
