package tb;

import android.os.AsyncTask;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import tb.itb;

/* loaded from: classes6.dex */
public class isd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private imn f29269a;
    private Object b;
    private Object c;
    private Object g;
    private ise<Void, HandlerThread> h;
    private a i = new a();
    private d j = new d();
    private c k = new c();
    private b l = new b();
    private e m = new e();

    /* loaded from: classes6.dex */
    public class e {
        public Executor e;

        /* renamed from: a  reason: collision with root package name */
        public int f29274a = 10000;
        public int b = 20000;
        public int c = 20000;
        public int d = 30000;
        public Executor f = AsyncTask.THREAD_POOL_EXECUTOR;

        static {
            kge.a(-513353469);
        }

        public e() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f("tbsearch"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.e = new h(threadPoolExecutor);
        }
    }

    static {
        kge.a(-1172968568);
    }

    public static /* synthetic */ imn a(isd isdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("6ceaae1e", new Object[]{isdVar}) : isdVar.f29269a;
    }

    public <T> T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : (T) this.b;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    public void a(ise<Void, HandlerThread> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee45407d", new Object[]{this, iseVar});
        } else {
            this.h = iseVar;
        }
    }

    public HandlerThread b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("3f7029d3", new Object[]{this});
        }
        ise<Void, HandlerThread> iseVar = this.h;
        if (iseVar != null) {
            return iseVar.a(null);
        }
        return null;
    }

    public <T> T c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : (T) this.c;
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public <T> T g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e4566784", new Object[]{this}) : (T) this.g;
    }

    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, obj});
        } else {
            this.g = obj;
        }
    }

    public a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("92feebe0", new Object[]{this}) : this.i;
    }

    public d i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("74dcb5dc", new Object[]{this}) : this.j;
    }

    public c j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("56ba7f5c", new Object[]{this}) : this.k;
    }

    public e k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("38984939", new Object[]{this}) : this.m;
    }

    public b l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1a76127b", new Object[]{this}) : this.l;
    }

    public isd(imn imnVar) {
        this.f29269a = imnVar;
    }

    /* loaded from: classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f29270a = j.a(152.0f);
        public int b = j.a(390.0f);
        public int c = -1184275;

        static {
            kge.a(-1155598848);
        }

        public a() {
        }

        public void a(com.taobao.android.searchbaseframe.datasource.impl.cell.a<? extends BaseCellBean> aVar, itb.a aVar2, itb.a aVar3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34a710a", new Object[]{this, aVar, aVar2, aVar3});
                return;
            }
            isd.a(isd.this).f().a(aVar);
            isd.a(isd.this).h().a(ListStyle.LIST, aVar.c(), aVar2);
            isd.a(isd.this).h().a(ListStyle.WATERFALL, aVar.c(), aVar3);
        }

        public void a(String str, com.taobao.android.searchbaseframe.datasource.impl.cell.a<? extends BaseCellBean> aVar, itb.a aVar2, itb.a aVar3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bbd1400", new Object[]{this, str, aVar, aVar2, aVar3});
                return;
            }
            isd.a(isd.this).f().a(str, aVar);
            isd.a(isd.this).h().a(ListStyle.LIST, aVar.c(), aVar2);
            isd.a(isd.this).h().a(ListStyle.WATERFALL, aVar.c(), aVar3);
        }

        public void a(ise<ipq, ? extends itd> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee45407d", new Object[]{this, iseVar});
            } else {
                isd.a(isd.this).m().f29266a.c = iseVar;
            }
        }

        public void b(ise<ipq, ? extends itd> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcc846fe", new Object[]{this, iseVar});
            } else {
                isd.a(isd.this).m().b.b = iseVar;
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.searchbaseframe.chitu.f f29271a;

        static {
            kge.a(298598027);
        }

        public b() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                isd.a(isd.this).n().f14963a = str;
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                isd.a(isd.this).n().c = str;
            }
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                isd.a(isd.this).k().b = str;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class f implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f29275a;
        private final ThreadGroup b;
        private final AtomicInteger c = new AtomicInteger(1);
        private final String d;

        static {
            kge.a(-931310749);
            kge.a(-1938806936);
            f29275a = new AtomicInteger(1);
        }

        public f(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            str = StringUtils.isEmpty(str) ? "tbsearch" : str;
            this.d = str + "-pool-" + f29275a.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            ThreadGroup threadGroup = this.b;
            Thread thread = new Thread(threadGroup, runnable, this.d + this.c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* loaded from: classes6.dex */
    public static class h extends g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1517094912);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1943090074:
                    return super.invokeAny((Collection) objArr[0]);
                case -1721567758:
                    return super.invokeAny((Collection) objArr[0], ((Number) objArr[1]).longValue(), (TimeUnit) objArr[2]);
                case -1306036184:
                    return super.submit((Callable) objArr[0]);
                case -1264443469:
                    return super.submit((Runnable) objArr[0]);
                case -794119066:
                    return super.invokeAll((Collection) objArr[0]);
                case -646688520:
                    return new Boolean(super.isTerminated());
                case -611890611:
                    return new Boolean(super.awaitTermination(((Number) objArr[0]).longValue(), (TimeUnit) objArr[1]));
                case -415144718:
                    return super.invokeAll((Collection) objArr[0], ((Number) objArr[1]).longValue(), (TimeUnit) objArr[2]);
                case -342309312:
                    return super.shutdownNow();
                case -303734229:
                    return new Boolean(super.isShutdown());
                case -227606449:
                    return super.submit((Runnable) objArr[0], objArr[1]);
                case 452660730:
                    super.execute((Runnable) objArr[0]);
                    return null;
                case 457600989:
                    super.shutdown();
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        @Override // tb.isd.g, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return super.awaitTermination(j, timeUnit);
        }

        @Override // tb.isd.g, java.util.concurrent.Executor
        public /* bridge */ /* synthetic */ void execute(Runnable runnable) {
            super.execute(runnable);
        }

        @Override // tb.isd.g, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ List invokeAll(Collection collection) throws InterruptedException {
            return super.invokeAll(collection);
        }

        @Override // tb.isd.g, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return super.invokeAll(collection, j, timeUnit);
        }

        @Override // tb.isd.g, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ Object invokeAny(Collection collection) throws InterruptedException, ExecutionException {
            return super.invokeAny(collection);
        }

        @Override // tb.isd.g, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ Object invokeAny(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return super.invokeAny(collection, j, timeUnit);
        }

        @Override // tb.isd.g, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ boolean isShutdown() {
            return super.isShutdown();
        }

        @Override // tb.isd.g, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ boolean isTerminated() {
            return super.isTerminated();
        }

        @Override // tb.isd.g, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ void shutdown() {
            super.shutdown();
        }

        @Override // tb.isd.g, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ List shutdownNow() {
            return super.shutdownNow();
        }

        @Override // tb.isd.g, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
            return super.submit(runnable);
        }

        @Override // tb.isd.g, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
            return super.submit(runnable, obj);
        }

        @Override // tb.isd.g, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public /* bridge */ /* synthetic */ Future submit(Callable callable) {
            return super.submit(callable);
        }

        public h(ExecutorService executorService) {
            super(executorService);
        }

        public void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            } else {
                super.shutdown();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class g extends AbstractExecutorService {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f29276a;

        static {
            kge.a(-335387801);
        }

        public g(ExecutorService executorService) {
            this.f29276a = executorService;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                this.f29276a.execute(runnable);
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            } else {
                this.f29276a.shutdown();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this}) : this.f29276a.shutdownNow();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue() : this.f29276a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue() : this.f29276a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue() : this.f29276a.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : this.f29276a.submit(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : this.f29276a.submit(callable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : this.f29276a.submit(runnable, t);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0aab466", new Object[]{this, collection}) : this.f29276a.invokeAll(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e74164f2", new Object[]{this, collection, new Long(j), timeUnit}) : this.f29276a.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8c2ecc66", new Object[]{this, collection}) : (T) this.f29276a.invokeAny(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9962f5f2", new Object[]{this, collection, new Long(j), timeUnit}) : (T) this.f29276a.invokeAny(collection, j, timeUnit);
        }
    }

    /* loaded from: classes6.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(227178152);
        }

        public d() {
        }

        public void a(ise<irp, ? extends ito> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee45407d", new Object[]{this, iseVar});
            } else {
                isd.a(isd.this).m().f29266a.b = iseVar;
            }
        }

        public void b(ise<irp, ? extends itn> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcc846fe", new Object[]{this, iseVar});
            } else {
                isd.a(isd.this).m().b.f29267a = iseVar;
            }
        }
    }

    /* loaded from: classes6.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public htd p;

        /* renamed from: a  reason: collision with root package name */
        public boolean f29272a = false;
        public boolean b = true;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public boolean g = true;
        public boolean h = false;
        public boolean i = true;
        public boolean j = true;
        public boolean k = true;
        public boolean l = false;
        public boolean m = false;
        public boolean n = false;
        public boolean o = false;
        public boolean q = false;
        public String r = "";
        public String s = ovr.KEY_TAB_BAR_FRAMEWORK;
        public com.taobao.android.searchbaseframe.parse.a<List<TabBean>, BaseSearchResult> t = null;
        public Class<? extends irz> u = null;
        public iua v = null;

        static {
            kge.a(-1843445238);
        }

        public c() {
        }

        public void a(iua iuaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee5f9e03", new Object[]{this, iuaVar});
            } else {
                this.v = iuaVar;
            }
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                isd.a(isd.this).b().a(str);
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.r = str;
            }
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.s = str;
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.j = z;
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.i = z;
            }
        }

        public void a(Class<? extends irz> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20fa47d5", new Object[]{this, cls});
            } else {
                this.u = cls;
            }
        }
    }
}
