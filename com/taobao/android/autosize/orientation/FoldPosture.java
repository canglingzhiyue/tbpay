package com.taobao.android.autosize.orientation;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.tao.log.TLog;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executor;
import tb.iuu;

/* loaded from: classes4.dex */
public class FoldPosture {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAT_STATUS = 0;
    public static final int FULL_FOLDED_STATUS = 2;
    public static final int HALF_OPENED_STATUS = 1;
    public static final int UNKNOWN_STATUS = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FoldStatus {
    }

    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: com.taobao.android.autosize.orientation.FoldPosture$a$-CC  reason: invalid class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class CC {
            public static void $default$a(a aVar, String str) {
            }
        }

        void a();

        void a(String str);
    }

    /* loaded from: classes4.dex */
    public static class b implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final a f9125a;
        private final Context b;

        public b(Context context, a aVar) {
            this.b = context;
            this.f9125a = aVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            if (method.getName().equals("onStateChanged")) {
                TLog.loge("TBAutoSize.FoldPosture", "onStateChanged");
            } else if (!method.getName().equals("onBaseStateChanged")) {
                return null;
            } else {
                TLog.loge("TBAutoSize.FoldPosture", "onBaseStateChanged");
            }
            this.f9125a.a();
            this.f9125a.a(FoldPosture.a(l.q(this.b)));
            return null;
        }
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != -1 ? i != 0 ? i != 1 ? i != 2 ? "UNKNOWN_STATUS" : "FULL_FOLDED_STATUS" : "HALF_OPENED_STATUS" : "FLAT_STATUS" : "UNKNOWN_STATUS";
    }

    public static void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b3e6a8", new Object[]{context, aVar});
            return;
        }
        a(aVar);
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo")) {
            a(VExecutors.newSingleThreadExecutor(new h() { // from class: com.taobao.android.autosize.orientation.FoldPosture.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : "AutoSizeFoldPostureThread";
                }
            }), context, aVar);
        } else {
            b(context, aVar);
        }
    }

    private static void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ce75a0", new Object[]{aVar});
        } else {
            iuu.a().a(new iuu.a() { // from class: com.taobao.android.autosize.orientation.FoldPosture.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public float f9123a = -1.0f;

                @Override // tb.iuu.a
                public void a(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                        return;
                    }
                    if (this.f9123a < 90.0f && f > 90.0f) {
                        a.this.a();
                    }
                    if (this.f9123a > 5.0f && f < 5.0f) {
                        a.this.a();
                    }
                    this.f9123a = f;
                }
            });
        }
    }

    private static void a(Executor executor, Context context, a aVar) {
        try {
            Object newInstance = Class.forName("android.hardware.devicestate.DeviceStateManager").newInstance();
            Class<?> cls = Class.forName("android.hardware.devicestate.DeviceStateManager");
            Class<?> cls2 = Class.forName("android.hardware.devicestate.DeviceStateManager$DeviceStateCallback");
            cls.getMethod("registerCallback", Executor.class, cls2).invoke(newInstance, executor, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls2}, new b(context, aVar)));
        } catch (Exception e) {
            TLog.loge("TBAutoSize.FoldPosture", "registerOppoObserver: ", e);
        }
    }

    private static void b(final Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a05429", new Object[]{context, aVar});
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return;
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            contentResolver.registerContentObserver(Settings.Global.getUriFor(a2), false, new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.taobao.android.autosize.orientation.FoldPosture.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == -1222901218) {
                        super.onChange(((Boolean) objArr[0]).booleanValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    super.onChange(z);
                    TLog.loge("TBAutoSize.FoldPosture", "onChange=" + z);
                    aVar.a();
                    aVar.a(FoldPosture.a(l.q(context)));
                }
            });
        } catch (RuntimeException e) {
            TLog.loge("TBAutoSize.FoldPosture", "registerObserverBySetting: ", e);
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1206476313:
                if (lowerCase.equals("huawei")) {
                    c = 0;
                    break;
                }
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    c = 3;
                    break;
                }
                break;
            case 3620012:
                if (lowerCase.equals("vivo")) {
                    c = 2;
                    break;
                }
                break;
            case 99462250:
                if (lowerCase.equals("honor")) {
                    c = 1;
                    break;
                }
                break;
            case 108389869:
                if (lowerCase.equals(l.REDMI_MANUFACTURE_LOWER_CASE)) {
                    c = 4;
                    break;
                }
                break;
            case 1864941562:
                if (lowerCase.equals("samsung")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            return "hw_fold_display_mode_prepare";
        }
        if (c == 1) {
            return "hn_fold_screen_state";
        }
        if (c == 2 || c == 3 || c == 4) {
            return "device_posture";
        }
        if (c == 5) {
            return "semDisplayDeviceType";
        }
        return null;
    }
}
