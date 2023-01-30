class ClousureAle {


    void ejercicio() {

        def squiare = { int num ->

            num * num
        }
        def squiare2 = { int num,int num2 ->

            num * num2
        }

        List numbers=[2,3,4,5,6,3]

        List squiares=numbers.collect(squiare)

        //curry crea un nuevo clusure aparte de otro con los argumentos que uno les quiera dar

        def newS=squiare2.curry(2,3)
//        def newS=squiare2.rcurry(2,3)
//        println(newS.call())

//        List squiares2=numbers.collect({squiare2(it,2)})
//
//
//        println(squiares2)

//        Closure printmessage = {
//            println("hello dev ${it}")
//        }
//        printmessage('ale')
//        //igual
//        printmessage.call('ale call')
//
//        println(    squiare.call(5))



        String sampleText = """Lorem ipsum dolor sit amet, consectetur adipiscing elit http://google.com.mx Integer
pharetra elit a elit molestie vehicula. Sed in eros mi. Aliquam massa elit, iaculis eget velit non,
malesuada elementum nisl. Cras urna sem, ornare quis turpis id, https://youtube.com facilisis ultrices massa. Duis sit amet
pretium ligula. Curabitur in libero vehicula, facilisis diam eget, maximus velit. Vestibulum ut orci at
velit vulputate placerat https://github.com Nunc varius a arcu nec lacinia. Vestibulum et magna http://facebook.com et metus
venenatis suscipit."""

        String regex = /http[s]?:\/\/[-A-Za-z0-9.\/_-]*[-A-Za-z0-9._-]/

        Closure collectUrls = { text ->
            (text =~ regex).collect()
        }
        List urls = collectUrls(sampleText)

//        println(urls)

        Closure isUrl = { text ->
            text ==~ regex
        }

        int urlsCount = sampleText.split(' ').count(isUrl)

//        println(urlsCount)

//
//        URL source = "https://s1.eestatic.com/2020/05/18/como/gatos-mascotas-trucos_490961518_152142875_1706x960.jpg".toURL()
//
//        String dowloadFolder=System.getProperty("user.home")+File.separator+"Desktop"+File.separator+"clousures"
//
//        File destination = new File(dowloadFolder , "gato.jpg")
//
//
//        Closure downloadFile = { url, file ->
//            url.withInputStream {is->
//                println "start download"
//                file.withOutputStream {os->
//                    def bs = new BufferedOutputStream( os )
//                    bs << is
//                }
//                println "finish downlad the file $file"
//            }
//        }
//
//
//        downloadFile(source,destination)
        def webpage = "https://joxebus.github.io"
        String downloadFolder = System.getProperty("user.home") + File.separator + "Downloads"
        def srcImageRegex = /assets\/images[-A-Za-z0-9.\/_-]*[-A-Za-z0-9._-]/

        Closure collectImageAssets = { text ->
            (text =~ srcImageRegex).collect()
        }


        Closure toFullUrl = { path ->
            webpage.concat('/').concat(path)
        }

        List images = collectImageAssets(webpage.toURL().text).collect(toFullUrl)
        Closure downloadFile = { url, fileName ->
            File destination = new File(downloadFolder , fileName)
            url.withInputStream {is->
                println "start download ${fileName}"
                destination.withOutputStream {os->
                    def bs = new BufferedOutputStream( os )
                    bs << is
                }
                println "finish downlad the file $fileName"
            }
        }

        images.each{ fullUrl ->
            String fileName = fullUrl.substring(fullUrl.lastIndexOf('/')+1)
            downloadFile(fullUrl.toURL(), fileName)
        }
    }


}
