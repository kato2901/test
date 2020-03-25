import java.util.List;
import java.util.ArrayList;

public class App4_5_4  {
    public App4_5_4() {
        List<Integer> weights = new ArrayList<Integer>();
        weights.add(70);    // 最初の配列に代入
        weights.add(65);    // ２番目の配列に代入
        weights.add(55);    // ３番目に配列に代入

        // 体重を画面に表示
        System.out.println(weights.get(0) + "kg");
        System.out.println(weights.get(1) + "kg");
        System.out.println(weights.get(2) + "kg");
    }
}