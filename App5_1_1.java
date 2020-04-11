public class App5_1_1 {
    public void divide() {
        // ゼロ除算 (Infinity)
        System.out.println(" 10.0f / 0 = " + 10.0f / 0);
        System.out.println(" -10.0f / 0 = " + -10.0f / 0);
        System.out.println(" 10.0f / -0 = " + 10.0f / -0);
        System.out.println(" -10.0f / -0 = " + -10.0f / -0);

        // ゼロ除算 (NaN)
        System.out.println(" 10.0f % 0 = " + 10.0f % 0);
        System.out.println(" -10.0f % 0 = " + -10.0f % 0);

        // 整数のゼロ除算 (ここでエラーで落ちます)
        System.out.println(" 10 / 0 = " + 10 / 0);
    }
}