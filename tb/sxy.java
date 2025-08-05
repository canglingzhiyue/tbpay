package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class sxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1869185165);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    public static <T> T a(String str, String str2, String str3, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4d49f4d0", new Object[]{str, str2, str3, t});
        }
        Variation variation = UTABTest.activate(str, str2).getVariation(str3);
        if (variation == null) {
            return t;
        }
        try {
            ?? r0 = (T) variation.getValueAsString(String.valueOf(t));
            if (t instanceof Boolean) {
                return (T) Boolean.valueOf(Boolean.parseBoolean(r0));
            }
            if (t instanceof Integer) {
                return (T) Integer.valueOf(Integer.parseInt(r0));
            }
            if (t instanceof Long) {
                return (T) Long.valueOf(Long.parseLong(r0));
            }
            if (t instanceof Float) {
                return (T) Float.valueOf(Float.parseFloat(r0));
            }
            if (t instanceof Double) {
                return (T) Double.valueOf(Double.parseDouble(r0));
            }
            if (!(t instanceof String)) {
                return null;
            }
            return r0;
        } catch (Exception e) {
            jpu c = jpu.a("Ultron").c("UltronABTest#获取实验出错");
            jpr.a(c.b(str + "#" + str2 + "#" + str3 + "#" + e.getMessage()));
            return t;
        }
    }
}
