package com.alipay.literpc.android.phone.mrpc.core;

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
    private static HttpManager b;
    private static final ThreadFactory i = new ThreadFactory() { // from class: com.alipay.literpc.android.phone.mrpc.core.HttpManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5293a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f5293a.getAndIncrement());
            thread.setPriority(4);
            return thread;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Context f5291a;
    private ThreadPoolExecutor c;
    private AndroidHttpClient d;
    private long e;
    private long f;
    private long g;
    private int h;

    public HttpManager(Context context) {
        this.f5291a = context;
        a();
    }

    public static final HttpManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpManager) ipChange.ipc$dispatch("1f3f3313", new Object[]{context});
        }
        HttpManager httpManager = b;
        return httpManager != null ? httpManager : a(context);
    }

    private static final synchronized HttpManager a(Context context) {
        synchronized (HttpManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpManager) ipChange.ipc$dispatch("b1e82a69", new Object[]{context});
            } else if (b != null) {
                return b;
            } else {
                HttpManager httpManager = new HttpManager(context);
                b = httpManager;
                return httpManager;
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d = AndroidHttpClient.newInstance("android");
        this.c = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), i, new ThreadPoolExecutor.CallerRunsPolicy());
        try {
            this.c.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f5291a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.Transport
    public Future<Response> execute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("7fddfcbb", new Object[]{this, request});
        }
        if (!(request instanceof HttpUrlRequest)) {
            throw new RuntimeException("request send error.");
        }
        if (MiscUtils.isDebugger(this.f5291a)) {
            dumpPerf();
        }
        FutureTask<Response> a2 = a(a((HttpUrlRequest) request));
        this.c.execute(a2);
        return a2;
    }

    private FutureTask<Response> a(final HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FutureTask) ipChange.ipc$dispatch("3e74f3b", new Object[]{this, httpWorker}) : new FutureTask<Response>(httpWorker) { // from class: com.alipay.literpc.android.phone.mrpc.core.HttpManager.1
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
                HttpUrlRequest request = httpWorker.getRequest();
                TransportCallback callback = request.getCallback();
                if (callback == null) {
                    super.done();
                    return;
                }
                try {
                    Response response = get();
                    if (!isCancelled() && !request.isCanceled()) {
                        if (response == null) {
                            return;
                        }
                        callback.onPostExecute(request, response);
                        return;
                    }
                    request.cancel();
                    if (!isCancelled() || !isDone()) {
                        cancel(false);
                    }
                    callback.onCancelled(request);
                } catch (InterruptedException e) {
                    callback.onFailed(request, 7, e + "");
                } catch (CancellationException unused) {
                    request.cancel();
                    callback.onCancelled(request);
                } catch (ExecutionException e2) {
                    if (e2.getCause() != null && (e2.getCause() instanceof HttpException)) {
                        HttpException httpException = (HttpException) e2.getCause();
                        callback.onFailed(request, httpException.getCode(), httpException.getMsg());
                        return;
                    }
                    callback.onFailed(request, 6, e2 + "");
                } catch (Throwable th) {
                    throw new RuntimeException("An error occured while executing http request", th);
                }
            }
        };
    }

    public HttpWorker a(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpWorker) ipChange.ipc$dispatch("a9f42ca", new Object[]{this, httpUrlRequest}) : new HttpWorker(this, httpUrlRequest);
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("3a43d37c", new Object[]{this}) : this.d;
    }

    public void addDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab683011", new Object[]{this, new Long(j)});
        } else {
            this.e += j;
        }
    }

    public void addConnectTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a5167", new Object[]{this, new Long(j)});
            return;
        }
        this.f += j;
        this.h++;
    }

    public void addSocketTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623635c", new Object[]{this, new Long(j)});
        } else {
            this.g += j;
        }
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue();
        }
        long j = this.g;
        if (j != 0) {
            return ((this.e * 1000) / j) >> 10;
        }
        return 0L;
    }

    public long getAverageConnectTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b2aeeb", new Object[]{this})).longValue();
        }
        int i2 = this.h;
        if (i2 != 0) {
            return this.f / i2;
        }
        return 0L;
    }

    public String dumpPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5581c", new Object[]{this});
        }
        return String.format("HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.c.getActiveCount()), Long.valueOf(this.c.getCompletedTaskCount()), Long.valueOf(this.c.getTaskCount()), Long.valueOf(getAverageSpeed()), Long.valueOf(getAverageConnectTime()), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h));
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.c;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
            this.c = null;
        }
        AndroidHttpClient androidHttpClient = this.d;
        if (androidHttpClient != null) {
            androidHttpClient.close();
        }
        this.d = null;
    }
}
