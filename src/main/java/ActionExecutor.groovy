class ActionExecutor {

    Map<String, Closure> actions = [:]

    def methodMissing(String name, args) {
        Closure closure = actions[name]
        if(closure) {
            closure.call(args)
        } else {
            throw new MissingMethodException(name, ActionExecutor.class, args)
        }
    }

}
//List elements = ['This', 'is', 'a', 'sample']
//ActionExecutor ae = new ActionExecutor()
//
//ae.actions << ['sortArgs': { args -> args.sort{ it.toLowerCase() }}]
//ae.actions << ['printArgsLenght': { args -> println args.collect{ "$it:${it.size()}"} }]
//
//List sorted = ae.sortArgs(*elements)
//ae.printArgsLenght(*sorted)