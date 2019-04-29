import java.util.Calendar;

/**
 * @Author: duanxu
 * @Date: 2019/4/26 15:41
 */
public class HelloWorld {
    public static void main(String[] args) {
// 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
        // 出现次数
        int num = 0;
        Calendar c =  Calendar.getInstance();
        String  time = String.valueOf(c.get(Calendar.YEAR))+"-"+String.valueOf(c.get(Calendar.MONTH)+1)+"-"+String.valueOf(c.get(Calendar.DAY_OF_MONTH));
        int [] a =new int[10];
        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (int i=0;i<s.length();i++)
        {
            // 获取每个字符，判断是否是字符a
            if (((Character)(s.charAt(i))).equals('a')){
                // 累加统计次数
                num++;
            }
        }
        System.out.println(time+"\n字符a出现的次数：" + num);
        StringBuilder str;

    }
}