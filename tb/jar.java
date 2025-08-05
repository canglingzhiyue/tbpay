package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class jar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Context f29440a;

    public static Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[0]) : f29440a;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        f29440a = context;
        jbg.f29445a = new jat();
        jbk.f29449a = new jav();
        jbk.b = new jau();
    }
}
