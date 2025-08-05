package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class HttpManager implements Transport {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HttpManager";

    /* renamed from: a  reason: collision with root package name */
    private static HttpManager f6200a;
    private static final ThreadFactory h = new ThreadFactory() { // from class: com.alipay.vi.android.phone.mrpc.core.HttpManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f6201a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "com.alipay.vi.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f6201a.getAndIncrement());
            thread.setPriority(4);
            return thread;
        }
    };
    private long d;
    private long e;
    private long f;
    private int g;
    public Context mContext;
    private AndroidHttpClient c = AndroidHttpClient.newInstance("android");
    private ThreadPoolExecutor b = new ThreadPoolExecutor(10, 11, 3, TimeUnit.SECONDS, new ArrayBlockingQueue(20), h, new ThreadPoolExecutor.CallerRunsPolicy());

    public HttpManager(Context context) {
        this.mContext = context;
        try {
            this.b.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.mContext);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final HttpManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpManager) ipChange.ipc$dispatch("8f5f5a21", new Object[]{context});
        }
        HttpManager httpManager = f6200a;
        return httpManager != null ? httpManager : a(context);
    }

    private static final synchronized HttpManager a(Context context) {
        synchronized (HttpManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpManager) ipChange.ipc$dispatch("1082a50b", new Object[]{context});
            } else if (f6200a != null) {
                return f6200a;
            } else {
                HttpManager httpManager = new HttpManager(context);
                f6200a = httpManager;
                return httpManager;
            }
        }
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.Transport
    public Future<Response> execute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("8c801f4b", new Object[]{this, request});
        }
        if (!(request instanceof HttpUrlRequest)) {
            throw new RuntimeException("request send error.");
        }
        if (MiscUtils.isDebugger(this.mContext)) {
            dumpPerf();
        }
        final HttpWorker generateWorker = generateWorker((HttpUrlRequest) request);
        FutureTask<Response> futureTask = new FutureTask<Response>(generateWorker) { // from class: com.alipay.vi.android.phone.mrpc.core.HttpManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1159927561) {
                    super.done();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // java.util.concurrent.FutureTask
            public void done() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("45231709", new Object[]{this});
                    return;
                }
                HttpUrlRequest request2 = generateWorker.getRequest();
                TransportCallback callback = request2.getCallback();
                if (callback == null) {
                    super.done();
                    return;
                }
                try {
                    Response response = get();
                    if (!isCancelled() && !request2.isCanceled()) {
                        if (response == null) {
                            return;
                        }
                        callback.onPostExecute(request2, response);
                        return;
                    }
                    request2.cancel();
                    if (!isCancelled() || !isDone()) {
                        cancel(false);
                    }
                    callback.onCancelled(request2);
                } catch (InterruptedException e) {
                    callback.onFailed(request2, 7, String.valueOf(e));
                } catch (CancellationException unused) {
                    request2.cancel();
                    callback.onCancelled(request2);
                } catch (ExecutionException e2) {
                    if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                        callback.onFailed(request2, 6, String.valueOf(e2));
                        return;
                    }
                    HttpException httpException = (HttpException) e2.getCause();
                    callback.onFailed(request2, httpException.getCode(), httpException.getMsg());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occured while executing http request", th);
                }
            }
        };
        this.b.execute(futureTask);
        return futureTask;
    }

    public HttpWorker generateWorker(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpWorker) ipChange.ipc$dispatch("b785281e", new Object[]{this, httpUrlRequest}) : new HttpWorker(this, httpUrlRequest);
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("4672debe", new Object[]{this}) : this.c;
    }

    public void addDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab683011", new Object[]{this, new Long(j)});
        } else {
            this.d += j;
        }
    }

    public void addConnectTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a5167", new Object[]{this, new Long(j)});
            return;
        }
        this.e += j;
        this.g++;
    }

    public void addSocketTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623635c", new Object[]{this, new Long(j)});
        } else {
            this.f += j;
        }
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue();
        }
        long j = this.f;
        if (j != 0) {
            return ((this.d * 1000) / j) >> 10;
        }
        return 0L;
    }

    public long getAverageConnectTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b2aeeb", new Object[]{this})).longValue();
        }
        int i = this.g;
        if (i != 0) {
            return this.e / i;
        }
        return 0L;
    }

    public String dumpPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5581c", new Object[]{this});
        }
        return String.format("HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.b.getActiveCount()), Long.valueOf(this.b.getCompletedTaskCount()), Long.valueOf(this.b.getTaskCount()), Long.valueOf(getAverageSpeed()), Long.valueOf(getAverageConnectTime()), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Integer.valueOf(this.g));
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.b;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
            this.b = null;
        }
        AndroidHttpClient androidHttpClient = this.c;
        if (androidHttpClient != null) {
            androidHttpClient.close();
        }
        this.c = null;
    }
}
