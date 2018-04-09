/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import code.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author MemoBG
 */
public class Main extends javax.swing.JFrame {
    Congruential congruential;
    ChiSquare chiSquare;
    /**
     * Method para detectar si son long o no
     */
    private boolean isNumber(String number) {
        try {
            Long.parseLong(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean isFloat(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);

        // ==== table ====
        table.setFillsViewportHeight(true);
        table.setEnabled(false);
        JTableHeader header = table.getTableHeader();
        header.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        // ==== text field ====
        lblM.setVisible(false);
        txtM.setVisible(false);
        txtA.setVisible(false);
        lblA.setVisible(false);
        lblC.setVisible(false);
        txtC.setVisible(false);
        lblAlpha.setVisible(false);
        txtAlpha.setVisible(false);

        // ==== text field ====
        txtX.setText("");

        // ==== buttons ====
        btnChiCuadrada.setVisible(false);
        btnKolmogorov.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnKolmogorov = new javax.swing.JButton();
        btnChiCuadrada = new javax.swing.JButton();
        lblAlpha = new javax.swing.JLabel();
        txtAlpha = new javax.swing.JTextField();
        pnlSide = new javax.swing.JPanel();
        pnlRadio = new javax.swing.JPanel();
        rdQuadraticCenter = new javax.swing.JRadioButton();
        rdMultiplicativeGenerator = new javax.swing.JRadioButton();
        rdCongruential = new javax.swing.JRadioButton();
        rdMixedCongruential = new javax.swing.JRadioButton();
        sprB = new javax.swing.JSeparator();
        pnlText = new javax.swing.JPanel();
        txtX = new javax.swing.JTextField();
        lblX = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        btnRun = new javax.swing.JButton();
        sprA = new javax.swing.JSeparator();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de Número Random");
        setBackground(new java.awt.Color(1, 1, 1));
        setResizable(false);

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        lblTitle.setFont(new java.awt.Font("Skia", 1, 36)); // NOI18N
        lblTitle.setText("Generador de números random");

        scroll.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "n", "Generador", "Operación", "No Aleatorio", "Ri"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        scroll.setViewportView(table);

        btnKolmogorov.setBackground(new java.awt.Color(53, 30, 82));
        btnKolmogorov.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        btnKolmogorov.setForeground(new java.awt.Color(255, 255, 255));
        btnKolmogorov.setText("Kolmogorv-Smirnov");
        btnKolmogorov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKolmogorovActionPerformed(evt);
            }
        });

        btnChiCuadrada.setBackground(new java.awt.Color(64, 84, 178));
        btnChiCuadrada.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        btnChiCuadrada.setForeground(new java.awt.Color(255, 255, 255));
        btnChiCuadrada.setText("Chi-Cuadrada");
        btnChiCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiCuadradaActionPerformed(evt);
            }
        });

        lblAlpha.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblAlpha.setText("alpha:");

        txtAlpha.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        txtAlpha.setText("0.05");
        txtAlpha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlphaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBackLayout.createSequentialGroup()
                                .addComponent(lblAlpha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAlpha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChiCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnKolmogorov, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKolmogorov, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChiCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlpha)
                    .addComponent(txtAlpha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlSide.setBackground(new java.awt.Color(41, 45, 49));

        pnlRadio.setBackground(new java.awt.Color(41, 45, 49));
        pnlRadio.setForeground(new java.awt.Color(255, 255, 255));

        rdQuadraticCenter.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdQuadraticCenter.setForeground(new java.awt.Color(255, 255, 255));
        rdQuadraticCenter.setSelected(true);
        rdQuadraticCenter.setText("Centros de los cuadrados");
        rdQuadraticCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdQuadraticCenterActionPerformed(evt);
            }
        });

        rdMultiplicativeGenerator.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdMultiplicativeGenerator.setForeground(new java.awt.Color(255, 255, 255));
        rdMultiplicativeGenerator.setText("Generador multiplicativo");
        rdMultiplicativeGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMultiplicativeGeneratorActionPerformed(evt);
            }
        });

        rdCongruential.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdCongruential.setForeground(new java.awt.Color(255, 255, 255));
        rdCongruential.setText("Congruencial");
        rdCongruential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCongruentialActionPerformed(evt);
            }
        });

        rdMixedCongruential.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdMixedCongruential.setForeground(new java.awt.Color(255, 255, 255));
        rdMixedCongruential.setText("Congruencial Mixto");
        rdMixedCongruential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMixedCongruentialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRadioLayout = new javax.swing.GroupLayout(pnlRadio);
        pnlRadio.setLayout(pnlRadioLayout);
        pnlRadioLayout.setHorizontalGroup(
            pnlRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRadioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdMixedCongruential)
                    .addComponent(rdCongruential)
                    .addComponent(rdMultiplicativeGenerator)
                    .addComponent(rdQuadraticCenter))
                .addGap(18, 18, 18))
        );
        pnlRadioLayout.setVerticalGroup(
            pnlRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRadioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdQuadraticCenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdMultiplicativeGenerator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdCongruential)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdMixedCongruential)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlText.setBackground(new java.awt.Color(41, 45, 49));

        txtX.setText("0");

        lblX.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblX.setForeground(new java.awt.Color(255, 255, 255));
        lblX.setText("x:");

        lblM.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblM.setForeground(new java.awt.Color(255, 255, 255));
        lblM.setText("m:");

        txtM.setText("0");

        txtA.setText("0");
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblA.setForeground(new java.awt.Color(255, 255, 255));
        lblA.setText("a:");

        lblC.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblC.setForeground(new java.awt.Color(255, 255, 255));
        lblC.setText("c:");

        txtC.setText("0");
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTextLayout = new javax.swing.GroupLayout(pnlText);
        pnlText.setLayout(pnlTextLayout);
        pnlTextLayout.setHorizontalGroup(
            pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblM)
                    .addComponent(lblX)
                    .addComponent(lblA)
                    .addComponent(lblC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtM)
                    .addComponent(txtA)
                    .addComponent(txtC)
                    .addComponent(txtX))
                .addGap(67, 67, 67))
        );
        pnlTextLayout.setVerticalGroup(
            pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX))
                .addGap(18, 18, 18)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblM))
                .addGap(18, 18, 18)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA))
                .addGap(18, 18, 18)
                .addGroup(pnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        btnRun.setBackground(new java.awt.Color(218, 56, 73));
        btnRun.setFont(new java.awt.Font("Sinhala Sangam MN", 1, 18)); // NOI18N
        btnRun.setForeground(new java.awt.Color(255, 255, 255));
        btnRun.setText("Ejecutar");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        lblIcon.setForeground(new java.awt.Color(255, 255, 255));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/shuffle.png"))); // NOI18N

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblIcon)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSideLayout.createSequentialGroup()
                                .addComponent(sprA, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addComponent(sprB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprA, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdQuadraticCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdQuadraticCenterActionPerformed
        if (rdQuadraticCenter.isSelected()) {
            rdMultiplicativeGenerator.setSelected(false);
            rdCongruential.setSelected(false);
            rdMixedCongruential.setSelected(false);

            lblM.setVisible(false);
            txtM.setVisible(false);
            txtA.setVisible(false);
            lblA.setVisible(false);
            lblC.setVisible(false);
            txtC.setVisible(false);
            lblAlpha.setVisible(false);
            txtAlpha.setVisible(false);
            btnChiCuadrada.setVisible(false);
            btnKolmogorov.setVisible(false);

            // ==== text field ====
            txtX.setText("");

            // Modelo para poder imprimir en la tabla
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            // Elimina datos anteriores de la tabala
            model.setRowCount(0);
        }
    }//GEN-LAST:event_rdQuadraticCenterActionPerformed

    private void rdMultiplicativeGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMultiplicativeGeneratorActionPerformed
        if (rdMultiplicativeGenerator.isSelected()) {
            rdQuadraticCenter.setSelected(false);
            rdCongruential.setSelected(false);
            rdMixedCongruential.setSelected(false);
            
            congruential = null;
            
            lblM.setVisible(true);
            txtM.setVisible(true);
            txtA.setVisible(true);
            lblA.setVisible(true);
            lblC.setVisible(false);
            txtC.setVisible(false);
            lblAlpha.setVisible(false);
            txtAlpha.setVisible(false);
            btnChiCuadrada.setVisible(false);
            btnKolmogorov.setVisible(false);

            // ==== text field ====
            txtX.setText("");
            txtA.setText("");
            txtM.setText("");

            // Modelo para poder imprimir en la tabla
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            // Elimina datos anteriores de la tabala
            model.setRowCount(0);
        }
    }//GEN-LAST:event_rdMultiplicativeGeneratorActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        //Variable para detectar si es numero o no
        //boolean isNumber = false;
        long x = 0, a = 0, c = 0, m = 0;
        boolean flagx, flaga, flagm, flagc;
        flagx = flaga = flagm = flagc = false;
        if (isNumber(txtX.getText())) {
            x = Long.parseLong(txtX.getText());
            flagx = true;
        } else {
            JFrame frame = new JFrame("Alerta");
            JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                    + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
        }
        if (isNumber(txtA.getText())) {
            a = Long.parseLong(txtA.getText());
            flaga = true;
        } else {
            JFrame frame = new JFrame("Alerta");
            JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                    + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
        }
        if (isNumber(txtC.getText())) {
            c = Long.parseLong(txtC.getText());
            flagc = true;
        } else {
            JFrame frame = new JFrame("Alerta");
            JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                    + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
        }
        if (isNumber(txtM.getText())) {
            m = Long.parseLong(txtM.getText());
            flagm = true;
        } else {
            JFrame frame = new JFrame("Alerta");
            JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                    + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
        }

        if (rdQuadraticCenter.isSelected()) {
            //QuadraticCenter quadratic;
            //System.out.println(isNumber(Long.toString(x)));
            if (!(x < 0) && flagx) {
                QuadraticCenter quadratic = new QuadraticCenter(x);
                quadratic.calculate();
                array = quadratic.getArray();
            } else if (x < 0) {
                JFrame frame = new JFrame("Alerta");
                JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                        + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
            }
        }
        if (rdMultiplicativeGenerator.isSelected()) {
            if (!(x < 0) && !(a < 0) && !(m < 0) && (flagx || flaga || flagm)) {
                congruential = new Congruential(x, a, m);
                congruential.calculate();
                array = congruential.getArray();
                lblAlpha.setVisible(true);
                txtAlpha.setVisible(true);
                btnChiCuadrada.setVisible(true);
                btnKolmogorov.setVisible(true);
            } else if (x < 0 || a < 0 || m < 0) {
                JFrame frame = new JFrame("Alerta");
                JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                        + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
            }
        }
        if (rdCongruential.isSelected()) {
            if (!(x < 0) && !(a < 0) && !(m < 0) && !(c < 0) && flagx && flaga && flagm && flagc) {
                congruential = new Congruential(x, a, c, m);
                congruential.calculate();
                array = congruential.getArray();
                lblAlpha.setVisible(true);
                txtAlpha.setVisible(true);
                btnChiCuadrada.setVisible(true);
                btnKolmogorov.setVisible(true);
            } else if (x < 0 || a < 0 || m < 0 || c < 0) {
                JFrame frame = new JFrame("Alerta");
                JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                        + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
            }
        }
        if (rdMixedCongruential.isSelected()) {
            if (!(x < 0) && !(a < 0) && !(m < 0) && !(c < 0) && flagx && flaga && flagm && flagc) {
                congruential = new Congruential(x, a, c, m);
                //JFrame frame = new JFrame("Alerta");
                //JOptionPane.showMessageDialog(frame, congruential.hullDobell());
                congruential.calculate();
                array = congruential.getArray();
                if(array.length==m+1){
                    JOptionPane.showMessageDialog(null, "Es periodo completo");
                }
                else{
                    JOptionPane.showMessageDialog(null, "No es periodo completo");
                }
                lblAlpha.setVisible(true);
                txtAlpha.setVisible(true);
                btnChiCuadrada.setVisible(true);
                btnKolmogorov.setVisible(true);
            } else if (x < 0 || a < 0 || m < 0 || c < 0) {
                JFrame frame = new JFrame("Alerta");
                JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números enteros y que sean positivos."
                        + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
            }
        }

        // Modelo para poder imprimir en la tabla
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        // Elimina datos anteriores de la tabala
        model.setRowCount(0);
        // Imprime resultado en la tabla
        if (array != null) {
            for (String[] row : array) {
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnRunActionPerformed

    private void rdCongruentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCongruentialActionPerformed
        if (rdCongruential.isSelected()) {
            rdQuadraticCenter.setSelected(false);
            rdMultiplicativeGenerator.setSelected(false);
            rdMixedCongruential.setSelected(false);
            
            congruential = null;
            
            lblM.setVisible(true);
            txtM.setVisible(true);
            txtA.setVisible(true);
            lblA.setVisible(true);
            lblC.setVisible(true);
            txtC.setVisible(true);
            lblAlpha.setVisible(false);
            txtAlpha.setVisible(false);
            btnChiCuadrada.setVisible(false);
            btnKolmogorov.setVisible(false);

            // ==== text field ====
            txtX.setText("");
            txtA.setText("");
            txtM.setText("");
            txtC.setText("");

            // Modelo para poder imprimir en la tabla
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            // Elimina datos anteriores de la tabala
            model.setRowCount(0);
        }
    }//GEN-LAST:event_rdCongruentialActionPerformed

    private void rdMixedCongruentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMixedCongruentialActionPerformed
        if (rdMixedCongruential.isSelected()) {
            rdQuadraticCenter.setSelected(false);
            rdMultiplicativeGenerator.setSelected(false);
            rdCongruential.setSelected(false);
            
            congruential = null;
            
            lblM.setVisible(true);
            txtM.setVisible(true);
            txtA.setVisible(true);
            lblA.setVisible(true);
            lblC.setVisible(true);
            txtC.setVisible(true);
            lblAlpha.setVisible(false);
            txtAlpha.setVisible(false);
            btnChiCuadrada.setVisible(false);
            btnKolmogorov.setVisible(false);

            // ==== text field ====
            txtX.setText("");
            txtA.setText("");
            txtM.setText("");
            txtC.setText("");

            // Modelo para poder imprimir en la tabla
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            // Elimina datos anteriores de la tabala
            model.setRowCount(0);
        }
    }//GEN-LAST:event_rdMixedCongruentialActionPerformed

    private void txtAlphaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlphaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlphaActionPerformed

    private void btnChiCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiCuadradaActionPerformed

        // ####### CHI CUADRADA #######
        String message = getAlphaValidationMessage();
        if(message == null){
            double alpha = Double.parseDouble(txtAlpha.getText());
            String result = congruential.chiTest(alpha);
            JOptionPane.showMessageDialog(null, result);
        }
        else{
            JOptionPane.showMessageDialog(null, message);
        }

    }//GEN-LAST:event_btnChiCuadradaActionPerformed

    private void btnKolmogorovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKolmogorovActionPerformed

        // ####### KOLMOGOROV #######
        String message = getAlphaValidationMessage();
        if(message == null){
            // #### PROGRAMA AQUÍ #####
            double alpha = 0;
            if (isFloat(txtAlpha.getText()) && congruential != null) {
                alpha = Double.parseDouble(txtAlpha.getText());
                String result = congruential.kolmoTest(alpha);
                JOptionPane.showMessageDialog(null, result);
            } else {
                JFrame frame = new JFrame("Alerta");
                JOptionPane.showMessageDialog(frame, "El sistema sólo acepta números decimales positivos."
                        + "\nNo se pueden ingresar números mayores a 9,223,327,036,854,775,807.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, message);
        }

    }//GEN-LAST:event_btnKolmogorovActionPerformed

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
                new Main().setVisible(true);
            }
        });
    }
    // Varibles declaration
    String array[][];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiCuadrada;
    private javax.swing.JButton btnKolmogorov;
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblAlpha;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlRadio;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlText;
    private javax.swing.JRadioButton rdCongruential;
    private javax.swing.JRadioButton rdMixedCongruential;
    private javax.swing.JRadioButton rdMultiplicativeGenerator;
    private javax.swing.JRadioButton rdQuadraticCenter;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator sprA;
    private javax.swing.JSeparator sprB;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAlpha;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables

    private String getAlphaValidationMessage() {
        String message = "El alpha no es valido. Intenta con 0.2, 0.1, 0.05, 0.02, 0.01, 0.005, 0.002 o 0.001";
        try {
            double alpha = Double.parseDouble(txtAlpha.getText());
            Double [] alphaList = {0.2, 0.1, 0.05, 0.02, 0.01, 0.005, 0.002, 0.001};
            for(Double posibleAlpha : alphaList){
                if(alpha ==posibleAlpha){
                    message = null;
                }
            }
        } catch (NumberFormatException nfe) {
            message = "La entra de Alpha debe ser un número decimal y no un texto.";
        }
        return message;
    }
}
