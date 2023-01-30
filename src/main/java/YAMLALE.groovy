import groovy.transform.Canonical
import groovy.yaml.YamlBuilder
import groovy.yaml.YamlSlurper

@Canonical
class YAMLALE {


     def  ejercicio(){


         def slurper = new YamlSlurper()

         def configuration = '''
version: 3.0
environment: "dev"
context:
  path: "/test"
endpoints:
  url: "/people"
  operations:
    POST: "create"
    GET: "list or get"
    PUT: "/update"
    DELETE: "delete"
'''

         def yaml = slurper.parseText(configuration)

         println "YAML keys: ${yaml.keySet()}"

         yaml.keySet().each { key ->
             println "Key: $key \t Type: ${yaml[key].getClass().name}"
         }

         def yamlBuilder = new YamlBuilder()

         yamlBuilder {
             version 3.0
             environment "dev"
             context {
                 path "/test"
             }
             endpoints {
                 url "/people"
                 operations ("POST":"create", "GET":"list or get", "PUT":"update", "DELETE":"delete")
             }
         }

         println yamlBuilder

         Map configurationMap = [
                 version : 3.0,
                 environment : "dev",
                 context : [path:"/test"],
                 endpoints : [url:"/people",
                              operations: [POST:"create", GET:"list or get",
                                           PUT:"update", DELETE:"delete"]
                 ]
         ]

         def yamlMap = new YamlBuilder()

         yamlMap(configurationMap)

         println yamlMap


         def configurationClass = new Configuration()

         configurationClass.with{
             version = 3.0
             environment = "dev"
             context = [path:"/test"]
             endpoints = [url:"/people",
                          operations: [POST:"create", GET:"list or get",
                                       PUT:"update", DELETE:"delete"]
             ]
         }

         def yamlConfi = new YamlBuilder()

         yamlConfi(configurationClass)

         println yamlConfi

    }
}
