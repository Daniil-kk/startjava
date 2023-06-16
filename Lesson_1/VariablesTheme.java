class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1 - Вывод характеристик компьютера");
        byte core = 6; 
        short cashMemory = 8; 
        int ssd = 256;
        long memoryFreq = 2666l;
        float maxFrecClock = 4.0f;
        double diagonal = 35.5;
        char symbol = 'k';
        boolean onPC = true;
        System.out.println(core);
        System.out.println(cashMemory);
        System.out.println(ssd);
        System.out.println(memoryFreq);
        System.out.println(maxFrecClock);
        System.out.println(diagonal);
        System.out.println(symbol);
        System.out.println(onPC);
        System.out.println("");

        System.out.println("2 - Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int sum = penPrice + bookPrice;
        int discountSum = sum / 100 * 11;
        int discountPrice = sum - discountSum;
        System.out.println(sum);
        System.out.println(discountSum);
        System.out.println(discountPrice);
        System.out.println("");

        System.out.println("3 -  Вывод слово JAVA");
        System.out.println("     J      a  v      v   a\n" +
                "     J     a a  v    v   a a\n" +
                " J   J    aaaaa  V  V   aaaaa\n" +
                "  JJ     a     a   V   a     a  ");
        System.out.println("");

        System.out.println("4 -  Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println(maxByte);
        System.out.println(++maxByte);
        System.out.println(--maxByte);

        short maxShort = 32767;
        System.out.println(maxShort);
        System.out.println(++maxShort);
        System.out.println(--maxShort);

        int maxInt = 2147483647;
        System.out.println(maxInt);
        System.out.println(++maxInt);
        System.out.println(--maxInt);

        long maxLong = 9223372036854775807l;
        System.out.println(maxLong);
        System.out.println(++maxLong);
        System.out.println(--maxLong);
        System.out.println("");

        System.out.println("5 - Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("С помощью третьей переменной");
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
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
        System.out.println("");

        System.out.println("6 - Вывод символов и их кодов");
        char lattice = '#';
        char ampersand = '&';
        char commercialAt = '@';
        char subdigitallyExclusiveOr = '^';
        char underlining = '_';

        System.out.println(lattice + "-" + (int)lattice + "\n" +
        ampersand + "-" + (int)ampersand + "\n" +
        commercialAt + "-" + (int)commercialAt + "\n" +
        subdigitallyExclusiveOr + "-" + (int)subdigitallyExclusiveOr + '\n' +
        underlining + "-" + (int)underlining);
        System.out.println("");

        System.out.println("7 - Вывод в консоль ASCII-арт Дюка");
        String slash = "/";
        String underscore = "_";
        String leftParenthesis = "(";
        String rightParenthesis = ")";
        String backslash = "\\";
        System.out.println("     " + slash + " " + backslash + "\n" +
                "    " + slash + "   " + backslash + "\n" +
                "   " + slash + underscore + leftParenthesis + "  " + rightParenthesis + backslash + "\n" +
                "  " + slash + "       " + backslash + "\n" +
                " " + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore +
        underscore + backslash);
        System.out.println("");

        System.out.println("8 - Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundred = num / 100;
        int dozen = num / 10;
        int unit = num / 1;

        System.out.println("Число " + num + " содержит:" + "\n" +
                hundred + " сотен" + "\n" +
                dozen + " десятков" + "\n" +
                unit + " единиц" + "\n" +
                "сумма его цифр = " + (hundred + dozen + unit) +"\n" +
                "произведение = " + (hundred * dozen * unit));
        System.out.println("");

        System.out.println("9 - Вывод времени");
        int time = 86399;
        int minutes = time % 60;
        int seconds = time % 60;
        int hours = time % 24;
        System.out.println(hours + ":" + minutes + ":" + seconds);
      }
   }