/**
 * @Author: duanxu
 * @Date: 2019/4/26 15:41
 */
public class HelloWorld {
    public static void main(String[] args) {
        String fileName = "HelloWorld.java";
        String  email = "duanxu@imooc.com";

        int index = fileName.indexOf(".");
        String prefix = fileName.substring(index);
        if(index>0&&prefix.equals("java")){
            System.out.println("java 文件名正确");
        }else {
            System.out.println("java 文件名错误");
        }
    }
}
