package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class nao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(25314788);
    }

    public static float a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6450", new Object[]{context})).floatValue() : context.getResources().getDisplayMetrics().widthPixels / 750.0f;
    }
}
