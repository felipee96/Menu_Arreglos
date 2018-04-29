package arreglos_menu;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_2
 */
public class Arreglos_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 0;
        int z = 0;
        int aux;
        int opcionPrincipal;
        int opcion;
        int vector[] = new int[3];
        boolean cambios = false;

        do {
            opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog("Digite su opcion: \n 1-ORDENAMIENTO BURBUJA \n 2-ORDENAMIENTO SHELL \n 3-ORDENAMIENTO QUICKSORT \n 4-ORDENAMIENTO DE ARREGLOS \n 5-SALIR"));

            switch (opcionPrincipal) {
                case 1:

                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite su opcion: \n 1-INGRESAR DATOS \n 2-IMPRIMIR ARREGLO \n 3-ORDENAR ARREGLO \n 4-VOLVER"));

                        switch (opcion) {
                            case 1:
                                Arreglo.Ingresar(vector);
                                break;
                            case 2:
                                System.out.println("METODO DE ORDENAMIENTO BURBUJA");
                                Arreglo.Mostrar(vector);
                                break;
                            case 3:
                                Arreglo obj = new Arreglo();
                                obj.ordenarBurbuja(vector);
                                System.out.println("VECTOR ORGANIZADO\n");
                                for (int i = 0; i < vector.length; i++) {
                                    System.out.println(" " + vector[i]);
                                }
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Usted selecciono volver");
                                z = 1;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Su opcion no existe");
                        }
                    } while (z == 0);
                    z = 0;

                    break;

                case 2:
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite su opcion: \n 1-INGRESAR DATOS \n 2-IMPRIMIR ARREGLO \n 3-ORDENAR ARREGLO \n 4-VOLVER"));

                        switch (opcion) {
                            case 1:
                                Arreglo.Ingresar(vector);
                                break;
                            case 2:
                                System.out.println("METODO DE ORDENAMIENTO SHELL");
                                Arreglo.Mostrar(vector);
                                break;
                            case 3:
                                Arreglo.shell(vector);
                                System.out.println("VECTOR ORGANIZADO\n");
                                for (int i = 0; i < vector.length; i++) {
                                    System.out.println(" " + vector[i]);
                                }
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Usted selecciono volver");
                                z = 1;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Su opcion no existe");
                        }
                    } while (z == 0);
                    z = 0;
                    break;
                case 3:
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite su opcion: \n 1-INGRESAR DATOS \n 2-IMPRIMIR ARREGLO \n 3-ORDENAR ARREGLO \n 4-VOLVER"));

                        switch (opcion) {
                            case 1:
                                Arreglo.Ingresar(vector);
                                break;
                            case 2:
                                System.out.println("METODO DE ORDENAMIENTO QUICKSORT");
                                Arreglo.Mostrar(vector);
                                break;
                            case 3:
                                QuickSort o = new QuickSort();
                                o.ordenarquicksort(vector);
                                System.out.println("VECTOR ORGANIZADO\n");
                                for (int i = 0; i < vector.length; i++) {
                                    System.out.println(" " + vector[i]);
                                }
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Usted selecciono volver");
                                z = 1;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Su opcion no existe");
                        }
                    } while (z == 0);
                    z = 0;
                    break;
                case 4:
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Usted selecciono salir");
                    x = 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Su opcion no existe");
            }
        } while (x == 0);
        x = 0;
    }

}
