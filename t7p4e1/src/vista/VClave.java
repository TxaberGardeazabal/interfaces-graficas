/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import t7p4e1.T7p4e1;
/**
 *
 * @author txaber
 */
public class VClave extends javax.swing.JFrame {

    
    private static String codigo = "";
    private static int[] numeros;
    private int contador = 0;
    /**
     * Creates new form VClave
     */
    public VClave() {
        initComponents();
        setLocationRelativeTo(null);
        iniciarBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNIF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        pfClave = new javax.swing.JPasswordField();
        bnum1 = new javax.swing.JButton();
        bnum2 = new javax.swing.JButton();
        bnum3 = new javax.swing.JButton();
        bnum4 = new javax.swing.JButton();
        bnum6 = new javax.swing.JButton();
        bnum7 = new javax.swing.JButton();
        bnum5 = new javax.swing.JButton();
        bnum8 = new javax.swing.JButton();
        bnum10 = new javax.swing.JButton();
        bnum9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIF");

        tfNIF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNIFFocusLost(evt);
            }
        });

        jLabel2.setText("Clave");

        jLabel3.setText("Sin puntos, guiones o blancos");

        bEntrar.setText("entrar");
        bEntrar.setEnabled(false);
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        pfClave.setEditable(false);

        bnum1.setEnabled(false);
        bnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum1ActionPerformed(evt);
            }
        });

        bnum2.setEnabled(false);
        bnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum2ActionPerformed(evt);
            }
        });

        bnum3.setEnabled(false);
        bnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum3ActionPerformed(evt);
            }
        });

        bnum4.setEnabled(false);
        bnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum4ActionPerformed(evt);
            }
        });

        bnum6.setEnabled(false);
        bnum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum6ActionPerformed(evt);
            }
        });

        bnum7.setEnabled(false);
        bnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum7ActionPerformed(evt);
            }
        });

        bnum5.setEnabled(false);
        bnum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum5ActionPerformed(evt);
            }
        });

        bnum8.setEnabled(false);
        bnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum8ActionPerformed(evt);
            }
        });

        bnum10.setEnabled(false);
        bnum10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum10ActionPerformed(evt);
            }
        });

        bnum9.setEnabled(false);
        bnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnum9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(tfNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(53, 53, 53)
                                    .addComponent(pfClave, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bEntrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnum10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnum1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(bnum3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnum4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnum5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnum7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bnum10, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(bnum6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnum8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnum9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEntrar)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        if (T7p4e1.validarCodigo(codigo)) 
            T7p4e1.acceder();
        else {
            JOptionPane.showMessageDialog(this, "clave incorrecta");
            pfClave.setText("");
            codigo = "";
            contador = 0;
        }
    }//GEN-LAST:event_bEntrarActionPerformed

    private void tfNIFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNIFFocusLost
        
        if (tfNIF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "debe introducir su dni");
        }
        else {
            Pattern patt = Pattern.compile("^[0-9]{8}[A-Z]{1}$");
            Matcher matt = patt.matcher(tfNIF.getText());
            
            if (!matt.matches())
                JOptionPane.showMessageDialog(null, "el DNI es incorrecto");
            else {
                if (!T7p4e1.validarCliente(tfNIF.getText())) {
                    JOptionPane.showMessageDialog(this, "usted no esta dado de alta");
                }
                else {
                
                    tfNIF.setEditable(false);
                    bnum1.setEnabled(true);
                    bnum2.setEnabled(true);
                    bnum3.setEnabled(true);
                    bnum4.setEnabled(true);
                    bnum5.setEnabled(true);
                    bnum6.setEnabled(true);
                    bnum7.setEnabled(true);
                    bnum8.setEnabled(true);
                    bnum9.setEnabled(true);
                    bnum10.setEnabled(true);
                    bEntrar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_tfNIFFocusLost

    private void bnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum1ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum1.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum1ActionPerformed

    private void bnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum2ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum2.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum2ActionPerformed

    private void bnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum3ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum3.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum3ActionPerformed

    private void bnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum4ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum4.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum4ActionPerformed

    private void bnum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum5ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum5.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum5ActionPerformed

    private void bnum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum6ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum6.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum6ActionPerformed

    private void bnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum7ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum7.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum7ActionPerformed

    private void bnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum8ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum8.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum8ActionPerformed

    private void bnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum9ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum9.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum9ActionPerformed

    private void bnum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnum10ActionPerformed
        if (contador != 6) {
            pfClave.setText(pfClave.getText() + "*");
            
            codigo += bnum10.getText();
            contador ++;
        }
    }//GEN-LAST:event_bnum10ActionPerformed

    private void iniciarBotones() {
        numeros = new int[10];
        Arrays.fill(numeros, 10);
        int num;
        for (int a = 0;a < numeros.length;a++) {
            do {
                num =(int) (Math.random() * 10);
                
            } while (secuenciaNumerica(num,a));
        }
        
        javax.swing.JButton[] b = {bnum1,bnum2,bnum3,bnum4,bnum5,bnum6,bnum7,bnum8,bnum9,bnum10};
        
        for (int c = 0;c < b.length;c++) {
            b[c].setText(Integer.toString(numeros[c]));
        }
    }
    
    private static boolean secuenciaNumerica(int num, int contador) {
        for (int x = 0;x < 10;x++) {
            if (numeros[x] == num)
                return true;
        }
        numeros[contador] = num;
        return false;
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
            java.util.logging.Logger.getLogger(VClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bnum1;
    private javax.swing.JButton bnum10;
    private javax.swing.JButton bnum2;
    private javax.swing.JButton bnum3;
    private javax.swing.JButton bnum4;
    private javax.swing.JButton bnum5;
    private javax.swing.JButton bnum6;
    private javax.swing.JButton bnum7;
    private javax.swing.JButton bnum8;
    private javax.swing.JButton bnum9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pfClave;
    private javax.swing.JTextField tfNIF;
    // End of variables declaration//GEN-END:variables
}