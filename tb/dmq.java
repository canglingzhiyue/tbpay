package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes.dex */
public final class dmq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1270437181);
    }

    public static final boolean a(ruk<t> func) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdbfc754", new Object[]{func})).booleanValue();
        }
        q.d(func, "func");
        try {
            func.mo2427invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            return false;
        }
    }
}
