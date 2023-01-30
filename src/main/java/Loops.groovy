class Loops {

    def listNames=['ale','yoda','mariana']

    def people=[name:'alejandro',edad:35]

   def ciclos(){

       int count=listNames.size()
//       for(int i=0;i<listNames.size();i++){
//           println listNames[i]
//       }

//       for(String name in listNames){
//           println name
//       }

//       for(String name : listNames){
//           println name
//       }

//       while (count){
//           println listNames[--count]
//       }

//       do{
//           println listNames[--count]
//       }while (count)

//iterar por rango
//       for(i in 1..10){
//           println i
//       }

//       for(i in people){
//           println "${i.key}  --  ${i.value}"
//       }


//       listNames.forEach {println(it)}
//       listNames.forEach {name->
//           println(name)}

//       (0..count).each {number->println(number)}

//       "ejemplo de ciclo".each {println(it)}
//       1.step(10,2){
//           println(it)
//       }

//       1.upto(10){
//           println(it)
//       }

       10.downto(1){
           println(it)
       }


   }
}
