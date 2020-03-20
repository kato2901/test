public class App4_3_1  {
    // 定数の宣言
    public static final int ERROR_READ    = 1;      // 読み込みエラー
    public static final int ERROR_WRITE   = 2;      // 書き込みエラー

    // ファイルをコピーする処理
    private int copy() {
        // 処理中に読み込みエラーが発生した場合を想定
        return ERROR_READ;
    }

    public App4_3_1() {
        int error;
        error = copy();
        if ( error == ERROR_READ ) {
            System.out.println("読み込みエラーが発生しました。");
        }
        else if (error == ERROR_WRITE ) {
            System.out.println("書き込みエラーが発生しました。");
        }
    }
}