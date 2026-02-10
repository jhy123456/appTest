import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello word!哈哈");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("20220512145636"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<String> strList = new ArrayList<>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
        System.out.println(strList);
        ListRevise(strList);
        System.out.println(strList);
    }

    public static void ListRevise(List list){
        Collections.reverse(list);
    }
}
