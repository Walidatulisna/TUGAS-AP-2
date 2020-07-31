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
public class insert {

    koneksi konek = new koneksi();

    public void insert(int nimm, String namaa, String alamatt, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
                String sql = "insert into mahasiswa values('" + nimm + "','" + namaa + "','" + alamatt + "','" + jk + "');";
                
                statement.executeUpdate(sql);
                  statement.close();
            

            //  menampilkan.setText(nim.getText() + "\n" + nama.getText() + "\n" + alamat.getText() + "\n" + jk.getText());
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
