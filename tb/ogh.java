package tb;

import android.os.Build;
import android.os.Debug;
import android.support.v4.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ogh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f32029a;
    private static ThreadLocal<List<a>> b;
    private static int c;
    private static final boolean d;
    private static final boolean e;
    private static final boolean f;

    static {
        kge.a(1127161763);
        f32029a = 100000;
        d = oeb.h("enableTNodeTrace");
        e = oeb.h("enableStartMethodTracing");
        f = oeb.h("enablePrint");
        b = new ThreadLocal<>();
        c = -1;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f32030a;
        private long b;

        static {
            kge.a(-794896462);
        }

        private a() {
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a66dd5f", new Object[]{aVar})).longValue() : aVar.b;
        }

        public static /* synthetic */ long a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e27546ad", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.b = j;
            return j;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7758eacb", new Object[]{aVar, str});
            }
            aVar.f32030a = str;
            return str;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8f27a74", new Object[]{aVar}) : aVar.f32030a;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!d) {
        } else {
            d();
        }
    }

    private static void d() {
        try {
            Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, true);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!d) {
        } else {
            TraceCompat.beginSection(str);
            if (!f) {
                return;
            }
            a aVar = new a();
            a.a(aVar, str);
            a.a(aVar, System.currentTimeMillis());
            List<a> list = b.get();
            if (list == null) {
                list = new ArrayList<>();
                b.set(list);
            }
            list.add(aVar);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!d) {
        } else {
            TraceCompat.endSection();
            if (!f) {
                return;
            }
            List<a> list = b.get();
            a remove = list.remove(list.size() - 1);
            long currentTimeMillis = System.currentTimeMillis() - a.a(remove);
            if (oec.f() && currentTimeMillis > 16) {
                ogg.b("[performance] main thread executed " + currentTimeMillis + " tag:" + a.b(remove));
            } else if (Thread.currentThread().getName().contains("tnode") && currentTimeMillis > 40) {
                ogg.b("[performance] engine thread executed " + currentTimeMillis + " tag:" + a.b(remove));
            } else if (currentTimeMillis <= 100) {
            } else {
                ogg.b("[performance] other thread executed " + currentTimeMillis + " tag:" + a.b(remove));
            }
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : (str == null || str.length() <= 50) ? str : str.substring(str.length() - 50);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!e) {
        } else {
            int a2 = oeb.a("delayFinishMethodTracingSamplingTime", 5);
            if (Build.VERSION.SDK_INT >= 21 && c == -1) {
                int a3 = oeb.a("methodTracingSamplingBufferSize", 50);
                ogg.a("TNodeTrace", "methodTracingSamplingBufferSize:" + a3 + ",delayFinishTime:" + a2);
                Debug.startMethodTracingSampling(null, (a3 << 10) << 10, 10000);
                c = 0;
            }
            oec.a(new Runnable() { // from class: tb.ogh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ogh.f();
                    }
                }
            }, a2 * 1000);
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else if (!e || c != 0) {
        } else {
            Debug.stopMethodTracing();
            c = 1;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : d;
    }
}
