package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes6.dex */
public class jpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-664355100);
    }

    public static synchronized boolean a(Context context) {
        synchronized (jpx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
            }
            return ifp.a(context);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : ifp.a();
    }
}
