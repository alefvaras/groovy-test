class Mapas {

    def ejercicio() {

//
//        def map=[:]

        def map=[name0:'alejandro0']
        //version antigua java
        map.put('name','alejandro')
        map['name2']='alejandro2'
        map.name3='alejandro3'
        map << [name4:'alejandro4']

        println(map)

        println(map.get('name'))
        println(map['name2'])
        println(map.name3)

        //eliminar
        map.remove('name')

        def map2=map.minus([name0:'alejandro0'])
        // es lo mismo         def map2= map - [name0: 'alejandro0']

        // sumar un elemtno
//        def map3= map.plus([name0: 'alejandro0'])
        def map3= map + [name0: 'alejandro0']

        //devuelve todas las llaves
        map.keySet()
        //devuelve un true o false
        map.containsKey('yoda')

        map.size()

        map.each {element->
            println("""
               ${element.key}
             ${element.value}
""")
        }

//       def entry= map.find {entry-> entry.value=='alejandro'}

        def people=[1:[name:'ale',age:35],2:[name:'yoda',age:11]]

        def names=people.collect {entry->entry.value['name']}

def grouped=people.groupBy {x->x.value.age>33}

        println(grouped)

    }
}
