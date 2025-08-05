package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.ITracingAdapter;
import com.taobao.weex.utils.WXLogUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class rjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f33181a;

    static {
        kge.a(632027385);
        f33181a = new AtomicInteger(0);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f33181a.getAndIncrement();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : WXEnvironment.isApkDebugable();
    }

    public static synchronized void a(a aVar) {
        synchronized (rjh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40bd15cb", new Object[]{aVar});
                return;
            }
            ITracingAdapter tracingAdapter = WXSDKManager.getInstance().getTracingAdapter();
            if (tracingAdapter != null) {
                tracingAdapter.submitTracingEvent(aVar);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f33182a;
        public String c;
        public String f;
        public Map<String, Object> l;
        private boolean m;
        public int j = -1;
        public long e = System.currentTimeMillis();
        public int d = rjh.a();
        public String b = rjh.c();

        static {
            kge.a(1709602048);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!this.m) {
                this.m = true;
                rjh.a(this);
            } else {
                WXLogUtils.w("WXTracing", "Event " + this.d + " has been submitted.");
            }
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        String name = Thread.currentThread().getName();
        return "WeexJSBridgeThread".equals(name) ? "JSThread" : "WeeXDomThread".equals(name) ? "DOMThread" : Looper.getMainLooper() == Looper.myLooper() ? "UIThread" : name;
    }

    public static a a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d7891e52", new Object[]{str, str2, new Integer(i)});
        }
        a aVar = new a();
        aVar.f33182a = str;
        aVar.f = str2;
        aVar.d = a();
        aVar.j = i;
        return aVar;
    }
}
