package com.taobao.android.tbuprofen.adapter.anr;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.util.Iterator;
import java.util.LinkedList;
import tb.jbg;
import tb.kge;

/* loaded from: classes6.dex */
public class AsyncSharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static com.taobao.android.boutique.reflection.e f15456a;
    private static com.taobao.android.boutique.reflection.e b;
    private static Object d;
    private static Object e;
    private static HandlerThread f;
    private static boolean g;

    public static /* synthetic */ Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[0]) : e;
    }

    public static /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[0]) : d;
    }

    public static /* synthetic */ boolean f() throws IllegalAccessException, NoSuchFieldException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : e();
    }

    static {
        kge.a(1749764698);
        f15456a = null;
        b = null;
        d = null;
        e = null;
        f = null;
        g = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (Build.VERSION.SDK_INT < 26) {
            com.taobao.android.tbuprofen.log.c.b("AsyncSharedPreferences", "Sp hook do not support below Android8", new Object[0]);
        } else {
            try {
                if (g) {
                    return;
                }
                try {
                    com.taobao.android.boutique.reflection.e a2 = com.taobao.android.boutique.reflection.e.a(Class.forName("android.app.QueuedWork"));
                    f15456a = a2;
                    com.taobao.android.boutique.reflection.e a3 = a2.a("sLock");
                    b = f15456a.a("sWork");
                    if (f15456a != null && a3 != null) {
                        e = f15456a.a("getHandler", new Class[0], new Object[0]).a();
                        d = a3.a();
                        if (e != null && d != null) {
                            UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY);
                            crashCaughtHeaderByType.addHeaderInfo("TBP_SP_OPT", "false");
                            synchronized (d) {
                                try {
                                } catch (Exception e2) {
                                    com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", e2, "Failed to hook QueuedWork", new Object[0]);
                                }
                                if (!e()) {
                                    if (g) {
                                        return;
                                    }
                                    b();
                                    return;
                                }
                                f15456a.a("sFinishers", new ProxyLinkList());
                                HandlerThread a4 = jbg.a("tbp-queued-work-looper");
                                f = a4;
                                a4.start();
                                f15456a.a("sHandler", new a(f.getLooper()));
                                g = true;
                                Object a5 = f15456a.a("getHandler", new Class[0], new Object[0]).a();
                                if (a5 instanceof a) {
                                    Message obtain = Message.obtain();
                                    obtain.what = a.MSG_CHECK_HOOK;
                                    obtain.obj = crashCaughtHeaderByType;
                                    ((a) a5).sendMessage(obtain);
                                } else {
                                    com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "waitToFinish processPendingWork hook failed!!!", new Object[0]);
                                }
                                crashCaughtHeaderByType.addHeaderInfo("TBP_SP_OPT", com.taobao.android.tbuprofen.common.a.a(System.currentTimeMillis()));
                                com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "optimize sp done!!!", new Object[0]);
                                if (g) {
                                    return;
                                }
                                b();
                                return;
                            }
                        }
                        com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "Failed to get object", new Object[0]);
                        if (g) {
                            return;
                        }
                        b();
                        return;
                    }
                    com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "Failed to get field or method", new Object[0]);
                    if (g) {
                        return;
                    }
                    b();
                } catch (Exception e3) {
                    com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", e3, "optimize sp exception", new Object[0]);
                    if (g) {
                        return;
                    }
                    b();
                }
            } catch (Throwable th) {
                if (!g) {
                    b();
                }
                throw th;
            }
        }
    }

    private static boolean e() throws IllegalAccessException, NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        Object a2 = b.a();
        if (a2 == null) {
            com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "Failed to get sWork object", new Object[0]);
            return false;
        }
        f15456a.a("sWork", new ProxyLinkList((LinkedList) a2));
        return true;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            if (d == null) {
                return;
            }
            synchronized (d) {
                if (f15456a != null) {
                    f15456a.a("sWork", new LinkedList());
                    f15456a.a("sFinishers", new LinkedList());
                    f15456a.a("sHandler", e);
                }
                if (f != null) {
                    f.quitSafely();
                }
            }
            UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY);
            crashCaughtHeaderByType.addHeaderInfo("TBP_SP_OPT", "false");
            crashCaughtHeaderByType.addHeaderInfo("TBP_SP_HOOK_HANDLER", "false");
            d = null;
            f = null;
            g = false;
            com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "deoptimize sp done!!!", new Object[0]);
        } catch (Exception e2) {
            com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", e2, "doptimize sp exception", new Object[0]);
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int MSG_CHECK_HOOK = 12331;

        static {
            kge.a(2138850086);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what != 12331) {
                return;
            }
            UncaughtCrashHeader uncaughtCrashHeader = (UncaughtCrashHeader) message.obj;
            if (AsyncSharedPreferences.c() instanceof Handler) {
                ((Handler) AsyncSharedPreferences.c()).removeMessages(1);
            }
            uncaughtCrashHeader.addHeaderInfo("TBP_SP_HOOK_HANDLER", com.taobao.android.tbuprofen.common.a.a(System.currentTimeMillis()));
        }
    }

    /* loaded from: classes6.dex */
    public static class ProxyLinkList<E> extends LinkedList<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean isWork = false;

        static {
            kge.a(-1223239844);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            return true;
        }

        public ProxyLinkList() {
        }

        public ProxyLinkList(LinkedList<Runnable> linkedList) {
            if (linkedList == null) {
                return;
            }
            Iterator<Runnable> it = linkedList.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdcb2a", new Object[]{this, runnable})).booleanValue();
            }
            if (this.isWork) {
                com.taobao.android.tbuprofen.common.e.a().a(new Runnable() { // from class: com.taobao.android.tbuprofen.adapter.anr.AsyncSharedPreferences.ProxyLinkList.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            runnable.run();
                        }
                    }
                });
            }
            return true;
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            if (this.isWork && Build.VERSION.SDK_INT >= 31) {
                synchronized (AsyncSharedPreferences.d()) {
                    try {
                        if (!AsyncSharedPreferences.f()) {
                            com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "proxy sWork failed", new Object[0]);
                        } else {
                            com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", "proxy sWork again!!!", new Object[0]);
                        }
                    } catch (Exception e) {
                        com.taobao.android.tbuprofen.log.c.a("AsyncSharedPreferences", e, "proxy sWork exception", new Object[0]);
                    }
                }
            }
            return 0;
        }
    }
}
