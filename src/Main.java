public class Main {
    public static void main(String[] args) {
      String file=  FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).export("TEST CONTENT");
   System.out.println(file);

    }
}