
/**
 *
 @version 0.0.1
 @author Vasiliy Matveev */
public class HomeWork2Task1 {

    public static void main(String[] args) {
        Object b = null;
        int[] array = {0,1,2};
        try {
           // System.out.println(array[3]); - если расскоментировать выпадет исключение ArrayIndexOutOfBounds
          //  f(); // Функция выкидывает собственное исключение MyException
            System.out.println(b.getClass()); // строка порождает исключение NullPointException
        } catch (NullPointerException e) {
            System.out.println("в переменной b значение null - вызван обработчик исключения");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        } catch (MyException e){
            System.out.println("поймано созданное исключениe");
        } finally {
            System.exit(1);
        }

    }

    static class MyException extends RuntimeException {}

    public static void f() throws MyException { throw new MyException();}

}
