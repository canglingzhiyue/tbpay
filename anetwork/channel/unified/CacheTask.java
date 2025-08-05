package anetwork.channel.unified;

import anet.channel.bytes.ByteArray;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.Arrays;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.kge;

/* loaded from: classes.dex */
public class CacheTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.CacheTask";
    private Cache cache;
    private volatile boolean isCanceled = false;
    private RequestContext rc;

    static {
        kge.a(496530652);
        kge.a(471853369);
    }

    public CacheTask(RequestContext requestContext, Cache cache) {
        this.rc = null;
        this.cache = null;
        this.rc = requestContext;
        this.cache = cache;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.isCanceled = true;
        this.rc.config.rs.ret = 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean equals;
        Cache.Entry entry;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.isCanceled) {
        } else {
            RequestStatistic requestStatistic = this.rc.config.rs;
            if (this.cache == null) {
                return;
            }
            String urlString = this.rc.config.getUrlString();
            Request awcnRequest = this.rc.config.getAwcnRequest();
            String str = awcnRequest.getHeaders().get(HttpConstant.CACHE_CONTROL);
            boolean equals2 = "no-store".equals(str);
            long currentTimeMillis = System.currentTimeMillis();
            if (equals2) {
                this.cache.remove(urlString);
                equals = false;
                entry = null;
            } else {
                equals = HttpHeaderConstant.NO_CACHE.equals(str);
                Cache.Entry entry2 = this.cache.get(urlString);
                if (ALog.isPrintLog(2)) {
                    String str2 = this.rc.seqNum;
                    Object[] objArr = new Object[8];
                    objArr[0] = "hit";
                    objArr[1] = Boolean.valueOf(entry2 != null);
                    objArr[2] = "cost";
                    objArr[3] = Long.valueOf(requestStatistic.cacheTime);
                    objArr[4] = a.ATOM_length;
                    objArr[5] = Integer.valueOf(entry2 != null ? entry2.data.length : 0);
                    objArr[6] = "key";
                    objArr[7] = urlString;
                    ALog.i(TAG, "read cache", str2, objArr);
                }
                entry = entry2;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            requestStatistic.cacheTime = currentTimeMillis2 - currentTimeMillis;
            if (entry != null && !equals && entry.isFresh()) {
                if (!this.rc.isDone.compareAndSet(false, true)) {
                    return;
                }
                this.rc.cancelTimeoutTask();
                requestStatistic.ret = 1;
                requestStatistic.statusCode = 200;
                requestStatistic.msg = "SUCCESS";
                requestStatistic.protocolType = "cache";
                requestStatistic.rspEnd = currentTimeMillis2;
                AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspRecvEnd", null);
                requestStatistic.processTime = currentTimeMillis2 - requestStatistic.start;
                if (ALog.isPrintLog(2)) {
                    ALog.i(TAG, "hit fresh cache", this.rc.seqNum, MonitorItemConstants.KEY_URL, this.rc.config.getHttpUrl().urlString());
                }
                if (entry.responseHeaders != null) {
                    entry.responseHeaders.put(HttpConstant.X_PROTOCOL, Arrays.asList(requestStatistic.protocolType));
                }
                this.rc.callback.onResponseCode(200, entry.responseHeaders);
                this.rc.callback.onDataReceiveSize(1, entry.data.length, ByteArray.wrap(entry.data));
                this.rc.callback.onFinish(new DefaultFinishEvent(200, "SUCCESS", awcnRequest));
            } else if (this.isCanceled) {
            } else {
                NetworkTask networkTask = new NetworkTask(this.rc, equals2 ? null : this.cache, entry);
                this.rc.runningTask = networkTask;
                networkTask.run();
            }
        }
    }
}
