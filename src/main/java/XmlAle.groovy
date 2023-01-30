import groovy.xml.MarkupBuilder
import groovy.xml.StreamingMarkupBuilder
import groovy.xml.XmlSlurper

class XmlAle {

    def ejercicio(){
        String xml = '''
<people>
   <person age='33'>
     <name>Omar</name>
   </person>
   <person age='30'>
     <name>Maria</name>
   </person>
</people>
'''

        def people = new XmlSlurper().parseText(xml)

        println(people.person[0].name)
        println(people.person[0].@age)
        println(people.person*.@age)


        //escribir xml
        def xml2=new StringWriter()
        def builder=new MarkupBuilder(xml2)

        builder.people(){
            person(name:'alejandro',age:35){
                city('santiago')
            }
            person(name:'alejandro2',age:36)

        }
        println(xml2)

        // otra forma de crear xml
        def builder2= new StreamingMarkupBuilder()

       def xml3= builder2.bind{
            person(name:'alejandro',age:35){
                city('santiago')
            }
            person(name:'alejandro2',age:36)
        }
        println(xml3)

        URL feedXML = 'https://refind.com/chrismessina.rss?amount=10'.toURL()

        def feed = new XmlSlurper().parseText(feedXML.text)


        feed.channel.item.each { entry ->
            println """
   title:   ${entry.title}
   url:     ${entry.link}
   created: ${entry.pubDate}
   """
        }

    
    }
}
