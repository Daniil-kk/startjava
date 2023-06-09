class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1 - Вывод характеристик компьютера");
        byte core = 6; // кол-во ядер
        short cash_memory = 8; //Кэш память
        int ssd = 256;//Объем ssd
        long memory_freq = 2666l;//Частота памяти, большего числа нет
        float max_frec_clock = 4.0f;//Максимальная тактовая частота
        double diagonal = 35.5;//Диагональ экрана
        char symbol = 'k';//Символ
        boolean  bool = true;
        System.out.println(core);
        System.out.println(cash_memory);
        System.out.println(ssd);
        System.out.println(memory_freq);
        System.out.println(max_frec_clock);
        System.out.println(diagonal);
        System.out.println(symbol);
        System.out.println(bool);

        System.out.println("2 - Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int sum = pen + book; //сумма
        int discount_amount = sum/100*11;//сумма скидки
        int discount_item = sum-discount_amount;
        System.out.println(sum);
        System.out.println(discount_amount);
        System.out.println(discount_item);

        System.out.println( "1 -  Вывод слово JAVA");
        System.out.println("     J      a  v      v   a         \n" +
        "     J     a a  v    v   a a\n"  +
        " J   J    aaaaa  V  V   aaaaa\n" +
        "  JJ     a     a   V   a     a  ");

        System.out.println("4 -  Вывод min и max значений целых числовых типов");
        byte max_byte = 127;
        short max_short = 32767;
        int max_int = 2147483647;
        long max_long = 9223372036854775807l;
        System.out.println(127);//max_byte
        System.out.println(-128);// ,++i, сразу увеличивает на единицу
        System.out.println(127);//--i;

        System.out.println(32767);//max_short
        System.out.println(-32768);
        System.out.println(32767);

        System.out.println(2147483647);//max_int
        System.out.println(-2147483648);
        System.out.println(2147483647);

        System.out.println(9223372036854775807l);//max_long
        System.out.println(-9223372036854775808l);
        System.out.println(9223372036854775807l);

        System.out.println("5 - Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3;
        System.out.println("С помощью третьей переменной");
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("num1 " + "= " + 2 + ", num2 " + "= "+ 5 +"\n" +
        "num1 " + "= " + num1 + ", num2 " + "=" + num2);
        System.out.println("С помощью арифметических операций");
        num1 += num2;
        num2 = num1 - num2;
        num1-=num2;
        System.out.println("num1 " + "=  " + 5 + " , num2 " + " = " + 2 + "\n" + 
        "num1 " + "= " + num1 + ", num2 " + "= "+ num2);
        System.out.println("С помощью побитовой операции");
        num1^=num2;
        num2^=num1;
        num1^=num2;
        System.out.println("num1 " + "= " + 2 + " , num2 " + " = " + 5 + "\n" + 
        "num1 " + "= " + num1 + ", num2 " + "= " + num2);

        System.out.println("6 - Вывод символов и их кодов");
        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '_';
        int symb1 = (int) symbol1;
        int symb2 = (int) symbol2;
        int symb3 = (int) symbol3;
        int symb4 = (int) symbol4;
        int symb5 = (int) symbol5;
        System.out.println("symbol1 = " + symbol1 + "\n" +
        symb1);
        System.out.println("symbol2 = " + symbol2 + "\n" + 
        symb2);
        System.out.println("symbol3 = " + symbol2 + "\n" + 
        symb3);
        System.out.println("symbol4 = " + symbol4 + "\n" + 
            symb4);
        System.out.println("symbol5 = " + symbol5 + "\n" + 
        symb5);

        System.out.println("7 - Вывод в консоль ASCII-арт Дюка");
        String slash = "/";
        String underscore = "_";
        String left_parenthesis = "(";
        String right_parenthesis = ")";
        String backslash = "\\";
        String augmented_underline = "____";
        System.out.println("     " + slash + " " + backslash + "\n"+
        "    " + slash + "   " + backslash + "\n" +
        "   " + slash + underscore + left_parenthesis + "  " + right_parenthesis + backslash + "\n" +
        "  " + slash +"       " + backslash + "\n" +
        " " + slash + augmented_underline + slash + backslash + underscore+underscore+underscore+backslash);

        System.out.println("8 - Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int x = 123/100;
        int y = 123/10;
        int z = 123/1;

        System.out.println("Число " + n +" содержит:" + "\n" +
        x + " сотен" +"\n" +
        y + " десятков" + "\n" +
        z + " единиц" + "\n" +
        "сумма его цифр = " + 6 + "\n" +
        "произведение = " + 6); 

        System.out.println("9 - Вывод времени");
        int seconds = 86399;
        int minutes = seconds%60;
        int seconds1 = minutes%60;
        int hours = 86399%24;
        System.out.println(hours + ":" + minutes  +":" + seconds1 );
      }
   }
    
 