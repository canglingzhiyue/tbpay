package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class gwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f28543a;

    static {
        kge.a(-1445721225);
        f28543a = null;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (Build.VERSION.SDK_INT != 15 || "SAMSUNG".equalsIgnoreCase(Build.BRAND)) {
        } else {
            gwo.a(5, "TweakWebCoreHandler", "BRAND: " + Build.BRAND);
            b();
        }
    }

    private static void b() {
        if (f28543a != null) {
            return;
        }
        try {
            Field declaredField = Class.forName("android.webkit.WebViewCore").getDeclaredField("sWebCoreHandler");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Method declaredMethod = Handler.class.getDeclaredMethod("getIMessenger", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, null);
            f28543a = new a((Handler) obj);
            if (invoke != null) {
                Field declaredField2 = Handler.class.getDeclaredField("mMessenger");
                declaredField2.setAccessible(true);
                declaredField2.set(f28543a, invoke);
            }
            declaredField.set(null, f28543a);
            gwo.a(3, "TweakWebCoreHandler", "sWebCoreHandler: " + obj);
        } catch (Throwable th) {
            gwo.a(6, "TweakWebCoreHandler", "tweakWebCoreHandler exception: " + Log.getStackTraceString(th));
        }
        if (f28543a != null) {
            return;
        }
        f28543a = new Handler();
    }

    /* loaded from: classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f28544a;

        static {
            kge.a(1085815010);
        }

        public a(Handler handler) {
            super(handler.getLooper());
            this.f28544a = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                gwo.a(3, "WebCoreProxyHandler", "handle message: " + message.what);
                this.f28544a.handleMessage(message);
            } catch (Throwable th) {
                gwo.a(6, "WebCoreProxyHandler", "handleMessage exception: " + Log.getStackTraceString(th));
            }
        }
    }
}
