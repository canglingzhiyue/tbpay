package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.f;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class xmb implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f34365a = new AtomicInteger(0);
    private final String b;

    public xmb(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        String str = this.b + this.f34365a.getAndIncrement();
        AdapterForTLog.loge(f.TAG, "threadName:" + str + " dump:" + Log.getStackTraceString(new Throwable()));
        Thread thread = new Thread(runnable);
        thread.setName(str);
        return thread;
    }
}
