import groovy.transform.ToString

@ToString
class Truth {

    int edad

    boolean asBoolean(){
        edad>18
    }
    def ejercicios(){

//        println(this?this:'menor de edad')
//        operador elvis
        println(this?:'menor de edad')
//        if(this.getEdad()>18){
//            println('mayor de edad')
//        }else{
//            println('menor de edad')
//        }
    }

}
