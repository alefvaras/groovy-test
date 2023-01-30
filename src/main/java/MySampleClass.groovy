class MySampleClass {

    Map props = [:]

    def propertyMissing(String propertyName, String value) {
        props[propertyName] = value
    }

    def propertyMissing(String propertyName) {
        props[propertyName]
    }

    def methodMissing(String name, args) {
        println """
      method: ${name}
      args: ${args}
      """
    }

    static def $static_methodMissing(String name, Object args) {
        println "El metodo estático de nombre [$name] y argumentos [$args] no existe"
    }

}

//    MySampleClass.myStaticMethod("Ejemplo", "invocación", "dinámica")
//
//    def object = new MySampleClass()
//
//    object.someProperty = "Esta propiedad no existe"
//
//    println object.someProperty
//
//    object.doSomethingWithArgs("Hola", "Desveloper", 33)