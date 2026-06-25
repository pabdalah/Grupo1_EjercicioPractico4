public class Persona {
    // Constante para el sexo por defecto
    private static final char SEXO_DEFECTO = 'H';

    // Atributos encapsulados (Modificador private)
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private int peso;
    private int altura;

    // Inicializa los atributos y autogenera la cedula
    public Persona(String nombre, int edad, char sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = validarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.cedula = generarCedulaAleatoria();
    }

    // Metodo privado para validar que el sexo sea correcto o asignar el por defecto
    private char validarSexo(char sexo) {
        char sexoUpper = Character.toUpperCase(sexo);
        if (sexoUpper == 'H' || sexoUpper == 'M') {
            return sexoUpper;
        }
        return SEXO_DEFECTO;
    }

    // Metodo para generar de forma aleatoria una cedula de 9 digitos
    private String generarCedulaAleatoria() {
        long numeroAleatorio = (long) (Math.random() * 900000000L) + 100000000L;
        return String.valueOf(numeroAleatorio);
    }

    // Metodo para calcular el IMC usando la formula 
    public double calcularIMC() {
        double alturaMetros = this.altura / 100.0;
        return this.peso / Math.pow(alturaMetros, 2);
    }

    // Metodo para determinar el estado de salud según la tabla proporcionada
    public String obtenerEstadoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc < 25.0) {
            return "PESO NORMAL";
        } else if (imc < 30.0) {
            return "SOBREPESO";
        } else if (imc < 35.0) {
            return "OBESIDAD I";
        } else if (imc < 40.0) {
            return "OBESIDAD II";
        } else {
            return "OBESIDAD III";
        }
    }

    // Metodo para comprobar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    // Metodo para estructurar la informacion del reporte individual
    public String generarInforme() {
        String condicionEdad = esMayorDeEdad() ? "Mayor de edad" : "Menor de edad";
        return "==================================\n" +
               "INFORME DE: " + nombre.toUpperCase() + "\n" +
               "==================================\n" +
               "• Cedula (Autogenerada): " + cedula + "\n" +
               "• Edad: " + edad + " años (" + condicionEdad + ")\n" +
               "• Sexo: " + (sexo == 'H' ? "Hombre" : "Mujer") + "\n" +
               "• Peso: " + peso + " kg\n" +
               "• Altura: " + altura + " cm\n" +
               "• IMC: " + String.format("%.2f", calcularIMC()) + " -> " + obtenerEstadoIMC() + "\n";
    }

    // Metodos Get necesarios para acceder a la informacion
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCedula() { return cedula; }
    public char getSexo() { return sexo; }
    public int getPeso() { return peso; }
    public int getAltura() { return altura; }
}
