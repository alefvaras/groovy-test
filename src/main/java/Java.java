public class Java {

    private int edad;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void ejercicio(){



        if(getEdad()>18){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }
    }


    public static void main(String[] args) {
         Java java=new Java();
         java.ejercicio();


    }

}
