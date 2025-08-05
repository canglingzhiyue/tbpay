package com.taobao.browser;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.taobao.util.k;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f16756a;
    private static ExecutorService b;

    static {
        kge.a(-570387583);
    }

    private a() {
        b = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new android.taobao.windvane.thread.d("BrowserExecutor"));
        try {
            ((ThreadPoolExecutor) b).allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static a a() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("10c16916", new Object[0]);
        }
        if (f16756a == null) {
            synchronized (a.class) {
                if (f16756a == null) {
                    f16756a = new a();
                }
                aVar = f16756a;
            }
            return aVar;
        }
        return f16756a;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            b.execute(runnable);
        }
    }

    public void b(final Runnable runnable) {
        MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: com.taobao.browser.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                runnable.run();
                return false;
            }
        };
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Looper.getMainLooper().getQueue().addIdleHandler(idleHandler);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            Field field = mainLooper.getClass().getField("mQueue");
            field.setAccessible(true);
            ((MessageQueue) field.get(mainLooper)).addIdleHandler(idleHandler);
        } catch (Throwable th) {
            k.a("BrowserExecutor", "runOnUIIdle: error " + th);
            th.printStackTrace();
        }
    }
}
