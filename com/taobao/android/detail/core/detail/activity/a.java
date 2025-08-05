package com.taobao.android.detail.core.detail.activity;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.e;
import com.taobao.android.detail.core.utils.i;
import com.taobao.metrickit.LowMemoryListener;
import com.taobao.metrickit.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import tb.ehk;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LinkedList<C0366a> f9417a;
    public static HashMap<String, DetailCoreActivity> b;
    private static boolean c;
    private static int d;
    private static boolean e;

    /* renamed from: com.taobao.android.detail.core.detail.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0366a {

        /* renamed from: a  reason: collision with root package name */
        public DetailCoreActivity f9418a;

        static {
            kge.a(1421771250);
        }

        public C0366a(DetailCoreActivity detailCoreActivity) {
            this.f9418a = detailCoreActivity;
        }
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            f();
        }
    }

    static {
        kge.a(-1381815834);
        c = false;
        d = 2;
        e = false;
        f9417a = new LinkedList<>();
        b = new HashMap<>();
        emu.a("com.taobao.android.detail.core.detail.activity.DetailAppContext");
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (e) {
        } else {
            if (e.m()) {
                l.a().a(new b());
            }
            e = true;
        }
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        if (c || i <= d) {
            return false;
        }
        d = i;
        c = true;
        return true;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f9417a.size();
    }

    public static void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{detailCoreActivity});
        } else if (detailCoreActivity == null) {
        } else {
            e();
            Iterator<C0366a> it = f9417a.iterator();
            while (it.hasNext()) {
                if (it.next().f9418a == detailCoreActivity) {
                    return;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (ehk.b() != null) {
                ehk.b().a();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String a2 = j.a("DetailAppContext");
            i.d(a2, "webview register plugin " + (currentTimeMillis2 - currentTimeMillis));
            f9417a.add(new C0366a(detailCoreActivity));
            b.put(detailCoreActivity.toString(), detailCoreActivity);
            if (f9417a.size() <= d) {
                return;
            }
            DetailCoreActivity detailCoreActivity2 = f9417a.poll().f9418a;
            b.remove(detailCoreActivity2.toString());
            detailCoreActivity2.finish();
        }
    }

    public static void b(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e6c7d2", new Object[]{detailCoreActivity});
            return;
        }
        C0366a c0366a = null;
        Iterator<C0366a> it = f9417a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0366a next = it.next();
            if (detailCoreActivity == next.f9418a) {
                c0366a = next;
                break;
            }
        }
        if (c0366a == null) {
            return;
        }
        f9417a.remove(c0366a);
        b.remove(c0366a.f9418a.toString());
        if (!f9417a.isEmpty() || ehk.b() == null) {
            return;
        }
        ehk.b().b();
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else if (f9417a.size() <= 0 || f9417a.size() != d) {
        } else {
            DetailCoreActivity detailCoreActivity = f9417a.poll().f9418a;
            b.remove(detailCoreActivity.toString());
            detailCoreActivity.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements LowMemoryListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-996713446);
            kge.a(843044973);
        }

        @Override // com.taobao.metrickit.LowMemoryListener
        public void a(int i, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2619f15b", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
            } else if (i != 1 && i != 2) {
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.detail.core.detail.activity.a.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.d();
                        }
                    }
                });
            }
        }
    }

    public static C0366a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0366a) ipChange.ipc$dispatch("b50639a5", new Object[0]) : f9417a.isEmpty() ? new C0366a(null) : f9417a.getLast();
    }

    public static com.taobao.android.detail.datasdk.model.datamodel.node.c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("f9508065", new Object[0]);
        }
        C0366a b2 = b();
        if (!a(b2)) {
            return b2.f9418a.y().t;
        }
        return null;
    }

    private static boolean a(C0366a c0366a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f40af704", new Object[]{c0366a})).booleanValue() : c0366a == null || c0366a.f9418a == null || c0366a.f9418a.y() == null;
    }

    public static DetailCoreActivity a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("f4414fbd", new Object[]{str}) : b.get(str);
    }
}
