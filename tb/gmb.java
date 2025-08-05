package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class gmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static gmb f28375a;

    static {
        kge.a(-2078356209);
    }

    public abstract String a();

    public static gmb a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gmb) ipChange.ipc$dispatch("34c3bd6a", new Object[]{context});
        }
        if (f28375a == null) {
            synchronized (gmb.class) {
                if (f28375a == null) {
                    f28375a = new gma(context);
                }
            }
        }
        return f28375a;
    }
}
