package com.tmall.android.dai.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jbg;
import tb.kge;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f23715a;
    private static Handler b;

    static {
        kge.a(1597306091);
        f23715a = new Handler(Looper.getMainLooper());
        b = null;
    }

    private static synchronized void a() {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (b != null) {
            } else {
                String str = "HandlerThread #" + System.currentTimeMillis();
                HandlerThread a2 = jbg.a(str);
                if (a2 == null) {
                    a2 = new HandlerThread(str, 1);
                }
                a2.start();
                b = new Handler(a2.getLooper()) { // from class: com.tmall.android.dai.internal.util.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                        if (str2.hashCode() == 673877017) {
                            super.handleMessage((Message) objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                            return;
                        }
                        super.handleMessage(message);
                        try {
                            if (message.obj == null || !(message.obj instanceof Runnable)) {
                                return;
                            }
                            g.a((Runnable) message.obj);
                        } catch (Throwable unused) {
                        }
                    }
                };
            }
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            b.b().a(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            a(0, runnable, j);
        }
    }

    public static void a(int i, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0f274b", new Object[]{new Integer(i), runnable, new Long(j)});
            return;
        }
        if (b == null) {
            a();
        }
        try {
            Message obtain = Message.obtain(b, i);
            obtain.obj = runnable;
            b.sendMessageDelayed(obtain, j);
        } catch (Exception e) {
            com.taobao.mrt.utils.a.b("TaskExecutor", e.getMessage(), e);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        if (b == null) {
            a();
        }
        b.removeMessages(i);
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else {
            f23715a.post(runnable);
        }
    }
}
