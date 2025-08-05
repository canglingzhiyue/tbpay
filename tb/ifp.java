package tb;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class ifp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f28997a;

    static {
        kge.a(372006491);
    }

    public static synchronized boolean a(Context context) {
        synchronized (ifp.class) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
            }
            if (f28997a == null) {
                try {
                    if ((context.getApplicationInfo().flags & 2) != 0) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
                f28997a = Boolean.valueOf(z);
            }
            return f28997a.booleanValue();
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context != null) {
            return a(context);
        }
        return false;
    }
}
