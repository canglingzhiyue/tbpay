package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class gnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1116681820);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : Math.round(f * context.getResources().getDisplayMetrics().density);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue() : Math.round(f / context.getResources().getDisplayMetrics().density);
    }
}
