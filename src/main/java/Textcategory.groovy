
class Textcategory {

    static String REGEX=/(http|ftp|https):\/\/([\w_-]+(?:(?:\.[\w_-]+)+))([\w.,@?^=%&:\/~+#-]*[\w@?^=%&\/~+#-])/
   static  boolean  isUrl(String self){

         this==~REGEX
    }

  static  int countUrls(String self){
      self.split(" ").count{
            isUrl(it)
        }
    }

    static  List <String> collecturls(String self){
        (self =~REGEX).collect()
    }
}
