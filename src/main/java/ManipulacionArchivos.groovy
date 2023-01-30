import groovy.io.FileType

class ManipulacionArchivos {


    def ejercicio(){

        String regex=/src/
        File file = ['/Users/alejandrofernandez/IdeaProjects/test/ale.txt']

        //lee por linea
        String lines =file as String[]




//        println(lines)

//        file.eachLine {println(it)}

        File directorio = ['/Users/alejandrofernandez/IdeaProjects/test/']
        File output = ['/Users/alejandrofernandez/IdeaProjects/test/archivos.groovy']
        def outWriter=output.newPrintWriter()

        directorio.eachFileRecurse {arch->{
            if(arch==~~ /.*\.groovy/){
               outWriter.println("---- fuente> ${arch.getPath()}")

                arch.eachLine {line->{
                    outWriter.println(line)
                }}
                outWriter.println("--------")
            }
        }}

        outWriter.close()
//        directorio.eachFile {println(it.name)}
//        println directorio.list()

        //muestra de manera recursiva, dentro de las carpetas todos los recursos
//        directorio.eachFileRecurse {println(it.name)}

//        List <String>nombreArchivo=[]
//        List <String> nombreDirectorio=[]

//        directorio.eachFile {archivo->{
//            if(archivo.isFile()){
////                nombreArchivo.add(archivo)
////                es lo mismo
//                nombreArchivo << archivo.name
//            }
//        }}

        //iterar directorios

//        directorio.eachFile(FileType.DIRECTORIES) { archivo ->
//            {
//
//                nombreArchivo << archivo.name
//
//            }
//        }
//        directorio.eachFileMatch (~regex){archivo->{
//            nombreArchivo << archivo.name
//        }}

        //lista se puede restar el contenido que se repite por sobrecarga de metodo

//        nombreDirectorio = directorio.list()-nombreArchivo
//        println( nombreArchivo)
//        println(nombreDirectorio)

//        println(nombreArchivo)
    }
}
