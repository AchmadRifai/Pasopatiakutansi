/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.net.UnknownHostException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author ai
 */
public class Admin extends javax.swing.JFrame {
private util.db d;
private entity.Akun a;
    /**
     * Creates new form Admin
     */
    public Admin(util.db db,entity.Akun akun) {
        a=akun;
        d=db;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Dasboard For ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setTitle(this.getTitle()+a.getNama());
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(isVisible())try {
                    refresh();
                    } catch (SQLException | InterruptedException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                        util.db.hindar(ex);
                    }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        java.io.File f=new java.io.File(System.getProperty("user.home")+"/.akuntasi/config.user");
        if(!f.exists()){
            try {
                metu();
            } catch (UnknownHostException | SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                util.db.hindar(ex);
            }
        }else takok();
    }//GEN-LAST:event_formWindowClosing

    private void refresh() throws SQLException, InterruptedException {
        a=new entity.Akun(a.getAkun(), d);
        if(!a.isSesi()){
            JOptionPane.showMessageDialog(rootPane, "Good bye!");
            new Login(d).setVisible(true);
            this.setVisible(false);
        }
        Thread.sleep(5000);
    }

    private void takok() {
        int x=JOptionPane.showConfirmDialog(rootPane, "Apa anda ingin menghapus cookies anda?", "HAPUS?", JOptionPane.YES_NO_OPTION);if(x==JOptionPane.YES_OPTION){
            try {
                new java.io.File(System.getProperty("user.home")+"/.akutansi/config.user").delete();
                entity.dao.DAOJejak jejak=new entity.dao.DAOJejak(d);
                jejak.insert(new entity.Jejak(a.getAkun(), "Menghapus Cookies", java.sql.Date.valueOf(LocalDate.now()), java.sql.Time.valueOf(LocalTime.now()),
                        java.net.InetAddress.getLocalHost().getHostAddress()));
                metu();
            } catch (SQLException | UnknownHostException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                util.db.hindar(ex);
            }
        }else System.exit(0);
    }

    private void metu() throws UnknownHostException, SQLException {
        entity.Akun b=new entity.Akun(a.getAkun(), d);b.setSesi(false);
                new entity.dao.DAOAkun(d).update(a, b);
                entity.dao.DAOJejak jejak=new entity.dao.DAOJejak(d);
                jejak.insert(new entity.Jejak(a.getAkun(), "Logout", java.sql.Date.valueOf(LocalDate.now()), java.sql.Time.valueOf(LocalTime.now()),
                        java.net.InetAddress.getLocalHost().getHostAddress()));
                new Login(d).setVisible(true);
                this.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
