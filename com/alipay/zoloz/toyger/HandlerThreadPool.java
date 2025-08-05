package com.alipay.zoloz.toyger;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes3.dex */
public class HandlerThreadPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Object f6260a = new Object();
    private static long b = 0;
    private static HashMap<String, HandlerThreadItem> c = new HashMap<>();

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[0]) : f6260a;
    }

    public static /* synthetic */ HashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[0]) : c;
    }

    /* loaded from: classes3.dex */
    public static class HandlerThreadItem extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6261a;
        public int b;
        public ManagedHandlerThread c;

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            int i = this.b - 1;
            this.b = i;
            if (i < 0) {
                throw new IllegalStateException("defRef called on dead thread");
            }
            return this.b;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            int i = this.b + 1;
            this.b = i;
            return i;
        }

        public HandlerThreadItem(String str, ManagedHandlerThread managedHandlerThread) {
            super(managedHandlerThread.getLooper());
            this.f6261a = str;
            this.c = managedHandlerThread;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 0) {
            } else {
                synchronized (HandlerThreadPool.a()) {
                    if (this.b == 0) {
                        HandlerThreadPool.b().remove(this.f6261a);
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.c.b();
                } else {
                    this.c.a();
                }
                this.c = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ManagedHandlerThread extends HandlerThread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f6262a;

        public static /* synthetic */ Object ipc$super(ManagedHandlerThread managedHandlerThread, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1214591724) {
                if (hashCode != -1052580006) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.quit());
            }
            return new Boolean(super.quitSafely());
        }

        public ManagedHandlerThread(String str) {
            super(str);
            this.f6262a = false;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f6262a = true;
            quit();
            this.f6262a = false;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.f6262a = true;
            quitSafely();
            this.f6262a = false;
        }

        @Override // android.os.HandlerThread
        public boolean quit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c142e75a", new Object[]{this})).booleanValue();
            }
            if (!this.f6262a) {
                throw new IllegalStateException("HandlerThread borrowed from HandlerThreadPool cannot call quit directory, use HandlerThreadPool.returnThread() instead");
            }
            return super.quit();
        }

        @Override // android.os.HandlerThread
        public boolean quitSafely() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b79acd14", new Object[]{this})).booleanValue();
            }
            if (!this.f6262a) {
                throw new IllegalStateException("HandlerThread borrowed from HandlerThreadPool cannot call quitSafely directly, use HandlerThreadPool.returnThread() instead");
            }
            return super.quitSafely();
        }
    }

    public static HandlerThread borrowHandlerThread(String str) {
        HandlerThreadItem handlerThreadItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("fb5e104c", new Object[]{str});
        }
        synchronized (f6260a) {
            handlerThreadItem = c.get(str);
            if (handlerThreadItem == null || handlerThreadItem.c == null) {
                ManagedHandlerThread managedHandlerThread = new ManagedHandlerThread(str);
                managedHandlerThread.start();
                HandlerThreadItem handlerThreadItem2 = new HandlerThreadItem(str, managedHandlerThread);
                c.put(str, handlerThreadItem2);
                handlerThreadItem = handlerThreadItem2;
            }
            if (handlerThreadItem != null) {
                handlerThreadItem.removeMessages(0);
                handlerThreadItem.b();
            }
        }
        if (handlerThreadItem == null) {
            return null;
        }
        return handlerThreadItem.c;
    }

    public static void returnHandlerThread(HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e249431", new Object[]{handlerThread});
            return;
        }
        String str = "returnHandlerThread() called with: thread = [" + handlerThread + riy.ARRAY_END_STR;
        if (handlerThread == null) {
            return;
        }
        String name = handlerThread.getName();
        synchronized (f6260a) {
            HandlerThreadItem handlerThreadItem = c.get(name);
            if (handlerThreadItem == null) {
                return;
            }
            if (handlerThreadItem.a() == 0) {
                String str2 = "returnHandlerThread() need quit for thread = [" + handlerThread + riy.ARRAY_END_STR;
                handlerThreadItem.sendEmptyMessageDelayed(0, b);
            }
        }
    }

    public static void setKeepAliveTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb4d50a", new Object[]{new Long(j)});
        } else {
            b = j;
        }
    }
}
