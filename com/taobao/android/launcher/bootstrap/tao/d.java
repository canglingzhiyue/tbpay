package com.taobao.android.launcher.bootstrap.tao;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.gtx;
import tb.gty;
import tb.jqm;
import tb.jzk;

/* loaded from: classes5.dex */
public class d implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f13084a;
    private static final SparseIntArray b;
    private final Handler.Callback c;
    private final Context d;
    private final Set<IBinder> f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f13084a = sparseIntArray;
        sparseIntArray.put(113, 113);
        f13084a.put(114, 114);
        f13084a.put(115, 115);
        f13084a.put(116, 116);
        f13084a.put(121, 121);
        f13084a.put(122, 122);
        f13084a.put(jzk.INSTALL_PROVIDER, jzk.INSTALL_PROVIDER);
        SparseIntArray clone = f13084a.clone();
        b = clone;
        clone.put(100, 100);
        f13084a.put(159, 159);
    }

    private d(Handler.Callback callback, Context context) {
        this.f = new HashSet();
        this.c = callback;
        this.d = context;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        h.a("ATmHPrivacy", "handleMessage, what=" + message.what);
        if (Build.VERSION.SDK_INT >= 28 && f13084a.get(message.what) == 0) {
            Handler.Callback callback = this.c;
            return callback != null && callback.handleMessage(message);
        } else if (Build.VERSION.SDK_INT < 28 && b.get(message.what) == 0) {
            Handler.Callback callback2 = this.c;
            return callback2 != null && callback2.handleMessage(message);
        } else if (gty.a(this.d) && !a(message)) {
            Handler.Callback callback3 = this.c;
            return callback3 != null && callback3.handleMessage(message);
        } else if (b(message)) {
            return true;
        } else {
            Handler.Callback callback4 = this.c;
            return callback4 != null && callback4.handleMessage(message);
        }
    }

    private boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        h.a("ATmHPrivacy", "checkExistMessage, what=" + message.what);
        if (message.what == 114 || message.what == 121 || message.what == 122) {
            return a(message.obj, 0);
        }
        if (message.what == 115) {
            return a(message.obj, 1);
        }
        if (message.what != 116) {
            return false;
        }
        return a(message.obj, 2);
    }

    private boolean b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeca26c0", new Object[]{this, message})).booleanValue();
        }
        h.b("ATmHPrivacy", "dealMessage, what=" + message.what);
        if (message.what == 114 || message.what == 121 || message.what == 122) {
            a(message.obj, 0, message.what);
            return true;
        } else if (message.what == 115) {
            a(message.obj, 1, message.what);
            return true;
        } else if (message.what == 116) {
            a(message.obj, 2, message.what);
            return true;
        } else if (message.what == 113) {
            b(message.obj);
            return true;
        } else if (message.what == 145) {
            a(message.obj);
            return true;
        } else if (message.what == 100 && Build.VERSION.SDK_INT < 28) {
            boolean d = d(message);
            h.b("ATmHPrivacy", "redirected: " + d + ", msg.what=" + message.what);
            return false;
        } else if (message.what == 159 && Build.VERSION.SDK_INT >= 28) {
            boolean c = c(message);
            h.b("ATmHPrivacy", "redirected: " + c + ", msg.what=" + message.what);
            return false;
        } else {
            h.b("ATmHPrivacy", "dealMessage, unsupported message, what=" + message.what);
            return false;
        }
    }

    private boolean c(Message message) {
        Field declaredField;
        List list;
        try {
            Field declaredField2 = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredField("mActivityCallbacks");
            declaredField2.setAccessible(true);
            declaredField = Class.forName("android.app.servertransaction.LaunchActivityItem").getDeclaredField("mIntent");
            declaredField.setAccessible(true);
            list = (List) declaredField2.get(message.obj);
        } catch (Throwable th) {
            h.a("ATmHPrivacy", "error occurred when redirectPAndAbove:", th);
        }
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                if ("android.app.servertransaction.LaunchActivityItem".equals(obj.getClass().getName())) {
                    boolean a2 = a(this.d, (Intent) declaredField.get(obj));
                    h.a("ATmHPrivacy", "redirectPAndAbove, result: " + a2);
                    return a2;
                }
            }
            return false;
        }
        return false;
    }

    private boolean d(Message message) {
        try {
            Field declaredField = message.obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            declaredField.setAccessible(true);
            boolean a2 = a(this.d, (Intent) declaredField.get(message.obj));
            h.a("ATmHPrivacy", "redirectPBelow, result: " + a2);
            return a2;
        } catch (Throwable th) {
            h.a("ATmHPrivacy", "error occurred when redirectPBelow:", th);
            return false;
        }
    }

    private static boolean a(Context context, Intent intent) {
        Intent launchIntentForPackage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        if (intent != null && intent.getComponent() != null) {
            ComponentName component = intent.getComponent();
            if ((!jqm.a() || !component.getClassName().startsWith("android.taobao.mulitenv.")) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName())) != null && launchIntentForPackage.getComponent() != null) {
                ComponentName component2 = launchIntentForPackage.getComponent();
                if (TextUtils.equals(component.getClassName(), component2.getClassName())) {
                    h.a("ATmHPrivacy", "class name is equal, discard: " + component.getClassName());
                    return false;
                }
                Bundle bundleExtra = intent.getBundleExtra("params");
                if (bundleExtra != null && bundleExtra.getBoolean("viewMode")) {
                    h.a("ATmHPrivacy", "viewMode container, discard it: " + component.getClassName());
                    return false;
                }
                intent.setComponent(component2);
                intent.setFlags(intent.getFlags() | 67108864);
                h.a("ATmHPrivacy", "redirect from " + component + " to " + component2);
                return true;
            }
        }
        return false;
    }

    private void a(Object obj) {
        try {
            Object a2 = jzk.a();
            Object b2 = jzk.b();
            Method declaredMethod = Class.forName("android.app.IActivityManager").getDeclaredMethod("publishContentProviders", Class.forName(ProcessUtils.ACTIVITY_THREAD), List.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(a2, b2, Collections.emptyList());
            h.a("ATmHPrivacy", "publishContentProviders: " + obj);
        } catch (Throwable th) {
            h.a("ATmHPrivacy", "error occurred when publishContentProviders: " + obj, th);
        }
    }

    private void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (!(obj instanceof BroadcastReceiver.PendingResult)) {
        } else {
            ((BroadcastReceiver.PendingResult) obj).finish();
            h.a("ATmHPrivacy", "finishReceiver: " + obj);
        }
    }

    private boolean a(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7da943", new Object[]{this, obj, new Integer(i)})).booleanValue();
        }
        try {
            if (this.f.contains(b(obj, i))) {
                h.b("ATmHPrivacy", "token dealt before");
                return true;
            }
        } catch (Throwable th) {
            h.a("ATmHPrivacy", "error occurred when checkServiceExecuted: " + obj, th);
        }
        return false;
    }

    private IBinder b(Object obj, int i) throws Throwable {
        if (i == 2) {
            return (IBinder) obj;
        }
        Field declaredField = obj.getClass().getDeclaredField("token");
        declaredField.setAccessible(true);
        return (IBinder) declaredField.get(obj);
    }

    private void a(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b137f1a4", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            Object a2 = jzk.a();
            IBinder b2 = b(obj, i);
            jzk.a(a2, obj, b2, i, i == 1 ? c(obj) : 0, i2);
            h.a("ATmHPrivacy", "serviceDoneExecuting: " + obj);
            boolean add = this.f.add(b2);
            h.a("ATmHPrivacy", "token: " + b2 + " added: " + add);
        } catch (Throwable th) {
            h.a("ATmHPrivacy", "error occurred when serviceDoneExecuting: " + obj, th);
        }
    }

    private int c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a8844b9", new Object[]{this, obj})).intValue();
        }
        String obj2 = obj.toString();
        int indexOf = obj2.indexOf("startId=");
        if (indexOf == -1) {
            return 0;
        }
        int i = indexOf + 8;
        try {
            return Integer.parseInt(obj2.substring(i, obj2.indexOf(" ", i)));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean a(final Context context, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d07c9c9", new Object[]{context, gtxVar})).booleanValue();
        }
        if (TextUtils.equals(gtxVar.f28453a, gtxVar.b)) {
            return jzk.a(new jzk.a() { // from class: com.taobao.android.launcher.bootstrap.tao.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jzk.a
                public Handler.Callback a(Handler.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Handler.Callback) ipChange2.ipc$dispatch("be16f0f6", new Object[]{this, callback}) : new d(callback, context);
                }
            });
        }
        return false;
    }
}
