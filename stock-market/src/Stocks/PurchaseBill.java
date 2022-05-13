/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Stocks;

import java.awt.Graphics2D;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

import java.text.*;
import java.awt.print.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextArea;

public class PurchaseBill extends javax.swing.JFrame {

public PurchaseBill(){
    initComponents();
}
    public PurchaseBill(String cusname,TableModel model) throws PrinterException {
        initComponents();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        String time = dtf2.format(now);
        
        txtinvoice.setText(txtinvoice.getText() + "*******************************\n");
        txtinvoice.setText(txtinvoice.getText() + "      Purchase Invoice " + "\n");
        txtinvoice.setText(txtinvoice.getText() + "*******************************\n");
        txtinvoice.setText(txtinvoice.getText() + "\n");
        txtinvoice.setText(txtinvoice.getText() + "Customer : " + cusname + "\n");
        txtinvoice.setText(txtinvoice.getText() + "Date : " + date + "\t" + time + "\n");
        txtinvoice.setText(txtinvoice.getText() + "\n");
        txtinvoice.setText(txtinvoice.getText() + "Stockname " + "\t" + "Price" + "\t" + "Qty" + "\t" + "Total" + "\n");
        for(int i=0;i<model.getRowCount();i++){
            String name = (String)model.getValueAt(i,3);
            String price = (String)model.getValueAt(i,4);
            String qty = (String)model.getValueAt(i,5);
            String amt = (String)model.getValueAt(i,6);
            txtinvoice.setText(txtinvoice.getText() + name + "\t" + price + "\t" + qty + "\t" + amt + "\n");
        }
        int sum=0;
        for(int i=0;i<model.getRowCount();i++){
            sum += Integer.parseInt(model.getValueAt(i,6).toString());
        }
        txtinvoice.setText(txtinvoice.getText() + "\n");
        txtinvoice.setText(txtinvoice.getText() + "*******************************\n");
        txtinvoice.setText(txtinvoice.getText() + "         TOTAL AMOUNT : ₹" + sum + "\n");
        txtinvoice.setText(txtinvoice.getText() + "*******************************\n");
//        txtinvoice.print();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtinvoice = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtinvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtinvoice.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea txtinvoice;
    // End of variables declaration//GEN-END:variables
}
