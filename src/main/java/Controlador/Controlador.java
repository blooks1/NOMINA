package Controlador;

import Vista.Formulario;
import Modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    private final Formulario objetoformulario;
    private final ArrayList<Modelo> listapersona = new ArrayList();

    public Controlador() {
        objetoformulario = new Formulario();
        this.objetoformulario.getBtninsertardatos().addActionListener(this);
        this.objetoformulario.getBtnconsultarprofesor().addActionListener(this);
        this.objetoformulario.getBtnconsultarnomina().addActionListener(this);
        this.objetoformulario.getBtnnominageneral().addActionListener(this);
        this.objetoformulario.getBtningresarAutentificacion().addActionListener(this);
        this.objetoformulario.getBtnsalir().addActionListener(this);
    }

    public void iniciarprograma() {

        this.objetoformulario.getCuadroDialogoIngreso().setSize(380, 250);
        this.objetoformulario.getCuadroDialogoIngreso().setLocationRelativeTo(objetoformulario);
        this.objetoformulario.getCuadroDialogoIngreso().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.objetoformulario.getBtninsertardatos()) {
            Modelo objetomodelo = new Modelo();

            if (this.objetoformulario.getTxtnombre().getText().isEmpty() || this.objetoformulario.getTxtcc().getText().isEmpty() || this.objetoformulario.getTxthoracatedra().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {

                objetomodelo.setNombre(this.objetoformulario.getTxtnombre().getText());
                objetomodelo.setCc(Integer.parseInt(this.objetoformulario.getTxtcc().getText()));
                objetomodelo.setVinculacion(this.objetoformulario.getComboboxvinculacion().getSelectedItem().toString());
                objetomodelo.setVinculaciona(this.objetoformulario.getComboboxvinculacion().getSelectedIndex());
                objetomodelo.setEstudiosa(this.objetoformulario.getComboboxestudios().getSelectedItem().toString());
                objetomodelo.setEstudios(this.objetoformulario.getComboboxestudios().getSelectedIndex());
                objetomodelo.setHora(Integer.parseInt(this.objetoformulario.getTxthoracatedra().getText()));

                this.listapersona.add(objetomodelo);

                this.objetoformulario.getTxtnombre().setText("");
                this.objetoformulario.getTxtcc().setText("");

                this.objetoformulario.requestFocus();
                this.objetoformulario.letreroinformacion("Datos almacenados de forma correcta");
                this.objetoformulario.getInformacion().append(objetomodelo.toString() + "\n");
            }
        }
        if (e.getSource() == this.objetoformulario.getBtnconsultarprofesor()) {
            boolean b = false;

            int cedula = this.objetoformulario.capturainformacionint("Digite la cedula de el profesor ");
            for (int i = 0; i < this.listapersona.size(); i++) {
                if (cedula == (this.listapersona.get(i).getCc())) {
                    this.objetoformulario.getInformacion().setText(this.listapersona.get(i).toString() + "\n Se le debe pagar al docente: " + this.listapersona.get(i).calcularSalario());
                    b = true;
                }

            }
            if (b == false) {
                this.objetoformulario.letreroinformacion("El profesor no ha sido encontrado en la lista");
            }
        }
        if (e.getSource() == this.objetoformulario.getBtnnominageneral()) {
            for (int i = 0; i < this.listapersona.size(); i++) {
                this.objetoformulario.getInformacion().append("\n " + this.listapersona.get(i).toString() + "\n Se le debe pagar al docente: " + this.listapersona.get(i).calcularSalario());
            }
        }
        if (e.getSource() == this.objetoformulario.getBtnconsultarnomina()) {
            float salarioa = 0;
            for (int i = 0; i < this.listapersona.size(); i++) {

                salarioa = salarioa + this.listapersona.get(i).calcularSalario();
            }
            this.objetoformulario.getInformacion().append("El valor total de la nomina general es: " + salarioa);
        }
        if (e.getSource() == this.objetoformulario.getBtningresarAutentificacion()) {
            if (this.objetoformulario.getTxtpassword().getText().equals("1234")) {
                this.objetoformulario.setVisible(true);
            } else {
                this.objetoformulario.letreroinformacion("error contraseña incorrecta");
            }
        }
        if (e.getSource() == this.objetoformulario.getBtnsalir()) {
            System.exit(0);
        }
    }
}
