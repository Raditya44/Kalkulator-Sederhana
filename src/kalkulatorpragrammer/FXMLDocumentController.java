/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorpragrammer;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    String angka = "";
    double angka1, angka2, jumlah;
    int pilih;
    
    private Label label;
    @FXML
    private JFXButton id_7;
    @FXML
    private JFXButton id_8;
    @FXML
    private JFXButton id_9;
    @FXML
    private JFXButton id_4;
    @FXML
    private JFXButton id_5;
    @FXML
    private JFXButton id_6;
    @FXML
    private JFXButton id_1;
    @FXML
    private JFXButton id_2;
    @FXML
    private JFXButton id_3;
    @FXML
    private JFXButton id_0;
    @FXML
    private JFXTextField id_hex;
    @FXML
    private JFXTextField id_dec;
    @FXML
    private JFXTextField id_oct;
    @FXML
    private JFXTextField id_bin;
    @FXML
    private JFXButton f;
    @FXML
    private JFXButton e;
    @FXML
    private JFXButton d;
    @FXML
    private JFXButton c;
    @FXML
    private JFXButton b;
    @FXML
    private JFXButton a;
    @FXML
    private JFXButton kurang;
    @FXML
    private JFXButton tambah;
    @FXML
    private JFXButton bagi;
    @FXML
    private JFXButton kali;
    @FXML
    private JFXButton samadengan;
    @FXML
    private JFXTextField hasil;
    @FXML
    private JFXButton C;
    @FXML
    private JFXButton mod;
    @FXML
    private JFXButton per;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pengurangan(ActionEvent event) {
    angka1=Double.parseDouble(angka);
    hasil.setText(String.valueOf(" - "));
    angka="";
    pilih=2;       
    }

    @FXML
    private void penjumlahan(ActionEvent event) {
    angka1=Double.parseDouble(angka);
    hasil.setText(String.valueOf(" + "));
    angka="";
    pilih=1;
    }

    @FXML
    private void pembagian(ActionEvent event) {
    angka1=Double.parseDouble(angka);
    hasil.setText(String.valueOf(" : "));
    angka="";
    pilih=4;
    }

    @FXML
    private void perkalian(ActionEvent event) {
    angka1=Double.parseDouble(angka);
    hasil.setText(String.valueOf(" X "));
    angka="";
    pilih=3;
    }
    
    @FXML
    private void modulus(ActionEvent event) {
    angka1=Double.parseDouble(angka);
    hasil.setText(String.valueOf(" Mod "));
    angka="";
    pilih=5;   
    }
    
    @FXML
    private void persen(ActionEvent event) {
    angka1=Double.parseDouble(angka);
    jumlah = angka1 / 100;
    angka = Double.toString(jumlah);
    hasil.setText(angka);
    }
    @FXML 
    private void hasil2(ActionEvent event)
    {
            switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            hasil.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            hasil.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            hasil.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            hasil.setText(angka);
            break;
        case 5:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 % angka2;
            angka = Double.toString(jumlah);
            hasil.setText(angka);
            break;
            default:
            break;
} 
    }

    @FXML
    private void hapus(ActionEvent event) {
    hasil.setText(" ");
    angka1=0.0;
    angka2=0.0;
    jumlah=0.0;
    angka="";
    id_dec.setText(String.valueOf("0"));
    id_hex.setText(String.valueOf("0"));
    id_bin.setText(String.valueOf("0"));
    id_oct.setText(String.valueOf("0"));
    
    }

    @FXML
    private void tujuh(ActionEvent event) {
        angka += "7";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void delapan(ActionEvent event) {
        angka += "8";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void sembilan(ActionEvent event) {
        angka += "9";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void empat(ActionEvent event) {
        angka += "4";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void lima(ActionEvent event) {
        angka += "5";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void enam(ActionEvent event) {
        angka += "6";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void satu(ActionEvent event) {
        angka += "1";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void dua(ActionEvent event) {
        angka += "2";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void tiga(ActionEvent event) {
        angka += "3";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    private void nol(ActionEvent event) {
        angka += "0";
        hasil.setText(angka);
        id_dec.setText(angka);
        String desimal1 = id_dec.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    id_oct.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = id_dec.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    id_hex.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = id_dec.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    id_bin.setText(Integer.toBinaryString(outBiner9));
        
    }

    @FXML
    private void hexa(ActionEvent event) {
        
    }

    @FXML
    private void deci(ActionEvent event) {
    }

    @FXML
    private void octa(ActionEvent event) {        
    }

    @FXML
    private void biner(ActionEvent event) {       
    }

    @FXML
    private void falcon(ActionEvent event) {
        angka += "15";
        hasil.setText(angka);
        id_hex.setText(angka);
        String hexa2 = id_hex.getText();
        int outDes2 = Integer.parseInt(hexa2,16);
        String hasilDes = Integer.toUnsignedString(outDes2);
        int hasilBiner = Integer.parseInt(hasilDes);
        id_bin.setText(Integer.toBinaryString(hasilBiner));
        
        String hexa = id_hex.getText();
        int outDes = Integer.parseInt(hexa,16);
        id_dec.setText(Integer.toUnsignedString(outDes));
        
        String hexa3 = id_hex.getText();
        int outDes3 = Integer.parseInt(hexa3,16);
        String hasilDes2 = Integer.toUnsignedString(outDes3);
        int hasilOktal2 = Integer.parseInt(hasilDes2);
        id_oct.setText(Integer.toOctalString(hasilOktal2));
    }

    @FXML
    private void echo(ActionEvent event) {
        angka += "14";
        hasil.setText(angka);
        id_hex.setText(angka);
        String hexa2 = id_hex.getText();
        int outDes2 = Integer.parseInt(hexa2,16);
        String hasilDes = Integer.toUnsignedString(outDes2);
        int hasilBiner = Integer.parseInt(hasilDes);
        id_bin.setText(Integer.toBinaryString(hasilBiner));
        
        String hexa = id_hex.getText();
        int outDes = Integer.parseInt(hexa,16);
        id_dec.setText(Integer.toUnsignedString(outDes));
        
        String hexa3 = id_hex.getText();
        int outDes3 = Integer.parseInt(hexa3,16);
        String hasilDes2 = Integer.toUnsignedString(outDes3);
        int hasilOktal2 = Integer.parseInt(hasilDes2);
        id_oct.setText(Integer.toOctalString(hasilOktal2));
    }

    @FXML
    private void delta(ActionEvent event) {
        angka += "13";
        hasil.setText(angka);
        id_hex.setText(angka);
        String hexa2 = id_hex.getText();
        int outDes2 = Integer.parseInt(hexa2,16);
        String hasilDes = Integer.toUnsignedString(outDes2);
        int hasilBiner = Integer.parseInt(hasilDes);
        id_bin.setText(Integer.toBinaryString(hasilBiner));
        
        String hexa = id_hex.getText();
        int outDes = Integer.parseInt(hexa,16);
        id_dec.setText(Integer.toUnsignedString(outDes));
        
        String hexa3 = id_hex.getText();
        int outDes3 = Integer.parseInt(hexa3,16);
        String hasilDes2 = Integer.toUnsignedString(outDes3);
        int hasilOktal2 = Integer.parseInt(hasilDes2);
        id_oct.setText(Integer.toOctalString(hasilOktal2));
    }

    @FXML
    private void charlie(ActionEvent event) {
        angka += "12";
        hasil.setText(angka);
        id_hex.setText(angka);
        String hexa2 = id_hex.getText();
        int outDes2 = Integer.parseInt(hexa2,16);
        String hasilDes = Integer.toUnsignedString(outDes2);
        int hasilBiner = Integer.parseInt(hasilDes);
        id_bin.setText(Integer.toBinaryString(hasilBiner));
        
        String hexa = id_hex.getText();
        int outDes = Integer.parseInt(hexa,16);
        id_dec.setText(Integer.toUnsignedString(outDes));
        
        String hexa3 = id_hex.getText();
        int outDes3 = Integer.parseInt(hexa3,16);
        String hasilDes2 = Integer.toUnsignedString(outDes3);
        int hasilOktal2 = Integer.parseInt(hasilDes2);
        id_oct.setText(Integer.toOctalString(hasilOktal2));
    }

    @FXML
    private void beta(ActionEvent event) {
        angka += "11";
        hasil.setText(angka);
        id_hex.setText(angka);
        String hexa2 = id_hex.getText();
        int outDes2 = Integer.parseInt(hexa2,16);
        String hasilDes = Integer.toUnsignedString(outDes2);
        int hasilBiner = Integer.parseInt(hasilDes);
        id_bin.setText(Integer.toBinaryString(hasilBiner));
        
        String hexa = id_hex.getText();
        int outDes = Integer.parseInt(hexa,16);
        id_dec.setText(Integer.toUnsignedString(outDes));
        
        String hexa3 = id_hex.getText();
        int outDes3 = Integer.parseInt(hexa3,16);
        String hasilDes2 = Integer.toUnsignedString(outDes3);
        int hasilOktal2 = Integer.parseInt(hasilDes2);
        id_oct.setText(Integer.toOctalString(hasilOktal2));
    }

    @FXML
    private void alpha(ActionEvent event) {
        angka += "10";
        hasil.setText(angka);
        id_hex.setText(angka);
        String hexa2 = id_hex.getText();
        int outDes2 = Integer.parseInt(hexa2,16);
        String hasilDes = Integer.toUnsignedString(outDes2);
        int hasilBiner = Integer.parseInt(hasilDes);
        id_bin.setText(Integer.toBinaryString(hasilBiner));
        
        String hexa = id_hex.getText();
        int outDes = Integer.parseInt(hexa,16);
        id_dec.setText(Integer.toUnsignedString(outDes));
        
        String hexa3 = id_hex.getText();
        int outDes3 = Integer.parseInt(hexa3,16);
        String hasilDes2 = Integer.toUnsignedString(outDes3);
        int hasilOktal2 = Integer.parseInt(hasilDes2);
        id_oct.setText(Integer.toOctalString(hasilOktal2));
    }
}
