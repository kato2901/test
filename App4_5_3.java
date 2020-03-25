public class App4_5_3  {
    public App4_5_3() {
        int[][] datas = new int[3][2];
        datas[0][0] = 10;    // 1行目、1列目に代入
        datas[0][1] = 20;    // 1行目、2列目に代入
        datas[1][0] = 30;    // 2行目、1列目に代入
        datas[1][1] = 40;    // 2行目、2列目に代入
        datas[2][0] = 50;    // 3行目、1列目に代入
        datas[2][1] = 60;    // 3行目、2列目に代入

        // すべてのデータを画面に表示
        System.out.println(datas[0][0]);
        System.out.println(datas[0][1]);
        System.out.println(datas[1][0]);
        System.out.println(datas[1][1]);
        System.out.println(datas[2][0]);
        System.out.println(datas[2][1]);
        System.out.println("1次元目の配列は" + datas.length + "個あります。");
        System.out.println("2次元目の配列は" + datas[0].length + "個あります。");
    }
}