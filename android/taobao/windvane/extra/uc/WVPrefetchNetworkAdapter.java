package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.cache.e;
import android.taobao.windvane.config.j;
import android.taobao.windvane.monitor.a;
import android.taobao.windvane.util.m;
import anetwork.channel.Network;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public class WVPrefetchNetworkAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_TYPE_DEGRADABLE_NETWORK = 2;
    public static final int NETWORK_TYPE_HTTP_NETWORK = 0;
    public static final int NETWORK_TYPE_SPDY_NETWORK = 1;
    public static final int STATE_ADDED = 3;
    public static final int STATE_FAILED = 4;
    public static final int STATE_RECEIVED = 2;
    public static final int STATE_STARTED = 1;
    public static final int STATE_TIMEOUT = 5;
    private static final String TAG = "WVPrefetchNetworkAdapter";
    private Network mAliNetwork;
    private Context mContext;
    private int mNetworkType;
    private Request request;
    private long timeout;
    private String urlString;
    private int state = 0;
    private long startTime = System.currentTimeMillis();

    static {
        kge.a(262144117);
    }

    public static /* synthetic */ Request access$000(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("f30450af", new Object[]{wVPrefetchNetworkAdapter}) : wVPrefetchNetworkAdapter.request;
    }

    public static /* synthetic */ Network access$100(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Network) ipChange.ipc$dispatch("1ee965b1", new Object[]{wVPrefetchNetworkAdapter}) : wVPrefetchNetworkAdapter.mAliNetwork;
    }

    public static /* synthetic */ String access$200(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c69e0ad", new Object[]{wVPrefetchNetworkAdapter}) : wVPrefetchNetworkAdapter.urlString;
    }

    public static /* synthetic */ int access$300(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("afb06c65", new Object[]{wVPrefetchNetworkAdapter})).intValue() : wVPrefetchNetworkAdapter.mNetworkType;
    }

    public WVPrefetchNetworkAdapter(Context context, int i, long j, Request request) {
        this.mNetworkType = -1;
        this.timeout = -1L;
        this.mContext = context;
        this.mNetworkType = i;
        this.timeout = j;
        this.request = request;
        this.urlString = request.getUrlString();
        int i2 = this.mNetworkType;
        if (i2 == 0) {
            this.mAliNetwork = new HttpNetwork(context);
        } else if (i2 != 1 && i2 != 2) {
        } else {
            this.mAliNetwork = new DegradableNetwork(context);
        }
    }

    /* loaded from: classes2.dex */
    public class CallableThread implements Callable<Response> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1675336431);
            kge.a(-119797776);
        }

        public CallableThread() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Response mo69call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Response) ipChange.ipc$dispatch("9ebc4f27", new Object[]{this});
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Response syncSend = WVPrefetchNetworkAdapter.access$100(WVPrefetchNetworkAdapter.this).syncSend(WVPrefetchNetworkAdapter.access$000(WVPrefetchNetworkAdapter.this), null);
                a.init();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String access$200 = WVPrefetchNetworkAdapter.access$200(WVPrefetchNetworkAdapter.this);
                StringBuilder sb = new StringBuilder();
                sb.append(WVPrefetchNetworkAdapter.access$300(WVPrefetchNetworkAdapter.this) == 0 ? "short" : "long");
                sb.append(" netTime");
                a.commitPreloadMainHtmlInfo(access$200, currentTimeMillis2, sb.toString());
                m.e(WVPrefetchNetworkAdapter.TAG, "WVPrefetch netTime=" + currentTimeMillis2);
                return syncSend;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    public boolean sendRequest() {
        Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fa6eaf2", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            this.state = 1;
            m.b(TAG, "url=" + this.request.getUrlString());
            FutureTask futureTask = new FutureTask(new CallableThread());
            new Thread(futureTask, TAG).start();
            try {
                j.a();
                response = (Response) futureTask.get(j.commonConfig.aG, TimeUnit.MILLISECONDS);
                m.b(TAG, "response get success:" + response);
            } catch (Exception e) {
                m.e(TAG, "task.get error");
                e.printStackTrace();
                response = null;
            }
            if (response == null) {
                this.state = 5;
                return false;
            }
            this.state = 2;
            Throwable error = response.getError();
            if (error != null) {
                this.state = 4;
                m.e(TAG, " failed " + error);
            } else {
                int statusCode = response.getStatusCode();
                m.b(TAG, "status code=" + statusCode);
                if (statusCode >= 0 && statusCode != 301 && statusCode != 302 && statusCode != 303 && statusCode != 307) {
                    long j = 0;
                    if (response.getStatisticData() != null) {
                        j = response.getStatisticData().oneWayTime_ANet;
                    }
                    long j2 = j;
                    byte[] bytedata = response.getBytedata();
                    if (bytedata != null && bytedata.length > 0) {
                        e.a().a(this.request.getUrlString(), response.getConnHeadFields(), bytedata, this.timeout, j2);
                        this.state = 3;
                    }
                }
                m.b(TAG, BaseFBPlugin.VERIFY_STATUS.abort);
            }
            return true;
        }
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue() : this.state;
    }

    public String getUrlString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bb9898f", new Object[]{this}) : this.urlString;
    }

    public long getStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : this.startTime;
    }
}
