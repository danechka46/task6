import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner s = new Scanner(System.in);
        int category = s.nextInt();
        int unit = 0;
        double count = 0;
        if (category == 1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - унция, 3 - карат, 4 - тройская унция");
            unit = s.nextInt();
            if(unit>0&&unit<5) {
                System.out.print("Введите количество выбранных единиц: ");
                count = s.nextDouble();
                switch (unit) {
                    case 1:
                        System.out.println("Результат:" + "\nГраммы: " + count + "\nУнции: " + count * 0.035 + "\nКараты: " + count * 5 + "\nТройские унции: " + count * 0.032);
                        break;
                    case 2:
                        System.out.println("Результат:" + "\nГраммы: " + count * 28.35 + "\nУнции: " + count + "\nКараты: " + count * 141.75 + "\nТройские унции: " + count * 0.91);
                        break;
                    case 3:
                        System.out.println("Результат:" + "\nГраммы: " + count * 0.2 + "\nУнции: " + count * 0.0071 + "\nКараты: " + count + "\nТройские унции: " + count * 0.0064);
                        break;
                    case 4:
                        System.out.println("Результат:" + "\nГраммы: " + count * 31.1 + "\nУнции: " + count * 1.1 + "\nКараты: " + count * 155.52 + "\nТройские унции: " + count);
                        break;
                }
            }
            else System.out.println("Выбрана неправильная единица измерения!!!");
        }else{
            if (category == 2){
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                unit = s.nextInt();
                if(unit>0&&unit<5){
                    System.out.print("Введите количество выбранных единиц: ");
                    count = s.nextDouble();
                    switch (unit){
                        case 1:
                            System.out.println("Результат:"+"\nМетры: "+count+"\nМили: "+count*0.00062+"\nЯрды: "+count*1.09361+"\nФуты: "+count*3.281);
                            break;
                        case 2:
                            System.out.println("Результат:"+"\nМетры: "+count*1609.34+"\nМили: "+count+"\nЯрды: "+count*1760+"\nФуты: "+count*5280);
                            break;
                        case 3:
                            System.out.println("Результат:"+"\nМетры: "+count*0.91+"\nМили: "+count*0.00057+"\nЯрды: "+count+"\nФуты: "+count*3);
                            break;
                        case 4:
                            System.out.println("Результат:"+"\nМетры: "+count*0.3+"\nМили: "+count*0.00019+"\nЯрды: "+count*0.33+"\nФуты: "+count);
                            break;
                    }
                }else System.out.println("Выбрана неправильная единица измерения!!!");
            }
            else System.out.println("Введена неправильная категория!!!");
        }


}}
