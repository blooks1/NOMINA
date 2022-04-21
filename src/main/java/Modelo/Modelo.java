package Modelo;

import java.util.ArrayList;
import Controlador.Controlador;

public class Modelo {

    private String nombre;
    private long cc;
    private String vinculacion;
    private int vinculaciona;
    private int estudios;
    private String estudiosa;
    private int salario;
    private int hora;

    @Override
    public String toString() {
        return "El profesor: " + this.nombre
                + "\n identificado con cc: " + this.cc
                + "\n con el tipo de vinculacion: " + this.vinculacion
                + "\n con el nivel de estudios: " + this.estudiosa;
    }
    public float calcularSalario() {
        if (estudios == 0) {
            if (vinculaciona == 0) {
                return salario = 2000000 - (8 * 2000000 / 100);
            }
            if (vinculaciona == 1) {
                return salario = (50 * 2000000 / 100) - (8 * (50 * 2000000 / 100) / 100);
            }
            if (vinculaciona == 2) {
                return salario = (hora * 2000000 / 240) - (8 * (hora * 2000000 / 240) / 100);
            }
        }
        if (estudios == 1) {
            if (vinculaciona == 0) {
                return salario = 3000000 - (8 * 3000000 / 100);
            }
            if (vinculaciona == 1) {
                return salario = (50 * 3000000 / 100) - (8 * (50 * 3000000 / 100) / 100);
            }
            if (vinculaciona == 2) {
                return salario = (hora * 3000000 / 240) - (8 * (hora * 3000000 / 240) / 100);
            }
        }
        if (estudios == 2) {
            if (vinculaciona == 0) {
                return salario = 5000000 - (8 * 5000000 / 100);
            }
            if (vinculaciona == 1) {
                return salario = (50 * 5000000 / 100) - (8 * (50 * 5000000 / 100) / 100);
            }
            if (vinculaciona == 2) {
                return salario = (hora * 5000000 / 240) - (8 * (hora * 5000000 / 240) / 100);
            }
        }
        if (estudios == 3) {
            if (vinculaciona == 0) {
                return salario = 8000000 - (8 * 8000000 / 100);
            }
            if (vinculaciona == 1) {
                return salario = (50 * 8000000 / 100) - (8 * (50 * 8000000 / 100) / 100);
            }
            if (vinculaciona == 2) {
                return salario = (hora * 8000000 / 240) - (8 * (hora * 8000000 / 240) / 100);
            }
        }
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public String getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(String vinculacion) {
        this.vinculacion = vinculacion;
    }

    public int getVinculaciona() {
        return vinculaciona;
    }

    public void setVinculaciona(int vinculaciona) {
        this.vinculaciona = vinculaciona;
    }

    public int getEstudios() {
        return estudios;
    }

    public void setEstudios(int estudios) {
        this.estudios = estudios;
    }

    public String getEstudiosa() {
        return estudiosa;
    }

    public void setEstudiosa(String estudiosa) {
        this.estudiosa = estudiosa;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

}
