package com.taobao.android.remoteso.tbadapter.ext;

import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ika;
import tb.ikm;
import tb.ikn;

/* loaded from: classes6.dex */
public class o implements ikn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f14870a = new CopyOnWriteArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private volatile ikn.a c;

    public static /* synthetic */ List a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8c35c687", new Object[]{oVar}) : oVar.f14870a;
    }

    public static /* synthetic */ void a(o oVar, int i, String str, Map map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d3eab7", new Object[]{oVar, new Integer(i), str, map, rSoException});
        } else {
            oVar.a(i, str, map, rSoException);
        }
    }

    @Override // tb.ikn
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        try {
            a(map);
            if (b()) {
                this.f14870a.add(new a(1, str, map, null));
                return;
            }
            a(1, str, map, null);
            a();
        } catch (Throwable th) {
            AppMonitor.Counter.commit(ikn.RSO_TRACK_MODULE, str, th.toString(), 1.0d);
        }
    }

    @Override // tb.ikn
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        try {
            a(map);
            if (b()) {
                this.f14870a.add(new a(2, str, map, null));
                return;
            }
            a(2, str, map, null);
            a();
        } catch (Throwable th) {
            AppMonitor.Counter.commit(ikn.RSO_TRACK_MODULE, str, th.toString(), 1.0d);
        }
    }

    @Override // tb.ikn
    public void a(String str, Map<String, Object> map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3556ef2", new Object[]{this, str, map, rSoException});
            return;
        }
        try {
            a(map);
            if (b()) {
                this.f14870a.add(new a(3, str, map, rSoException));
                return;
            }
            a(3, str, map, rSoException);
            a();
        } catch (Throwable th) {
            AppMonitor.Counter.commit(ikn.RSO_TRACK_MODULE, str, th.toString(), 1.0d);
        }
    }

    @Override // tb.ikn
    public void a(ikn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f5d0ef", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b.compareAndSet(false, true)) {
        } else {
            if (this.f14870a.isEmpty()) {
                RSoLog.c("tracker-> trySubmitCachedNodes skip, cachedTrackNodes isEmpty !!");
                return;
            }
            RSoLog.c("tracker-> trySubmitCachedNodes enter");
            ika.a(new Runnable() { // from class: com.taobao.android.remoteso.tbadapter.ext.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RSoLog.c("tracker-> trySubmitCachedNodes in task enter");
                    if (o.a(o.this).isEmpty()) {
                        RSoLog.c("tracker-> trySubmitCachedNodes intask skip, cachedTrackNodes isEmpty !!");
                        return;
                    }
                    RSoLog.c("tracker,trySubmitCachedNodes cachedTrackNodes.size=" + o.a(o.this).size());
                    for (a aVar : o.a(o.this)) {
                        o.a(o.this, a.a(aVar), a.b(aVar), a.c(aVar), a.d(aVar));
                    }
                    o.a(o.this).clear();
                    RSoLog.c("tracker-> trySubmitCachedNodes in task done.");
                }
            });
        }
    }

    private void a(int i, String str, Map<String, Object> map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4402b35f", new Object[]{this, new Integer(i), str, map, rSoException});
        } else if (i == 1) {
            ikm.a(ikn.RSO_TRACK_MODULE, str, map);
        } else if (i == 2) {
            ikm.b(ikn.RSO_TRACK_MODULE, str, map);
        } else if (i != 3) {
        } else {
            if (rSoException == null) {
                ikm.a(ikn.RSO_TRACK_MODULE, str, map, -1, "");
            } else {
                ikm.a(ikn.RSO_TRACK_MODULE, str, map, rSoException.getErrorCode(), rSoException.getErrorMsg());
            }
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !AnalyticsMgr.i();
    }

    private void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        ikn.a aVar = this.c;
        if (map == null || aVar == null) {
            RSoLog.c("srcArgs == null || binder == null");
        } else {
            aVar.a(map);
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f14872a;
        private final String b;
        private final Map<String, Object> c;
        private final RSoException d;

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("870d1bd6", new Object[]{aVar})).intValue() : aVar.f14872a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bf534a9e", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c8223516", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ RSoException d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RSoException) ipChange.ipc$dispatch("633a1b5", new Object[]{aVar}) : aVar.d;
        }

        public a(int i, String str, Map<String, Object> map, RSoException rSoException) {
            this.f14872a = i;
            this.b = str;
            this.c = map;
            this.d = rSoException;
        }
    }
}
