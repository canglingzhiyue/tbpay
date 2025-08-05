package com.taobao.android.launcher.bootstrap.tao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import java.lang.reflect.Field;
import java.util.List;
import tb.guc;
import tb.jzk;
import tb.xjq;
import tb.xmf;

/* loaded from: classes5.dex */
public class c implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f13082a;
    private static final SparseIntArray b;
    private final Handler.Callback c;
    private final Context d;
    private final com.taobao.android.launcher.bootstrap.tao.ability.m e;
    private xmf f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f13082a = sparseIntArray;
        sparseIntArray.put(113, 113);
        f13082a.put(114, 114);
        f13082a.put(115, 115);
        f13082a.put(116, 116);
        f13082a.put(121, 121);
        f13082a.put(122, 122);
        f13082a.put(jzk.INSTALL_PROVIDER, jzk.INSTALL_PROVIDER);
        SparseIntArray clone = f13082a.clone();
        b = clone;
        clone.put(100, 100);
        f13082a.put(159, 159);
    }

    private c(Handler.Callback callback, Context context, com.taobao.android.launcher.bootstrap.tao.ability.m mVar) {
        this.c = callback;
        this.d = context;
        this.e = mVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        h.b("ATmHNGNext", "handleMessage, what=" + message.what);
        if (Build.VERSION.SDK_INT >= 28 && f13082a.get(message.what) == 0) {
            Handler.Callback callback = this.c;
            return callback != null && callback.handleMessage(message);
        } else if (Build.VERSION.SDK_INT < 28 && b.get(message.what) == 0) {
            Handler.Callback callback2 = this.c;
            return callback2 != null && callback2.handleMessage(message);
        } else if (a(message)) {
            return true;
        } else {
            Handler.Callback callback3 = this.c;
            return callback3 != null && callback3.handleMessage(message);
        }
    }

    private boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        h.b("ATmHNGNext", "dealMessage, what=" + message.what);
        if (message.what == 114 || message.what == 121 || message.what == 122) {
            return a(message, 0, message.what);
        }
        if (message.what == 115) {
            return a(message, 1, message.what);
        }
        if (message.what == 116) {
            return a(message, 2, message.what);
        }
        if (message.what == 113) {
            return e(message);
        }
        if (message.what == 145) {
            a(message.obj);
            return false;
        } else if (message.what == 100 && Build.VERSION.SDK_INT < 28) {
            return d(message);
        } else {
            if (message.what == 159 && Build.VERSION.SDK_INT >= 28) {
                return c(message);
            }
            h.b("ATmHNGNext", "dealMessage, unsupported message, what=" + message.what);
            b(message);
            return false;
        }
    }

    private void b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeca26bc", new Object[]{this, message});
        } else if (this.e.c()) {
        } else {
            this.e.a(android.taobao.safemode.k.a(message.obj.toString()));
            h.a("ATmHNGNext", "dealUnknownMessage: " + message.obj);
        }
    }

    private boolean c(Message message) {
        xmf xmfVar = this.f;
        if (xmfVar == null || !xmfVar.a(message)) {
            if (this.e.c()) {
                return false;
            }
            try {
                Field declaredField = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredField("mActivityCallbacks");
                declaredField.setAccessible(true);
                Field declaredField2 = Class.forName("android.app.servertransaction.LaunchActivityItem").getDeclaredField("mIntent");
                declaredField2.setAccessible(true);
                List list = (List) declaredField.get(message.obj);
                if (list != null && !list.isEmpty()) {
                    for (Object obj : list) {
                        if ("android.app.servertransaction.LaunchActivityItem".equals(obj.getClass().getName())) {
                            return a(message, this.d, (Intent) declaredField2.get(obj));
                        }
                    }
                    return false;
                }
                return a(message, this.d, (Intent) null);
            } catch (Throwable th) {
                h.a("ATmHNGNext", "error occurred when dealActivityMessagePOrAbove:", th);
                return a(message, this.d, (Intent) null);
            }
        }
        return true;
    }

    private boolean a(Message message, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df8db2e", new Object[]{this, message, context, intent})).booleanValue();
        }
        android.taobao.safemode.k a2 = a(context, intent);
        this.f = Dispatchers.a(message, Dispatchers.TYPE_ACTIVITY, this.e.f(), a2);
        this.e.a(a2, this.f);
        return this.f.a();
    }

    private boolean a(Message message, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c05c0d53", new Object[]{this, message, str, str2})).booleanValue();
        }
        this.f = Dispatchers.a(message, str, this.e.f());
        this.e.a(android.taobao.safemode.k.a(str2), this.f);
        return this.f.a();
    }

    private boolean d(Message message) {
        xmf xmfVar = this.f;
        if (xmfVar == null || !xmfVar.a(message)) {
            if (this.e.c()) {
                return false;
            }
            try {
                Field declaredField = message.obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField.setAccessible(true);
                return a(message, this.d, (Intent) declaredField.get(message.obj));
            } catch (Throwable th) {
                h.a("ATmHNGNext", "error occurred when dealActivityMessageUnderP:", th);
                return a(message, this.d, (Intent) null);
            }
        }
        return true;
    }

    private static android.taobao.safemode.k a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.taobao.safemode.k) ipChange.ipc$dispatch("8ce31781", new Object[]{context, intent});
        }
        String packageName = context.getPackageName();
        return android.taobao.safemode.k.a(packageName, packageName, true, null, intent, false, null);
    }

    private void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (this.e.c()) {
        } else {
            this.e.a(android.taobao.safemode.k.a(obj.toString()));
            h.a("ATmHNGNext", "publishContentProviders: " + obj);
        }
    }

    private boolean e(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b5b0dc3", new Object[]{this, message})).booleanValue();
        }
        Object obj = message.obj;
        if (xjq.a(message)) {
            b(obj);
            return true;
        }
        b(obj);
        xmf xmfVar = this.f;
        if (xmfVar != null && xmfVar.a(message)) {
            return true;
        }
        if (!this.e.c()) {
            return a(message, Dispatchers.TYPE_RECEIVER, obj.toString());
        }
        return false;
    }

    private void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (!guc.a(this.d, "ngFinishReceiverV3")) {
        } else {
            d(obj);
        }
    }

    private void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
        } else if (!(obj instanceof BroadcastReceiver.PendingResult)) {
        } else {
            try {
                jzk.a((BroadcastReceiver.PendingResult) obj);
            } catch (Throwable th) {
                h.a("ATmHNGNext", "error occurred when finishReceiver: " + obj, th);
            }
            h.b("ATmHNGNext", "finishReceiver: " + obj);
        }
    }

    private IBinder a(Object obj, int i) throws Throwable {
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
            jzk.a(jzk.a(), obj, a(obj, i), i, i == 1 ? c(obj) : 0, i2);
            h.a("ATmHNGNext", "serviceDoneExecuting: " + obj);
        } catch (Throwable th) {
            h.a("ATmHNGNext", "error occurred when serviceDoneExecuting: " + obj, th);
        }
    }

    private boolean a(Message message, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b98b75f", new Object[]{this, message, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Object obj = message.obj;
        if (xjq.a(message)) {
            h.b("ATmHNGNext", "current message is sensitive_reply, let's reply to AMS: " + message);
            a(obj, i, i2);
            xjq.e(message);
            return true;
        }
        a(obj, i, i2);
        if (xjq.b(message)) {
            long c = xjq.c(message);
            long d = xjq.d(message);
            long uptimeMillis = SystemClock.uptimeMillis();
            long when = uptimeMillis - message.getWhen();
            h.b("ATmHNGNext", "{ reply=" + c + ",replied=" + d + ",now=" + uptimeMillis + ",saved=" + (uptimeMillis - d) + "ms,duration=" + when + "ms } for msg=" + message);
        }
        xmf xmfVar = this.f;
        if (xmfVar != null && xmfVar.a(message)) {
            return true;
        }
        if (this.e.c()) {
            return false;
        }
        return a(message, Dispatchers.TYPE_SERVICE, obj.toString());
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

    public static boolean a(final Context context, final com.taobao.android.launcher.bootstrap.tao.ability.m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70a12207", new Object[]{context, mVar})).booleanValue() : jzk.a(new jzk.a() { // from class: com.taobao.android.launcher.bootstrap.tao.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jzk.a
            public Handler.Callback a(Handler.Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Handler.Callback) ipChange2.ipc$dispatch("be16f0f6", new Object[]{this, callback});
                }
                Dispatchers.a("OriginCallback", String.valueOf(callback));
                return new c(callback, context, mVar);
            }
        });
    }
}
