package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;

/* loaded from: classes8.dex */
public class prk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DecimalFormat f32829a;
    private static DecimalFormat b;

    static {
        kge.a(-565783223);
        f32829a = new DecimalFormat("#.#");
        b = new DecimalFormat("#.##");
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return "" + j;
        }
        return f32829a.format(j / 10000.0d) + "万";
    }

    public static String b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2381a05", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return "" + j;
        } else if (j < 1000000) {
            return b.format(j / 10000.0d) + "万";
        } else if (j < 100000000) {
            return f32829a.format(j / 10000.0d) + "万";
        } else {
            return b.format(j / 1.0E8d) + "亿";
        }
    }
}
