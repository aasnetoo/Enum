import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do mês: ");
        String option = scan.nextLine();
        MonthEnum monthOption = MonthEnum.geMonthEnum(option.toUpperCase());

        switch (monthOption) {
            case JANUARY -> showResult(MonthEnum.JANUARY.getDescricao(), MonthEnum.JANUARY.getExpensive());
            case FEBRUARY -> showResult(MonthEnum.FEBRUARY.getDescricao(), MonthEnum.FEBRUARY.getExpensive());
            case MARCH -> showResult(MonthEnum.MARCH.getDescricao(), MonthEnum.MARCH.getExpensive());
            case APRIL -> showResult(MonthEnum.APRIL.getDescricao(), MonthEnum.APRIL.getExpensive());
            case MAY -> showResult(MonthEnum.MAY.getDescricao(), MonthEnum.MAY.getExpensive());
            case JUNE -> showResult(MonthEnum.JUNE.getDescricao(), MonthEnum.JUNE.getExpensive());
            case JULY -> showResult(MonthEnum.JULY.getDescricao(), MonthEnum.JULY.getExpensive());
            case AUGUST -> showResult(MonthEnum.AUGUST.getDescricao(), MonthEnum.AUGUST.getExpensive());
            case SEPTEMBER -> showResult(MonthEnum.SEPTEMBER.getDescricao(), MonthEnum.SEPTEMBER.getExpensive());
            case OCTOBER -> showResult(MonthEnum.OCTOBER.getDescricao(), MonthEnum.OCTOBER.getExpensive());
            case NOVEMBER -> showResult(MonthEnum.NOVEMBER.getDescricao(), MonthEnum.NOVEMBER.getExpensive());
            case DECEMBER -> showResult(MonthEnum.DECEMBER.getDescricao(), MonthEnum.DECEMBER.getExpensive());
            default -> System.out.println("Digite um mês entre Janeiro a Dezembro");
        }
    }
    private static void showResult(String mes, Double valor) {
        System.out.println("O mês de " + mes + " teve um gasto de R$ " + valor);

    }
}



