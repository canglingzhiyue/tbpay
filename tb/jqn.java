package tb;

import android.os.AsyncTask;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.e;
import com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class jqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2066014107);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        if (!(executor instanceof ThreadPoolExecutor)) {
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
        StubThreadPoolExecutor stubThreadPoolExecutor = new StubThreadPoolExecutor(8, 8, threadPoolExecutor.getKeepAliveTime(TimeUnit.SECONDS), TimeUnit.SECONDS, new LinkedBlockingQueue(), new e() { // from class: tb.jqn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.e
            public VirtualThread a(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (VirtualThread) ipChange2.ipc$dispatch("ac603360", new Object[]{this, runnable}) : new VirtualThread(runnable, "AsyncTask:vt");
            }
        }, threadPoolExecutor.getRejectedExecutionHandler());
        stubThreadPoolExecutor.allowCoreThreadTimeOut(threadPoolExecutor.allowsCoreThreadTimeOut());
        a(stubThreadPoolExecutor);
    }

    private static boolean a(ThreadPoolExecutor threadPoolExecutor) {
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                Field declaredField = AsyncTask.class.getDeclaredField("THREAD_POOL_EXECUTOR");
                declaredField.setAccessible(true);
                declaredField.set(null, threadPoolExecutor);
                return true;
            } catch (Exception unused) {
                jrk.b("AsyncTaskHooker", "Failed to install THREAD_POOL_EXECUTOR as default executor of AsyncTask.");
            }
        } else {
            try {
                try {
                    try {
                        Method method = AsyncTask.class.getMethod("setDefaultExecutor", Executor.class);
                        method.setAccessible(true);
                        method.invoke(null, threadPoolExecutor);
                        return true;
                    } catch (Exception unused2) {
                        jrk.b("AsyncTaskHooker", "Failed to install as default executor of AsyncTask.");
                    }
                } catch (Exception unused3) {
                    Field declaredField2 = AsyncTask.class.getDeclaredField("sExecutor");
                    declaredField2.setAccessible(true);
                    declaredField2.set(null, threadPoolExecutor);
                    return true;
                }
            } catch (Exception unused4) {
                Field declaredField3 = AsyncTask.class.getDeclaredField("sDefaultExecutor");
                declaredField3.setAccessible(true);
                declaredField3.set(null, threadPoolExecutor);
                return true;
            }
        }
        return false;
    }
}
