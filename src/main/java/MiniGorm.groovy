class MiniGorm {
    def db = []

    def methodMissing(String methodName, args) {
        methodName = methodName.toLowerCase()-"findby"
        switch(methodName) {
            case {it =~ /notlike+/ }:
                def property = methodName - "notlike"
                db.findAll { elem-> !elem[property].contains(args[0])}
                break
            case {it =~ /like+/ }:
                def property = methodName - "like"
                db.findAll { elem-> elem[property].contains(args[0])}
                break
            default:
                "Operacion no soportada"

        }
    }
}

//List people = [
//        [first: "Omar", last:"Bautista"],
//        [first: "Jorge", last:"Valenzuela"],
//        [first: "Mia", last:"Bautista"],
//        [first: "Maria", last:"Ojeda"]
//]
//
//def miniGorm = new MiniGorm(db:people)
//
//println miniGorm.findByFirstLike("Maria") // [first: "Maria", last:"Ojeda"]
//println miniGorm.findByLastLike("Bautista") // [first: "Omar", last:"Bautista"], [first: "Mia", last:"Bautista"]
//println miniGorm.findByLastNotLike("Bautista") // [first: "Jorge", last:"Valenzuela"], [first: "Maria", last:"Ojeda"]