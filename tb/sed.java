package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.external.e;
import com.taobao.homepage.utils.n;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class sed {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f33501a;
    private static final List<Runnable> b;

    static {
        kge.a(1173013227);
        f33501a = new AtomicBoolean(false);
        b = new CopyOnWriteArrayList();
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (!n.n().n()) {
            runnable.run();
        } else if (!f33501a.get()) {
            b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!n.n().n() || !f33501a.compareAndSet(false, true)) {
            return false;
        }
        for (Runnable runnable : b) {
            runnable.run();
        }
        b.clear();
        return true;
    }

    public static void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{str, str2, str3, strArr});
        } else {
            a(d(str, str2, str3, strArr));
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65212840", new Object[]{str, str2, str3, map, strArr});
        } else {
            a(b(str, str2, str3, map, strArr));
        }
    }

    public static void a(final String str, final String str2, final float f, final float f2, final List<e> list, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b0c878", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            a(new Runnable() { // from class: tb.sed.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        h.a(str, str2, f, f2, list, map);
                    }
                }
            });
        }
    }

    public static void b(final String str, final String str2, final float f, final float f2, final List<e> list, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c197", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            a(new Runnable() { // from class: tb.sed.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        h.b(str, str2, f, f2, list, map);
                    }
                }
            });
        }
    }

    public static void c(final String str, final String str2, final float f, final float f2, final List<e> list, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2892bab6", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            a(new Runnable() { // from class: tb.sed.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        h.c(str, str2, f, f2, list, map);
                    }
                }
            });
        }
    }

    public static void a(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f39fc7", new Object[]{str, str2, obj, strArr});
        } else {
            a(b(str, str2, obj, strArr));
        }
    }

    public static void b(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690464b8", new Object[]{str, str2, str3, strArr});
        } else {
            a(c(str, str2, str3, strArr));
        }
    }

    public static void a(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd09d2d3", new Object[]{str, str2, str3, view, strArr});
        } else {
            a(d(str, str2, str3, view, strArr));
        }
    }

    public static void a(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dfbd46", new Object[]{str, str2, str3, view, map, strArr});
        } else {
            a(d(str, str2, str3, view, map, strArr));
        }
    }

    public static void b(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc106d4", new Object[]{str, str2, str3, view, strArr});
        } else {
            a(c(str, str2, str3, view, strArr));
        }
    }

    private static Runnable c(final String str, final String str2, final String str3, final View view, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("1f23889f", new Object[]{str, str2, str3, view, strArr}) : new Runnable() { // from class: tb.sed.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.b(str, str2, str3, view, strArr);
                }
            }
        };
    }

    public static void b(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ebe725", new Object[]{str, str2, str3, view, map, strArr});
        } else {
            a(c(str, str2, str3, view, map, strArr));
        }
    }

    private static Runnable c(final String str, final String str2, final String str3, final View view, final Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("452e4e10", new Object[]{str, str2, str3, view, map, strArr}) : new Runnable() { // from class: tb.sed.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.b(str, str2, str3, view, map, strArr);
                }
            }
        };
    }

    private static Runnable d(final String str, final String str2, final String str3, final View view, final Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("34f141d1", new Object[]{str, str2, str3, view, map, strArr}) : new Runnable() { // from class: tb.sed.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.a(str, str2, str3, view, (Map<String, String>) map, strArr);
                }
            }
        };
    }

    private static Runnable d(final String str, final String str2, final String str3, final View view, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("9539aafe", new Object[]{str, str2, str3, view, strArr}) : new Runnable() { // from class: tb.sed.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.a(str, str2, str3, view, strArr);
                }
            }
        };
    }

    private static Runnable c(final String str, final String str2, final String str3, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("1ea509dd", new Object[]{str, str2, str3, strArr}) : new Runnable() { // from class: tb.sed.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.c(str, str2, str3, strArr);
                }
            }
        };
    }

    public static void a(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e601333d", new Object[]{str, str2, str3, obj, strArr});
        } else {
            a(b(str, str2, str3, obj, strArr));
        }
    }

    private static Runnable b(final String str, final String str2, final Object obj, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("b4397e6e", new Object[]{str, str2, obj, strArr}) : new Runnable() { // from class: tb.sed.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.a(str, str2, obj, strArr);
                }
            }
        };
    }

    private static Runnable b(final String str, final String str2, final String str3, final Object obj, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("43833cf8", new Object[]{str, str2, str3, obj, strArr}) : new Runnable() { // from class: tb.sed.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.a(str, str2, str3, obj, strArr);
                }
            }
        };
    }

    private static Runnable d(final String str, final String str2, final String str3, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("4e5c3dde", new Object[]{str, str2, str3, strArr}) : new Runnable() { // from class: tb.sed.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.a(str, str2, str3, strArr);
                }
            }
        };
    }

    private static Runnable b(final String str, final String str2, final String str3, final Map<String, String> map, final String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("47a23f33", new Object[]{str, str2, str3, map, strArr}) : new Runnable() { // from class: tb.sed.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.a(str, str2, str3, (Map<String, String>) map, strArr);
                }
            }
        };
    }
}
