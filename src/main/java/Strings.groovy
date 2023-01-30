class Strings {


    void ejercicios() {
        def command='ls -lha'

//        println(command.execute().text)


        def algo = 'ale'
        def value = "hola $algo"

        println(value[2..6])

        println(value[6..2])

        println( value.reverse())
        println("class ${value.class.name}  value $value")

        def multilinea = '''
cadena



multilinea
'''
        def multilineaInterpolation = """"
cadena
acepta valores interpolados  GString
${algo}

multilinea
"""

        def slashString = /expresiones regulares es 
multilinea/
        def slashString$ = $/expresiones regulares 

que acepta interpolacion ${algo}/$
        println(multilineaInterpolation)


    }
}
