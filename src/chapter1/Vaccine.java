package chapter1;

import javax.swing.*;

public class Vaccine {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包含AZ, BNT, Moderna, Janssen): ");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            JOptionPane.showInputDialog(null,"AZ\n研發國:英國、瑞典\n疫苗類型:腸病毒疫苗\n劑量:2\n保護力:81%");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showInputDialog(null,"BNT\n研發國:德國與美國\n疫苗類型:mRNA\n劑量:2\n保護力:95%");
        } else if (vaccine.equals("moderna")) {
            JOptionPane.showInputDialog(null,"Moderna\n研發國:美國\n疫苗類型:mRNA\n劑量:2\n保護力:94%");
        } else if (vaccine.equals("janssen")) {
            JOptionPane.showInputDialog(null,"Janssen\n研發國:美國與比利時\n疫苗類型:腺病毒疫苗\n劑量:1\n保護力:66%");
        } else {
            JOptionPane.showInputDialog(null,"無法辨識輸入內容");

        }
    }
}
