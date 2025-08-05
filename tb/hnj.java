package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class hnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<RecyclerView> f28741a;
    private static boolean b;
    private static ArrayList<p> c;
    private static boolean d;
    private static long e;

    public static /* synthetic */ long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue() : e;
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            e();
        }
    }

    static {
        kge.a(608491514);
        b = false;
        c = new ArrayList<>();
        d = false;
        e = 0L;
    }

    public static void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{recyclerView});
        } else if (b || !ipa.T()) {
        } else {
            WeakReference<RecyclerView> weakReference = f28741a;
            RecyclerView recyclerView2 = weakReference == null ? null : weakReference.get();
            f28741a = new WeakReference<>(recyclerView);
            if (recyclerView2 == null) {
                return;
            }
            recyclerView2.setLayoutFrozen(false);
        }
    }

    public static void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{pVar});
        } else if (pVar == null || c.contains(pVar)) {
        } else {
            c.add(pVar);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        d = true;
        final long j = e + 1;
        e = j;
        ipa.N().postDelayed(new Runnable() { // from class: tb.hnj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (j != hnj.c()) {
                        return;
                    }
                    hnj.d();
                } catch (Throwable th) {
                    if (qxo.a()) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }, ipa.Z());
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        Iterator<p> it = c.iterator();
        while (it.hasNext()) {
            it.next().onViewDisappear();
            if (!ipa.O()) {
                fjt.a(fjt.TAG_TIP, "已经冻结 Weex 实例， index = " + i);
                i++;
            }
        }
    }

    public static void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        final long j = e + 1;
        e = j;
        d = false;
        ipa.N().postDelayed(new Runnable() { // from class: tb.hnj.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (j != hnj.c()) {
                        return;
                    }
                    hnj.c(context);
                } catch (Throwable th) {
                    if (qxo.a()) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }, ipa.aa());
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        WeakReference<RecyclerView> weakReference = f28741a;
        RecyclerView recyclerView = weakReference == null ? null : weakReference.get();
        if (recyclerView != null) {
            recyclerView.setLayoutFrozen(false);
        }
        e(context);
    }

    private static void e(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
            return;
        }
        Iterator<p> it = c.iterator();
        int i = 0;
        while (it.hasNext()) {
            p next = it.next();
            if (next.getUIContext() == context) {
                next.onViewAppear();
                if (!ipa.O()) {
                    fjt.a(fjt.TAG_TIP, "正在遍历唤醒当前页面的 Weex 实例。index = " + i);
                }
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        f();
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        Iterator<p> it = c.iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next != null) {
                next.onViewAppear();
            }
            if (!ipa.O()) {
                fjt.a(fjt.TAG_TIP, "正在遍历唤醒 Weex 实例列表。index = " + i);
                i++;
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            b = false;
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        b = true;
        e = 0L;
        WeakReference<RecyclerView> weakReference = f28741a;
        f28741a = null;
        RecyclerView recyclerView = weakReference == null ? null : weakReference.get();
        if (recyclerView != null) {
            recyclerView.setLayoutFrozen(false);
        }
        f28741a = null;
        Iterator<p> it = c.iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next.getUIContext() != context) {
                next.onViewAppear();
            }
        }
        c.clear();
    }
}
