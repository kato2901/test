public class App4_6_1 {
    public App4_6_1() {
        int intData = 100;
        // オートボクシング
        Integer integerData1 = intData; // int型をInteger型に代入
        
        // オートボクシングを使わない場合
        Integer integerData2 = new Integer(intData);
        Integer integerData3 = Integer.valueOf(intData);
    }   
}
