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
import java.util.*;
import java.io.File;
import javax.swing.Timer;

public class Latihan2_TiaraBellaNaodi extends JFrame {
    private JLabel imageLabel;
    private java.util.List<ImageIcon> images;
    private int currentIndex = 0;
    private Timer timer;

    public Latihan2_TiaraBellaNaodi() {
        setTitle("Slideshow Gambar Otomatis");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        loadImages("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\gambar");
        startSlideshow();
    }

    private void loadImages(String folderPath) {
        images = new ArrayList<>();
        
        File folder = new File(folderPath);
        File [] files = folder.listFiles ((dir, name) -> {
            return name.toLowerCase () .endsWith(".jpg") || name.toLowerCase () .endsWith(".png");
        });

        if (files != null) {
            for (File file : files) {
                images.add (new ImageIcon (file.getPath () ) ) ;
            }
        }
        
        if (images.size () > 0) {
            imageLabel.setIcon (images.get (0) );
        } else {
            imageLabel.setText ("Tidak ada gambar di folder. ");
        }
    }
    
    private void startSlideshow () {
        if (images == null || images.size () == 0)  return;
        
        timer = new Timer (3000, new ActionListener () { // Ganti setiap 3 detik 
            public void actionPerformed (ActionEvent e) {
                currentIndex =(currentIndex + 1) % images .size();
                imageLabel.setIcon (images.get (currentIndex) );
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Latihan2_TiaraBellaNaodi().setVisible(true);
        });
    }
}
