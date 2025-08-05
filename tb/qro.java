package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class qro {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f33052a = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(2, 2, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h() { // from class: tb.qro.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "tinct-thread";
        }
    }, new ThreadPoolExecutor.AbortPolicy());

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final qro f33054a = new qro();

        public static /* synthetic */ qro a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (qro) ipChange.ipc$dispatch("f09bc70", new Object[0]) : f33054a;
        }
    }

    public static qro a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qro) ipChange.ipc$dispatch("f09bc70", new Object[0]) : a.a();
    }

    public qro() {
        this.f33052a.allowCoreThreadTimeOut(true);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f33052a.execute(runnable);
        }
    }
}
