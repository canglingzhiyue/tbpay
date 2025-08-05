package tb;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public abstract class cwx implements cwu {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, cwx> f26576a = new HashMap();
    private static final Object b = new Object();

    public static cwx a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return a(context, context.getPackageName());
    }

    public static cwx a(Context context, String str) {
        cwx cwxVar;
        synchronized (b) {
            cwxVar = f26576a.get(str);
            if (cwxVar == null) {
                cwxVar = new cxd(context, str);
                f26576a.put(str, cwxVar);
            }
        }
        return cwxVar;
    }
}
