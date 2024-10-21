public class ArrayAverage {
    public static void main(String[] args) {
        Object[] arr = {5,"g"};
        int sum = 0;
        double avg;
        try{
            for (int i = 0; i < arr.length;i++) {
                if (arr[i] instanceof Integer) {
                    sum += (Integer) i;
                } else {
                    throw new Exception("Не число: " + arr[i]);
                }
            }
            avg = sum / arr.length;
            System.out.println("Среднее значение - " + avg);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат данных в массиве.");
        }catch (ArithmeticException e) {
            System.out.println("Ошибка в арифметике: ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}