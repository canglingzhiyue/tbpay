package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.k;
import com.taobao.android.remoteso.resolver2.l;
import com.taobao.android.remoteso.resolver2.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ijq implements ijk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ijd b;
    private final c c;
    private final ijr d;
    private final iji e = new iji();

    public static /* synthetic */ ijo a(j jVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijo) ipChange.ipc$dispatch("7475920d", new Object[]{jVar, rSoException}) : b(jVar, rSoException);
    }

    public ijq(ijd ijdVar, c cVar, ijr ijrVar) {
        this.b = ijdVar;
        this.c = cVar;
        this.d = ijrVar;
    }

    @Override // tb.ijk
    public ijo a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str}) : d(str);
    }

    @Override // tb.ijk
    public ijo b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7d1d5005", new Object[]{this, str});
        }
        ijo d = d(str);
        if (d.e()) {
            return d;
        }
        final o oVar = new o();
        b(str, new ijm() { // from class: tb.ijq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ijm
            public void onFinish(ijo ijoVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("559f7a1b", new Object[]{this, ijoVar});
                } else {
                    oVar.a((o) ijoVar);
                }
            }
        });
        int a2 = ijn.a(this.b, str);
        ijo ijoVar = (ijo) (this.b.a("key_sync_6304_opt", true) ? oVar.b(a2) : oVar.a(a2));
        return ijoVar == null ? b(a(str, this.c.c()), RSoException.error(6304)) : ijoVar;
    }

    @Override // tb.ijk
    public void a(String str, ijm ijmVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db485b6", new Object[]{this, str, ijmVar});
            return;
        }
        ijo d = d(str);
        if (d.e()) {
            ijmVar.onFinish(d);
        } else {
            b(str, ijmVar);
        }
    }

    private void b(String str, ijm ijmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429d4df7", new Object[]{this, str, ijmVar});
            return;
        }
        RSoLog.c("puller ->  obtainOrResolve, start,  targetReq=" + str + ",  callback=" + ijmVar);
        SoIndexData c = this.c.c();
        j a2 = a(str, c);
        List<String> a3 = this.e.a(a2.a(), c);
        if (a3.size() <= 0) {
            throw new IllegalArgumentException(a2 + " got ordered libNames size < 1, wtf??");
        }
        RSoLog.c("puller ->  obtainOrResolve, result=fail, will resolve,  targetReq=" + a2.a() + ",  dep lib =" + a3);
        a aVar = new a(a2, a3, ijmVar);
        for (String str2 : a3) {
            a(str2, c, aVar);
        }
    }

    private ijo d(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7e76a743", new Object[]{this, str});
        }
        RSoLog.c("puller ->  obtainIncludeLast, start,  targetReq=" + str);
        SoIndexData c = this.c.c();
        j a2 = a(str, c);
        ijo a3 = a(a2, c);
        if (a3.e()) {
            RSoLog.c("puller ->  obtainIncludeLast, result=succ, from current, " + a2.a());
            return a3;
        }
        boolean b = ijn.b(this.b, a2.a());
        SoInfo2 f = a2.f();
        if (f != null && f.ext.allowLastIndex) {
            z = true;
        }
        if (!b && !z) {
            RSoLog.c("puller ->  obtainIncludeLast, result=fail, not allow last index, " + a2.a());
            return a3;
        }
        a2.a(true);
        return a(a2);
    }

    private ijo a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("abf5b10c", new Object[]{this, jVar});
        }
        String a2 = jVar.a();
        for (SoIndexData soIndexData : this.c.a().b()) {
            try {
                if (ijn.a(jVar, soIndexData)) {
                    ijo a3 = a(jVar, soIndexData);
                    if (a3.e()) {
                        RSoLog.c("puller ->  last, uc kernel, " + a2);
                        return a3;
                    }
                }
            } catch (Throwable th) {
                ikq.a("obtainIncludeLast,sortedData", th);
            }
            try {
                SoIndexData.SoFileInfo a4 = this.c.a(a2, soIndexData);
                if (a4 != null) {
                    j a5 = j.a(a2, a4, null);
                    k a6 = this.d.a(a5);
                    if (a6.i()) {
                        RSoLog.c("puller ->  last, last prefer, " + a2);
                        return new ijo(a5, a6);
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                ikq.a("obtainIncludeLast,error", a2, th2);
            }
        }
        RSoLog.c("puller ->  last, result=fail, not found result, " + jVar.a());
        return b(jVar, RSoException.error(6005));
    }

    private ijo a(j jVar, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("92db37ec", new Object[]{this, jVar, soIndexData});
        }
        List<String> a2 = this.e.a(jVar.a(), soIndexData);
        if (a2.size() <= 0) {
            throw new IllegalArgumentException(jVar + " got ordered libNames size < 1, wtf??");
        }
        RSoLog.c("puller ->  obtainFromDataOrError, start,  targetReq=" + jVar.a() + ",  dep libs=" + a2);
        ArrayList arrayList = new ArrayList(a2.size());
        for (String str : a2) {
            k a3 = a(soIndexData, str);
            if (!a3.i()) {
                RSoLog.c("puller ->  obtainFromDataOrError, result=fail, dep fail,  targetReq=" + jVar.a() + ",  dep lib=" + str);
                return new ijo(jVar, a3);
            }
            arrayList.add(a3);
        }
        if (arrayList.size() != a2.size()) {
            RSoLog.c("puller ->  obtainFromDataOrError, result=fail, dep fail,  targetReq=" + jVar.a() + ",  succResults.len=" + arrayList.size() + ", libNames.len=" + a2.size());
            return b(jVar, RSoException.error(6310));
        }
        return new ijo(jVar, arrayList);
    }

    private k a(SoIndexData soIndexData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("927b779d", new Object[]{this, soIndexData, str});
        }
        try {
            return this.d.a(a(str, soIndexData));
        } catch (Throwable th) {
            String b = l.b(str);
            if (b != null) {
                return l.a(l.a(str), b, "prefer-apk");
            }
            throw RSoException.error(6090, th);
        }
    }

    private void a(String str, SoIndexData soIndexData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed86a69", new Object[]{this, str, soIndexData, aVar});
            return;
        }
        try {
            this.d.a(a(str, soIndexData), aVar);
        } catch (Throwable th) {
            String b = l.b(str);
            if (b != null) {
                aVar.a(l.a(l.a(str), b, "prefer-apk"));
                return;
            }
            throw RSoException.error(6090, th);
        }
    }

    private j a(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("964580aa", new Object[]{this, str, soIndexData}) : l.a(this.c, str, soIndexData);
    }

    private static ijo b(j jVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijo) ipChange.ipc$dispatch("932fc9ce", new Object[]{jVar, rSoException}) : new ijo(jVar, l.a(jVar, rSoException, "puller-error"));
    }

    /* loaded from: classes6.dex */
    public static class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final j f29088a;
        private final List<String> b;
        private final ijm c;
        private final Map<String, k> d;
        private final Map<String, k> e;
        private final AtomicInteger f = new AtomicInteger(0);

        public a(j jVar, List<String> list, ijm ijmVar) {
            this.f29088a = jVar;
            this.b = list;
            this.c = ijmVar;
            this.d = new ConcurrentHashMap(list.size());
            this.e = new ConcurrentHashMap(list.size());
        }

        @Override // com.taobao.android.remoteso.resolver2.c.a
        public void a(k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                return;
            }
            RSoLog.c("puller ->  CombinedResolveCallback, result = " + kVar);
            if (kVar.i()) {
                this.d.put(kVar.a(), kVar);
            } else {
                this.e.put(kVar.a(), kVar);
            }
            int incrementAndGet = this.f.incrementAndGet();
            if (incrementAndGet != this.b.size()) {
                RSoLog.c("puller ->  CombinedResolveCallback, skip,  i = " + incrementAndGet + ", libNames.size = " + this.b.size());
                return;
            }
            ijo a2 = a();
            RSoLog.c("puller ->  CombinedResolveCallback, finish,  pullResult = " + a2);
            this.c.onFinish(a2);
        }

        private ijo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ijo) ipChange.ipc$dispatch("f05fb70", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList(this.b.size());
            for (String str : this.b) {
                k kVar = this.d.get(str);
                if (kVar != null) {
                    arrayList.add(kVar);
                } else {
                    k kVar2 = this.e.get(str);
                    if (kVar2 != null) {
                        return new ijo(this.f29088a, kVar2);
                    }
                    ikq.a("tryGetResult", this.d + " , " + this.e + " , " + str);
                    return ijq.a(this.f29088a, RSoException.error(6310));
                }
            }
            if (arrayList.size() != this.b.size()) {
                return ijq.a(this.f29088a, RSoException.error(6310));
            }
            return new ijo(this.f29088a, arrayList);
        }
    }
}
