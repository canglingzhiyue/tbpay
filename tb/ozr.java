package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.video_remoteso.VideoRemoteSo;
import com.taobao.video_remoteso.api.FetchCallback;
import com.taobao.video_remoteso.api.FetchResult;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public class ozr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LinkedList<ozq> f32510a;
    private static LinkedList<ozq> b;
    private static volatile ozr c;
    private static final Object m;
    private volatile AtomicBoolean d = new AtomicBoolean(false);
    private volatile AtomicReference<String> e = new AtomicReference<>("");
    private volatile AtomicReference<String> f = new AtomicReference<>("");
    private volatile AtomicReference<String> g = new AtomicReference<>("");
    private volatile AtomicBoolean h = new AtomicBoolean(false);
    private volatile AtomicReference<String> i = new AtomicReference<>("");
    private volatile AtomicBoolean j = new AtomicBoolean(false);
    private volatile AtomicReference<String> k = new AtomicReference<>("");
    private volatile AtomicBoolean l = new AtomicBoolean(false);
    private volatile AtomicReference<String> n = new AtomicReference<>("");
    private volatile AtomicBoolean o = new AtomicBoolean(false);

    public static /* synthetic */ AtomicBoolean a(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("9f08d191", new Object[]{ozrVar}) : ozrVar.l;
    }

    public static /* synthetic */ void a(ozr ozrVar, FetchResult fetchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c128a4", new Object[]{ozrVar, fetchResult});
        } else {
            ozrVar.a(fetchResult);
        }
    }

    public static /* synthetic */ AtomicReference b(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("9ccb444f", new Object[]{ozrVar}) : ozrVar.k;
    }

    public static /* synthetic */ AtomicBoolean c(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("f1b17c13", new Object[]{ozrVar}) : ozrVar.h;
    }

    public static /* synthetic */ AtomicReference d(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("e7f35651", new Object[]{ozrVar}) : ozrVar.e;
    }

    public static /* synthetic */ AtomicReference e(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("d875f52", new Object[]{ozrVar}) : ozrVar.f;
    }

    public static /* synthetic */ AtomicReference f(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("331b6853", new Object[]{ozrVar}) : ozrVar.g;
    }

    public static /* synthetic */ AtomicBoolean g(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("9702d117", new Object[]{ozrVar}) : ozrVar.j;
    }

    public static /* synthetic */ AtomicReference h(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("7e437a55", new Object[]{ozrVar}) : ozrVar.i;
    }

    public static /* synthetic */ AtomicBoolean i(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("e9ab7b99", new Object[]{ozrVar}) : ozrVar.o;
    }

    public static /* synthetic */ ozr i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ozr) ipChange.ipc$dispatch("4c961d0f", new Object[0]) : c;
    }

    public static /* synthetic */ AtomicReference j(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("c96b8c57", new Object[]{ozrVar}) : ozrVar.n;
    }

    static {
        kge.a(2034592513);
        f32510a = new LinkedList<>();
        b = new LinkedList<>();
        m = new Object();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        AVSDKLog.e(c.MODULE_SDK_PAGE, this + " fetchSo init");
        VideoRemoteSo.fetchAsync("avcodec", new FetchCallback() { // from class: tb.ozr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.video_remoteso.api.FetchCallback
            public void onFetchFinished(FetchResult fetchResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                    return;
                }
                AVSDKLog.e(c.MODULE_SDK_PAGE, this + " fetchSo onFetchFinished " + fetchResult);
                if (TextUtils.isEmpty(fetchResult.getLibFullPath())) {
                    return;
                }
                ozr.a(ozr.i()).set(true);
                ozr.b(ozr.i()).set(fetchResult.getLibFullPath());
                ozr.a(ozr.i(), fetchResult);
            }
        });
        VideoRemoteSo.fetchAsync("artc_engine", new FetchCallback() { // from class: tb.ozr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.video_remoteso.api.FetchCallback
            public void onFetchFinished(FetchResult fetchResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                    return;
                }
                AVSDKLog.e(c.MODULE_SDK_PAGE, this + " fetchSo onFetchFinished " + fetchResult);
                if (TextUtils.isEmpty(fetchResult.getLibFullPath())) {
                    return;
                }
                ozr.c(ozr.i()).set(true);
                ozr.d(ozr.i()).set(fetchResult.getLibFullPath());
                ozr.e(ozr.i()).set(fetchResult.getMajorVersion());
                ozr.f(ozr.i()).set(fetchResult.getMinorVersion());
                ozr.a(ozr.i(), fetchResult);
            }
        });
        VideoRemoteSo.fetchAsync("s266dec", new FetchCallback() { // from class: tb.ozr.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.video_remoteso.api.FetchCallback
            public void onFetchFinished(FetchResult fetchResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                    return;
                }
                AVSDKLog.e(c.MODULE_SDK_PAGE, this + " fetchSo onFetchFinished " + fetchResult);
                if (TextUtils.isEmpty(fetchResult.getLibFullPath())) {
                    return;
                }
                ozr.g(ozr.i()).set(true);
                ozr.h(ozr.i()).set(fetchResult.getLibFullPath());
                ozr.a(ozr.i(), fetchResult);
            }
        });
        VideoRemoteSo.fetchAsync("VPM", new FetchCallback() { // from class: tb.ozr.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.video_remoteso.api.FetchCallback
            public void onFetchFinished(FetchResult fetchResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d09396a1", new Object[]{this, fetchResult});
                    return;
                }
                AVSDKLog.e(c.MODULE_SDK_PAGE, this + " fetchSo onFetchFinished " + fetchResult);
                if (TextUtils.isEmpty(fetchResult.getLibFullPath())) {
                    return;
                }
                ozr.i(ozr.i()).set(true);
                ozr.j(ozr.i()).set(fetchResult.getLibFullPath());
                ozr.a(ozr.i(), fetchResult);
            }
        });
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e.get();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.i.get();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.k.get();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f.get();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.g.get();
    }

    public static synchronized ozr e() {
        synchronized (ozr.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ozr) ipChange.ipc$dispatch("2dcf8793", new Object[0]);
            }
            if (c == null && c == null) {
                ozr ozrVar = new ozr();
                c = ozrVar;
                ozrVar.j();
            }
            return c;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : e().d.get();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : e().h.get();
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : e().j.get();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : e().l.get();
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : e().o.get();
    }

    public static synchronized void a(ozq ozqVar) {
        synchronized (ozr.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8ea6d32", new Object[]{ozqVar});
            } else if (ozqVar == null) {
            } else {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "fetchSo registerFetchCallback " + ozqVar);
                if (e().d.get()) {
                    e().l();
                    return;
                }
                synchronized (m) {
                    f32510a.add(ozqVar);
                }
            }
        }
    }

    public static void b(ozq ozqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d73b3", new Object[]{ozqVar});
        } else if (ozqVar == null) {
        } else {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "fetchSo unregisterFetchCallback " + ozqVar);
            synchronized (m) {
                f32510a.remove(ozqVar);
            }
        }
    }

    public static synchronized void c(ozq ozqVar) {
        synchronized (ozr.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5f07a34", new Object[]{ozqVar});
            } else if (ozqVar == null) {
            } else {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "fetchSo registerFetchCallbackAll " + ozqVar);
                if (e().d.get()) {
                    e().l();
                    return;
                }
                synchronized (m) {
                    b.add(ozqVar);
                }
            }
        }
    }

    public static void d(ozq ozqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47380b5", new Object[]{ozqVar});
        } else if (ozqVar == null) {
        } else {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "fetchSo unregisterFetchCallbackAll " + ozqVar);
            synchronized (m) {
                b.remove(ozqVar);
            }
        }
    }

    private ozs k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozs) ipChange.ipc$dispatch("5bf967ec", new Object[]{this});
        }
        ozs ozsVar = new ozs();
        ozsVar.f32515a = this.h.get();
        ozsVar.g = this.j.get();
        ozsVar.e = this.l.get();
        ozsVar.j = this.o.get();
        ozsVar.b = this.e.get();
        ozsVar.h = this.i.get();
        ozsVar.f = this.k.get();
        ozsVar.i = this.n.get();
        ozsVar.c = this.f.get();
        ozsVar.d = this.g.get();
        return ozsVar;
    }

    public static LinkedList<ozq> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("62ca3c78", new Object[0]);
        }
        LinkedList<ozq> linkedList = new LinkedList<>();
        synchronized (m) {
            linkedList.addAll(f32510a);
        }
        return linkedList;
    }

    public static LinkedList<ozq> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("64a38f97", new Object[0]);
        }
        LinkedList<ozq> linkedList = new LinkedList<>();
        synchronized (m) {
            linkedList.addAll(b);
        }
        return linkedList;
    }

    private void a(FetchResult fetchResult) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f9dd6d", new Object[]{this, fetchResult});
            return;
        }
        AtomicBoolean atomicBoolean = this.d;
        if (!this.h.get() || !this.l.get()) {
            z = false;
        }
        atomicBoolean.set(z);
        ozs k = k();
        if (k.f32515a && !TextUtils.isEmpty(k.b)) {
            Iterator<ozq> it = o().iterator();
            while (it.hasNext()) {
                it.next().onFetchFinished(k);
            }
        }
        Iterator<ozq> it2 = p().iterator();
        while (it2.hasNext()) {
            it2.next().onFetchFinished(k);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ozs k = k();
        Iterator<ozq> it = o().iterator();
        while (it.hasNext()) {
            it.next().onFetchFinished(k);
        }
        Iterator<ozq> it2 = p().iterator();
        while (it2.hasNext()) {
            it2.next().onFetchFinished(k);
        }
    }
}
