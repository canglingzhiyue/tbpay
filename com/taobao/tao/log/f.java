package com.taobao.tao.log;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.interceptor.RealTimeLogMessageManager;
import com.taobao.tao.log.interceptor.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jhd;
import tb.kge;
import tb.oki;
import tb.okk;
import tb.okm;
import tb.okn;
import tb.oku;
import tb.ola;
import tb.olb;
import tb.olg;
import tb.oli;
import tb.oln;
import tb.olo;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INIT_END = 2;
    public static final int INIT_ING = 1;
    public static final int INIT_NO = 0;

    /* renamed from: a */
    public String f20688a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, olo> f;
    private Context g;
    private Application h;
    private volatile int i;
    private oli j;
    private okk k;
    private okn l;
    private b m;
    private com.taobao.tao.log.statistics.b n;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final f f20689a;

        static {
            kge.a(-835416326);
            f20689a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("79355322", new Object[0]) : f20689a;
        }
    }

    static {
        kge.a(-865856473);
    }

    public static /* synthetic */ void lambda$ASYgPpHrE4tnbmGnbzzvQ0KHG6g(f fVar) {
        fVar.u();
    }

    private f() {
        this.i = 0;
        this.f20688a = "motu-debug-log";
        this.b = "adash.emas-ha.cn";
        this.c = "ha-remote-debug";
        this.d = "real_time_log";
        this.e = null;
        this.f = new ConcurrentHashMap();
        this.j = null;
        this.k = null;
        this.l = null;
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("79355322", new Object[0]) : a.a();
    }

    public f b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("7b0ea641", new Object[]{this});
        }
        if (this.i != 0) {
            return this;
        }
        this.i = 1;
        com.taobao.tao.log.utils.c.a(this.g);
        d.a(this.g);
        com.taobao.tao.log.utils.a.a(this.g);
        com.taobao.tao.log.statistics.c.a(this.g, d.z, d.A);
        com.taobao.tao.log.interceptor.d.a(this.g);
        TLogNative.appenderOpen(d.l.getIndex(), com.taobao.tao.log.utils.a.a().getAbsolutePath(), com.taobao.tao.log.utils.a.b().getAbsolutePath(), d.n, com.taobao.tao.log.utils.a.e(), d.f20685a, d.v, d.o, d.w, d.x, d.r, d.s, d.t, d.u);
        if (TLogNative.isSoOpen()) {
            try {
                TLogNative.setConsoleLogOpen(false);
            } catch (Throwable th) {
                Log.e("TLOG", "TLogNative.isSoOpen: ", th);
            }
        }
        e.a().b(d.l);
        e.a().d();
        oku.a().b();
        oln olnVar = new oln();
        a(olnVar.getBizCode(), olnVar);
        this.i = 2;
        String format = String.format("tlog init end! Config: %s", d.a());
        TLog.loge("TLOG", "init", format);
        Log.e("TLOG", format);
        return this;
    }

    public f a(Context context, LogLevel logLevel, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("21c085cc", new Object[]{this, context, logLevel, str, str2, str3, str4});
        }
        if (this.i != 0) {
            return this;
        }
        this.g = context;
        d.j = g.b(context);
        d.l = logLevel;
        d.f20685a = str3;
        d.e = str4;
        if (!TextUtils.isEmpty(str2)) {
            d.n = str2.replaceAll("[:*?<>|\"\\\\/]", "-");
        }
        return this;
    }

    public f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("7bb21598", new Object[]{this, str});
        }
        d.b = str;
        return this;
    }

    public f b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("3e9e7ef7", new Object[]{this, str});
        }
        d.c = str;
        return this;
    }

    public f c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("18ae856", new Object[]{this, str});
        }
        d.d = str;
        return this;
    }

    public f a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5d821f73", new Object[]{this, application});
        }
        this.h = application;
        return this;
    }

    public f d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c47751b5", new Object[]{this, str});
        }
        d.f = str;
        return this;
    }

    public f e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("8763bb14", new Object[]{this, str});
        }
        d.m = str;
        return this;
    }

    public f f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4a502473", new Object[]{this, str});
        }
        if (str != null) {
            jhd.a().a(str);
        }
        return this;
    }

    public f a(okk okkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("311ee7c1", new Object[]{this, okkVar});
        }
        this.k = okkVar;
        if (this.k != null) {
            oki okiVar = new oki();
            okiVar.b = this.g;
            okiVar.d = a().m();
            okiVar.i = this.c;
            this.k.a(okiVar);
        }
        return this;
    }

    public f c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("7ce7f960", new Object[]{this});
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.g == null) {
            return this;
        }
        if (this.k != null) {
            olb.a();
            ola.a().b();
        }
        com.taobao.tao.log.utils.d.a().a(new Runnable() { // from class: com.taobao.tao.log.-$$Lambda$f$ASYgPpHrE4tnbmGnbzzvQ0KHG6g
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.lambda$ASYgPpHrE4tnbmGnbzzvQ0KHG6g(f.this);
            }
        });
        return this;
    }

    public /* synthetic */ void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        try {
            if (!d.f()) {
                return;
            }
            com.taobao.tao.log.interceptor.d.b(this.g);
            com.taobao.tao.log.statistics.c.a(this.g);
            olg.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public f a(String str, olo oloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("3ddf5b5a", new Object[]{this, str, oloVar});
        }
        try {
            this.f.put(str, oloVar);
        } catch (Exception e) {
            Log.e("TLOG", "regist tlog user define uploader error", e);
        }
        return this;
    }

    public f a(oli oliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2a97a0de", new Object[]{this, oliVar});
        }
        this.j = oliVar;
        return this;
    }

    public f a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f1cd369e", new Object[]{this, new Boolean(z)});
        }
        d.i = z;
        return this;
    }

    public f a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("35b2b9cf", new Object[]{this, new Integer(i)});
        }
        d.o = i;
        d.p = true;
        return this;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.i;
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            olb.a(num);
        }
    }

    public f g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d3c8dd2", new Object[]{this, str});
        }
        d.h = str;
        return this;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : d.n;
    }

    public oli f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oli) ipChange.ipc$dispatch("3580f74d", new Object[]{this}) : this.j;
    }

    public okk g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (okk) ipChange.ipc$dispatch("3d329929", new Object[]{this}) : this.k;
    }

    public okn h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okn) ipChange.ipc$dispatch("44e43ee5", new Object[]{this});
        }
        if (this.l == null) {
            this.l = new okm();
        }
        return this.l;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : d.g;
    }

    public Context j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e9631be9", new Object[]{this}) : this.g;
    }

    public Application k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("9640e541", new Object[]{this}) : this.h;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        if (d.b == null) {
            d.b = d.f20685a + "@android";
        }
        return d.b;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : d.f20685a;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : d.e;
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : d.f;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : d.h;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : d.i || d.j;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : d.B;
    }

    public f a(com.taobao.tao.log.statistics.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("173eb1b2", new Object[]{this, bVar});
        }
        this.n = bVar;
        return this;
    }

    public com.taobao.tao.log.statistics.b s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.log.statistics.b) ipChange.ipc$dispatch("3e3242ea", new Object[]{this});
        }
        if (this.n == null) {
            this.n = new com.taobao.tao.log.statistics.a();
        }
        return this.n;
    }

    public b t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("23c5431d", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new com.taobao.tao.log.interceptor.e();
        }
        return this.m;
    }

    public f b(okk okkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("6e3eabe0", new Object[]{this, okkVar});
        }
        RealTimeLogMessageManager.a(okkVar);
        return this;
    }

    public f h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d028f731", new Object[]{this, str});
        }
        d.y = str;
        return this;
    }

    public f b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("6f03ca90", new Object[]{this, new Integer(i)});
        }
        if (i <= 2048) {
            d.H = i << 10;
        }
        return this;
    }
}
