package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class iig implements ihx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f29046a;
    private final c b;
    private final ijk c;

    public static /* synthetic */ ihw a(iig iigVar, String str, ijo ijoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("91c718b1", new Object[]{iigVar, str, ijoVar}) : iigVar.a(str, ijoVar);
    }

    public iig(ijd ijdVar, c cVar, ijk ijkVar) {
        this.f29046a = ijdVar;
        this.b = cVar;
        this.c = ijkVar;
    }

    @Override // tb.ihx
    public ihw a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("7c709ddc", new Object[]{this, str});
        }
        try {
            if (this.f29046a.a(str)) {
                RSoLog.d("fetch -> failure , lib in config is disabled, libName=" + str);
                return ihw.a(str, 6003);
            }
            return a(str, this.c.a(str));
        } catch (Throwable th) {
            return ihw.a(str, RSoException.error(5000, th));
        }
    }

    @Override // tb.ihx
    public iht a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iht) ipChange.ipc$dispatch("fa5cf678", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(a(str));
        }
        return iht.a(arrayList);
    }

    @Override // tb.ihx
    public ihw b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("7d1d497b", new Object[]{this, str});
        }
        try {
            if (this.f29046a.a(str)) {
                RSoLog.d("fetchAsync -> failure , lib in config is disabled, libName=" + str);
                return ihw.a(str, 6003);
            }
            return a(str, this.c.b(str));
        } catch (Throwable th) {
            return ihw.a(str, RSoException.error((int) RSoException.ERROR_FETCH_SYNC_FAILED, th));
        }
    }

    @Override // tb.ihx
    public void a(final String str, final ihu ihuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9bf9ac", new Object[]{this, str, ihuVar});
            return;
        }
        try {
            if (this.f29046a.a(str)) {
                RSoLog.d("fetchAsync -> failure , lib in config is disabled, libName=" + str);
                ihuVar.onFetchFinished(ihw.a(str, 6003));
                return;
            }
            this.c.a(str, new ijm() { // from class: tb.iig.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ijm
                public void onFinish(ijo ijoVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("559f7a1b", new Object[]{this, ijoVar});
                        return;
                    }
                    try {
                        ihuVar.onFetchFinished(iig.a(iig.this, str, ijoVar));
                    } catch (Throwable th) {
                        ihuVar.onFetchFinished(ihw.a(str, RSoException.error((int) RSoException.ERROR_FETCH_ASYNC_CALLBACK_FAILED, th)));
                    }
                }
            });
        } catch (Throwable th) {
            ihuVar.onFetchFinished(ihw.a(str, RSoException.error((int) RSoException.ERROR_FETCH_ASYNC_FAILED, th)));
        }
    }

    @Override // tb.ihx
    public void a(final List<String> list, final ihs ihsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d39d715", new Object[]{this, list, ihsVar});
            return;
        }
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            ihu ihuVar = new ihu() { // from class: tb.iig.2
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final AtomicInteger e = new AtomicInteger(0);

                @Override // tb.ihu
                public void onFetchFinished(ihw ihwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                        return;
                    }
                    int incrementAndGet = this.e.incrementAndGet();
                    copyOnWriteArrayList.add(ihwVar);
                    if (incrementAndGet < list.size()) {
                        return;
                    }
                    ihsVar.a(iht.a(copyOnWriteArrayList));
                }
            };
            for (String str : list) {
                a(str, ihuVar);
            }
        } catch (Throwable th) {
            ihsVar.a(iht.a(RSoException.error((int) RSoException.ERROR_FETCH_ASYNC_FAILED, th)));
        }
    }

    private ihw a(String str, ijo ijoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("5384cd5a", new Object[]{this, str, ijoVar});
        }
        k c = ijoVar.c();
        SoIndexData.SoFileInfo g = c.g();
        if (c.i()) {
            return ihw.a(str, c.h()).b(g.getMajorVersion(), g.getMinorVersion()).a(c.f());
        }
        RSoException e = c.e();
        if (e == null) {
            e = RSoException.error(6401, c.a() + " needed by " + str + " fetch failed");
        }
        return ihw.a(str, e).a(c.f());
    }
}
