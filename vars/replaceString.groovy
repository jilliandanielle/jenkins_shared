def call(String fileName){
     def text = readFile file: "${fileName}"
     text = text.replaceAll("%BUILD_NUMBER%","${BUILD_NUMBER}" )
     writeFile file: "${fileName}", text: text
 }

