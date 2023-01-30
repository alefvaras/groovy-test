class Lista {

    def ejercicio() {
        def list = []

        def linkedList = [] as LinkedList
        LinkedList linkedList2 = []
        int[] array = []
        assert list instanceof ArrayList
        assert array instanceof int[]


        def intlist = [1, 2, 3]
        def stringList = ['hola', 'ale']
        def nestedList = [1, 2, 3, [3, 4], 5, 6]
        def heterogeneusList = ['dev', 23, 3.4, [name: 'ale']]

//       println(heterogeneusList.pop()) //remueve el; primer elemento de la lista
//        println(heterogeneusList[0])

        intlist.add(6)
        //es lo mismo
        intlist << 9



        stringList = stringList - 'hola'
//        print(stringList)

        //elinmina elementos repetidos
//        print(intlist.unique())
        //en objeto
        List<Person> listPerson = [['ale': 99], ['yoda': 77],['asesina': 77]]

        println(listPerson.unique())

        //elimina todos las personas repetidas por edad
        println(listPerson.unique({
            a, b -> a.age <=> b.age
        }))

        println(listPerson.findAll {p->p.age==99})
        assert intlist.contains(2)


    }
}
