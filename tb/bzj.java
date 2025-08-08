package tb;

import android.content.Context;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.openid.device.a;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bzi f26199a;
    private static boolean b;
    private static String c;

    static {
        kge.a(-217270076);
        f26199a = null;
        c = null;
        b = false;
    }

    public static synchronized String a(Context context) {
        synchronized (bzj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
            } else if (context == null) {
                throw new RuntimeException("Context is null");
            } else {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Cannot be called from the main thread");
                }
                if (f26199a == null) {
                    f26199a = a.a();
                }
                if (f26199a != null) {
                    try {
                        String a2 = f26199a.a(context);
                        if (!StringUtils.isEmpty(a2)) {
                            c = a2;
                        }
                        b = true;
                        return c;
                    } catch (Throwable unused) {
                    }
                }
                return null;
            }
        }
    }

    @Deprecated
    public static synchronized String b(Context context) {
        synchronized (bzj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
            }
            return null;
        }
    }
}
