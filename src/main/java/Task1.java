public class Task1 {
    static String s = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        System.out.println(method(args));
    }

    /**
     * Печатает количество букв (без пробелов и точки) в переменной до определенного символа (не включая его) в строке: "Циклом называется многократное выполнение одних и тех же действий."
     * @param args массив из одного искомого символа
     * @return Количество букв (без пробелов и точки) до определенного символа
     */
    public static int method(String[] args){
        return s.replace(" ","").indexOf(args[0]);
    }
}