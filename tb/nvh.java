package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.k;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class nvh implements ijk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FETCH_FROM_BUSI_CALL = "busi_call";
    public static final String FETCH_FROM_LOAD = "load";

    /* renamed from: a  reason: collision with root package name */
    private final ijk f31786a;
    private final String b;
    private final String c;
    private final long d = iky.a();

    public static /* synthetic */ String a(nvh nvhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("adac2c68", new Object[]{nvhVar}) : nvhVar.c;
    }

    public static /* synthetic */ void a(nvh nvhVar, ijo ijoVar, ikr ikrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d093b1a4", new Object[]{nvhVar, ijoVar, ikrVar, str});
        } else {
            nvhVar.a(ijoVar, ikrVar, str);
        }
    }

    public nvh(ijk ijkVar, String str, String str2) {
        this.f31786a = ijkVar;
        this.b = str;
        this.c = str2;
    }

    @Override // tb.ijk
    public ijo a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str});
        }
        RSoLog.c(this.c + " [puller].resolve() enter -> libName=" + str);
        ikr ikrVar = new ikr("fetch");
        ikrVar.a("begin");
        ijo a2 = this.f31786a.a(str);
        ikrVar.a("end", "begin");
        a(a2, ikrVar, "fetch");
        RSoLog.c(this.c + " [puller].resolve() exit -> result=" + a2);
        return a2;
    }

    @Override // tb.ijk
    public ijo b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7d1d5005", new Object[]{this, str});
        }
        RSoLog.c(this.c + " [puller].resolveSync() enter -> libName=" + str);
        ikr ikrVar = new ikr("fetchSync");
        ikrVar.a("begin");
        ijo b = this.f31786a.b(str);
        ikrVar.a("end", "begin");
        a(b, ikrVar, "fetchSync");
        RSoLog.c(this.c + " [puller].resolveSync() exit -> result=" + b);
        return b;
    }

    @Override // tb.ijk
    public void a(String str, final ijm ijmVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db485b6", new Object[]{this, str, ijmVar});
            return;
        }
        RSoLog.c(this.c + " [puller].resolveAsync() enter -> libName=" + str);
        final ikr ikrVar = new ikr("fetchAsync");
        ikrVar.a("begin");
        this.f31786a.a(str, new ijm() { // from class: tb.nvh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ijm
            public void onFinish(ijo ijoVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("559f7a1b", new Object[]{this, ijoVar});
                    return;
                }
                RSoLog.c(nvh.a(nvh.this) + " [puller].resolveAsync() exit -> result=" + ijoVar);
                ikrVar.a("end", "begin");
                nvh.a(nvh.this, ijoVar, ikrVar, "fetchAsync");
                ijmVar.onFinish(ijoVar);
            }
        });
    }

    private void a(ijo ijoVar, ikr ikrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc97b2d4", new Object[]{this, ijoVar, ikrVar, str});
            return;
        }
        try {
            SoIndexData.SoFileInfo b = ijoVar.b();
            k c = ijoVar.c();
            SoIndexData.SoFileInfo g = c.g();
            HashMap hashMap = new HashMap();
            hashMap.put(ikn.ARGS_LIB_NAME, ijoVar.a());
            hashMap.put("targetMajorVer", ikw.a(b.getMajorVersion()));
            hashMap.put("targetMinorVer", ikw.a(b.getMinorVersion()));
            hashMap.put("targetLength", Long.valueOf(b.getLength()));
            hashMap.put("resultMajorVer", ikw.a(g.getMajorVersion()));
            hashMap.put("resultMinorVer", ikw.a(g.getMinorVersion()));
            hashMap.put("resultLength", Long.valueOf(g.getLength()));
            hashMap.put(ikn.ARGS_FETCH_FROM, this.c);
            hashMap.put(ikn.ARGS_CALL_TYPE, this.c + "_" + str);
            hashMap.put(ikn.ARGS_INTERVAL_FROM_INIT, Long.valueOf(iky.a() - this.d));
            hashMap.put("source", c.f());
            hashMap.putAll(ikrVar.a());
            if (c.i()) {
                ikq.b(this.b, hashMap);
            } else {
                ikq.a(this.b, hashMap, c.e());
            }
        } catch (Throwable th) {
            ikq.a("PullerTrackWrapper,logFetchResult", th);
        }
    }
}
