/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasi2angka;

import pertambahan2angka.*;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import mainmenu.MainMenu;

/**
 *
 * @author acer
 */
public class Operasi2Angka extends javax.swing.JFrame {

    /**
     * Creates new form Pertambahan2Angka
     */
    public Operasi2Angka() {
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

        Panel1 = new javax.swing.JPanel();
        tambahButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        textangka1 = new javax.swing.JTextField();
        textangka2 = new javax.swing.JTextField();
        texthasil = new javax.swing.JTextField();
        kurangButton = new javax.swing.JButton();
        kaliButton = new javax.swing.JButton();
        bagiButton3 = new javax.swing.JButton();
        samadengan = new javax.swing.JLabel();
        operator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("OPERASI DUA ANGKA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        Panel1.setBackground(new java.awt.Color(153, 153, 153));
        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operasi Dua Angka", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        Panel1.setForeground(new java.awt.Color(0, 0, 0));
        Panel1.setName(""); // NOI18N

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Hapus");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Keluar");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        textangka1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textangka1KeyTyped(evt);
            }
        });

        textangka2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textangka2KeyTyped(evt);
            }
        });

        texthasil.setEnabled(false);

        kurangButton.setText("Kurang");
        kurangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangButtonActionPerformed(evt);
            }
        });

        kaliButton.setText("Kali");
        kaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliButtonActionPerformed(evt);
            }
        });

        bagiButton3.setText("Bagi");
        bagiButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiButton3ActionPerformed(evt);
            }
        });

        samadengan.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        samadengan.setForeground(new java.awt.Color(0, 0, 0));
        samadengan.setText("=");

        operator.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        operator.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(textangka1)
                        .addGap(41, 41, 41)
                        .addComponent(operator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(textangka2)
                        .addGap(36, 36, 36)
                        .addComponent(samadengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(texthasil))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(tambahButton, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kurangButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kaliButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bagiButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(operator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(samadengan, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textangka2)
                        .addComponent(texthasil))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(textangka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bagiButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kaliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kurangButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel1.getAccessibleContext().setAccessibleName("");
        Panel1.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(518, 198));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filterKeyTyped(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c)||
                (c == KeyEvent.VK_BACKSPACE)||
                (c == KeyEvent.VK_DELETE)||
                (c == KeyEvent.VK_ENTER )||
                (c == KeyEvent.VK_PERIOD))
               )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukan Hanya 0-9");
            evt.consume();
        }
    }
    
    private void erormsg(){
        JOptionPane.showMessageDialog(null, "Masukan Angka !!", "INFORMATION" , JOptionPane.INFORMATION_MESSAGE);  
    }
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed
        
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       // TODO add your handling code here:
       textangka1.setText(""); 
       textangka2.setText("");
       texthasil.setText("");
       operator.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        // TODO add your handling code here:
        if ((textangka1.getText().equals("")) ||
           textangka2.getText().equals("")){
        erormsg();
        }else{
        operator.setText("+");
        double hasil = Double.parseDouble(textangka1.getText()) + Double.parseDouble(textangka2.getText());
        texthasil.setText(String.valueOf(String.format("%.2f",hasil)));
        }
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void textangka1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textangka1KeyTyped
        // TODO add your handling code here:
        filterKeyTyped(evt);
    }//GEN-LAST:event_textangka1KeyTyped

    private void textangka2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textangka2KeyTyped
        // TODO add your handling code here:
        filterKeyTyped(evt);
    }//GEN-LAST:event_textangka2KeyTyped

    private void kurangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangButtonActionPerformed
        // TODO add your handling code here:
         if ((textangka1.getText().equals("")) ||
           textangka2.getText().equals("")){
        erormsg();
        }else{
        operator.setText("-");
        double hasil = Double.parseDouble(textangka1.getText()) - Double.parseDouble(textangka2.getText());
        texthasil.setText(String.valueOf(String.format("%.2f",hasil)));
        }
    }//GEN-LAST:event_kurangButtonActionPerformed

    private void kaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliButtonActionPerformed
        // TODO add your handling code here:
         if ((textangka1.getText().equals("")) ||
           textangka2.getText().equals("")){
        erormsg();
        }else{
        operator.setText("*");
        double hasil = Double.parseDouble(textangka1.getText()) * Double.parseDouble(textangka2.getText());
        texthasil.setText(String.valueOf(String.format("%.2f",hasil)));
        }
    }//GEN-LAST:event_kaliButtonActionPerformed

    private void bagiButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiButton3ActionPerformed
        // TODO add your handling code here:
         if ((textangka1.getText().equals("")) ||
           textangka2.getText().equals("")){
        erormsg();
        }else{
        operator.setText("/");
        double hasil = Double.parseDouble(textangka1.getText()) / Double.parseDouble(textangka2.getText());
        texthasil.setText(String.valueOf(String.format("%.2f",hasil)));
        }
    }//GEN-LAST:event_bagiButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Operasi2Angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operasi2Angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operasi2Angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operasi2Angka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operasi2Angka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton bagiButton3;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton kaliButton;
    private javax.swing.JButton kurangButton;
    private javax.swing.JLabel operator;
    private javax.swing.JLabel samadengan;
    private javax.swing.JButton tambahButton;
    private javax.swing.JTextField textangka1;
    private javax.swing.JTextField textangka2;
    private javax.swing.JTextField texthasil;
    // End of variables declaration//GEN-END:variables
}
