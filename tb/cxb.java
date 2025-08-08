package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class cxb extends cws {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, cws> f26579a = new HashMap();
    private static final Object b = new Object();
    private static String c;
    private cwx d;

    private cxb(Context context, String str) {
        this.d = cwx.a(context, str);
    }

    public static cws a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        c = context.getPackageName();
        return a(context, c);
    }

    public static cws a(Context context, String str) {
        cws cwsVar;
        if (!StringUtils.isEmpty(str)) {
            synchronized (b) {
                cwsVar = f26579a.get(str);
                if (cwsVar == null) {
                    f26579a.put(str, new cxb(context, str));
                }
            }
            return cwsVar;
        }
        throw new IllegalArgumentException("packageName can not be empty");
    }
}
