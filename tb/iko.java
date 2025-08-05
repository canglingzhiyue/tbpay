package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class iko implements ihx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihx f29121a;
    private final long b = iky.a();

    public static /* synthetic */ long a(iko ikoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("edd9101f", new Object[]{ikoVar})).longValue() : ikoVar.b;
    }

    public static /* synthetic */ void a(iko ikoVar, ihw ihwVar, ikr ikrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec9724d", new Object[]{ikoVar, ihwVar, ikrVar, str});
        } else {
            ikoVar.a(ihwVar, ikrVar, str);
        }
    }

    public iko(ihx ihxVar) {
        this.f29121a = ihxVar;
    }

    @Override // tb.ihx
    public ihw a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("7c709ddc", new Object[]{this, str});
        }
        try {
            RSoLog.c("fetch() enter -> libName=" + str);
            ikr ikrVar = new ikr("fetch");
            ikrVar.a("begin");
            ihw a2 = this.f29121a.a(str);
            ikrVar.a("end", "begin");
            a(a2, ikrVar, "fetch");
            RSoLog.c("fetch() result=" + a2.toString());
            return a2;
        } catch (Throwable th) {
            return ihw.a(str, RSoException.error(6201, th));
        }
    }

    @Override // tb.ihx
    public iht a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iht) ipChange.ipc$dispatch("fa5cf678", new Object[]{this, list});
        }
        try {
            RSoLog.c("batchFetch() enter -> libName=" + list);
            iht a2 = this.f29121a.a(list);
            RSoLog.c("batchFetch() result=" + a2.toString());
            return a2;
        } catch (Throwable th) {
            return iht.a(RSoException.error(6201, th));
        }
    }

    @Override // tb.ihx
    public ihw b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("7d1d497b", new Object[]{this, str});
        }
        try {
            RSoLog.c("fetchSync() enter -> libName=" + str);
            ikr ikrVar = new ikr("fetchSync");
            ikrVar.a("begin");
            ihw b = this.f29121a.b(str);
            ikrVar.a("end", "begin");
            a(b, ikrVar, "fetchSync");
            RSoLog.c("fetchSync() result=" + b.toString());
            return b;
        } catch (Throwable th) {
            return ihw.a(str, RSoException.error(6201, th));
        }
    }

    @Override // tb.ihx
    public void a(String str, final ihu ihuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9bf9ac", new Object[]{this, str, ihuVar});
            return;
        }
        try {
            RSoLog.c("fetchAsync() enter -> libName=" + str);
            final ikr ikrVar = new ikr("fetchAsync");
            ikrVar.a("begin");
            this.f29121a.a(str, new ihu() { // from class: tb.iko.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihu
                public void onFetchFinished(ihw ihwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                        return;
                    }
                    RSoLog.c("fetchAsync() result=" + ihwVar.toString());
                    ikrVar.a("end", "begin");
                    iko.a(iko.this, ihwVar, ikrVar, "fetchAsync");
                    ihuVar.onFetchFinished(ihwVar);
                }
            });
        } catch (Throwable th) {
            ihuVar.onFetchFinished(ihw.a(str, RSoException.error(6201, th)));
        }
    }

    @Override // tb.ihx
    public void a(List<String> list, final ihs ihsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d39d715", new Object[]{this, list, ihsVar});
            return;
        }
        try {
            RSoLog.c("batchFetchAsync() enter -> libName=" + list);
            this.f29121a.a(list, new ihs() { // from class: tb.iko.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihs
                public void a(iht ihtVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("edb10f83", new Object[]{this, ihtVar});
                        return;
                    }
                    RSoLog.c("batchFetchAsync() result=" + ihtVar.toString());
                    ihsVar.a(ihtVar);
                }
            });
        } catch (Throwable th) {
            ihsVar.a(iht.a(RSoException.error(6201, th)));
        }
    }

    private void a(final ihw ihwVar, final ikr ikrVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82b7f4a", new Object[]{this, ihwVar, ikrVar, str});
        } else {
            ikq.a("fetcher-tracker", new Runnable() { // from class: tb.iko.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(ikn.ARGS_LIB_NAME, ihwVar.a());
                    hashMap.put(ikn.ARGS_CALL_TYPE, str);
                    hashMap.put(ikn.ARGS_INTERVAL_FROM_INIT, Long.valueOf(iky.a() - iko.a(iko.this)));
                    hashMap.put("resultMajorVer", ikw.a(ihwVar.c()));
                    hashMap.put("resultMinorVer", ikw.a(ihwVar.d()));
                    hashMap.put("source", ihwVar.e());
                    hashMap.putAll(ikrVar.a());
                    if (ihwVar.g()) {
                        ikq.b(ikn.POINT_FETCHER, hashMap);
                    } else {
                        ikq.a(ikn.POINT_FETCHER, hashMap, ihwVar.f());
                    }
                }
            });
        }
    }
}
