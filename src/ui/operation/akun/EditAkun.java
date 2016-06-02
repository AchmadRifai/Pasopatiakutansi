/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.operation.akun;

import java.awt.Color;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author ai
 */
public class EditAkun extends javax.swing.JFrame {
private util.db d;
private entity.Akun a,sa;
    /**
     * Creates new form EditAkun
     */
    public EditAkun(util.db db,entity.Akun akun,entity.Akun s) {
        sa=s;
        d=db;
        a=akun;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        opass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        repass = new javax.swing.JPasswordField();
        nama = new javax.swing.JTextField();
        jk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        role = new javax.swing.JCheckBox();
        blocked = new javax.swing.JCheckBox();
        sesi = new javax.swing.JCheckBox();
        s = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menguabh Data Akun ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Password Lama");

        jLabel2.setText("Password Baru");

        jLabel3.setText("Re-Type");

        jLabel4.setText("Nama");

        jLabel5.setText("Gender");

        jLabel6.setText("Alamat");

        opass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                opassKeyReleased(evt);
            }
        });

        pass.setEditable(false);
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });

        repass.setEditable(false);
        repass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                repassKeyReleased(evt);
            }
        });

        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaKeyReleased(evt);
            }
        });

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pria", "wanita" }));
        jk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jkItemStateChanged(evt);
            }
        });

        alamat.setColumns(20);
        alamat.setRows(5);
        alamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                alamatKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(alamat);

        role.setText("Admin");
        role.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                roleStateChanged(evt);
            }
        });

        blocked.setText("Blocked");
        blocked.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blockedStateChanged(evt);
            }
        });

        sesi.setText("Masuk");
        sesi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sesiStateChanged(evt);
            }
        });

        s.setText("SAVE");
        s.setEnabled(false);
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opass)
                            .addComponent(pass)
                            .addComponent(repass, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(nama)
                            .addComponent(jk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(role)
                        .addGap(45, 45, 45)
                        .addComponent(blocked)
                        .addGap(47, 47, 47)
                        .addComponent(sesi)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(opass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(role)
                        .addComponent(blocked))
                    .addComponent(sesi))
                .addGap(18, 18, 18)
                .addComponent(s)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    try {
        new entity.dao.DAOJejak(d).insert(new entity.Jejak(a.getAkun(), "Membatalkan pengubahan akun "+sa.getAkun(), java.sql.Date.valueOf(LocalDate.now()),
                java.sql.Time.valueOf(LocalTime.now()),java.net.InetAddress.getLocalHost().getHostAddress()));
        new ui.Admin(d, a).setVisible(true);
        this.setVisible(false);
    } catch (SQLException | UnknownHostException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.db.hindar(ex);
    }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        blocked.setSelected(sa.isBlocked());
        jk.setSelectedItem(sa.getJk());
        role.setSelected(sa.isRole());
        sesi.setSelected(sa.isSesi());
        nama.setText(sa.getNama());
        this.setTitle(this.getTitle()+sa.getAkun());
        alamat.setText(sa.getAlamat());
        s.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void opassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opassKeyReleased
        boolean b=sa.getPass().equals(opass.getText());
        opass.setEditable(!b);opass.setEnabled(!b);
        pass.setEditable(b);pass.setEnabled(b);
        repass.setEditable(b);repass.setEnabled(b);
        refresh();
    }//GEN-LAST:event_opassKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        refresh();
    }//GEN-LAST:event_passKeyReleased

    private void repassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repassKeyReleased
        if(!pass.getText().isEmpty()){
            if(pass.getText().equals(repass.getText()))repass.setForeground(Color.BLACK);
            else repass.setForeground(Color.red);
        }refresh();
    }//GEN-LAST:event_repassKeyReleased

    private void namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyReleased
        refresh();
    }//GEN-LAST:event_namaKeyReleased

    private void jkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jkItemStateChanged
        refresh();
    }//GEN-LAST:event_jkItemStateChanged

    private void alamatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alamatKeyReleased
        refresh();
    }//GEN-LAST:event_alamatKeyReleased

    private void roleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roleStateChanged
        refresh();
    }//GEN-LAST:event_roleStateChanged

    private void blockedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blockedStateChanged
        refresh();
    }//GEN-LAST:event_blockedStateChanged

    private void sesiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sesiStateChanged
        refresh();
    }//GEN-LAST:event_sesiStateChanged

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
    try {
        entity.Akun ok=new entity.Akun(sa.getAkun(), d);
        ok.setAlamat(alamat.getText());ok.setBlocked(blocked.isSelected());ok.setJk(jk.getItemAt(jk.getSelectedIndex()));ok.setNama(nama.getText());
        if(!opass.isEditable())ok.setPass(pass.getText());
        ok.setRole(role.isSelected());ok.setSesi(sesi.isSelected());
        new entity.dao.DAOJejak(d).insert(new entity.Jejak(a.getAkun(), "Mengubah Akun "+sa.getAkun(), java.sql.Date.valueOf(LocalDate.now()),
                java.sql.Time.valueOf(LocalTime.now()),java.net.InetAddress.getLocalHost().getHostAddress()));
        new entity.dao.DAOAkun(d).update(sa, ok);
        new ui.Admin(d, a).setVisible(true);
        this.setVisible(false);
    } catch (SQLException | UnknownHostException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.db.hindar(ex);
    }
    }//GEN-LAST:event_sActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JCheckBox blocked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField opass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField repass;
    private javax.swing.JCheckBox role;
    private javax.swing.JButton s;
    private javax.swing.JCheckBox sesi;
    // End of variables declaration//GEN-END:variables

    private void refresh() {
        s.setEnabled(!alamat.getText().isEmpty()&&!nama.getText().isEmpty()&&(opass.isEditable()||(Color.BLACK==repass.getForeground()&&!pass.getText().isEmpty())));
    }
}
