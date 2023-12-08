public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(){
        super("Sıfır ile bölme hatası!");
    }
    public DivisionByZeroException(String mesaj){
        super(mesaj);
    }
}
