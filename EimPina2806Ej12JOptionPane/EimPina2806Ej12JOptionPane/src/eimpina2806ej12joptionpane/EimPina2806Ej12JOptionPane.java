
/*
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package eimpina2806ej12joptionpane;

/*
A)Crear una aplicación, que permita el ingreso de 2 números, para luego calcular
la suma, resta, división, multiplicación, división y residuo. 
B)Ingrese por teclado el puntaje de un alumno que ha postulado a la Universidad,
visualice un mensaje “Alumno Ingresado” si el puntaje obtenido es mayor a 500.

Mostrar y solicitar valores utilizando JOPTIONPANE
*/

import javax.swing.JOptionPane;   


public class EimPina2806Ej12JOptionPane {

    public static void main(String[] args) {

        
        // Ejercicio A)
        
        int selector;
        String primer, segundo;
        int primernumero, segundonumero,suma,resta;
        float division,resto;
        long multiplicacion;
        
        do{
            primer= JOptionPane.showInputDialog(null, "Ingrese el primer numero:", "Primer numero", JOptionPane.OK_OPTION);
            segundo=JOptionPane.showInputDialog(null, "Ingrese el segundo numero:", "Segundo numero", JOptionPane.OK_OPTION);
               
        }while ( (!primer.matches("[0-9]+")) || (!segundo.matches("[0-9]+")));
                
        primernumero = Integer.parseInt(primer);
        segundonumero = Integer.parseInt(segundo);
                
        selector = JOptionPane.showOptionDialog(null, "Elija una tarea a realizar con "+primernumero+" y con "+segundonumero
                , "Bienvenido a la calculadora simple",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object [] {"suma","resta","division","multiplicacion"},"suma");
        
        if (selector == -1){
            JOptionPane.showMessageDialog(null, "¿Seguro desea salir?");
            }
        
        switch (selector+1) {
            case 1: suma=primernumero+segundonumero; 
                JOptionPane.showMessageDialog(null, "La suma es "+suma); break;
            case 2: resta=primernumero-segundonumero; 
                JOptionPane.showMessageDialog(null, "La resta es "+resta); break;
            case 3: division= ( primernumero/segundonumero ); 
                resto= (primernumero % segundonumero);
                JOptionPane.showMessageDialog(null, "La division es "+division+" . "+"El resto que queda es "+resto); break;
            case 4: multiplicacion = (primernumero * segundonumero); 
                JOptionPane.showMessageDialog(null, "La multiplicacion es "+multiplicacion); break;
            } 
        
        //Ejercicio B

        String puntaje,nombre;
        int puntos;
        
        
            do{
                nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno:", "Alumno", JOptionPane.OK_OPTION);
            }while (!nombre.matches("[a-zA-Z]+") );
        

            do{
                puntaje= JOptionPane.showInputDialog(null, "Ingrese el puntaje del alumno:", "Alumno", JOptionPane.OK_OPTION);
            }while (!puntaje.matches("[0-9]+"));
       
        puntos = Integer.parseInt(puntaje);
        
        if (puntos > 500){ 
            JOptionPane.showMessageDialog(null,  "Alumno ingresado", "Confirmacion",JOptionPane.INFORMATION_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(null, "Alumno NO ingresado", "Confirmacion", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
        
        
        
        }


    }
    
