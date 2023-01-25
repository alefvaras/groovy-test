class TiposDatos {


    def inmutable(){

        def algo=1
        println algo.class.name

        algo='ale'
        println algo.class.name

        def write={
            println algo
            println algo.class.name
        }
        write()

    }

    void ejercicios() {
        println('main ejercicio')
        def name = '"alejandro"'
        def map = [:]
        def elemts = [1, 'ddd', 0..100, 'a'..'z']
        elemts.each {
            println(it.class.name)
        }
        def list = []
        println(list.class.name)


//        def name = '"Desveloper"'
//        def map = [:]                               // java.util.LinkedHashMap
//
//        def elements = [1,                          // java.lang.Integer
//                        11111111111,                    // java.lang.Long
//                        11111111111111111111,           // java.math.BigInteger
//                        0.1,                            // java.math.BigDecimal
//                        0..5,                           // groovy.lang.IntRange
//                        'x'..'p',                       // groovy.lang.ObjectRange
//                        "Normal String",                // java.lang.String
//                        'Another normal String',        // java.lang.String
//                        "GString with value $name",     // groovy.lang.GString
//                        [],                             // java.util.ArrayList
//
//        ]
//
//        elements.each{ println it.class.name }
//        println map.getClass().name

    }
}
