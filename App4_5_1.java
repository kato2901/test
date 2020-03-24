public class App4_5_1  {
    public App4_5_1() {
        int[] weights = new int[3];
        weights[0] = 70;    // 最初の配列に代入
        weights[1] = 65;    // ２番目の配列に代入
        weights[2] = 55;    // ３番目に配列に代入

        // 体重を画面に表示
        System.out.println(weights[0] + "kg");
        System.out.println(weights[1] + "kg");
        System.out.println(weights[2] + "kg");
        System.out.println(weights.length + "個のデータがあります。");
    }
}