package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ikp implements iia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iia f29125a;
    private final long b = iky.a();

    public static /* synthetic */ long a(ikp ikpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("edd9847e", new Object[]{ikpVar})).longValue() : ikpVar.b;
    }

    public static /* synthetic */ void a(ikp ikpVar, ihz ihzVar, ikr ikrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622211c9", new Object[]{ikpVar, ihzVar, ikrVar, str});
        } else {
            ikpVar.a(ihzVar, ikrVar, str);
        }
    }

    public ikp(iia iiaVar) {
        this.f29125a = iiaVar;
    }

    @Override // tb.iia
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f29125a.a(str);
    }

    @Override // tb.iia
    public ihz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("7d1d49d8", new Object[]{this, str});
        }
        try {
            RSoLog.c("load() -> enter() " + str);
            ikr ikrVar = new ikr("load");
            ikrVar.a("begin");
            ihz b = this.f29125a.b(str);
            ikrVar.a("end", "begin");
            a(b, ikrVar, "load");
            RSoLog.c("load() result=" + b.toString());
            return b;
        } catch (Throwable th) {
            return ihz.a(str, RSoException.error(5101, th));
        }
    }

    @Override // tb.iia
    public ihz c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("7dc9f577", new Object[]{this, str});
        }
        try {
            RSoLog.c("loadSync() -> enter() " + str);
            ikr ikrVar = new ikr("loadSync");
            ikrVar.a("begin");
            ihz c = this.f29125a.c(str);
            ikrVar.a("end", "begin");
            a(c, ikrVar, "loadSync");
            RSoLog.c("loadSync() result=" + c.toString());
            return c;
        } catch (Throwable th) {
            return ihz.a(str, RSoException.error(5101, th));
        }
    }

    @Override // tb.iia
    public void a(String str, final ihy ihyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9dcb28", new Object[]{this, str, ihyVar});
            return;
        }
        try {
            RSoLog.c("loadAsync() enter -> libName=" + str);
            final ikr ikrVar = new ikr("loadAsync");
            ikrVar.a("begin");
            this.f29125a.a(str, new ihy() { // from class: tb.ikp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                        return;
                    }
                    RSoLog.c("loadAsync() result=" + ihzVar.toString());
                    ikrVar.a("end", "begin");
                    ikp.a(ikp.this, ihzVar, ikrVar, "loadAsync");
                    ihyVar.onLoadFinished(ihzVar);
                }
            });
        } catch (Throwable th) {
            ihyVar.onLoadFinished(ihz.a(str, RSoException.error(5101, th)));
        }
    }

    private void a(final ihz ihzVar, final ikr ikrVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da318227", new Object[]{this, ihzVar, ikrVar, str});
        } else {
            ikq.a("loader-tracker", new Runnable() { // from class: tb.ikp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(ikn.ARGS_LIB_NAME, ihzVar.a());
                    hashMap.put(ikn.ARGS_LOAD_FROM, ihzVar.e());
                    hashMap.put(ikn.ARGS_CALL_TYPE, str);
                    hashMap.put(ikn.ARGS_INTERVAL_FROM_INIT, Long.valueOf(iky.a() - ikp.a(ikp.this)));
                    hashMap.put("resultMajorVer", ikw.a(ihzVar.b()));
                    hashMap.put("resultMinorVer", ikw.a(ihzVar.c()));
                    hashMap.put("source", ihzVar.d());
                    hashMap.putAll(ikrVar.a());
                    if (ihzVar.g()) {
                        ikq.b(ikn.POINT_LOADER, hashMap);
                    } else {
                        ikq.a(ikn.POINT_LOADER, hashMap, ihzVar.f());
                    }
                }
            });
        }
    }
}
