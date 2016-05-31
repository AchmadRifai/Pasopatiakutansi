/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akutansi;

import java.net.UnknownHostException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author ai
 */
public class InitSaldo extends javax.swing.JFrame {
private util.db d;
private entity.Akun akun;
private entity.Aset sa;
    /**
     * Creates new form InitSaldo
     */
    public InitSaldo(util.db db,entity.Akun a) {
        d=db;akun=a;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAset = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        n = new javax.swing.JButton();
        da = new javax.swing.JButton();
        ua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Initial Aset");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblAset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Tipe", "Initial", "Ket"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAsetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAset);

        jButton1.setText("Add Aset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        n.setText("NEXT");
        n.setEnabled(false);
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        da.setText("Hapus");
        da.setEnabled(false);
        da.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daActionPerformed(evt);
            }
        });

        ua.setText("Edit");
        ua.setEnabled(false);
        ua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(da)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(n)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(n)
                    .addComponent(da)
                    .addComponent(ua))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    try {
        String name=d.getName();
        d.setName("postgres");
        d.masuk("drop database "+name);
        d.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.db.hindar(ex);
    }new java.io.File(System.getProperty("user.home")+"/.akutansi/config.oke").delete();
    new Start().setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
        java.util.ArrayList<entity.Aset>l=new entity.dao.DAOAset(d).getData();
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) tblAset.getModel();
        for(entity.Aset a:l){
            if(!"keluar".equals(a.getKode()))m.addRow(new Object[]{a.getKode(),a.getTipe(),a.getJum(),a.getKet()});
        }refresh();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.db.hindar(ex);
    }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ui.operation.modal.addModal(d, akun).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblAsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAsetMouseClicked
        int s=tblAset.getSelectedRow();
        boolean b=tblAset.isRowSelected(s);if(b)try {
                sa=new entity.Aset(""+tblAset.getValueAt(s,0), d);
                da.setEnabled(true);ua.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            util.db.hindar(ex);
        }else{
            da.setEnabled(false);ua.setEnabled(false);
        }
    }//GEN-LAST:event_tblAsetMouseClicked

    private void daActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daActionPerformed
        int k=JOptionPane.showConfirmDialog(rootPane, "Apa anda ingin menghapus ini?", "HAPUS?", JOptionPane.YES_NO_OPTION);
        if(k==JOptionPane.YES_OPTION)hapusAset();
        this.formWindowOpened(null);
        ua.setEnabled(false);da.setEnabled(false);
    }//GEN-LAST:event_daActionPerformed

    private void uaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uaActionPerformed
    try {
        new entity.dao.DAOJejak(d).insert(new entity.Jejak(akun.getAkun(), "Akan merubah data "+sa.getKode(), java.sql.Date.valueOf(LocalDate.now()),
                java.sql.Time.valueOf(LocalTime.now()),java.net.InetAddress.getLocalHost().getHostAddress()));
        new ui.operation.modal.EditModal(d, akun, sa).setVisible(true);
        this.setVisible(false);
    } catch (SQLException | UnknownHostException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.db.hindar(ex);
    }
    }//GEN-LAST:event_uaActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        new ui.Login(d).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton da;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton n;
    private javax.swing.JTable tblAset;
    private javax.swing.JButton ua;
    // End of variables declaration//GEN-END:variables

    private void refresh() {
        n.setEnabled(0<tblAset.getRowCount());
    }

    private void hapusAset() {
    try {
        new entity.dao.DAOJejak(d).insert(new entity.Jejak(akun.getAkun(), "Menghapus aset "+sa.getKode(), java.sql.Date.valueOf(LocalDate.now()),
                java.sql.Time.valueOf(LocalTime.now()),java.net.InetAddress.getLocalHost().getHostAddress()));
        new entity.dao.DAOAset(d).delete(sa);
    } catch (UnknownHostException | SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.db.hindar(ex);
    }clearTable();
    }

    private void clearTable() {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) tblAset.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
    }
}
