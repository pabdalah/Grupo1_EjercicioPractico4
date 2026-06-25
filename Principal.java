import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Solicitamos la cantidad de registros para dimensionar nuestro arreglo estatico
        String cantidadStr = JOptionPane.showInputDialog(null, "¿Cuantas personas desea registrar?", "Registro de Personas", JOptionPane.QUESTION_MESSAGE);
        
        if (cantidadStr == null || cantidadStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada o entrada invalida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int cantidad = Integer.parseInt(cantidadStr);
        // Inicialización del arreglo 
        Persona[] listaPersonas = new Persona[cantidad];

        // Captura de datos de cada persona
        for (int i = 0; i < cantidad; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos de la persona " + (i + 1) + " de " + cantidad, "Formulario de entrada", JOptionPane.INFORMATION_MESSAGE);

            String nombre = JOptionPane.showInputDialog("Nombre:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
            
            String sexoInput = JOptionPane.showInputDialog("Sexo (H para Hombre, M para Mujer):");
            // Si el usuario da cancelar o deja vacio, pasamos un caracter vacío para activar el valor por defecto
            char sexo = (sexoInput != null && !sexoInput.trim().isEmpty()) ? sexoInput.charAt(0) : ' ';

            int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (en kg enteros):"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura (en cm enteros):"));

            // Instanciamos el objeto y lo guardamos en la posicion correspondiente del arreglo
            listaPersonas[i] = new Persona(nombre, edad, sexo, peso, altura);
        }

        // Construccion del reporte final con los datos 
        StringBuilder reporteFinal = new StringBuilder();
        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i] != null) {
                reporteFinal.append(listaPersonas[i].generarInforme()).append("\n");
            }
        }

        // Mostrar toda la informacion recopilada en un unico cuadro de dialogo
        JOptionPane.showMessageDialog(null, reporteFinal.toString(), "Reporte General de Salud", JOptionPane.INFORMATION_MESSAGE);
    }
}
