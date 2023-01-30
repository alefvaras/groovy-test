import groovy.time.TimeCategory
import groovy.transform.AutoClone
import groovy.transform.Canonical
import groovy.transform.Immutable
import groovy.transform.Sortable
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.transform.builder.ExternalStrategy

@Canonical
// incluye todas las anotaciones anteriores

//@ToString(includes = ['name'])
//@EqualsAndHashCode
@TupleConstructor
//crea constructores para cada campo
@AutoClone
//@Builder
@Sortable(includes = ['age', 'name'])
class Person {
    String name;
    int age;

//    @NullCheck
//    void setName(String name) {
//        this.name = name
//    }
}

@Builder(builderStrategy = ExternalStrategy, forClass = Person)
class PersonBuilder {

}

@Singleton
class PersnService {
    static List people = []
}


@Immutable
class PersonInmutable {
    String name;
    int age;
}

static void main(String[] args) {


//category
//    use(TimeCategory){
//        Date date=new Date()
//
//
//        println(date -1.year)
//    }

//    use(NumberCategory) {
//        (1..30).each { number ->
//            if (number.isOdd()) {
//                println("numero ${number} es impar")
//            }
//
//            println("el triple de $number es ${number.triple()}")
//        }

//    use(NumberCategory2) {
//        (1..30).each { number ->
//            if (number.isOdd()) {
//                println("numero ${number} es impar")
//            }
//
//            println("el triple de $number es ${number.triple()}")
//        }
//
//    }

//    String text='https://www.youtube.com/watch?v=WktheNLd84c&list=PLL4p1zl6yzdynlB4dhyUnGq_32km96CHA&index=23 dgdgdgdgdggddg https://www.youtube.com/watch?v=WktheNLd84c&list=PLL4p1zl6yzdynlB4dhyUnGq_32km96CHA&index=20'
//
//    use(Textcategory){
//def urls=text.collecturls()
//        println(urls)
//
//        println(text.countUrls())
//    }

    use(NumberConversorCategory) {
        Meter meters = 10.meters

        Centimeter centimeter = 200.centimeters

        println(centimeter)
        println(meters)

        println(240.centimeters.to.meters)

        println(240.meters.to.centimeter)


    }


//    def yamlAle = new YAMLALE()
//    yamlAle.ejercicio()

//    @Immutable
//
//PersonInmutable personInmutable=new PersonInmutable('ale',35)
//
//    Caught: groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: name for class: PersonInmutable
//    personInmutable.name='yoda'
//
//    println(personInmutable)

//    @NullCheck
//    def person = new Person()
//
//    person.name = null // throws java.lang.IllegalArgumentException
    //@Singleton
//List people=[new Person('ale',39),new Person('ale2',36),new Person('ale3',37)]

//println(people)
    //con ordenamiento
//    println(people.sort())
//
//    println(people.reverse())

//llamar a singleton

//   def personService1= PersnService.instance
//    def personService2= PersnService.instance
//
//    println(personService1.hashCode())
//    println(personService2.hashCode())
//
//    personService1.people<<new Person("ale2",55)
//    personService2.people<<new Person("ale",59)
//
//    println(personService1.people)

    //clonar objeto
//    def person = [name: 'ale', age: 33]
//    def person2 =[name:'ale',age:33]
    //con autoclone
//    def person2 = person

//    def builder = new Person().builder().name('asesina').age(11)
//
//    Person asesina = builder.build()
//
//    println(asesina)

//    def builder = new PersonBuilder().name('asesina').age(11)
//
//    Person asesina = builder.build()
//
//    println(asesina)

//
//println(person)
//    println(person2)

    //groovy probee por defecto un contructor que se le pasa un map
// Person person=new  Person([name:'alejandro',age:36]);
// Person person=[name:'alejandro',age:36];

//  person.setName('ale')
//  person.setAge(35)


// es lo mismo que:
//    person.with {
//        name="drake"
//        age=35}

//    print(person)

//  print("name: ${person.getName()} age: ${person.getAge()}")

//    TiposDatos tiposDatos=new TiposDatos();
//
//    tiposDatos.inmutable()

//    Truth truth = new Truth(edad: 23)

//truth.ejercicios()

//    assert truth.getEdad()>66
//Loops loops=new Loops()
//    loops.ciclos()
//ExpresionesRegulares expresionesRegulares=new ExpresionesRegulares()
//    expresionesRegulares.ejercicio()
//
//    ManipulacionArchivos manipulacionArchivos=new ManipulacionArchivos()
//
//    manipulacionArchivos.ejercicio()

//    Strings strings=[]
//
//    strings.ejercicios()

//    Lista lista=[]
//    lista.ejercicio()

//    Mapas mapas=[]
//    mapas.ejercicio()

//    Fechas fechas=new Fechas()
//    fechas.ejercicio()

//    ClousureAle clousure=[]
//    clousure.ejercicio()

//    JsonAle jsonAle=[]
//
//    jsonAle.ejercicio()


    // XmlAle xmlAle=new XmlAle()
    //xmlAle.ejercicio()


}