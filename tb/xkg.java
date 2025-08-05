package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.behavix.feature.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class xkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final Map<String, Boolean> f34348a;
    private static final Set<String> b;
    private static final AtomicBoolean c;
    private static final AtomicBoolean d;
    private static boolean e;

    public static /* synthetic */ void lambda$BNDOUihIGDbzDPgMagmo7G7qYco(Context context) {
        c(context);
    }

    public static /* synthetic */ void lambda$zSa3ZwU3F5IN1e1DRAZUw_Fhlv0(Context context) {
        d(context);
    }

    static {
        kge.a(-632620188);
        f34348a = new HashMap();
        b = new CopyOnWriteArraySet();
        c = new AtomicBoolean();
        d = new AtomicBoolean();
        try {
            Class.forName("com.taobao.android.ab.api.ABGlobal");
            e = true;
        } catch (Exception unused) {
            e = false;
        }
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (!f34348a.containsKey(str)) {
            Map<String, Boolean> map = f34348a;
            map.put(str, Boolean.valueOf(new File("/data/local/tmp/." + str).exists()));
        }
        return f34348a.get(str).booleanValue();
    }

    public static boolean a(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!e) {
            return false;
        }
        Context a2 = kaq.a();
        try {
            if (!c.get()) {
                b.add(str);
                a(a2);
            } else {
                xkh.b(a2, "atools_cfg_bk", str, ABGlobal.isFeatureOpened(a2, str));
            }
        } catch (Exception unused) {
        }
        try {
            z = xkh.a(a2, "atools_cfg", str, false);
            if (!z) {
                try {
                    z = b(str);
                } catch (Throwable th) {
                    th = th;
                    kau.instance.b("ABAdapter", "isFeatureOpened err", th, a.FEATURE_NAME, str);
                    return z;
                }
            }
            kau.instance.c("ABAdapter", "isFeatureOpened", a.FEATURE_NAME, str, "opened", Boolean.valueOf(z));
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!e || d.getAndSet(true)) {
        } else {
            b(context);
            kao.a().schedule(new Runnable() { // from class: tb.-$$Lambda$xkg$zSa3ZwU3F5IN1e1DRAZUw_Fhlv0
                @Override // java.lang.Runnable
                public final void run() {
                    xkg.lambda$zSa3ZwU3F5IN1e1DRAZUw_Fhlv0(context);
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        c.set(true);
        if (!context.getPackageName().equals(kap.b(context))) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : b) {
            hashMap.put(str, String.valueOf(ABGlobal.isFeatureOpened(kaq.a(), str)));
        }
        xkh.a(kaq.a(), "atools_cfg_bk", hashMap);
        b.clear();
    }

    public static void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            kao.a().execute(new Runnable() { // from class: tb.-$$Lambda$xkg$BNDOUihIGDbzDPgMagmo7G7qYco
                @Override // java.lang.Runnable
                public final void run() {
                    xkg.lambda$BNDOUihIGDbzDPgMagmo7G7qYco(context);
                }
            });
        }
    }

    public static /* synthetic */ void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (!kap.a(context)) {
        } else {
            kau.instance.d("ABAdapter", "sync", new Object[0]);
            xkh.a(context, "atools_cfg", xkh.a(context, "atools_cfg_bk"));
        }
    }
}
