package android.taobao.windvane.runtimepermission;

import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.taobao.windvane.jsbridge.d;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PERMISSION_ALLOW = "allow";
    public static final String PERMISSION_DENY = "deny";

    static {
        kge.a(-475997158);
    }

    public static synchronized C0022a a(Context context, String[] strArr) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0022a) ipChange.ipc$dispatch("fcf5913e", new Object[]{context, strArr});
            } else if (context == null) {
                throw new NullPointerException("context can not be null");
            } else {
                if (strArr == null || strArr.length == 0) {
                    throw new NullPointerException("permissions can not be null");
                }
                C0022a c0022a = new C0022a();
                C0022a.a(c0022a, context);
                C0022a.a(c0022a, strArr);
                return c0022a;
            }
        }
    }

    public static Map<String, String> b(Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("86aea0f5", new Object[]{context, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, str.contains(AttributionReporter.SYSTEM_PERMISSION) ? str : "android.permission." + str);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : hashMap.keySet()) {
            try {
                if (ActivityCompat.checkSelfPermission(context, (String) hashMap.get(str2)) != 0) {
                    hashMap2.put(str2, PERMISSION_DENY);
                } else {
                    hashMap2.put(str2, PERMISSION_ALLOW);
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap2;
    }

    /* renamed from: android.taobao.windvane.runtimepermission.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0022a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f1694a;
        private String[] b;
        private Runnable c;
        private d d;

        static {
            kge.a(-1632111116);
        }

        public static /* synthetic */ Context a(C0022a c0022a, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("3e17c579", new Object[]{c0022a, context});
            }
            c0022a.f1694a = context;
            return context;
        }

        public static /* synthetic */ String[] a(C0022a c0022a, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("adbeef67", new Object[]{c0022a, strArr});
            }
            c0022a.b = strArr;
            return strArr;
        }

        public C0022a a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0022a) ipChange.ipc$dispatch("886a3325", new Object[]{this, runnable});
            }
            if (runnable == null) {
                throw new NullPointerException("permissionGrantedRunnable is null");
            }
            this.c = runnable;
            return this;
        }

        public C0022a a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0022a) ipChange.ipc$dispatch("5e4b770b", new Object[]{this, dVar});
            }
            this.d = dVar;
            return this;
        }

        public void a() {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : this.b) {
                try {
                    if (ActivityCompat.checkSelfPermission(this.f1694a, str) != 0) {
                        arrayList.add(str);
                    }
                } catch (Throwable unused) {
                    this.c.run();
                    return;
                }
            }
            if (arrayList.size() == 0) {
                this.c.run();
            } else {
                this.d.a(arrayList);
            }
        }
    }
}
