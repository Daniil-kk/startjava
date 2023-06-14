class VariablesTheme {

    public static void main(String[] args) {
              System.out.println("1 - Вывод характеристик компьютера");
        byte core = 6; // кол-во ядер
        short cashMemory = 8; //Кэш память
        int ssd = 256;//Объем ssd
        long memoryFreq = 2666l;//Частота памяти, большего числа нет
        float maxFrecClock = 4.0f;//Максимальная тактовая частота
        double diagonal = 35.5;//Диагональ экрана
        char symbol = 'k';//Символ
        System.out.println(core);
        System.out.println(cashMemory);
        System.out.println(ssd);
        System.out.println(memoryFreq);
        System.out.println(maxFrecClock);
        System.out.println(diagonal);
        System.out.println(symbol);

        System.out.println("2 - Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int sum = penPrice + bookPrice; //сумма
        int discountAmount = sum / 100 * 11;//сумма скидки
        int discountPrice = sum - discountAmount;
        System.out.println(sum);
        System.out.println(discountAmount);
        System.out.println(discountPrice);

        System.out.println("3 -  Вывод слово JAVA");
        System.out.println("     J      a  v      v   a         \n" +
                "     J     a a  v    v   a a\n" +
                " J   J    aaaaa  V  V   aaaaa\n" +
                "  JJ     a     a   V   a     a  ");

        System.out.println("4 -  Вывод min и max значений целых числовых типов");
        byte max_byte = 127;
        short max_short = 32767;
        int max_int = 2147483647;
        long max_long = 9223372036854775807l;
        System.out.println(max_byte);//max_byte
        System.out.println(++max_byte);// ,++i, сразу увеличивает на единицу
        System.out.println(--max_byte);//--i;

        System.out.println(max_short);//max_short
        System.out.println(++max_short);
        System.out.println(--max_short);

        System.out.println(max_int);//max_int
        System.out.println(++max_int);
        System.out.println(--max_int);

        System.out.println(max_long);//max_long
        System.out.println(++max_long);
        System.out.println(--max_long);

        System.out.println("5 - Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3;
        System.out.println("С помощью третьей переменной");
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("num1 " + "= " + 2 + ", num2 " + "= " + 5 + "\n" +
                "num1 " + "= " + num1 + ", num2 " + "=" + num2);
        System.out.println("С помощью арифметических операций");

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("num1 " + " =  " + 5 + " , num2 " + " = " + 2 + "\n" +
                "num1 " + "= " + num1 + ", num2 " + "= " + num2);
        System.out.println("С помощью побитовой операции");

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
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
        String leftParenthesis = "(";
        String rightParenthesis = ")";
        String backslash = "\\";
        String augmentedUnderline = "____";
        System.out.println("     " + slash + " " + backslash + "\n" +
                "    " + slash + "   " + backslash + "\n" +
                "   " + slash + underscore + leftParenthesis + "  " + rightParenthesis + backslash + "\n" +
                "  " + slash + "       " + backslash + "\n" +
                " " + slash + augmentedUnderline + slash + backslash + underscore + underscore + underscore + backslash);

        System.out.println("8 - Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int x = 123 / 100;
        int y = 123 / 10;
        int z = 123 / 1;

        System.out.println("Число " + n + " содержит:" + "\n" +
                x + " сотен" + "\n" +
                y + " десятков" + "\n" +
                z + " единиц" + "\n" +
                "сумма его цифр = " + 6 + "\n" +
                "произведение = " + 6);

        System.out.println("9 - Вывод времени");
        int time = 86399;
        int minutes = time % 60;
        int seconds = time % 60;
        int hours = 86399 % 24;
        System.out.println(hours + ":" + minutes + ":" + seconds);
      }
   }
    
 