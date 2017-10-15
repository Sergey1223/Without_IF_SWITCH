import java.util.GregorianCalendar;

public class Util {
    private String[] types = new String[] {"Будний", "Выходной"};

    public int getUnevenElementsCount(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i] % 2;
        }
        return counter;
    }

    public String getTypeDay(String date){
        String[] temp = date.split("\\.");
        System.out.println(temp.length);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(
                Integer.parseInt(temp[2]) - 1, Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[0]));
        return types[gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK)/6];
    }

    public void multiType(Object object){
        try{
            Integer integer = (Integer)object;
            System.out.println(Integer.toString(integer * 2));
        }
        catch (ClassCastException e){
            String string = (String)object;
            for (int i = 0; i < string.length(); i++) {
                System.out.print(string.charAt(i));
                System.out.print(string.charAt(i));
            }
        }
    }
}
