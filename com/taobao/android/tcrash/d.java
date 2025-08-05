package com.taobao.android.tcrash;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import com.taobao.android.tcrash.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.iqm;
import tb.jdv;
import tb.jdy;
import tb.jej;
import tb.jel;
import tb.jep;
import tb.jer;
import tb.jes;
import tb.jeu;
import tb.jey;
import tb.jez;
import tb.jfa;
import tb.jfb;
import tb.jfc;
import tb.jfj;
import tb.jfp;
import tb.jfq;
import tb.jfr;
import tb.jft;
import tb.jfw;
import tb.jfx;
import tb.jgf;
import tb.jgg;
import tb.jgh;
import tb.jgu;
import tb.jgv;
import tb.scv;
import tb.scw;
import tb.scx;
import tb.sff;
import tb.xka;
import tb.xkb;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final UncaughtCrashManager f15509a;

    public static /* synthetic */ void lambda$8WE9Vea0A_UHtmzZ7ah7aGehJi4(jdy jdyVar, String str) {
        a(jdyVar, str);
    }

    public static /* synthetic */ void lambda$94ZOUqer4H4nXWtOaRJdHMqja4c(jfq jfqVar, String str) {
        c(jfqVar, str);
    }

    public static /* synthetic */ void lambda$HYLcgz1SDPQaqNnvmzzRYKOFtI4(jfq jfqVar, String str) {
        b(jfqVar, str);
    }

    /* renamed from: lambda$Rqtv-HSZZlWUu64CMW6QHzeA0r8 */
    public static /* synthetic */ void m1033lambda$RqtvHSZZlWUu64CMW6QHzeA0r8(jfq jfqVar, String str) {
        a(jfqVar, str);
    }

    public static /* synthetic */ void lambda$fG1vWR_Dgbqfi5L8mquT74QUFo4(jft jftVar, String str) {
        a(jftVar, str);
    }

    public static d a(jdy jdyVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5d569a22", new Object[]{jdyVar, map});
        }
        jdyVar.a(a(jdyVar));
        jft f = f(jdyVar);
        jfq b = b();
        jgh b2 = b(jdyVar, map);
        UncaughtCrashManager a2 = a(jdyVar, b2, b, f);
        new scw().a(new scx(jdyVar, f)).a(new scv(jdyVar, b2)).a();
        sff.a(jdyVar, b2);
        return new d(a2, f);
    }

    private d(UncaughtCrashManager uncaughtCrashManager, jft jftVar) {
        this.f15509a = uncaughtCrashManager;
    }

    public UncaughtCrashManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashManager) ipChange.ipc$dispatch("26babb59", new Object[]{this}) : this.f15509a;
    }

    private static jgh b(jdy jdyVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgh) ipChange.ipc$dispatch("a56988f0", new Object[]{jdyVar, map});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (new jdv(map).a("isDebuggable", false) && jgv.a(jdyVar.a())) {
            jfj.a(true);
            return new jgf(jdyVar.d());
        } else if (jdyVar.b().split("\\.").length > 3) {
            return new jgf(jdyVar.d());
        } else {
            return new jgg(jdyVar.d());
        }
    }

    private static jdv a(jdy jdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdv) ipChange.ipc$dispatch("1ec80171", new Object[]{jdyVar});
        }
        try {
            return new jdv(jdyVar.a().getSharedPreferences(FeatureManager.FEATURE_KEY_CRASH, 0).getAll());
        } catch (Exception unused) {
            return new jdv(new HashMap());
        }
    }

    private static jfq b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfq) ipChange.ipc$dispatch("16b80668", new Object[0]) : new jfp();
    }

    private static UncaughtCrashManager a(jdy jdyVar, jgh jghVar, jfq jfqVar, jft jftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashManager) ipChange.ipc$dispatch("89d78090", new Object[]{jdyVar, jghVar, jfqVar, jftVar});
        }
        jel b = b(jdyVar, jghVar, jfqVar, jftVar);
        TCrashSDK.instance().setUncaughtCrashManager(b);
        return b;
    }

    private static jel b(final jdy jdyVar, jgh jghVar, final jfq jfqVar, final jft jftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jel) ipChange.ipc$dispatch("1ece4e43", new Object[]{jdyVar, jghVar, jfqVar, jftVar});
        }
        jel jelVar = new jel(jdyVar);
        jelVar.b().a(new jfb()).a(new iqm()).a(new xkb(jdyVar)).a(new jfc());
        jes jesVar = new jes(jdyVar.a());
        jfa jfaVar = new jfa();
        jelVar.b().a(new e(jdyVar)).a(jesVar).a(new jey(jdyVar)).a(new jez(jdyVar.a())).a(new jeu()).a(new jep(jdyVar)).a(new xka(jdyVar)).a(jfaVar).a(new OnFileCreatedListener() { // from class: com.taobao.android.tcrash.-$$Lambda$d$94ZOUqer4H4nXWtOaRJdHMqja4c
            @Override // com.taobao.android.tcrash.OnFileCreatedListener
            public final void onFileCreated(String str) {
                d.lambda$94ZOUqer4H4nXWtOaRJdHMqja4c(jfq.this, str);
            }
        }).a(new jej() { // from class: com.taobao.android.tcrash.-$$Lambda$d$fG1vWR_Dgbqfi5L8mquT74QUFo4
            @Override // tb.jej
            public final void onCompleted(String str) {
                d.lambda$fG1vWR_Dgbqfi5L8mquT74QUFo4(jft.this, str);
            }
        });
        jelVar.c().a(new OnFileCreatedListener() { // from class: com.taobao.android.tcrash.-$$Lambda$d$HYLcgz1SDPQaqNnvmzzRYKOFtI4
            @Override // com.taobao.android.tcrash.OnFileCreatedListener
            public final void onFileCreated(String str) {
                d.lambda$HYLcgz1SDPQaqNnvmzzRYKOFtI4(jfq.this, str);
            }
        }).a(new jej() { // from class: com.taobao.android.tcrash.-$$Lambda$d$8WE9Vea0A_UHtmzZ7ah7aGehJi4
            @Override // tb.jej
            public final void onCompleted(String str) {
                d.lambda$8WE9Vea0A_UHtmzZ7ah7aGehJi4(jdy.this, str);
            }
        });
        jelVar.c().a(jesVar).a(jfaVar).b(new OnFileCreatedListener() { // from class: com.taobao.android.tcrash.-$$Lambda$d$Rqtv-HSZZlWUu64CMW6QHzeA0r8
            @Override // com.taobao.android.tcrash.OnFileCreatedListener
            public final void onFileCreated(String str) {
                d.m1033lambda$RqtvHSZZlWUu64CMW6QHzeA0r8(jfq.this, str);
            }
        }).b($$Lambda$d$lFqISeTrk_fRHeT0oabGFeAddQ.INSTANCE).b(new a(jdyVar, jghVar, new a.b() { // from class: com.taobao.android.tcrash.-$$Lambda$d$Db92TQh2LK2NYVvtktayT3pFgbU
            @Override // com.taobao.android.tcrash.a.b
            public final void intercept(File file, boolean z) {
                d.a(jft.this, file, z);
            }
        }));
        final UncaughtCrashHeader uncaughtCrashHeader = jelVar.getUncaughtCrashHeader();
        Application a2 = jdyVar.a();
        uncaughtCrashHeader.getClass();
        a2.registerActivityLifecycleCallbacks(new jer(jdyVar, new jer.a() { // from class: com.taobao.android.tcrash.-$$Lambda$-ZTpqHNk0_Te6K9LeU9A2MI1Q0o
            @Override // tb.jer.a
            public final void keyValue(String str, String str2) {
                UncaughtCrashHeader.this.addHeaderInfo(str, str2);
            }
        }));
        return jelVar;
    }

    public static /* synthetic */ void c(jfq jfqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdff3b8f", new Object[]{jfqVar, str});
        } else {
            jfqVar.a("java", new File(str).getName());
        }
    }

    public static /* synthetic */ void a(jft jftVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bedaea", new Object[]{jftVar, str});
        } else {
            jftVar.a(jfw.a(new File(str), "java"));
        }
    }

    public static /* synthetic */ void b(jfq jfqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e916734e", new Object[]{jfqVar, str});
        } else {
            jfqVar.a("native", str);
        }
    }

    public static /* synthetic */ void a(jdy jdyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f84d83", new Object[]{jdyVar, str});
        } else {
            jgu.a(jdyVar, str, "native");
        }
    }

    public static /* synthetic */ void a(jfq jfqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42dab0d", new Object[]{jfqVar, str});
        } else {
            jfqVar.a("anr", str);
        }
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            jfr.a().a("STAGE_ANR_HAPPENED", "TCrash", "anr");
        }
    }

    public static /* synthetic */ void a(jft jftVar, File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b795bb1d", new Object[]{jftVar, file, new Boolean(z)});
        } else if (!z) {
        } else {
            jftVar.a(jfw.a(file, "anr"));
            jfr.a().a("STAGE_ANR_HAPPENED_SEND", "TCrash", "anr");
        }
    }

    private static jft f(jdy jdyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jft) ipChange.ipc$dispatch("a4f13890", new Object[]{jdyVar}) : new jfx(jdyVar);
    }
}
