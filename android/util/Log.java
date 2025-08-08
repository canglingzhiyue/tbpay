package android.util;

public class Log {
    public static int e(String tag, String msg) {
        System.err.println(tag + ": " + msg); // 将安卓的Log.e重定向到PC的控制台错误输出
        return 0;
    }
}
