/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventaris_form;
import inventaris_kampus.*;
import com.sun.crypto.provider.JceKeyStore;
import inventaris_form.InventarisKampus;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Checkbox;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.*;

/**
 *
 * @author Nuke Brilian
 */
public class IO extends Super implements Interface {
    Scanner in = new Scanner(System.in);
    Model call1 = new Model();
    Model nk;
    
    public IO(JTextField txtnama, JTextField txtlokasi, JTextField cmbfakultas) {
        call1.setNama_ruang(txtnama.getText());
        call1.setLokasi_ruang(txtlokasi.getText());
        call1.setFakultas((String) cmbfakultas.getText());
        nk = new Model(call1.getNama_ruang(), call1.getLokasi_ruang(), call1.getFakultas());
    }

    public IO(JTextField txtpanjang, JTextField txtlebar, JTextField txtkursi, JTextField txtpintu, JTextField txtjendela) {
        call1.setPanjang_ruang(Double.parseDouble(txtpanjang.getText()));
        call1.setLebar_ruang(Double.parseDouble(txtlebar.getText()));
        call1.setJml_kursi(Integer.parseInt(txtkursi.getText()));
        call1.setJml_pintu(Integer.parseInt(txtpintu.getText()));
        call1.setJml_jendela(Integer.parseInt(txtjendela.getText()));
    }
    
    public IO(JTextField txtjmlsteker, JTextField txtjmlkondisisteker,
            JTextField txtposisisteker, JTextField txtjmlLCD,
            JTextField txtkondisiLCD, JTextField txtposisiLCD, JTextField txtjmllampu,
            JTextField txtjmlkondisilampu, JTextField txtposisilampu, JTextField txtjmlkipas,
            JTextField txtjmlkondisikipas, JTextField txtposisikipas,
            JTextField txtjmlAC, JTextField txtjmlkondisiAC, JTextField txtposisiAC,
            JTextField txtjmlCCTV, JTextField txtjmlkondisiCCTV,
            JTextField txtposisiCCTV, JTextField txtSSID, JTextField txtlogin ) {
        call1.setJml_steker(Integer.parseInt(txtjmlsteker.getText()));
        call1.setJml_baik_steker(Integer.parseInt(txtjmlkondisisteker.getText()));
        call1.setPosisi_steker((String)txtposisisteker.getText());
        call1.setJml_kabel_LCD(Integer.parseInt(txtjmlLCD.getText()));
        call1.setJml_baik_LCD(Integer.parseInt(txtkondisiLCD.getText()));
        call1.setPosisi_kabel_LCD((String)txtposisiLCD.getText());
        call1.setJml_lampu(Integer.parseInt(txtjmllampu.getText()));
        call1.setJml_baik_lampu(Integer.parseInt(txtjmlkondisilampu.getText()));
        call1.setPosisi_lampu((String)txtposisilampu.getText());
        call1.setJml_kipas(Integer.parseInt(txtjmlkipas.getText()));
        call1.setJml_baik_kipas(Integer.parseInt(txtjmlkondisikipas.getText()));
        call1.setPosisi_kipas((String)txtposisikipas.getText());
        call1.setJml_AC(Integer.parseInt(txtjmlAC.getText()));
        call1.setJml_baik_AC(Integer.parseInt(txtjmlkondisiAC.getText()));
        call1.setPosisi_AC((String)txtposisiAC.getText());
        call1.setJml_CCTV(Integer.parseInt(txtjmlCCTV.getText()));
        call1.setJml_baik_CCTV(Integer.parseInt(txtjmlkondisiCCTV.getText()));
        call1.setPosisi_CCTV((String)txtposisiCCTV.getText());
        call1.setLogin((String)txtlogin.getText());
        call1.setSSID((String)txtSSID.getText());
    }
    
    public IO(JTextField txtkondisilantai, JTextField txtkondisidinding,
            JTextField txtkondisiatap, JTextField txtkondisipintu, JTextField txtkondisijendela, JTextField txtkondisikaca){
        call1.setKondisi_lantai((String)txtkondisilantai.getText());
        call1.setKondisi_dinding((String)txtkondisidinding.getText());
        call1.setKondisi_atap((String)txtkondisiatap.getText());
        call1.setKondisi_pintu((String)txtkondisipintu.getText());
        call1.setKondisi_jendela((String)txtkondisijendela.getText());
        call1.setKondisi_kaca_jendela((String)txtkondisikaca.getText());
    }
    
    public IO(JTextField txtsirkulasiudara, JTextField txtnilaipencahayaan, JTextField txtkelembapan, JTextField txtsuhu){
        call1.setSirkulasi_udara((String)txtsirkulasiudara.getText());
        call1.setNilai_pencahayaan(Double.parseDouble(txtnilaipencahayaan.getText()));
        call1.setKelembapan(Double.parseDouble(txtkelembapan.getText()));
        call1.setSuhu(Double.parseDouble(txtsuhu.getText()));
    }
    
//    public IO(JTextField txtkebisingan, JTextField txtbau, JTextField txtkebocoran, JTextField txtkerusakan, JTextField txtkeausan){
//        call1.setKebisingan((String)txtkebisingan.getText());
//        call1.setBau((String)txtbau.getText());
//        call1.setKebocoran((String)txtkebocoran.getText());
//        call1.setKerusakan((String)txtkerusakan.getText());
//        call1.setKeausan((String)txtkeausan.getText());
//    }
//    
//    public IO(JTextField txtkekokohan, JTextField txtjmlkuncipintu, JTextField txtjmlkuncijendela, JTextField txtbahaya){
//        
//    }

    public IO() {

    }

    @Override
    public void identitas_ruang_kelas() {
        InventarisKampus.identitas_ruang.setVisible(true);
    }

    @Override
    public void kondisi_ruang() {
        InventarisKampus.kondisi_ruang.setVisible(true);
    }

    @Override
    public void jumlah_kondisi_dan_posisi_sarana() {
        InventarisKampus.sarana_ruang.setVisible(true);
    }

    @Override
    public void lingkungan_ruang_kelas() {
        InventarisKampus.lingkungan_ruang.setVisible(true);
    }

    @Override
    public void kebersihan_ruang_kelas() {
        InventarisKampus.kebersihan_ruang.setVisible(true);
    }

    @Override
    public void kenyamanan_ruang_kelas() {
        InventarisKampus.kenyamanan_ruang.setVisible(true);
    }

    @Override
    public void keamanan_ruang_kelas() {
        InventarisKampus.keamanan_ruang.setVisible(true);
    }

    public void tampil() {
        
    }

    public Model getModel() {
        return nk;
    }
}
