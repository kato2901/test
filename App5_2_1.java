public class App5_2_1 {
    void wideningConversion(byte bValue) {
        // 拡大変数(byte -> short)を行う
        short sValue = bValue;

        // 値を16進数に変換
        String bHex = String.format("%02x", bValue);
        String sHex = String.format("%04x", sValue);

        // 値を2進数に変換
        String bBin = String.format("%8.8s", rightString(
            Integer.toBinaryString(bValue), 8)).replaceAll(" ", "0");
        String sBin = String.format("%16.16s", rightString(
            Integer.toBinaryString(sValue), 16)).replaceAll(" ", "0");

        // 入力と出力の10進数と16進数表記を出力
        System.out.println(bValue + " , 0x" + bHex + " , " + bBin + " -> " + sValue + " , 0x" + sHex + " , " + sBin);
    }

    // 文字列の右側から指定文字数を取得
    public static String rightString(String value, int length) {
        int len = value.length();
          if (len >= length) {
              return value.substring(len - length);
          }
          else {
              return value;
          }
    }
}