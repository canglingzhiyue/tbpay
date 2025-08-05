package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.k;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.p;
import java.util.HashSet;

/* loaded from: classes8.dex */
public class tih implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static tih k;
    private final Handler b;
    private tii c;
    private k d;
    private String e;
    private d.a f;
    private HashSet<Integer> g;
    private a i;
    private String j;

    /* renamed from: a  reason: collision with root package name */
    private final String f34117a = tih.class.getSimpleName();
    private final Runnable h = new Runnable() { // from class: tb.tih.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tih.a(tih.this);
            }
        }
    };

    /* loaded from: classes8.dex */
    public interface a {
    }

    static {
        kge.a(854128382);
        kge.a(-2101054629);
    }

    public static /* synthetic */ void a(tih tihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0165", new Object[]{tihVar});
        } else {
            tihVar.b();
        }
    }

    public tih() {
        TaoLiveLaunchInitializer.init();
        this.b = new Handler(Looper.getMainLooper());
    }

    public static String d(tii tiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4aa4239", new Object[]{tiiVar});
        }
        f();
        tih tihVar = new tih();
        k = tihVar;
        tihVar.a(tiiVar);
        return k.e();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        tih tihVar = k;
        if (tihVar == null || str == null || !str.equals(tihVar.e())) {
            return;
        }
        f();
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        tih tihVar = k;
        if (tihVar == null) {
            return;
        }
        tihVar.a();
        k = null;
    }

    public void a(tii tiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f75c4", new Object[]{this, tiiVar});
            return;
        }
        this.c = tiiVar;
        b(tiiVar.c);
        if (tiiVar.g != 0) {
            this.b.postDelayed(this.h, tiiVar.g);
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
            n.a(this.f34117a, "PMModel is null when start subscribe PM");
        } else if (p.r()) {
            b(this.c);
        } else {
            c(this.c);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (p.r()) {
            c();
        } else {
            d();
        }
        this.b.removeCallbacksAndMessages(null);
        this.f = null;
        this.i = null;
        this.g = null;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.j;
    }

    private void b(tii tiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef027c45", new Object[]{this, tiiVar});
            return;
        }
        this.d = new k(1, tiiVar.c, null, tiiVar.f29228a, false, true, false, false, tiiVar.b, false, false, this);
        this.d.c(tiiVar.d);
        this.d.a(tiiVar.f);
        this.d.d();
        this.d.a();
    }

    private void c(tii tiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8582c6", new Object[]{this, tiiVar});
            return;
        }
        this.e = pqh.a().b();
        pqh.a().a(this.e, tiiVar.c, tiiVar.b, tiiVar.f29228a, tiiVar.d, tiiVar.f, this);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        k kVar = this.d;
        if (kVar == null) {
            return;
        }
        kVar.c();
        this.d.g();
        this.d = null;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        pqh.a().a(this.e);
        this.e = null;
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (this.f == null) {
        } else {
            HashSet<Integer> hashSet = this.g;
            if (hashSet != null && !hashSet.isEmpty()) {
                if (!this.g.contains(Integer.valueOf(i))) {
                    return;
                }
                this.f.onMessageReceived(i, obj);
                return;
            }
            this.f.onMessageReceived(i, obj);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.j = str + "_" + System.currentTimeMillis();
    }
}
