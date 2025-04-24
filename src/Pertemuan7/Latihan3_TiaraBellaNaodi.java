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
import java.util.*;

public class Latihan3_TiaraBellaNaodi extends JFrame {
 private JLabel imageLabel;
    private JLabel descriptionLabel;
    private java.util.List<ImageIcon> images = new ArrayList<>();
    private java.util.List<String> sounds = new ArrayList<>();
    private java.util.List<String> descriptions = new ArrayList<>();
    private int currentIndex = 0;
    private javax.swing.Timer timer;
    private Clip currentClip;
    private boolean isPaused = false;
    private JButton nextButton, prevButton, pauseButton;
    private long clipPosition = 0;

    public Latihan3_TiaraBellaNaodi() {
        setTitle("Slideshow Gambar + Suara");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        descriptionLabel = new JLabel("Deskripsi akan muncul di sini", JLabel.CENTER);
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(descriptionLabel, BorderLayout.SOUTH);

        JPanel controlPanel = new JPanel();
        nextButton = new JButton("Next");
        prevButton = new JButton("Previous");
        pauseButton = new JButton("Pause");

        nextButton.addActionListener(e -> {
            pauseSlideshow();
            currentIndex = (currentIndex + 1) % images.size();
            updateSlide(currentIndex);
        });

        prevButton.addActionListener(e -> {
            pauseSlideshow();
            currentIndex = (currentIndex - 1 + images.size()) % images.size();
            updateSlide(currentIndex);
        });

        pauseButton.addActionListener(e -> {
            if (isPaused) {
                resumeSlideshow();
            } else {
                pauseSlideshow();
            }
        });

        controlPanel.add(prevButton);
        controlPanel.add(pauseButton);
        controlPanel.add(nextButton);
        add(controlPanel, BorderLayout.NORTH);

        loadData();
        startSlideshow();
    }

    private void loadData() {
        images.add(new ImageIcon("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\gambar\\image.jpg"));
        images.add(new ImageIcon("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\gambar\\image2.jpg"));
        images.add(new ImageIcon("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\gambar\\image3.jpg"));

        sounds.add("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\suara\\jumbo.wav");
        sounds.add("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\suara\\sound1.wav");
        sounds.add("D:\\UTB\\SEMESTER 4\\PBO2\\tugas\\praktek netbeans\\ProjectOOP2_TiaraBellaNaodi\\BahanPraktek\\suara\\sound2.wav");

        descriptions.add("Ini adalah gambar pertama");
        descriptions.add("Ini gambar kedua, lebih keren!");
        descriptions.add("Dan ini yang ketiga, mantap!");

        if (!images.isEmpty()) {
            updateSlide(0);
        }
    }

    private void startSlideshow() {
        if (images.isEmpty()) return;

        timer = new javax.swing.Timer(9000, e -> {
            currentIndex = (currentIndex + 1) % images.size();
            updateSlide(currentIndex);
        });
        timer.start();
    }

    private void updateSlide(int index) {
        imageLabel.setIcon(images.get(index));
        descriptionLabel.setText(descriptions.get(index));
        putarSuara(sounds.get(index), true);
    }

    private void putarSuara(String path, boolean resetPosition) {
        try {
            if (currentClip != null && currentClip.isRunning()) {
                currentClip.stop();
                currentClip.close();
            }

            File file = new File(path);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            currentClip = AudioSystem.getClip();
            currentClip.open(audioIn);

            if (!resetPosition) {
                currentClip.setMicrosecondPosition(clipPosition);
            } else {
                clipPosition = 0;
            }

            currentClip.start();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memutar suara: " + path);
        }
    }

    private void pauseSlideshow() {
        timer.stop();
        isPaused = true;
        pauseButton.setText("Play");

        if (currentClip != null && currentClip.isRunning()) {
            clipPosition = currentClip.getMicrosecondPosition();
            currentClip.stop();
        }
    }

    private void resumeSlideshow() {
        timer.start();
        isPaused = false;
        pauseButton.setText("Pause");

        if (currentClip != null) {
            currentClip.setMicrosecondPosition(clipPosition);
            currentClip.start();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Latihan3_TiaraBellaNaodi().setVisible(true));
    }
}


