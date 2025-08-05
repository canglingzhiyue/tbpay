package com.huawei.agconnect.core.a;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cwr;
import tb.cwt;
import tb.cwu;
import tb.cww;
import tb.cwx;
import tb.cxa;
import tb.cxb;
import tb.cxc;

/* loaded from: classes.dex */
public class b extends cwt {

    /* renamed from: a  reason: collision with root package name */
    private static List<com.huawei.agconnect.core.b> f7297a;
    private static final Object b = new Object();
    private static final Map<String, cwt> c = new HashMap();
    private static String d;
    private final cwu e;
    private final d f;
    private final d g;

    public b(cwu cwuVar) {
        this.e = cwuVar;
        if (f7297a == null) {
            Log.e("AGConnectInstance", "please call `initialize()` first");
        }
        this.f = new d(f7297a, cwuVar.b());
        this.g = new d(null, cwuVar.b());
        if (cwuVar instanceof cxc) {
            this.g.a(((cxc) cwuVar).d(), cwuVar.b());
        }
    }

    public static cwt a(String str) {
        cwt cwtVar;
        synchronized (b) {
            cwtVar = c.get(str);
            if (cwtVar == null && !cxa.DEFAULT_NAME.equals(str)) {
                String str2 = "not find instance for : " + str;
            }
        }
        return cwtVar;
    }

    private static cwt a(cwu cwuVar, boolean z) {
        cwt cwtVar;
        synchronized (b) {
            cwtVar = c.get(cwuVar.a());
            if (cwtVar == null || z) {
                cwtVar = new b(cwuVar);
                c.put(cwuVar.a(), cwtVar);
            }
        }
        return cwtVar;
    }

    private static synchronized void a(Context context, cwu cwuVar) {
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            e();
            cxb.a(context);
            if (f7297a == null) {
                f7297a = new c(context).a();
            }
            a(cwuVar, true);
            d = cwuVar.a();
            String str = "AGC SDK initialize end, default route:" + cwuVar.c().a();
            a.a();
        }
    }

    public static cwt b(cwu cwuVar) {
        return a(cwuVar, false);
    }

    public static synchronized void b(Context context) {
        synchronized (b.class) {
            if (c.size() > 0) {
                return;
            }
            a(context, cwx.a(context));
        }
    }

    public static cwt d() {
        String str = d;
        return str == null ? a(cxa.DEFAULT_NAME) : a(str);
    }

    private static void e() {
        cww.a("/agcgw/url", new cww.a() { // from class: com.huawei.agconnect.core.a.b.1
            @Override // tb.cww.a
            public String a(cwu cwuVar) {
                String str;
                if (cwuVar.c().equals(cwr.CHINA)) {
                    str = "/agcgw_all/CN";
                } else if (cwuVar.c().equals(cwr.RUSSIA)) {
                    str = "/agcgw_all/RU";
                } else if (cwuVar.c().equals(cwr.GERMANY)) {
                    str = "/agcgw_all/DE";
                } else if (!cwuVar.c().equals(cwr.SINGAPORE)) {
                    return null;
                } else {
                    str = "/agcgw_all/SG";
                }
                return cwuVar.a(str);
            }
        });
        cww.a("/agcgw/backurl", new cww.a() { // from class: com.huawei.agconnect.core.a.b.2
            @Override // tb.cww.a
            public String a(cwu cwuVar) {
                String str;
                if (cwuVar.c().equals(cwr.CHINA)) {
                    str = "/agcgw_all/CN_back";
                } else if (cwuVar.c().equals(cwr.RUSSIA)) {
                    str = "/agcgw_all/RU_back";
                } else if (cwuVar.c().equals(cwr.GERMANY)) {
                    str = "/agcgw_all/DE_back";
                } else if (!cwuVar.c().equals(cwr.SINGAPORE)) {
                    return null;
                } else {
                    str = "/agcgw_all/SG_back";
                }
                return cwuVar.a(str);
            }
        });
    }

    @Override // tb.cwt
    public Context b() {
        return this.e.b();
    }

    @Override // tb.cwt
    public cwu c() {
        return this.e;
    }
}
