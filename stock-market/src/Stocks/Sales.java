/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Stocks;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Sales extends javax.swing.JFrame {
    PreparedStatement pst;
    PreparedStatement pst2;
    PreparedStatement pst3;
    Connection conn;
    ResultSet rs;
    DefaultTableModel df;
    Statement stmt;
    DefaultTableModel  dtm;
    CallableStatement mycall;

    /**
     * Creates new form Purchase
     */
    public Sales() {
        initComponents();
        conn = Database.connect();
        customerClear();
    }
    public void customerClear(){
        salesidval.setText(null);
        quantityval.setText(null);
        txtreturn.setText(null);
        txtamtnow.setText(null);
        txtcname.setText(null);
        txtcval.setText(null);
        txtpsupply.setText(null);
        txtpholdings.setText(null);
        txtpamt.setText(null);
        txtpavg.setText(null);
        txtcval.setText(null);
        txtbalance.setText(null);
        txtavg.setText(null);
        txtsellprice.setText(null);
        txtcname.setText(null);
        txtstockid.setText(null);
        txtname.setText(null);
        txtprice.setText(null);
        txtshares.setText(null);
        txtpurchase.setText(null);
        txtholdings.setText(null);
        btnsales.setEnabled(false);
        btnsbills.setEnabled(false);
        txtholdings.setText(null);
//        cbseller.setSelectedIndex(-1);
        txtinvest.setText(null);
        txtavg.setText(null);
        salesidval.setText(null);
        quantityval.setText(null);
        txtreturn.setText(null);
        txtamtnow.setText(null);
        txtalloted.setText(null);
        txtsupply.setText(null);
    }
    public void stockClear(){
        txtpsupply.setText(null);
        txtpholdings.setText(null);
        txtpamt.setText(null);
        txtpavg.setText(null);
        salesidval.setText(null);
        txtbalance.setText(null);
        quantityval.setText(null);
                txtname.setText(null);
                txtprice.setText(null);
                txtshares.setText(null);
                txtsellprice.setText(null);
                txtholdings.setText(null);
                txtavg.setText(null);
                txtinvest.setText(null);
                txtamtnow.setText(null);
                txtreturn.setText(null);
                txtalloted.setText(null);
                txtsupply.setText(null);
    }
    public void investmentClear(){
        txtpsupply.setText(null);
        txtpholdings.setText(null);
        txtpamt.setText(null);
        txtpavg.setText(null);
        txtholdings.setText(null);
                    txtinvest.setText(null);
                    txtavg.setText(null);
                    txtamtnow.setText(null);
    }
    public void salesClear(){
        txtpsupply.setText(null);
        txtpholdings.setText(null);
        txtpamt.setText(null);
        txtpavg.setText(null);
        btnsales.setEnabled(false);
        quantityval.setText(null);
                txtsellprice.setText(null);
                txtbalance.setText(null);
    }
    public void afterSales(){
        int holdings = Integer.parseInt(txtholdings.getText());
        int invest = Integer.parseInt(txtinvest.getText());
        int shares = Integer.parseInt(txtshares.getText());
        int balance = Integer.parseInt(txtdemat.getText());
        int price = Integer.parseInt(txtprice.getText());
        int supply = Integer.parseInt(txtsupply.getText());
        int quantity = Integer.parseInt(txtshares.getText());
        int total = price * quantity;
        int dbalance = balance + total;
        int psupply = supply + shares;
        int pholdings = holdings - shares;
        int pinvest = invest - total;
                    txtsellprice.setText(String.valueOf(total));
                    txtbalance.setText(String.valueOf(dbalance)+"₹");
                    txtpsupply.setText(String.valueOf(psupply));
                    txtpholdings.setText(String.valueOf(pholdings));
                    txtpamt.setText(String.valueOf(pinvest));
                    txtpavg.setText(String.valueOf(Integer.parseInt(txtpamt.getText()) / Integer.parseInt(txtpholdings.getText())));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtstockid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtshares = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsales = new javax.swing.JTable();
        btnsales = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtdemat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        txtprice = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpurchase = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtsellprice = new javax.swing.JLabel();
        txtholdings = new javax.swing.JLabel();
        btnsbills = new javax.swing.JButton();
        salesidval = new javax.swing.JLabel();
        quantityval = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtinvest = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtavg = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtreturn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtamtnow = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        txtcval = new javax.swing.JLabel();
        txtcname = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtpsupply = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtpholdings = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtpamt = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtsupply = new javax.swing.JLabel();
        txtalloted = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtpavg = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SALES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stock ID : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Stock Name : ");

        txtstockid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtstockidMouseClicked(evt);
            }
        });
        txtstockid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockidActionPerformed(evt);
            }
        });
        txtstockid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtstockidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstockidKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Stock Price : ");

        txtshares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsharesActionPerformed(evt);
            }
        });
        txtshares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsharesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsharesKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Selling Shares : ");

        tblsales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Date", "Time", "Stock Name", "Stock Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblsales);

        btnsales.setBackground(new java.awt.Color(255, 0, 0));
        btnsales.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnsales.setText("Sell");
        btnsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Customer ID :");

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DEMAT ACCOUNT BALANCE");

        txtdemat.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtdemat.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(txtdemat, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdemat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Stocks");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Purchases");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Customers");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Sales");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Deposit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Withdrawal");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 0, 0));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Stock Holdings");

        jButton23.setBackground(new java.awt.Color(0, 0, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Stock Holdings");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("TOTAL PURCHASES");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Sales Records");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtprice.setForeground(new java.awt.Color(255, 0, 0));
        txtprice.setText("0");

        txtname.setBackground(new java.awt.Color(255, 0, 0));
        txtname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 51, 51));
        txtname.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Selling Price : ");

        txtpurchase.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Holding Shares :");

        txtsellprice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtsellprice.setForeground(new java.awt.Color(255, 0, 0));
        txtsellprice.setText("0");

        txtholdings.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtholdings.setForeground(new java.awt.Color(255, 0, 0));
        txtholdings.setText("0");

        btnsbills.setBackground(new java.awt.Color(0, 0, 0));
        btnsbills.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsbills.setForeground(new java.awt.Color(255, 255, 255));
        btnsbills.setText("Print Bill");
        btnsbills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsbillsActionPerformed(evt);
            }
        });

        salesidval.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salesidval.setForeground(new java.awt.Color(255, 0, 0));
        salesidval.setText("jLabel6");

        quantityval.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quantityval.setForeground(new java.awt.Color(255, 0, 0));
        quantityval.setText("jLabel6");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total amount invested : ");

        txtinvest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtinvest.setForeground(new java.awt.Color(255, 0, 0));
        txtinvest.setText("jLabel9");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Average Buy Price :");

        txtavg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtavg.setForeground(new java.awt.Color(255, 0, 0));
        txtavg.setText("jLabel13");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Return :");

        txtreturn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtreturn.setForeground(new java.awt.Color(255, 0, 0));
        txtreturn.setText("jLabel13");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Amount Now : ");

        txtamtnow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtamtnow.setForeground(new java.awt.Color(255, 0, 0));
        txtamtnow.setText("jLabel14");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Customer : ");

        txtcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcidActionPerformed(evt);
            }
        });
        txtcid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcidKeyReleased(evt);
            }
        });

        txtcval.setForeground(new java.awt.Color(255, 0, 0));
        txtcval.setText("jLabel15");

        txtcname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtcname.setText("jLabel16");

        jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("STOCK DETAILS");

        jToggleButton2.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton2.setText("INVESTMENT DETAILS");

        jToggleButton4.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton4.setText("SALES DETAILS");

        jToggleButton3.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton3.setText("AFTER SALES DETAILS");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Demat Balance : ");

        txtbalance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbalance.setForeground(new java.awt.Color(255, 0, 0));
        txtbalance.setText("jLabel18");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Stock Supply : ");

        txtpsupply.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpsupply.setForeground(new java.awt.Color(255, 0, 0));
        txtpsupply.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Holding Shares :");

        txtpholdings.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpholdings.setForeground(new java.awt.Color(255, 0, 0));
        txtpholdings.setText("jLabel21");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Total Amt Invested :");

        txtpamt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpamt.setForeground(new java.awt.Color(255, 0, 0));
        txtpamt.setText("jLabel21");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Current Supply : ");

        txtsupply.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtsupply.setForeground(new java.awt.Color(255, 0, 0));
        txtsupply.setText("jLabel18");

        txtalloted.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtalloted.setForeground(new java.awt.Color(255, 0, 0));
        txtalloted.setText("jLabel16");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Alloted Shares :");

        txtpavg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpavg.setForeground(new java.awt.Color(255, 0, 0));
        txtpavg.setText("jLabel21");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Average Buy Price : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jToggleButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jToggleButton2)
                                                    .addGap(1728, 1728, 1728))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(94, 94, 94)
                                                                    .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(jLabel14))
                                                                .addComponent(txtcval, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jToggleButton1)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(51, 51, 51)
                                                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel7)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtshares, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(33, 33, 33)
                                                            .addComponent(jLabel10)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtsellprice, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(quantityval, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jLabel2)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(txtstockid, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(jLabel3))
                                                                .addComponent(salesidval, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel4)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jLabel15)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtalloted, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jLabel17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(txtsupply, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(1101, 1101, 1101)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(1144, 1144, 1144))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(321, 321, 321)
                                                .addComponent(jLabel1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnsales, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnsbills, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(txtpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpsupply, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpholdings, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpamt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtpavg, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(281, 281, 281)
                                        .addComponent(jToggleButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtholdings, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtinvest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtavg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtamtnow, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(txtpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel14)
                                            .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtcval)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToggleButton1)
                                        .addGap(1, 1, 1))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtstockid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(txtprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtalloted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtsupply, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salesidval, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtinvest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtavg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtholdings, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtamtnow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel7)
                            .addComponent(txtshares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtsellprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityval, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jToggleButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtpsupply, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpholdings, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpamt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtpavg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btnsales, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnsbills, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalesActionPerformed
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        String time = dtf2.format(now);
        
        try {
            String stockid = txtstockid.getText();
            String cusid = txtcid.getText();   
            int balance = Integer.parseInt(txtdemat.getText());
            int price = Integer.parseInt(txtprice.getText());
            int supply = Integer.parseInt(txtsupply.getText());
            int shares = Integer.parseInt(txtshares.getText());
            int total = Integer.parseInt(txtsellprice.getText());
            int holdings = Integer.parseInt(txtholdings.getText());
            int invest = Integer.parseInt(txtinvest.getText());
            int avg = Integer.parseInt(txtavg.getText());
            String sname = txtname.getText();
                    
            String sql = "insert into sales values ("+null+",'"+cusid+"','"+stockid+"','"+sname+"','"+date+"','"+time+"','"+price+"','"+shares+"')";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
                
//            String tstockid,tdate,ttime,tstockname,tprice,tquantity,ttotal;
//            
//            for(int i=0;i<tblpurchases.getRowCount();i++){
//                tstockid = (String)tblpurchases.getValueAt(i,0);
//                tdate = (String)tblpurchases.getValueAt(i,1);
//                ttime = (String)tblpurchases.getValueAt(i,2);
//                tstockname = (String)tblpurchases.getValueAt(i,3);
//                tprice = (String)tblpurchases.getValueAt(i,4);
//                tquantity = (String)tblpurchases.getValueAt(i,5);
//                ttotal = (String)tblpurchases.getValueAt(i,6);
//                
//                pst.setString(1,cusid);
//                pst.setString(2,tstockid);
//                pst.setString(3,tstockname);
//                pst.setString(4,tdate);
//                pst.setString(5,ttime);
//                pst.setString(6, tprice);
//                pst.setString(7, tquantity);
//                pst.setString(8,ttotal);
//                pst.executeUpdate();
//            } 
        DefaultTableModel df = (DefaultTableModel)tblsales.getModel();
        df.addRow(new Object[]
        {
            txtstockid.getText(),
            date,
            time,
            txtname.getText(),
            txtprice.getText(),
            txtshares.getText(),
            String.valueOf(total)
        });
        
        pst = conn.prepareStatement("select amount/shares from pool where cusid = '"+cusid+"' and stockid = '"+stockid+"'");
        rs = pst.executeQuery();
        if(rs.next()){
            avg = rs.getInt(1);
        }
        int temp = shares * avg;
        pst = conn.prepareStatement("update pool set amount = amount - '"+temp+"', shares = shares - '"+shares+"' where cusid = '"+cusid+"' and stockid = '"+stockid+"'");
        pst.executeUpdate();
        
                
        pst = conn.prepareStatement("update customers set demat = demat + '"+total+"' where customerid = '"+cusid+"'");
        pst.executeUpdate();
        
        pst = conn.prepareStatement("select demat from customers where customerid = '"+cusid+"'");
        rs = pst.executeQuery();
        if(rs.next()){
            balance = rs.getInt(1);
            txtdemat.setText(balance+"");
        }
            
        double decrease = total * 0.001;
        pst = conn.prepareStatement("update stocks set price = price - '"+decrease+"' where stockid = '"+stockid+"'");
        pst.executeUpdate();
        
        pst = conn.prepareStatement("select price,supply from stocks where stockid = '"+stockid+"'");
        rs = pst.executeQuery();
        if(rs.next()){
            price = rs.getInt(1);
            supply = rs.getInt(2);
            txtprice.setText(price+"");
            txtsupply.setText(supply+"");
        }
      
        pst = conn.prepareStatement("select amount,shares,amount/shares from pool where cusid = '"+cusid+"' and stockid = '"+stockid+"'");
        rs = pst.executeQuery();
        if(rs.next()){
            invest = rs.getInt(1);
            holdings = rs.getInt(2);
            avg = rs.getInt(3);
            txtinvest.setText(String.valueOf(invest));
            txtholdings.setText(String.valueOf(holdings));
            txtavg.setText(String.valueOf(avg));
        }
        else{
            investmentClear();
        }

        int amtnow = price * holdings ;
        txtamtnow.setText(String.valueOf(amtnow)+"₹");
                
        float profit = amtnow * 100 / invest;
        profit = profit - 100; 
        txtreturn.setText(String.valueOf(profit)+"%");
        
        txtshares.setText(null);
        btnsbills.setEnabled(true);
        salesClear();
//        JOptionPane.showMessageDialog(this,"sales completed");
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnsales.setEnabled(false);
        btnsbills.setEnabled(true);
    }//GEN-LAST:event_btnsalesActionPerformed

    private void txtstockidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockidKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtstockidKeyPressed

    private void txtstockidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtstockidMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtstockidMouseClicked

    private void txtstockidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockidActionPerformed

    private void txtsharesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsharesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsharesActionPerformed

    private void txtsharesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsharesKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtsharesKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Stocks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new Purchases().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new Customers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new Sales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        new TotalSales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnsbillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsbillsActionPerformed
        // TODO add your handling code here:
            // TODO add your handling code here:
            try{
            String cusid = txtcid.getText(); 
            pst = conn.prepareStatement("select name from customers where username = '"+cusid+"'");
            rs = pst.executeQuery();
            String cusname = null;
            if(rs.next()){
                cusname = rs.getString(1);
            }
            try {
                new SalesBill(cusname,tblsales.getModel()).setVisible(true);
            } catch (PrinterException ex) {
                Logger.getLogger(Purchases.class.getName()).log(Level.SEVERE, null, ex);
            }
            btnsbills.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(Purchases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsbillsActionPerformed

    private void txtstockidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockidKeyReleased
        // TODO add your handling code here:
            // TODO add your handling code here:
            String id = txtstockid.getText();
            if("".equals(id)){
                stockClear();
            }else{
            
            try {
            
            String cusid = txtcid.getText(); 
            pst = conn.prepareStatement("select * from stocks where stockid = '"+id+"'");
            rs = pst.executeQuery();
            if(rs.next() == false){
                salesidval.setText("stockid not found");
            }else{
                String name = rs.getString("name");
                int price = rs.getInt("price");
                String alloted = rs.getString("shares");
                String supply = rs.getString("supply");
                txtname.setText(name.trim());
                txtprice.setText(String.valueOf(price));
                txtalloted.setText(alloted.trim());
                txtsupply.setText(supply.trim());
                
                pst = conn.prepareStatement("select amount,shares,amount/shares from pool where cusid = '"+cusid+"' and stockid = '"+id+"'");
                rs = pst.executeQuery();
                int avg = 0;
                int amount = 0;
                int shares = 0;
                if(rs.next()){
                    amount = rs.getInt(1);
                    shares = rs.getInt(2);
                    avg = rs.getInt(3);
                    txtinvest.setText(String.valueOf(amount));
                    txtholdings.setText(String.valueOf(shares));
                    txtavg.setText(String.valueOf(avg));
                    int amtnow = price * shares ;
                txtamtnow.setText(String.valueOf(amtnow)+"₹");
                
                int profit = amtnow * 100 / amount;
                profit = profit - 100; 
                txtreturn.setText(String.valueOf(profit)+"%");
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    txtshares.requestFocus();
                }
                }
                else{
                    investmentClear();
                }  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       }
    }//GEN-LAST:event_txtstockidKeyReleased

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        new Withdrawal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        new StockHoldings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        new TotalPurchases().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        new TotalSales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void txtsharesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsharesKeyReleased
        if("".equals(txtprice.getText()) ||"".equals(txtshares.getText())){
                salesClear();
            }
            else{
                int holdings = Integer.parseInt(txtholdings.getText());
                int shares = Integer.parseInt(txtshares.getText());
                
                if(shares>holdings){
                    quantityval.setText("more than holding stocks");
                    btnsales.setEnabled(false);
                    afterSales();
                }
                else{
                    quantityval.setText(null);
                    btnsales.setEnabled(true);
                    afterSales();
                }
            }
    }//GEN-LAST:event_txtsharesKeyReleased

    private void txtcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcidActionPerformed

    private void txtcidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcidKeyReleased
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if("".equals(txtcid.getText())){
                customerClear();
            }
            else{
                txtcval.setText(null);
                String cusid = txtcid.getText();
                pst = conn.prepareStatement("select name,demat from customers where customerid = '"+cusid+"'");
                rs = pst.executeQuery();
                if(rs.next()){
                  String name = rs.getString(1);
                  String demat = rs.getString(2);
                    txtcname.setText(name.trim());
                    txtdemat.setText(demat);
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    txtstockid.requestFocus();
                }
                }else{
                txtcval.setText("customer not found");
                }
            }
        } catch (SQLException ex) {        
            Logger.getLogger(Purchases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcidKeyReleased

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsales;
    private javax.swing.JButton btnsbills;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel quantityval;
    private javax.swing.JLabel salesidval;
    private javax.swing.JTable tblsales;
    private javax.swing.JLabel txtalloted;
    private javax.swing.JLabel txtamtnow;
    private javax.swing.JLabel txtavg;
    private javax.swing.JLabel txtbalance;
    private javax.swing.JTextField txtcid;
    private javax.swing.JLabel txtcname;
    private javax.swing.JLabel txtcval;
    private javax.swing.JLabel txtdemat;
    private javax.swing.JLabel txtholdings;
    private javax.swing.JLabel txtinvest;
    private javax.swing.JLabel txtname;
    private javax.swing.JLabel txtpamt;
    private javax.swing.JLabel txtpavg;
    private javax.swing.JLabel txtpholdings;
    private javax.swing.JLabel txtprice;
    private javax.swing.JLabel txtpsupply;
    private javax.swing.JLabel txtpurchase;
    private javax.swing.JLabel txtreturn;
    private javax.swing.JLabel txtsellprice;
    private javax.swing.JTextField txtshares;
    private javax.swing.JTextField txtstockid;
    private javax.swing.JLabel txtsupply;
    // End of variables declaration//GEN-END:variables
}
