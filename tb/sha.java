package tb;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.falco.FalcoEnvironment;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import java.util.HashMap;
import tb.tpr;

/* loaded from: classes7.dex */
public class sha implements a.c, tpr.a, tpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FalcoEnvironment f33575a;

    @Override // tb.tpr.b
    public void a(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d51079", new Object[]{this, fragmentManager, fragment});
        }
    }

    @Override // tb.tpr.b
    public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a112a7bb", new Object[]{this, fragmentManager, fragment, bundle});
        }
    }

    @Override // tb.tpr.b
    public void c(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7b3b7", new Object[]{this, fragmentManager, fragment});
        }
    }

    @Override // tb.tpr.a
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tpr.a
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.tpr.a
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ FalcoEnvironment a(sha shaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FalcoEnvironment) ipChange.ipc$dispatch("ae290c82", new Object[]{shaVar}) : shaVar.f33575a;
    }

    public sha(FalcoEnvironment falcoEnvironment) {
        this.f33575a = falcoEnvironment;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c.a(this);
        tpr.a().a((tpr.a) this);
        tpr.a().a((tpr.b) this);
        a(s.f18233a.a(), true);
        a(s.f18233a.b(), true);
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            a(s.f18233a.d(), false);
        }
    }

    @Override // tb.tpr.a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            a(s.f18233a.b(activity), true);
        }
    }

    @Override // tb.tpr.b
    public void b(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed66218", new Object[]{this, fragmentManager, fragment});
        } else {
            a(s.f18233a.b(fragment), true);
        }
    }

    private void a(final g gVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822f3b00", new Object[]{this, gVar, new Boolean(z)});
        } else if (gVar == null) {
            ALog.e("falco.env.injector", "[injectEnvToApm] procedure is null", null, new Object[0]);
        } else {
            dit.g(new Runnable() { // from class: tb.sha.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    HashMap hashMap = new HashMap(45);
                    hashMap.put("envFalcoId", sha.a(sha.this).b());
                    spn k = sha.a(sha.this).k();
                    hashMap.put("memTotal", Long.valueOf(k.f33815a));
                    hashMap.put("memFree", Long.valueOf(k.b));
                    hashMap.put("appMemUsage", Long.valueOf(k.c));
                    qrj j = sha.a(sha.this).j();
                    hashMap.put("cpuCores", Integer.valueOf(j.f33049a));
                    hashMap.put("deviceCpuUsage", Float.valueOf(j.b));
                    hashMap.put("appCpuUsage", Float.valueOf(j.c));
                    tes i = sha.a(sha.this).i();
                    hashMap.put("diskTotal", Long.valueOf(i.f34059a));
                    hashMap.put("diskFree", Long.valueOf(i.b));
                    tcc g = sha.a(sha.this).g();
                    hashMap.put("netType", g.f34017a);
                    hashMap.put("apn", g.b);
                    hashMap.put("wifiSsid", g.c);
                    hashMap.put(DispatchConstants.CARRIER, g.d);
                    hashMap.put("isAirplaneMode", Integer.valueOf(g.e));
                    hashMap.put("isWifiEnabled", Integer.valueOf(g.f));
                    hashMap.put("isWifiRestricted", Integer.valueOf(g.g));
                    hashMap.put("isCellularRestricted", Integer.valueOf(g.h));
                    hashMap.put("proxyType", Integer.valueOf(g.i));
                    hashMap.put("ipStack", Integer.valueOf(g.j));
                    tcd h = sha.a(sha.this).h();
                    hashMap.put("srttAvgCDN", Double.valueOf(h.f34018a));
                    hashMap.put("srttMaxCDN", Double.valueOf(h.b));
                    hashMap.put("srttMinCDN", Double.valueOf(h.c));
                    hashMap.put("srttAvgIDC", Double.valueOf(h.d));
                    hashMap.put("srttMaxIDC", Double.valueOf(h.e));
                    hashMap.put("srttMinIDC", Double.valueOf(h.f));
                    hashMap.put("frttAvgCDN", Double.valueOf(h.g));
                    hashMap.put("frttMaxCDN", Double.valueOf(h.h));
                    hashMap.put("frttMinCDN", Double.valueOf(h.i));
                    hashMap.put("frttAvgIDC", Double.valueOf(h.j));
                    hashMap.put("frttMaxIDC", Double.valueOf(h.k));
                    hashMap.put("frttMinIDC", Double.valueOf(h.l));
                    hashMap.put("lossratioAvgCDN", Double.valueOf(h.m));
                    hashMap.put("lossratioMaxCDN", Double.valueOf(h.n));
                    hashMap.put("lossratioAvgIDC", Double.valueOf(h.o));
                    hashMap.put("lossratioMaxIDC", Double.valueOf(h.p));
                    hashMap.put("recentWinCount", Long.valueOf(h.q));
                    hashMap.put("recentWinFail", Long.valueOf(h.r));
                    hashMap.put("recentWinBWE", Long.valueOf(h.s));
                    hashMap.put("mtuCDN", Long.valueOf(h.t));
                    hashMap.put("mtuIDC", Long.valueOf(h.u));
                    hashMap.put("signalDBM", Integer.valueOf(h.v));
                    hashMap.put("signalRSSI", Integer.valueOf(h.w));
                    hashMap.put("signalSINR", Integer.valueOf(h.x));
                    hashMap.put("score", Integer.valueOf(h.y));
                    if (!z) {
                        hashMap.put("temperature", Integer.valueOf(sha.a(sha.this).f().d));
                    }
                    ALog.e("falco.env.injector", "[injectEnvToApm] spend time: " + (System.currentTimeMillis() - currentTimeMillis), null, new Object[0]);
                    gVar.a("additional_env", (Object) hashMap);
                }
            });
        }
    }
}
