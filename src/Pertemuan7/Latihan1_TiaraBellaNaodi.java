/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author ThinkPad123
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class Latihan1_TiaraBellaNaodi extends JFrame {
    private JLabel imageLabel;
    private JButton playSoundButton;

    public Latihan1_TiaraBellaNaodi() {
        setTitle("Aplikasi Gambar dan Suara");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ImageIcon imageIcon = new ImageIcon("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\gambar\\image.jpg");
        imageLabel = new JLabel(imageIcon);
        add(imageLabel, BorderLayout.CENTER);

        playSoundButton = new JButton("Putar Suara");
        playSoundButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                putarSuara("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\suara\\sound1.wav");
            }
        });
        add(playSoundButton, BorderLayout.SOUTH);
    }

    private void putarSuara(String path) {
        try {
            File soundFile = new File(path);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memutar suara: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Latihan1_TiaraBellaNaodi().setVisible(true);
        });
    }
}
