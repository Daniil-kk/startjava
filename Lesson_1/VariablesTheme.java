class VariablesTheme {

    public static void main (String [] args){
        System.out.println(1 + " - Вывод характеристик компьютера");
        byte b = 6; // кол-во ядер
        short a = 8; //Кэш память
        int s = 256;//Объем ssd
        long l = 2666l;//Частота памяти, большего числа нет
        float f = 4.0f;//Максимальная тактовая частота
        double d = 35.5;//Диагональ экрана
        char c = 'k';//Символ
        boolean  q = true;
        System.out.println(b);
        System.out.println(a);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(q);


        System.out.println(2 + " - Расчет стоимости товара со скидкой");
        int num1 = 100;
        int num2 = 200;
        int sum = num1 + num2; //сумма
        int num3 = sum/100*11;//сумма скидки
        int e = sum-num3;
        System.out.println(sum);
        System.out.println(num3);
        System.out.println(e);

        System.out.println(3 + " Вывод слово JAVA");
           System.out.println("     J      a  v      v   a         \n" +
                "     J     a a  v    v   a a\n"  +
                " J   J    aaaaa  V  V   aaaaa\n" +
                "  JJ     a     a   V   a     a  ");

           System.out.println(4 + " Вывод min и max значений целых числовых типов");
           byte num4 = 127;
           short num5 = 32767;
           int num6 = 2147483647;
           long num7 = 9223372036854775807l;
           System.out.println(num4);
           System.out.println(num4++);// i++,  в начале 
           System.out.println(num4--);//i--;

       }
   }
    
