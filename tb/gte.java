package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class gte extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f28437a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(gtf gtfVar);
    }

    public gte(int i, int i2, a aVar, ThreadFactory threadFactory) {
        super(i, i2, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactory);
        allowCoreThreadTimeOut(true);
        this.f28437a = aVar;
    }

    public static /* synthetic */ Object ipc$super(gte gteVar, String str, Object... objArr) {
        if (str.hashCode() == 1173060588) {
            super.beforeExecute((Thread) objArr[0], (Runnable) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
            return;
        }
        if (this.f28437a != null) {
            gtf gtfVar = new gtf();
            gtfVar.b = getMaximumPoolSize();
            gtfVar.c = thread.getPriority();
            gtfVar.f28438a = getCorePoolSize();
            if (this.f28437a.a(gtfVar)) {
                setCorePoolSize(gtfVar.f28438a);
                setMaximumPoolSize(gtfVar.b);
                Process.setThreadPriority(gtfVar.c);
            }
        }
        super.beforeExecute(thread, runnable);
    }
}
