package pattern.structural.flyweight.simple01;

/**
 * 客户端测试类
 *
 * @author wudih
 * @date 2019/3/29 11:06
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        Chessman black1, black2, black3, white1, white2, white3;
        black1 = ChessmanFactory.getChessman("b");
        black2 = ChessmanFactory.getChessman("b");
        black3 = ChessmanFactory.getChessman("b");
        System.out.println(black1 == black2);
        black3.display(new Coordinates(1, 10));

        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = "ab" + "cd";
        String str4 = "ab";
        str4 += "cd";
        //true
        System.out.println(str1 == str2);
        //true
        System.out.println(str1 == str3);
        //false
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str4));

        str2 += "e";
        //false
        System.out.println(str1 == str2);
    }
}
