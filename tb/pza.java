package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-151729406);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
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
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }
}
