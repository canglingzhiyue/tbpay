package com.taobao.aranger.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.aranger.utils.CallbackManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.jzv;
import tb.kak;
import tb.kge;
import tb.xkf;

/* loaded from: classes.dex */
public class CallbackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f16367a;
    private static volatile CallbackManager b;
    private final ProcessStateReceiver f = new ProcessStateReceiver();
    private final IntentFilter g = new IntentFilter();
    private final ConcurrentHashMap<String, a> c = new ConcurrentHashMap<>();
    private final CopyOnWriteArrayList<ProcessStateListener> d = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<ProcessStateListener> e = new CopyOnWriteArrayList<>();

    public static /* synthetic */ CopyOnWriteArrayList a(CallbackManager callbackManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("d0a2e186", new Object[]{callbackManager}) : callbackManager.d;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f16367a;
    }

    public static /* synthetic */ CopyOnWriteArrayList b(CallbackManager callbackManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("b9aaa687", new Object[]{callbackManager}) : callbackManager.e;
    }

    static {
        kge.a(1150487038);
        f16367a = CallbackManager.class.getSimpleName();
        b = null;
    }

    private CallbackManager() {
        this.g.addAction(Constants.ACTION_CONNECT);
        this.g.addAction(Constants.ACTION_DISCONNECT);
    }

    public static CallbackManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CallbackManager) ipChange.ipc$dispatch("bb74cb5f", new Object[0]);
        }
        if (b == null) {
            synchronized (CallbackManager.class) {
                if (b == null) {
                    b = new CallbackManager();
                }
            }
        }
        return b;
    }

    public void a(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb14d106", new Object[]{this, str, obj, new Boolean(z)});
        } else {
            this.c.putIfAbsent(str, new a(z, obj));
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        a aVar = this.c.get(str);
        if (aVar == null) {
            return null;
        }
        Object a2 = aVar.a();
        if (a2 == null) {
            this.c.remove(str);
        }
        return a2;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c.remove(str);
        }
    }

    public void a(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89be8b5", new Object[]{this, processStateListener});
            return;
        }
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                jzv.a().registerReceiver(this.f, this.g);
            }
            this.d.add(processStateListener);
        }
    }

    public void b(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c270676", new Object[]{this, processStateListener});
            return;
        }
        synchronized (this.e) {
            this.e.add(processStateListener);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        Iterator<ProcessStateListener> it = this.e.iterator();
        while (it.hasNext()) {
            try {
                it.next().onProcessStop(str);
            } catch (Throwable th) {
                kak.a(f16367a, "onProcessDisconnect err", th, new Object[0]);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f16368a;

        static {
            kge.a(-2090578488);
        }

        public a(boolean z, Object obj) {
            if (z) {
                this.f16368a = new WeakReference(obj);
            } else {
                this.f16368a = obj;
            }
        }

        public Object a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
            }
            Object obj = this.f16368a;
            return obj instanceof WeakReference ? ((WeakReference) obj).get() : obj;
        }
    }

    /* loaded from: classes.dex */
    public class ProcessStateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-826234249);
        }

        public static /* synthetic */ Object ipc$super(ProcessStateReceiver processStateReceiver, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private ProcessStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (xkf.a()) {
                b.a(false, false, new Runnable() { // from class: com.taobao.aranger.utils.-$$Lambda$CallbackManager$ProcessStateReceiver$mEeQIe_SsjhPX8OzSX4rtp8OyD4
                    {
                        CallbackManager.ProcessStateReceiver.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CallbackManager.ProcessStateReceiver.this.lambda$onReceive$7$CallbackManager$ProcessStateReceiver(intent);
                    }
                });
            } else {
                onReceiveImpl(intent);
            }
        }

        public /* synthetic */ void lambda$onReceive$7$CallbackManager$ProcessStateReceiver(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d536167e", new Object[]{this, intent});
            } else {
                onReceiveImpl(intent);
            }
        }

        private void onReceiveImpl(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f940188", new Object[]{this, intent});
                return;
            }
            String stringExtra = intent.getStringExtra("processName");
            if (Constants.ACTION_DISCONNECT.equals(intent.getAction())) {
                Iterator it = CallbackManager.a(CallbackManager.this).iterator();
                while (it.hasNext()) {
                    try {
                        ((ProcessStateListener) it.next()).onProcessStop(stringExtra);
                    } catch (Throwable th) {
                        kak.a(CallbackManager.b(), "[onReceive][onProcessStop]", th, new Object[0]);
                    }
                }
                return;
            }
            Iterator it2 = CallbackManager.a(CallbackManager.this).iterator();
            while (it2.hasNext()) {
                try {
                    ((ProcessStateListener) it2.next()).onProcessStart(stringExtra);
                } catch (Throwable th2) {
                    kak.a(CallbackManager.b(), "[onReceive][onProcessStart]", th2, new Object[0]);
                }
            }
            if (CallbackManager.b(CallbackManager.this) == null) {
                return;
            }
            Iterator it3 = CallbackManager.b(CallbackManager.this).iterator();
            while (it3.hasNext()) {
                try {
                    ((ProcessStateListener) it3.next()).onProcessStart(stringExtra);
                } catch (Throwable th3) {
                    kak.a(CallbackManager.b(), "[onReceive][onProcessStart]local", th3, new Object[0]);
                }
            }
        }
    }
}
