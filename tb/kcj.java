package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class kcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(258136873);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder(20);
        if (!StringUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("_");
        }
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        StringBuilder sb = new StringBuilder("android");
        if (!StringUtils.isEmpty(str2)) {
            sb.append("_");
            sb.append(str2);
        }
        sb.append("_");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public static float b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }
}
