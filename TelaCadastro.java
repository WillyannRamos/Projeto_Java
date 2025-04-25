package com.mycompany.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *  Willyann Ramos 
 */
public class TelaCadastro extends JFrame {
    private JTextField txtNome;
    private JTextField txtCargo;
    private JTextField txtSalario;
    private final JButton btnSalvar;

    public TelaCadastro() {
        setTitle("Cadastro de Funcionários - Futurista");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centraliza na tela

        // Cores Futuristas
        Color fundo = new Color(20, 20, 35); 
        Color texto = new Color(200, 255, 255); 
        Color campo = new Color(45, 45, 65); 
        Color destaque = new Color(100, 255, 218); 

        Font fonte = new Font("Segoe UI", Font.PLAIN, 13);

        getContentPane().setBackground(fundo); 

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 25);
        lblNome.setForeground(destaque);
        lblNome.setFont(fonte);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 20, 200, 25);
        txtNome.setBackground(campo);
        txtNome.setForeground(texto);
        txtNome.setCaretColor(Color.WHITE);
        txtNome.setBorder(BorderFactory.createLineBorder(destaque));
        txtNome.setFont(fonte);
        add(txtNome);

        JLabel lblCargo = new JLabel("Cargo:");
        lblCargo.setBounds(20, 60, 80, 25);
        lblCargo.setForeground(destaque);
        lblCargo.setFont(fonte);
        add(lblCargo);

        txtCargo = new JTextField();
        txtCargo.setBounds(100, 60, 200, 25);
        txtCargo.setBackground(campo);
        txtCargo.setForeground(texto);
        txtCargo.setCaretColor(Color.WHITE);
        txtCargo.setBorder(BorderFactory.createLineBorder(destaque));
        txtCargo.setFont(fonte);
        add(txtCargo);

        JLabel lblSalario = new JLabel("Salário:");
        lblSalario.setBounds(20, 100, 80, 25);
        lblSalario.setForeground(destaque);
        lblSalario.setFont(fonte);
        add(lblSalario);

        txtSalario = new JTextField();
        txtSalario.setBounds(100, 100, 200, 25);
        txtSalario.setBackground(campo);
        txtSalario.setForeground(texto);
        txtSalario.setCaretColor(Color.WHITE);
        txtSalario.setBorder(BorderFactory.createLineBorder(destaque));
        txtSalario.setFont(fonte);
        add(txtSalario);

        btnSalvar = new JButton(" Salvar");
        btnSalvar.setBounds(120, 150, 100, 35);
        btnSalvar.setBackground(destaque);
        btnSalvar.setForeground(fundo);
        btnSalvar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSalvar.setFocusPainted(false);
        btnSalvar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        btnSalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnSalvar);

        btnSalvar.addActionListener((ActionEvent e) -> {
            Funcionario f = new Funcionario() {
                @Override
                public double calcularSalario() {
                    return getSalario(); 
                }
            };

            f.setNome(txtNome.getText());
            f.setCargo(txtCargo.getText());

            try {
                f.setSalario(Double.parseDouble(txtSalario.getText()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Salário inválido. Digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(
                this,
                f.getDados(),
                "Dados do Funcionário",
                JOptionPane.INFORMATION_MESSAGE
            );
        });
    }
}

