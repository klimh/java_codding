package org.krypto;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StudentService s = new StudentService();
        System.out.println(s.sortujMalejacowgSredniej(s.wczytajZPliku("studenci.csv")));
        System.out.println(s.sortujWgImienia(s.wczytajZPliku("studenci.csv")));
        System.out.println(s.sortujWgNazwiska(s.wczytajZPliku("studenci.csv")));
        s.sortujMalejacowgSredniejAPI_Stream(s.wczytajZPliku("studenci.csv"));
        s.sortujString(s.wczytajZPliku("studenci.csv"));
    }
}