package tb;

import android.content.Context;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Typeface f28191a;

    public static Typeface a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("53c5ec56", new Object[]{context});
        }
        if (f28191a == null && context != null) {
            try {
                f28191a = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "uik_iconfont.ttf");
            } catch (Exception unused) {
            }
        }
        return f28191a;
    }
}
