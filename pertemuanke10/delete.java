/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanke10;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Walidatul Isna
 */
public class delete {
    koneksi konek = new koneksi();

    public void delete(int NIM) {

        try {
            konek.koneksi();
            Statement statement = (Statement) konek.con.createStatement();
                String sql = "delete from mahasiswa where nim = '" + NIM + "'";
                
                statement.executeUpdate(sql);
                  statement.close();
            

            //  menampilkan.setText(nim.getText() + "\n" + nama.getText() + "\n" + alamat.getText() + "\n" + jk.getText());
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

