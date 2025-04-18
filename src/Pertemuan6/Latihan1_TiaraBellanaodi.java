/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author ThinkPad123
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Latihan1_TiaraBellanaodi extends JFrame{
    
    // Konstruktor kelas DrawingRect
public Latihan1_TiaraBellanaodi() {
super("Kelas DrawingRect");
setSize(260, 165);
setVisible(true);
}
// Metoda paint
public void paint(Graphics g) {
// Memanggil metoda paint dari superclass
super.paint(g);
// Mengatur warna
g.setColor(Color.RED);
g.drawRect(20, 40, 220, 50);
g.setColor(Color.BLUE);
g.fillRect(20, 100, 220, 50);
}
// Metoda main
public static void main(String[] args) {
Latihan1_TiaraBellanaodi frame = new Latihan1_TiaraBellanaodi();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
