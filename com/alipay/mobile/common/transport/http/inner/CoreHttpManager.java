package com.alipay.mobile.common.transport.http.inner;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.concurrent.TaskExecutorManager;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.download.DownloadRequest;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.h5.H5HttpUrlRequest;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpTask;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsInitRunnable;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.APNetworkStartupUtil;
import com.alipay.mobile.common.transport.utils.AppStartNetWorkingHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Security;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;
import tb.riy;

/* loaded from: classes3.dex */
public class CoreHttpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static CoreHttpManager DEFAULT_HTTP_MANAGER = null;
    public static final String TAG = "HttpManager";

    /* renamed from: a  reason: collision with root package name */
    private AndroidHttpClient f5571a;
    private AndroidHttpClient b;
    private AndroidHttpClient c;
    private AndroidHttpClient d;
    private TaskExecutorManager e;
    private CountDownLatch f = new CountDownLatch(1);
    private long g;
    private long h;
    private long i;
    private int j;
    public Context mContext;

    public static /* synthetic */ void access$000(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f733c570", new Object[]{coreHttpManager});
        } else {
            coreHttpManager.c();
        }
    }

    public static /* synthetic */ void access$100(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3014260f", new Object[]{coreHttpManager});
        } else {
            coreHttpManager.b();
        }
    }

    public static /* synthetic */ void access$200(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f486ae", new Object[]{coreHttpManager});
        } else {
            coreHttpManager.d();
        }
    }

    public static /* synthetic */ CountDownLatch access$300(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("84dcd7b3", new Object[]{coreHttpManager}) : coreHttpManager.f;
    }

    public static final CoreHttpManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoreHttpManager) ipChange.ipc$dispatch("a2ad316d", new Object[]{context});
        }
        CoreHttpManager coreHttpManager = DEFAULT_HTTP_MANAGER;
        if (coreHttpManager != null) {
            return coreHttpManager;
        }
        synchronized (CoreHttpManager.class) {
            if (DEFAULT_HTTP_MANAGER != null) {
                return DEFAULT_HTTP_MANAGER;
            }
            DEFAULT_HTTP_MANAGER = new CoreHttpManager(context);
            return DEFAULT_HTTP_MANAGER;
        }
    }

    private CoreHttpManager(Context context) {
        this.mContext = context;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LogCatUtil.info("HttpManager", "Transport start init ..");
        TransportEnvUtil.setContext(this.mContext);
        e();
        f();
        getHttpClient();
        APNetworkStartupUtil.notifyNetworkStartupListener();
        this.e = TaskExecutorManager.getInstance(this.mContext);
        NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transport.http.inner.CoreHttpManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    HttpContextExtend.createInstance(CoreHttpManager.this.mContext);
                    NwSharedSwitchUtil.init();
                    CoreHttpManager.access$000(CoreHttpManager.this);
                    CoreHttpManager.access$100(CoreHttpManager.this);
                    CoreHttpManager.access$200(CoreHttpManager.this);
                    CoreHttpManager.this.notifyFirstTunnelChanged();
                    LogCatUtil.info("HttpManager", "Transport async init finish.");
                } catch (Throwable th) {
                    LogCatUtil.error("HttpManager", "Network init very serious error. ", th);
                }
                try {
                    CoreHttpManager.access$300(CoreHttpManager.this).countDown();
                } catch (Throwable th2) {
                    LogCatUtil.warn("HttpManager", "countDown exception. " + th2.toString());
                }
            }
        });
        LogCatUtil.info("HttpManager", "Transport init finish.");
    }

    public void notifyFirstTunnelChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde58d8c", new Object[]{this});
        } else if ((MiscUtils.isInAlipayClient(this.mContext) || TransportStrategy.isEnabledEnhanceNetworkModule()) && MiscUtils.isPushProcess(this.mContext)) {
        } else {
            NetworkTunnelStrategy.getInstance().notifyFirstTunnelChanged();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            AppStartNetWorkingHelper.runOnAppStart(new AlipayHttpDnsInitRunnable(this.mContext, DnsUtil.getFlag(this.mContext)), this.mContext);
        } catch (Exception e) {
            LogCatUtil.warn("HttpManager", "runOnAppStart exception : " + e.toString());
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.mContext == null) {
            LogCatUtil.error("HttpManager", "initConfigWithStrategy. mContext is null.");
        } else {
            TransportConfigureManager.getInstance().firstUpdateConfig(this.mContext);
            NetworkTunnelStrategy.getInstance().init(this.mContext, HttpContextExtend.getInstance().getDid());
            TransportStrategy.init();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ExtTransportOffice extTransportOffice = ExtTransportOffice.getInstance();
        extTransportOffice.setContext(this.mContext);
        if (!extTransportOffice.isEnableExtTransport(this.mContext) || MiscUtils.isPushProcess(this.mContext)) {
            return;
        }
        extTransportOffice.init(this.mContext);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            Security.setProperty("networkaddress.cache.ttl", String.valueOf(-1));
        }
    }

    public Future<Response> execute(HttpManager httpManager, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("3ce5de1d", new Object[]{this, httpManager, request});
        }
        if (!(request instanceof HttpUrlRequest)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request not instanceof HttpUrlRequest. request=[");
            sb.append(request != null ? request.getClass().getName() : " is null. ");
            sb.append(riy.ARRAY_END_STR);
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            if (this.f.getCount() == 1) {
                LogCatUtil.info("HttpManager", "waiting for transport init complete!");
            }
            this.f.await();
        } catch (InterruptedException e) {
            LogCatUtil.warn("HttpManager", "countDownLatch await exception. " + e.toString());
        }
        if (MiscUtils.isDebugger(this.mContext)) {
            LogCatUtil.info("HttpManager", dumpPerf(httpManager.getClass().getSimpleName()));
        }
        HttpUrlRequest httpUrlRequest = (HttpUrlRequest) request;
        return this.e.execute(createTask(httpManager.generateWorker(httpUrlRequest), a(httpUrlRequest)));
    }

    private int a(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f1e978f", new Object[]{this, httpUrlRequest})).intValue();
        }
        if (c(httpUrlRequest)) {
            return 4;
        }
        String tag = httpUrlRequest.getTag("operationType");
        if (TextUtils.equals(tag, DownloadRequest.OPERATION_TYPE)) {
            try {
                URL url = new URL(httpUrlRequest.getUrl());
                if (!url.getPath().endsWith(".amr") && !url.getPath().endsWith(".jar")) {
                    return 2;
                }
                return ((DownloadRequest) httpUrlRequest).isUrgentResource() ? 8 : 3;
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else if (TextUtils.equals(tag, H5HttpUrlRequest.OPERATION_TYPE)) {
            return 6;
        } else {
            return b(httpUrlRequest) ? 1 : 0;
        }
    }

    private boolean b(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9943821", new Object[]{this, httpUrlRequest})).booleanValue();
        }
        String tag = httpUrlRequest.getTag("operationType");
        if (TextUtils.isEmpty(tag)) {
            return true;
        }
        if (httpUrlRequest.isBgRpc()) {
            LogCatUtil.debug("BgRpc", "Background RPC： " + tag);
            return true;
        } else if (!MiscUtils.isBgRpc(tag)) {
            return false;
        } else {
            httpUrlRequest.setBgRpc(true);
            LogCatUtil.warn("BgRpc", "Warning: Force bg RPC :" + tag);
            return true;
        }
    }

    private boolean c(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409d8a2", new Object[]{this, httpUrlRequest})).booleanValue();
        }
        boolean urgentFlag = httpUrlRequest.getUrgentFlag();
        if (urgentFlag) {
            LogCatUtil.debug("HttpManager", "Request is Urgent RPC: " + urgentFlag);
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.USE_URGENT_RPC_POOL);
        if (!TextUtils.isEmpty(stringValue) && stringValue.startsWith("T")) {
            return urgentFlag;
        }
        return false;
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("909d0b72", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.f5571a;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            if (this.f5571a != null) {
                return this.f5571a;
            }
            if (this.f5571a == null) {
                this.f5571a = AndroidHttpClient.newDefaultInstance();
            }
            return this.f5571a;
        }
    }

    public AndroidHttpClient getH5HttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("9bf4f1df", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.b;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.b == null) {
                this.b = AndroidHttpClient.newDefaultInstance();
            }
            return this.b;
        }
    }

    public AndroidHttpClient getDjgHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("3be7a487", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.c;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            if (this.c == null) {
                this.c = AndroidHttpClient.newInstanceOfBigConn("Android_MWallet_DJango");
            }
            return this.c;
        }
    }

    public AndroidHttpClient getLogHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("5d8dd82a", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.d;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            if (this.d != null) {
                return this.d;
            }
            if (this.d == null) {
                this.d = AndroidHttpClient.newDefaultInstance();
            }
            return this.d;
        }
    }

    public void addDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab683011", new Object[]{this, new Long(j)});
        } else {
            this.g += j;
        }
    }

    public void addConnectTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a5167", new Object[]{this, new Long(j)});
            return;
        }
        this.h += j;
        this.j++;
    }

    public void addSocketTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623635c", new Object[]{this, new Long(j)});
        } else {
            this.i += j;
        }
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue();
        }
        long j = this.i;
        if (j != 0) {
            return ((this.g * 1000) / j) >> 10;
        }
        return 0L;
    }

    public long getAverageConnectTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b2aeeb", new Object[]{this})).longValue();
        }
        int i = this.j;
        if (i != 0) {
            return this.h / i;
        }
        return 0L;
    }

    public String dumpPerf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1785492", new Object[]{this, str});
        }
        try {
            return String.format(str + "#" + hashCode() + ": Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Long.valueOf(getAverageSpeed()), Long.valueOf(getAverageConnectTime()), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Integer.valueOf(this.j));
        } catch (Exception unused) {
            LogCatUtil.warn("HttpManager", "dumpPerf exception");
            return "";
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.e.closeAllSingleThreadPool();
        AndroidHttpClient androidHttpClient = this.f5571a;
        if (androidHttpClient == null) {
            return;
        }
        androidHttpClient.close();
        this.f5571a = null;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    public void setH5HttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345d98c9", new Object[]{this, androidHttpClient});
            return;
        }
        synchronized (this) {
            this.b = androidHttpClient;
        }
    }

    public void setHttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1befe96", new Object[]{this, androidHttpClient});
        } else {
            this.f5571a = androidHttpClient;
        }
    }

    public void setDjgHttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9c02b9", new Object[]{this, androidHttpClient});
        } else {
            this.c = androidHttpClient;
        }
    }

    public HttpTask createTask(HttpWorker httpWorker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpTask) ipChange.ipc$dispatch("b631b260", new Object[]{this, httpWorker, new Integer(i)}) : new HttpTask(httpWorker, i);
    }
}
