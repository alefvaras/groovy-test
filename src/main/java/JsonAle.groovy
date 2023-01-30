import groovy.json.JsonGenerator
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class JsonAle {

    def ejercicio(){

        String json='{"name":"ale","age":35}'

        String jsonArray='''[
{ "name" : "ale", "age" : 35 },
{ "name" : "yoda", "age" : 11 },
{ "name" : "asesina",  "age" : 10 }
]'''

        //como mapa
        def object=new JsonSlurper().parseText(json)
    //como lista
        def lista=new JsonSlurper().parseText(jsonArray)

//        println(object['name'])
//
//        println(lista)

        assert  lista instanceof List

//        println(lista[0])

        //quiero traerme todos los nombre de la lista
//        def names0 = lista.collect { it.nombre }
        def names=lista*.name

//        println(names)

        //excluir campos en json de salida

        def generator=new JsonGenerator.Options().excludeFieldsByName('name').build()

        String output=generator.toJson(lista)
//        println(JsonOutput.prettyPrint(output))

        URL feedJSON = 'https://refind.com/chrismessina.json?amount=10'.toURL()
//        println(feedJSON.text)
        String jsonFeed =feedJSON.text

        def feed=new JsonSlurper().parseText(jsonFeed)

        feed.each{
            println("""
                title: ${it.title}
                date: ${it.created_at}
                url: ${it.url}

            """)
        }

    }
}
