
import groovy.lang.Category

@Category(Integer)
class NumberCategory2 {

     boolean isOdd(){

       (this%2)!=0
   }

     Integer triple(){
        this*3
    }
}
