package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.widget.IconFontView;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex_framework.util.p;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.utils.Global;
import tb.ipa;

/* loaded from: classes5.dex */
public class idk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_MAIN_WEEX_URL = "https://infinite.m.taobao.com/app/newdetail/newflow/home?wh_weex=true&weex_mode=dom&wx_recycle_images=true&renderType=2&wx_js_min_version=0.0.1";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f28931a;
    private static boolean b;
    private static volatile boolean c;
    private static volatile HandlerThread d;
    private static volatile Handler e;

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618ba84b", new Object[]{aVar});
        } else {
            b(aVar);
        }
    }

    public static /* synthetic */ a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ab7936e", new Object[0]) : e();
    }

    static {
        kge.a(977951606);
        f28931a = null;
        b = false;
        c = false;
    }

    private static a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ec955d0d", new Object[0]);
        }
        if (f28931a == null) {
            f28931a = new a();
        }
        return f28931a;
    }

    public static void b(Runnable runnable) {
        Handler handler;
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
            return;
        }
        synchronized (idk.class) {
            Handler handler2 = e;
            if (handler2 == null) {
                handlerThread = d;
                HandlerThread handlerThread2 = new HandlerThread("nd_async_task", -4);
                handlerThread2.start();
                handler = new Handler(handlerThread2.getLooper());
                d = handlerThread2;
                e = handler;
            } else {
                handler = handler2;
                handlerThread = null;
            }
        }
        if (handlerThread != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                handlerThread.quitSafely();
            } else {
                handlerThread.quit();
            }
        }
        handler.post(runnable);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f28934a;
        private volatile String b;
        private volatile String c;
        private final Object d;
        private volatile int e;
        private final Object f;

        static {
            kge.a(58785666);
        }

        private a() {
            this.f28934a = true;
            this.b = null;
            this.c = null;
            this.d = new Object();
            this.f = new Object();
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cfe9d40b", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.e = i;
            return i;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22308bb5", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a78133eb", new Object[]{aVar, str});
            }
            aVar.b = str;
            return str;
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cfea13ed", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.f28934a = z;
            return z;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa60cb94", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String b(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("992ada0a", new Object[]{aVar, str});
            }
            aVar.c = str;
            return str;
        }

        public static /* synthetic */ Object c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3fce2e05", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f1de701", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ Object e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("502eadc3", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22d4bb94", new Object[]{aVar})).booleanValue() : aVar.f28934a;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        a e2 = e();
        if (str != null && a.a(e2) != null && str.equals(a.a(e2)) && !TextUtils.isEmpty(a.b(e2))) {
            return a.b(e2);
        }
        a.a(e2, str);
        a.b(e2, p.b(str));
        return a.b(e2);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        a e2 = e();
        if (str != null && a.a(e2) != null && str.equals(a.a(e2)) && !TextUtils.isEmpty(a.b(e2))) {
            return a.b(e2);
        }
        return null;
    }

    public static void a(final String str, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d729b0", new Object[]{str, runnable});
        } else {
            b(new Runnable() { // from class: tb.idk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a d2 = idk.d();
                    synchronized (a.c(d2)) {
                        a.a(d2, str);
                        a.b(d2, p.b(str));
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            });
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
        } else {
            Coordinator.execute(runnable, 23);
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : a.d(e());
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            b(runnable);
        }
    }

    public static void a(final Runnable runnable, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{runnable, new Boolean(z)});
        } else {
            Coordinator.execute(new ipa.c() { // from class: tb.idk.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "preInitUIInfoTask";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a d2 = idk.d();
                    synchronized (a.e(d2)) {
                        if (z) {
                            a.a(d2, true);
                        }
                        if (a.f(d2)) {
                            if (ipa.x()) {
                                idk.a(d2);
                            }
                            a.a(d2, false);
                        }
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 == null) {
                        return;
                    }
                    runnable2.run();
                }
            }, 28);
        }
    }

    private static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb67128c", new Object[]{aVar});
            return;
        }
        fjt.a(fjt.TAG_TIP, "doPreInitNavBarUIInfo>> 开始执行.");
        if (b) {
            new IconFontView(Global.getApplication());
            c = true;
        }
        a.a(aVar, SystemBarDecorator.getStatusBarHeight(Global.getApplication()));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!b) {
            return true;
        }
        return c;
    }

    public static void c() {
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        synchronized (idk.class) {
            e = null;
            handlerThread = d;
            d = null;
        }
        if (handlerThread == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            handlerThread.quitSafely();
        } else {
            handlerThread.quit();
        }
    }
}
