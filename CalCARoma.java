import java.util.*;
import java.lang.String;


public class CalCARoma {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(" " + " " + "CalCARoma ver 1.01 ©Vlad0124, Feb.2024"); // титульный лист


        String[] arb01 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}; // присвоение данных для правильного ввода арабских цифр

  //      System.out.println(Arrays.toString(arb01));

        String[] rim01 = {"I", "V", "X", "i", "v", "x"}; // присвоение данных для правильного ввода римских цифр
  //      System.out.println(Arrays.toString(rim01));

        String[] znk01 = {"*", "/", "+", "-"}; // присвоение данных для допустимых арифметических знаков
  //      System.out.println(Arrays.toString(znk01));

        String[][] gloBall = new String[][]{{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"},
                {"I", "V", "X", "i", "v", "x"},
                {"I", "V", "X"},
                {"i", "v", "x"}};
  //      System.out.println(gloBall[1][4] + "   " + gloBall.length);

// таблица умножения для римских чисел
        String[][] umRim = new String[][]{{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"},
                {"II", "IV", "VI", "VIII", "X", "XII", "XIV", "XVI", "XVIII", "XX"},
                {"III", "VI", "IX", "XII", "XV", "XVIII", "XXI", "XXIV", "XXVII", "XXX"},
                {"IV", "VIII", "XII", "XVI", "XX", "XXIV", "XXVIII", "XXXII", "XXXVI", "XL"},
                {"V", "X", "XV", "XX", "XXV", "XXX", "XXXV", "XL", "XLV", "L"},
                {"VI", "XII", "XVIII", "XXIV", "XXX", "XXXVI", "XLII", "XLVIII", "LIV", "LX"},
                {"VII", "XIV", "XXI", "XXVIII", "XXXV", "XLII", "XLIX", "LVI", "LXIII", "LXX"},
                {"VIII", "XVI", "XXIV", "XXXII", "XL", "XLVIII", "LVI", "LXIV", "LXXII", "LXXX"},
                {"IX", "XVIII", "XXVII", "XXXVI", "XLV", "LIV", "LXIII", "LXXII", "LXXXI", "XC"},
                {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"}};
    //    System.out.println(umRim[7][5]);

// таблица деления для римских чисел
        String[][] dlRim = new String[][]{{"I", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1"},
                {"II", "I", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1"},
                {"III", "I", "I", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1"},
                {"IV", "II", "I", "I", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1"},
                {"V", "II", "I", "I", "I", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1"},
                {"VI", "III", "II", "I", "I", "I", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1"},
                {"VII", "III", "II", "I", "I", "I", "I", "Результат меньше 1", "Результат меньше 1", "Результат меньше 1"},
                {"VIII", "IV", "II", "II", "I", "I", "I", "I", "Результат меньше 1", "Результат меньше 1"},
                {"IX", "IV", "III", "II", "I", "I", "I", "I", "I", "Результат меньше 1"},
                {"X", "V", "III", "II", "II", "I", "I", "I", "I", "I"}};
    //    System.out.println(dlRim[3][5]);

// таблица сложения для римских чисел
        String[][] slRim = new String[][]{

                {"II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI"},
                {"III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"},
                {"IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII"},
                {"V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV"},
                {"VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV"},
                {"VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI"},
                {"VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII"},
                {"IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII"},
                {"X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX"},
                {"XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"}};

// таблица вычитания для римских чисел

        String[][] vcRim = new String[][]{{"Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"I", "Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"II", "I", "Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"III", "II", "I", "Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"IV", "III", "II", "I", "Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"V", "IV", "III", "II", "I", "Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"VI", "V", "IV", "III", "II", "I", "Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"VII", "VI", "V", "IV", "III", "II", "I", "Число 0 не используется", "Отрицательное число недопустимо", "Отрицательное число недопустимо"},
                {"VIII", "VII", "VI", "V", "IV", "III", "II", "I", "Число 0 не используется", "Отрицательное число недопустимо"},
                {"IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I", "Число 0 не используется"}};

// таблица умножения для арабских чисел
        String[][] umArb = new String[][]{
                {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                {"2", "4", "6", "8", "10", "12", "14", "16", "18", "20"},
                {"3", "6", "9", "12", "15", "18", "21", "24", "27", "30"},
                {"4", "8", "12", "16", "20", "24", "28", "32", "36", "40"},
                {"5", "10", "15", "20", "25", "30", "35", "40", "45", "50"},
                {"6", "12", "18", "24", "30", "36", "42", "48", "54", "60"},
                {"7", "14", "21", "28", "35", "42", "49", "56", "63", "70"},
                {"8", "16", "24", "32", "40", "48", "56", "64", "72", "80"},
                {"9", "18", "27", "36", "45", "54", "63", "72", "81", "90"},
                {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100"}};

// таблица деления для арабских чисел
        String[][] dlArb = new String[][]{

                {"1", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"2", "1", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"3", "1", "1", "0", "0", "0", "0", "0", "0", "0"},
                {"4", "2", "1", "1", "0", "0", "0", "0", "0", "0"},
                {"5", "2", "1", "1", "1", "0", "0", "0", "0", "0"},
                {"6", "3", "2", "1", "1", "1", "0", "0", "0", "0"},
                {"7", "3", "2", "1", "1", "1", "1", "0", "0", "0"},
                {"8", "4", "2", "2", "1", "1", "1", "1", "0", "0"},
                {"9", "4", "3", "2", "1", "1", "1", "1", "1", "0"},
                {"10", "5", "3", "2", "2", "1", "1", "1", "1", "1"}};


// таблица сложения для арабских чисел
        String[][] slArb = new String[][]{
                {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11"},
                {"3", "4", "5", "6", "7", "8", "9", "10", "11", "12"},
                {"4", "5", "6", "7", "8", "9", "10", "11", "12", "13"},
                {"5", "6", "7", "8", "9", "10", "11", "12", "13", "14"},
                {"6", "7", "8", "9", "10", "11", "12", "13", "14", "15"},
                {"7", "8", "9", "11", "11", "12", "13", "14", "15", "16"},
                {"8", "9", "10", "11", "12", "13", "14", "15", "16", "17"},
                {"9", "10", "11", "12", "13", "14", "15", "16", "17", "18"},
                {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19"},
                {"11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}};

// таблица вычитания для арабских чисел
        String[][] vcArb = new String[][]{

                {"0", "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9"},
                {"1", "0", "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8"},
                {"2", "1", "0", "-1", "-2", "-3", "-4", "-5", "-6", "-7"},
                {"3", "2", "1", "0", "-1", "-2", "-3", "-4", "-5", "-6"},
                {"4", "3", "2", "1", "0", "-1", "-2", "-3", "-4", "-5"},
                {"5", "4", "3", "2", "1", "0", "-1", "-2", "-3", "-4"},
                {"6", "5", "4", "3", "2", "1", "0", "-1", "-2", "-3"},
                {"7", "6", "5", "4", "3", "2", "1", "0", "-1", "-2"},
                {"8", "7", "6", "5", "4", "3", "2", "1", "0", "-1"},
                {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}};


        Scanner s1 = new Scanner(System.in); // присвоение s1
        System.out.println("Поставьте арифметическую задачу для калькулятора из двух положительных арабских или римских целых чисел от 1 до 10 : ");

        String keya = s1.nextLine(); // запрос данных из строчки
        String[] numbers = keya.split(""); // присвоение полученного из строчки в массив
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
//        System.out.println(numbers[0]);

///------сравнение длины массива задачи по количеству допустимого количества знаков от 3 до 9 включительно-----
        int klZn = 0; //
        klZn = klZn + numbers.length;
        if (klZn > 9) {
            System.out.println("Количество знаков в задаче больше допустимых 9-ти: " + numbers.length);
            System.exit(0);
        } else if (klZn < 3) {
            System.out.println("Количество знаков в задаче меньше 3-х: " + numbers.length);
            System.exit(0);
        }

///------------определяем 0 и количество достоверных арифметических знаков в поставленной задаче, их место в массиве. Указываем ошибки ввода
        int afZn = 0; //
        int plZn = 0;
        for (int g = 0; g < znk01.length; g++) {
            if (Objects.equals(numbers[klZn - 1], znk01[g])) {
                System.out.println(" Вы завершаете задачу арифметическим знаком. Повторите задачу.");
                System.exit(0);
            }
        }
        for (int k = 0; k < numbers.length; k++) {
            for (int i = 0; i < znk01.length; i++) {
                if (Objects.equals(numbers[k], znk01[i])) {
                    afZn++;
                    if (afZn == 1) {
                        plZn = plZn + k;
                    }
                    if (plZn == 0) {
                        System.out.println(" Вы начинаете задачу с арифметического знака. Повторите задачу.");
                        System.exit(0);
                    }
                    if (afZn > 1) {
                        System.out.println(" Количество арифметических знаков в задаче больше 1-го. Повторите задачу.");
                        System.exit(0);
                    }
                    if (Objects.equals(numbers[0], "0")) {
                        System.out.println(" Число 0 в калькуляторе не используется. Повторите задачу.");
                        System.exit(0);
                    }
                    if (Objects.equals(numbers[plZn + 1], "0")) {
                        System.out.println(" Второе число в задаче - 0, оно не используется. Повторите задачу.");
                        System.exit(0);
                    }
                    //  System.out.println(" numbers " + numbers[k] + " a = " + afZn + " k = " + k + " место 1-го арифметического знака в массиве " + plZn);
                }
            }
        }
        if (afZn == 0) {
            System.out.println(" Арифметические знаки в задаче отсутствуют. Повторите задачу.");
            System.exit(0);
        }
///---------отделяем достоверные арабские и римские знаки от иных знаков
// ------определяем смешанные операторы, устанавливаем вариант решения задачи-----------------------

        int arZn = 0;
        int rmZn = 0;
        int vaRr = 0;
        for (int l = 0; l < numbers.length; l++) {
            for (int m = 0; m < arb01.length; m++) {
                if (Objects.equals(numbers[l], arb01[m])) {
                    arZn++;
                }
            }
        }
//        System.out.println(" Количество верных арабских цифр в массиве = " + arZn);
        for (int n = 0; n < numbers.length; n++) { // определяем количество достоверных римских знаков в поставленной задаче и место в массиве первого знак
            for (int p = 0; p < rim01.length; p++) {
                if (Objects.equals(numbers[n], rim01[p])) {
                    rmZn++;
                }
            }
        }
//        System.out.println(" Количество верных римских знаков в задаче = " + rmZn);
        if ((1 + rmZn + arZn) < klZn) {
            System.out.println(" В задаче присутствуют посторонние знаки. Повторите задачу. ");
            System.exit(0);
        }
        if (Math.abs(rmZn - arZn) == (klZn - 1)) {  // через модуль определяем вариант применения калькулятора
            if (rmZn > arZn) {
                vaRr++;
            }
        } else {
            System.out.println(" В задаче присутствуют римские и арабские цифры. Повторите задачу. ");
            System.exit(0);
        }
//        System.out.println(" вариант решения и место знака в массиве " + vaRr + " " + plZn + " тип знака " + numbers[plZn]);


////----------------Арабская арифметика----------------------
        int x = 0;
        int y = 0;

        if (vaRr == 0) {
            if (klZn == 3) {           /// три элемента в задаче
                for (int i = 0; i < 9; i++) {
                    if (numbers[0].equals(arb01[i])) {
                        x = x + i;
                    }
                    if (numbers[2].equals(arb01[i])) {
                        y = y + i;
                    }
                }
                if (numbers[plZn].equals("*")) { // вывод на печать
                    System.out.println(" Ответ: " + umArb[x][y]);
                    System.exit(0);
                }
                if (numbers[plZn].equals("/")) {
                    System.out.println(" Ответ: " + dlArb[x][y]);
                    System.exit(0);
                }
                if (numbers[plZn].equals("+")) {
                    System.out.println(" Ответ: " + slArb[x][y]);
                    System.exit(0);
                }
                if (numbers[plZn].equals("-")) {
                    System.out.println(" Ответ: " + vcArb[x][y]);
                    System.exit(0);
                }
            }
            if (klZn == 4) {   /// четыре элемента в задаче
                if (plZn == 1 && numbers[2].equals("1") && numbers[3].equals("0")) {
                    y = y + 9;
                    for (int i = 0; i < 9; i++) {
                        if (numbers[0].equals(arb01[i])) {
                            x = x + i;
                        }
                    }
                    if (numbers[plZn].equals("*")) {
                        System.out.println(" Ответ: " + umArb[x][y]);
                        System.exit(0);
                    }
                    if (numbers[plZn].equals("/")) {
                        System.out.println(" Ответ: " + dlArb[x][y]);
                        System.exit(0);
                    }
                    if (numbers[plZn].equals("+")) {
                        System.out.println(" Ответ: " + slArb[x][y]);
                        System.exit(0);
                    }
                    if (numbers[plZn].equals("-")) {
                        System.out.println(" Ответ: " + vcArb[x][y]);
                        System.exit(0);
                    }
                }
                if (plZn == 2 && numbers[0].equals("1") && numbers[1].equals("0")) {
                    x = x + 9;
                    for (int k = 0; k < 9; k++) {
                        if (numbers[3].equals(arb01[k])) {
                            y = y + k;
                        }
                    }
                    if (numbers[plZn].equals("*")) {
                        System.out.println(" Ответ: " + umArb[x][y]);
                        System.exit(0);
                    }
                    if (numbers[plZn].equals("/")) {
                        System.out.println(" Ответ: " + dlArb[x][y]);
                        System.exit(0);
                    }
                    if (numbers[plZn].equals("+")) {
                        System.out.println(" Ответ: " + slArb[x][y]);
                        System.exit(0);
                    }
                    if (numbers[plZn].equals("-")) {
                        System.out.println(" Ответ: " + vcArb[x][y]);
                        System.exit(0);
                    }
                } else {
                    System.out.println(" В задаче арабское число более 10. Повторите задачу.");
                    System.exit(0);
                }
            }
            if ((klZn > 5) || (klZn == 5 && plZn != 2)) {   /// отсекаем в арабском варианте превышение по количеству возможных цифр и трехзначные числа
                System.out.println(" Задача вне возможностей. Трёхзначные числа для арабских цифр и более недопустимы. Повторите задачу. ");
                System.exit(0);
            }
            if (klZn == 5 && (numbers[0].equals("1") && numbers[1].equals("0") && numbers[3].equals("1") && numbers[4].equals("0"))) {   /// пять элементов в задаче т.е. 10 и 10, отсекаем иное
                x = x + 9;
                y = y + 9;
                if (numbers[plZn].equals("*")) {
                    System.out.println(" Ответ: " + umArb[x][y]);
                    System.exit(0);
                }
                if (numbers[plZn].equals("/")) {
                    System.out.println(" Ответ: " + dlArb[x][y]);
                    System.exit(0);
                }
                if (numbers[plZn].equals("+")) {
                    System.out.println(" Ответ: " + slArb[x][y]);
                    System.exit(0);
                }
                if (numbers[plZn].equals("-")) {
                    System.out.println(" Ответ: " + vcArb[x][y]);
                    System.exit(0);
                }
            }
            {
                System.out.println(" В задаче арабское число более 10. Повторите задачу.");
                System.exit(0);
            }


        }
        ///--------------------------Римская арифметика ------------------------------
        ArrayList<String> numRim1 = new ArrayList<>(); /// задаем список 1 и 2 для формирования одного элемента из нескольких римских знаков
        ArrayList<String> numRim2 = new ArrayList<>();
        int x1 = 0;
        int y1 = 0;
        int c = 0;
        int f = 0;

        /// удаляем римские элементы для более 4-х знаков ()
            if ((plZn == 1 && klZn > 6) || (plZn == 2 && klZn > 7) || (plZn == 3 && klZn > 8) || (plZn > 4)) {
                System.out.println(" В задаче, возможно, недопустимые римские числа. Повторите задачу.");
                System.exit(0);
            }
            for (int d = 0; d < numbers.length; d++) {  // переформатируем введенные римские знаки в CAPS
                for (int e = 0; e < 3; e++) {
                    if (numbers[d].equals(gloBall[3][e])) {
                        numbers[d] = gloBall[2][e];
                    }
                }
            }
            //       System.out.println("Новый массив numbers: " + Arrays.toString(numbers));

            if (plZn == 1 && klZn == 3) {      /// формируем два списка из римских элементов до арифметического оператора, и после него
                numRim1.add(numbers[0]);
                numRim2.add(numbers[2]);
            }
            if (plZn == 1 && klZn == 4) {
                numRim1.add(numbers[0]);
                numRim2.add(numbers[2] + numbers[3]);
            }
            if (plZn == 1 && klZn == 5) {
                numRim1.add(numbers[0]);
                numRim2.add(numbers[2] + numbers[3] + numbers[4]);
            }
            if (plZn == 1 && klZn == 6) {
                numRim1.add(numbers[0]);
                numRim2.add(numbers[2] + numbers[3] + numbers[4] + numbers[5]);
            }
            if (plZn == 2 && klZn == 4) {
                numRim1.add(numbers[0] + numbers[1]);
                numRim2.add(numbers[3]);
            }
            if (plZn == 2 && klZn == 5) {
                numRim1.add(numbers[0] + numbers[1]);
                numRim2.add(numbers[3] + numbers[4]);
            }
            if (plZn == 2 && klZn == 6) {
                numRim1.add(numbers[0] + numbers[1]);
                numRim2.add(numbers[3] + numbers[4] + numbers[5]);
            }
            if (plZn == 2 && klZn == 7) {
                numRim1.add(numbers[0] + numbers[1]);
                numRim2.add(numbers[3] + numbers[4] + numbers[5] + numbers[6]);
            }
            if (plZn == 3 && klZn == 5) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2]);
                numRim2.add(numbers[4]);
            }
            if (plZn == 3 && klZn == 6) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2]);
                numRim2.add(numbers[4] + numbers[5]);
            }
            if (plZn == 3 && klZn == 7) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2]);
                numRim2.add(numbers[4] + numbers[5] + numbers[6]);
            }
            if (plZn == 3 && klZn == 8) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2]);
                numRim2.add(numbers[4] + numbers[5] + numbers[6] + numbers[7]);
            }
            if (plZn == 4 && klZn == 6) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2] + numbers[3]);
                numRim2.add(numbers[5]);
            }
            if (plZn == 4 && klZn == 7) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2] + numbers[3]);
                numRim2.add(numbers[5] + numbers[6]);
            }
            if (plZn == 4 && klZn == 8) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2] + numbers[3]);
                numRim2.add(numbers[5] + numbers[6] + numbers[7]);
            }
            if (plZn == 4 && klZn == 9) {
                numRim1.add(numbers[0] + numbers[1] + numbers[2] + numbers[3]);
                numRim2.add(numbers[5] + numbers[6] + numbers[7] + numbers[8]);
            }

            //    System.out.println("Новый List 1 & иии  2: " + numRim1 + numRim2);
            String[] nuR1 = numRim1.toArray(String[]::new);  // переводим списки в два массива с одним элементом, состоящим из объединённых римских знаков
            String[] nuR2 = numRim2.toArray(String[]::new);

            //    System.out.println("Новый массив List 1 & иии  2: " + umRim[0][0] + " " + numRim1 + numRim2 + Arrays.toString(nuR1) + "opa" + nuR1[0] + " " + nuR2[0] + "n " + numbers[0]);

            for (int i = 0; i < 10; i++) { // порверяем элемент из бывшего списка на соответствие условиям до 10 (до X включительно)
                if (nuR1[0].equals(umRim[i][0])) {  // переменными устанавливаем x и y, выводимые на печать ответа, и отсекаем 0 из массива, если ни один из элементов списка не является допустимым
                    x1 = x1 + i;
                    c++;
                    //            System.out.println(" Промеж Χ1  Υ1 " + x1 + " " + y1 + umRim[0][0] + "dr " + umRim[i][0]);
                }
                if (nuR2[0].equals(umRim[i][0])) {
                    y1 = y1 + i;
                    f++;
                    //            System.out.println(" Промеж 02 Χ1  Υ1 " + x1 + " " + y1 + umRim[0][0] + "dr " + umRim[i][0]);
                }
            }
            if ((x1 == 0 && c == 0) || (y1 == 0 && f == 0)) {
                System.out.println(" В задаче, возможно, недопустимые римские числа. Повторите задачу.");
                System.exit(0);
            }

            if (numbers[plZn].equals("*")) {  // печать допустимых результатов
                System.out.println(" Ответ: " + umRim[x1][y1]);
                System.exit(0);
            }
            if (numbers[plZn].equals("/")) {
                System.out.println(" Ответ: " + dlRim[x1][y1]);
                System.exit(0);
            }
            if (numbers[plZn].equals("+")) {
                System.out.println(" Ответ: " + slRim[x1][y1]);
                System.exit(0);
            }
            if (numbers[plZn].equals("-")) {
                System.out.println(" Ответ: " + vcRim[x1][y1]);
                System.exit(0);
            }



    }

}

