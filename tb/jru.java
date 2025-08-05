package tb;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.u;
import com.taobao.android.virtual_thread.VirtualThread;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.jru;

/* loaded from: classes6.dex */
public class jru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static boolean f29744a;
    private static Application b;
    private static HashMap<String, Object> c;

    public static /* synthetic */ void b(Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{application, hashMap});
        } else {
            e(application, hashMap);
        }
    }

    static {
        kge.a(1173907216);
        f29744a = false;
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        u.i().put(ejb.DX_PARSER_GETA11YTEXTFROMRICHTEXT, new ejb());
        if (jst.a()) {
            e(application, hashMap);
            return;
        }
        c(application, hashMap);
        d(application, hashMap);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f29744a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            e(b, c);
        }
    }

    private static void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3849cde", new Object[]{application, hashMap});
            return;
        }
        b = application;
        c = hashMap;
    }

    /* renamed from: tb.jru$1 */
    /* loaded from: classes6.dex */
    public static class AnonymousClass1 implements jss {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Application f29745a;
        public final /* synthetic */ HashMap b;

        /* renamed from: lambda$pWDGZQilLCPK-lVgGZn37LFQkbs */
        public static /* synthetic */ void m2454lambda$pWDGZQilLCPKlVgGZn37LFQkbs(Application application, HashMap hashMap) {
            a(application, hashMap);
        }

        public AnonymousClass1(Application application, HashMap hashMap) {
            this.f29745a = application;
            this.b = hashMap;
        }

        @Override // tb.jss
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            final Application application = this.f29745a;
            final HashMap hashMap = this.b;
            new VirtualThread(new Runnable() { // from class: tb.-$$Lambda$jru$1$pWDGZQilLCPK-lVgGZn37LFQkbs
                @Override // java.lang.Runnable
                public final void run() {
                    jru.AnonymousClass1.m2454lambda$pWDGZQilLCPKlVgGZn37LFQkbs(application, hashMap);
                }
            }).ofVirtual().start();
        }

        public static /* synthetic */ void a(Application application, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            } else {
                jru.b(application, hashMap);
            }
        }
    }

    private static void d(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30e36df", new Object[]{application, hashMap});
        } else {
            jst.a(new AnonymousClass1(application, hashMap));
        }
    }

    private static void e(Application application, HashMap<String, Object> hashMap) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.voiceassistant.context.AssistantContext");
            Method declaredMethod = cls.getDeclaredMethod("get", new Class[0]);
            declaredMethod.setAccessible(true);
            cls.getDeclaredMethod("init", Context.class, Map.class).invoke(declaredMethod.invoke(null, new Object[0]), application, hashMap);
            f29744a = true;
        } catch (Exception e) {
            Log.e("Launcher", "realInit exception " + e);
            e.printStackTrace();
        }
    }
}
