package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.wireless.aliprivacyext.f;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class cgj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f26284a;
    private final List<TrackLog> b;
    private final ThreadPoolExecutor c;
    private cgi d;
    private final e e;

    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "aliprivacy-track-manager");
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrackLog f26286a;

        public b(TrackLog trackLog) {
            this.f26286a = trackLog;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cgj.a(cgj.this).add(this.f26286a);
            if (!cgj.b(cgj.this).hasMessages(1)) {
                cgj.b(cgj.this).sendEmptyMessageDelayed(1, cgj.this.b());
            }
            if (cgj.a(cgj.this).size() < cgj.this.d()) {
                return;
            }
            cgj.c(cgj.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26287a;

        public c(boolean z) {
            this.f26287a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cgj.c(cgj.this);
            cgj.a(cgj.this, this.f26287a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final cgj f26288a = new cgj(null);

        public static /* synthetic */ cgj a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (cgj) ipChange.ipc$dispatch("f033558", new Object[0]) : f26288a;
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final cgj f26289a;

        public e(cgj cgjVar) {
            super(Looper.getMainLooper());
            this.f26289a = cgjVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                this.f26289a.e();
            } else if (i != 2) {
            } else {
                cgj.d(this.f26289a);
            }
        }
    }

    public /* synthetic */ cgj(a aVar) {
        this();
    }

    public static /* synthetic */ List a(cgj cgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d87a0375", new Object[]{cgjVar}) : cgjVar.b;
    }

    public static /* synthetic */ e b(cgj cgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("3e71d32c", new Object[]{cgjVar}) : cgjVar.e;
    }

    public static /* synthetic */ void c(cgj cgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0676594", new Object[]{cgjVar});
        } else {
            cgjVar.f();
        }
    }

    public static /* synthetic */ void d(cgj cgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeea6c15", new Object[]{cgjVar});
        } else {
            cgjVar.g();
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : f.a(cgf.h(this.f26284a), 20) * 1000;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : f.a(cgf.j(this.f26284a), 20);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a(false);
        }
    }

    private cgj() {
        this.e = new e(this);
        this.b = new ArrayList();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static cgj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cgj) ipChange.ipc$dispatch("f033558", new Object[0]) : d.a();
    }

    public static /* synthetic */ void a(cgj cgjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ca6c82", new Object[]{cgjVar, new Boolean(z)});
        } else {
            cgjVar.b(z);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b.isEmpty()) {
            b(z);
        } else {
            this.c.execute(new c(z));
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !"0".equals(cgf.i(this.f26284a));
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f26284a = context;
        this.e.removeMessages(1);
        int nextInt = new Random(System.currentTimeMillis()).nextInt(10) * 1000;
        com.alibaba.wireless.aliprivacy.c.a("TrackManager", "random:" + nextInt);
        this.e.sendEmptyMessageDelayed(1, b() + ((long) nextInt));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.b.isEmpty()) {
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(new TrackLog[this.b.size()]));
            Collections.copy(arrayList, this.b);
            cgi cgiVar = this.d;
            if (cgiVar == null) {
                return;
            }
            cgiVar.a(arrayList);
            this.b.clear();
        }
    }

    public void a(cgi cgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e360e433", new Object[]{this, cgiVar});
        } else {
            this.d = cgiVar;
        }
    }

    public void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d966404e", new Object[]{this, trackLog});
        } else if (!c()) {
            com.alibaba.wireless.aliprivacy.c.a("TrackManager", "add log fail: switch is " + c());
        } else {
            com.alibaba.wireless.aliprivacy.c.a("TrackManager", "track log: " + trackLog.getMethod());
            this.c.execute(new b(trackLog));
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e.removeMessages(1);
        if (z) {
            return;
        }
        this.e.sendEmptyMessageDelayed(1, b());
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.e.removeCallbacksAndMessages(null);
        }
    }
}
