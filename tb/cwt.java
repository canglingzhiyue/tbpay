package tb;

import android.content.Context;
import com.huawei.agconnect.core.a.b;

/* loaded from: classes.dex */
public abstract class cwt {
    public static cwt a() {
        return b.d();
    }

    public static cwt a(cwu cwuVar) {
        return b.b(cwuVar);
    }

    public static synchronized void a(Context context) {
        synchronized (cwt.class) {
            b.b(context);
        }
    }

    public abstract Context b();

    public abstract cwu c();
}
