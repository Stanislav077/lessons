import java.util.Calendar;

public class Main {



    public static void main(String[] args) {
        /* Выведите на экран первые 11 членов последовательности Фибоначчи.
        Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.*/
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b);
        int sum = 0;
        int s =11;
        for(int i = 0; i < s; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
        }
/*
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
«Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
как, например, в билетах с номерами 003102 или 567576.
Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
 С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

*/
        System.out.println("\n");

     //   System.out.println(123567 / 1000 % 1000);
       // System.out.println(123567 % 1000);

         int limit = 999999;
         int count = 0;
        for(int x = 0; x<=limit;x++) {

if ((x % 10) + (x / 10) % 10 + (x / 100) % 10 == (x / 1000) % 10 + (x / 10000) % 10 + (x / 100000) % 10) {
              //  System.out.println(x);
                count++;
            }
        }
        //55252 билетов
        System.out.println(count);

        /*
        Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
        что справа от двоеточия (например, 02:20, 11:11 или 15:51).
         */
        System.out.println((23/10) % 10);
        System.out.println((23 % 10));


        for(int h = 0; h<=23;h++) {
            for(int m=0;m<60;m++){


if((h / 10) % 10==(m / 10) % 10 && (h % 10)==(m % 10)){
    System.out.println(h+":"+m);

                }


            }

        }



    }
}
