/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraybidimensional;

import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class Notas {

    int[][] notas = new int[3][4];
    int[] medias = new int[notas.length];

    public void crearTaboa() {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Notas :"));
            }
        }
    }

    public void amosar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("|\n");
        }
    }

    public void mediAlumno() {
        int acu, f, c;
        for (f = 0; f < notas.length; f++) {
            acu = 0;
            for (c = 0; c < notas[f].length; c++) {
                acu = acu + notas[f][c];
            }
            System.out.println("media :" + acu / notas[f].length);
        }
    }

    public int[] mediAlumno2() {
        int acu, f, c;
        int[] medias = new int[notas.length];
        for (f = 0; f < notas.length; f++) {
            acu = 0;
            for (c = 0; c < notas[f].length; c++) {
                acu = acu + notas[f][c];
            }
            medias[f] = acu / notas[f].length;
        }
        return medias;
    }

//media de las columnas
    public int[] mediaModulo() {
        int[] modulo = new int[notas.length];
        int acu, f, c;
        for (f = 0; f < notas.length; f++) {
            acu = 0;
            for (c = 0; c < notas[f].length; c++) {
                acu = acu + notas[f][c];
            }
            modulo[f] = acu / notas[f].length;
        }
        System.out.println("modulo :" + modulo[f]);
        return modulo;
    }

    public void ordenar() {
        int aux1 = 0, aux2 = 0;
        for (int i = 0; i < medias.length - 1; i++) {
            for (int j = i + 1; j < medias.length - 1; j++) {
                if (medias[i] > medias[j]) {
                    aux1 = medias[i];
                    medias[i] = medias[j];
                    medias[j] = aux1;
                    for (int k = 0; k < notas[0].length; k++) {
                        aux2 = notas[i][k];
                        notas[j][k] = aux2;

                    }
                }

            }
        }
    }
}
