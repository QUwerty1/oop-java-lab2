// 24)
// a. Выберите из заданного множества числа, удовлетворяющие условию, введенному ввиде строки при запуске программы (“>0” или “<10”);
// b. Проверить есть ли в массиве чисел такие: равные/неравные заданному (условие также пользователь вводит в виде строки «=1» или «<>1»);
// c. В строке записаны числа разделенные пробелами, требуется удалить дубликаты.
// d. Определить упорядоченность массива чисел (по возрастанию/по убыванию/не упорядочены)

    public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {
            IntArray array1 = new IntArray();
//            int[] numbers = new int[]{16, -54, 72, -9, -52, -5, 45, -96, -79, 31, 51, -15, -61, 5, -8, -98, -55, -98, -95, 51, 63, -91, -9, -98, 85, 29, 19, 64, -80, -78};
//            IntArray array1 = new IntArray(numbers);

            String conditionStringA = ">10";
            String conditionStringB = "=10";

            String lineC = "-1 4 -7 -10 8 -3 -6 -2 -8 1 -10 -4 -4 -8 -6 -4 -9 7 -10 -4 -5 -5 -6 2 -6 2 8 5 -1 8 -6 -7 8 6 4 -10 -7 -8 7 -7";
            IntArray array2 = new IntArray(lineC);
            IntArray array3 = array1.clone();

    // поменять конструкт                   ор и сделать возвращаемым IntArray
            System.out.println("Ответ к заданию a:");
            System.out.println(
                    array1.filteredArray(conditionStringA));
            System.out.println("\nОтвет к заданию b:");
            System.out.println(
                    array1.checkForCondition(conditionStringB) ? "Есть" : "Нет");
            System.out.println("\nОтвет к заданию c:");
            System.out.println(
                    array2.filteredDuplicates());
            System.out.println("\nОтвет к заданию d:");
            System.out.println(
                    IntArray.getStringOrder(array3.getOrder()));
        }
    }