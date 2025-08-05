package com.taobao.android.launcher.bootstrap.tao.ability.ipc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.ipc.a;
import com.taobao.android.launcher.bootstrap.tao.h;
import com.taobao.android.task.Coordinator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.guc;
import tb.xjm;

/* loaded from: classes5.dex */
public class IPCKnifeImpl implements Handler.Callback, a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a.InterfaceC0506a f13072a;
    private final Handler c;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private int e = 0;
    private final Handler d = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ProxyFlags {
    }

    public static /* synthetic */ Handler a(IPCKnifeImpl iPCKnifeImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7bb5369a", new Object[]{iPCKnifeImpl}) : iPCKnifeImpl.d;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        h.b("IPCKnifeImpl", "received broadcast receiver message: " + message);
        return false;
    }

    public static a.b a(a.InterfaceC0506a interfaceC0506a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("61eecaf1", new Object[]{interfaceC0506a}) : new IPCKnifeImpl(interfaceC0506a);
    }

    private IPCKnifeImpl(a.InterfaceC0506a interfaceC0506a) {
        this.f13072a = interfaceC0506a;
        Context a2 = interfaceC0506a.a();
        if (!guc.a(a2, "ngIPCKnifeOpen")) {
            this.c = null;
            return;
        }
        if (guc.a(a2, "ngIPCKnifeOpenForAll")) {
            this.e |= 1;
        }
        if (guc.a(a2, "ngIPCKnifeOpenForSensitiveReceiver")) {
            this.e |= 2;
        }
        this.c = new Handler(Coordinator.getWorkerLooper()) { // from class: com.taobao.android.launcher.bootstrap.tao.ability.ipc.IPCKnifeImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 72182663) {
                    super.dispatchMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                IPCKnifeImpl.this.handleMessage(message);
                Runnable callback = message.getCallback();
                if (callback != null) {
                    IPCKnifeImpl.a(IPCKnifeImpl.this).postAtFrontOfQueue(xjm.a("ReceiverRunnable", callback));
                } else {
                    super.dispatchMessage(message);
                }
            }
        };
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b
    public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("677247b4", new Object[]{this, broadcastReceiver, intentFilter, new Integer(i)});
        }
        if (this.e == 0) {
            return this.f13072a.a(broadcastReceiver, intentFilter, i);
        }
        if (this.b.get()) {
            return this.f13072a.a(broadcastReceiver, intentFilter, i);
        }
        int i2 = this.e;
        if ((i2 & 1) == 1) {
            return this.f13072a.a(broadcastReceiver, intentFilter, null, this.c, i);
        }
        if ((i2 & 2) == 0) {
            return this.f13072a.a(broadcastReceiver, intentFilter);
        }
        if (a(intentFilter)) {
            return this.f13072a.a(broadcastReceiver, intentFilter, null, this.c, i);
        }
        return this.f13072a.a(broadcastReceiver, intentFilter, i);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b
    public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("db5ddb8f", new Object[]{this, broadcastReceiver, intentFilter});
        }
        if (this.e == 0) {
            return this.f13072a.a(broadcastReceiver, intentFilter);
        }
        if (this.b.get()) {
            return this.f13072a.a(broadcastReceiver, intentFilter);
        }
        int i = this.e;
        if ((i & 1) == 1) {
            return this.f13072a.a(broadcastReceiver, intentFilter, null, this.c);
        }
        if ((i & 2) == 0) {
            return this.f13072a.a(broadcastReceiver, intentFilter);
        }
        if (a(intentFilter)) {
            return this.f13072a.a(broadcastReceiver, intentFilter, null, this.c);
        }
        return this.f13072a.a(broadcastReceiver, intentFilter);
    }

    private boolean a(IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3a803d1", new Object[]{this, intentFilter})).booleanValue() : intentFilter.hasAction("android.intent.action.BOOT_COMPLETED") || intentFilter.hasAction("android.intent.action.SCREEN_OFF") || intentFilter.hasAction("android.intent.action.SCREEN_ON") || intentFilter.hasAction("android.intent.action.USER_PRESENT");
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.compareAndSet(false, true);
        }
    }
}
