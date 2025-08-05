package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class mou implements IPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long B;
    private mos b;
    private IPage.d c;
    private IPage.e d;
    private WeakReference<Window> e;
    private WeakReference<View> f;
    private WeakReference<View> g;
    private WeakReference<Activity> l;
    private WeakReference<Fragment> m;
    private IPage n;
    private String o;
    private long q;
    private String r;
    private boolean s;

    /* renamed from: a  reason: collision with root package name */
    private final String f31176a = String.valueOf(System.nanoTime());
    private String h = null;
    private String i = null;
    private String j = null;
    private volatile boolean k = false;
    private final AtomicLong p = new AtomicLong(-1);
    private final AtomicLong t = new AtomicLong(-1);
    private final AtomicInteger u = new AtomicInteger(0);
    private final AtomicInteger v = new AtomicInteger(0);
    private final AtomicInteger w = new AtomicInteger(0);
    private final AtomicInteger x = new AtomicInteger(0);
    private final AtomicInteger y = new AtomicInteger(0);
    private final Map<String, Integer> z = new ConcurrentHashMap();
    private final Map<String, Integer> A = new ConcurrentHashMap();
    private final LruCache<WeakReference<View>, IPage.a> C = new LruCache<>(20);

    public View a() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        WeakReference<Window> weakReference2 = this.e;
        if (weakReference2 != null && (window = weakReference2.get()) != null) {
            return window.getDecorView();
        }
        return null;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.f = new WeakReference<>(view);
        }
    }

    public Window b() {
        Window window;
        FragmentActivity activity;
        Window window2;
        Window window3;
        Window window4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("f9e942c0", new Object[]{this});
        }
        WeakReference<Window> weakReference = this.e;
        if (weakReference != null && (window4 = weakReference.get()) != null) {
            return window4;
        }
        Activity m = m();
        if (m != null && (window3 = m.getWindow()) != null) {
            a(window3);
            return window3;
        }
        Fragment n = n();
        if (n != null && (activity = n.getActivity()) != null && (window2 = activity.getWindow()) != null) {
            a(window2);
            return window2;
        }
        View a2 = a();
        if (a2 == null) {
            return null;
        }
        Context context = a2.getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) {
            return null;
        }
        a(window);
        return window;
    }

    public void a(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af06fc7f", new Object[]{this, window});
        } else if (window == null) {
        } else {
            this.e = new WeakReference<>(window);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f31176a;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.d) ipChange.ipc$dispatch("8e1302c6", new Object[]{this}) : this.c;
    }

    public void a(IPage.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ccc69a3", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    public void a(mos mosVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e6a227", new Object[]{this, mosVar});
        } else {
            this.b = mosVar;
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.b) ipChange.ipc$dispatch("957837a7", new Object[]{this}) : this.b;
    }

    public void a(IPage.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cccde02", new Object[]{this, eVar});
        } else {
            this.d = eVar;
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.c) ipChange.ipc$dispatch("a442a204", new Object[]{this}) : this.b;
    }

    public WeakReference<View> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("984d13d", new Object[]{this}) : this.g;
    }

    public void a(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
        } else {
            this.g = weakReference;
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.h;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public void a(View view, IPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9913208", new Object[]{this, view, aVar});
        } else {
            this.C.put(new WeakReference<>(view), aVar);
        }
    }

    private boolean b(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue() : view != null && ((float) ((view.getRight() - view.getLeft()) * (view.getBottom() - view.getTop()))) / ((float) (mnh.screenHeight * mnh.screenWidth)) > 0.7f;
    }

    public IPage.a j() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.a) ipChange.ipc$dispatch("ba724123", new Object[]{this});
        }
        for (Map.Entry<WeakReference<View>, IPage.a> entry : this.C.snapshot().entrySet()) {
            WeakReference<View> key = entry.getKey();
            if (key != null && (view = key.get()) != null && b(view)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.i;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.j;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public Activity m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3792a4b4", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.l;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.l = new WeakReference<>(activity);
        }
    }

    public Fragment n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("132d1357", new Object[]{this});
        }
        WeakReference<Fragment> weakReference = this.m;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
        } else {
            this.m = new WeakReference<>(fragment);
        }
    }

    public boolean o() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        Activity m = m();
        Fragment n = n();
        boolean z2 = m != null && m.isFinishing();
        if (n != null) {
            if (n.isRemoving()) {
                z = true;
            } else {
                FragmentActivity activity = n.getActivity();
                if (activity != null) {
                    z = activity.isFinishing();
                }
            }
            return !z2 || z || this.k;
        }
        z = false;
        if (!z2) {
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.s;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.r;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public IPage r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage) ipChange.ipc$dispatch("1d8ef278", new Object[]{this}) : this.n;
    }

    public void a(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f025d123", new Object[]{this, iPage});
        } else {
            this.n = iPage;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.o;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.p.set(j);
        }
    }

    public long t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aef", new Object[]{this})).longValue() : this.p.get();
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.q = j;
        }
    }

    public long u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6864270", new Object[]{this})).longValue() : this.t.get();
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else {
            this.t.set(j);
        }
    }

    public Context v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d921d1f5", new Object[]{this});
        }
        View a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getContext();
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        WeakReference<Fragment> weakReference = this.m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue() : this.u.get();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.u.incrementAndGet();
        }
    }

    public int A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a97c3b", new Object[]{this})).intValue() : this.v.get();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.v.addAndGet(i);
        }
    }

    public int B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue() : this.w.get();
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.w.incrementAndGet();
        }
    }

    public int D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue() : this.x.get();
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else {
            this.x.incrementAndGet();
        }
    }

    public int F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue() : this.y.get();
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else {
            this.y.incrementAndGet();
        }
    }

    public Map<String, Integer> H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8a711cc4", new Object[]{this}) : this.z;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Integer num = this.z.get(str);
            if (num == null) {
                num = 0;
            }
            this.z.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public Map<String, Integer> I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("581b7e85", new Object[]{this}) : this.A;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Integer num = this.A.get(str);
            if (num == null) {
                num = 0;
            }
            this.A.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public long J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4284fc5", new Object[]{this})).longValue() : this.B;
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
        } else {
            this.B += j;
        }
    }
}
