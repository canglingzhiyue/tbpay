package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.searchbaseframe.util.k;

/* loaded from: classes6.dex */
public class iuc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-845819715);
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            if (str.endsWith("wx")) {
                return c(str);
            }
            return e(str);
        } catch (Throwable unused) {
            k.a("WeexSizeUtil", "解析尺寸异常");
            return 0.0f;
        }
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (str.endsWith("wx")) {
                return c(str);
            }
            return d(str);
        } catch (Throwable unused) {
            k.a("WeexSizeUtil", "解析尺寸异常");
            return 0;
        }
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        if (str.endsWith("wx") || str.endsWith("dp")) {
            return j.a(g.a(str.substring(0, str.length() - 2), f));
        }
        if (str.endsWith("px")) {
            return g.a(str.substring(0, str.length() - 2), f);
        }
        return g.a(str, f);
    }

    private static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            k.a("WeexSizeUtil", "wxSize字符串为空");
            return 0;
        }
        int lastIndexOf = str.lastIndexOf("wx");
        if (lastIndexOf < 0 || lastIndexOf >= str.length()) {
            k.a("WeexSizeUtil", "解析wx后缀异常");
            return 0;
        }
        try {
            return j.a(Float.parseFloat(str.substring(0, lastIndexOf)));
        } catch (Exception unused) {
            k.a("WeexSizeUtil", "解析wx数字异常");
            return 0;
        }
    }

    private static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            k.a("WeexSizeUtil", "remSize字符串为空");
            return 0;
        }
        try {
            return (Integer.parseInt(str) * imk.c) / 750;
        } catch (Exception unused) {
            k.a("WeexSizeUtil", "解析rem数字异常");
            return 0;
        }
    }

    private static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            k.a("WeexSizeUtil", "remSize字符串为空");
            return 0;
        }
        try {
            return (int) ((Float.parseFloat(str) * imk.c) / 750.0f);
        } catch (Exception unused) {
            k.a("WeexSizeUtil", "解析rem数字异常");
            return 0;
        }
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue() : (f * 750.0f) / imk.c;
    }
}
