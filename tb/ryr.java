package tb;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.Header;
import anetwork.channel.Request;
import anetwork.channel.entity.BasicHeader;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.statist.StatisticData;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.network.domain.NetworkStats;
import mtopsdk.network.domain.ParcelableRequestBodyImpl;
import mtopsdk.network.impl.ParcelableRequestBodyEntry;

/* loaded from: classes.dex */
public final class ryr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(632409572);
    }

    public static List<Header> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{map});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null && StringUtils.isNotBlank(entry.getKey())) {
                arrayList.add(new BasicHeader(entry.getKey(), entry.getValue()));
            }
        }
        return arrayList;
    }

    public static Request a(mtopsdk.network.domain.Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("a24a944f", new Object[]{request});
        }
        RequestImpl requestImpl = new RequestImpl(request.f25005a);
        requestImpl.setSeqNo(request.e);
        requestImpl.setRetryTime(request.j);
        requestImpl.setConnectTimeout(request.f);
        requestImpl.setReadTimeout(request.g);
        if (!StringUtils.isEmpty(request.l)) {
            requestImpl.setBizId(request.l);
        } else {
            requestImpl.setBizId(request.k);
        }
        if (!StringUtils.isEmpty(request.B)) {
            requestImpl.setExtProperty("biz-topic", request.B);
        }
        requestImpl.setExtProperty(RequestConstant.KEY_PARENT_TRACE_ID, request.n);
        requestImpl.setMethod(request.b);
        requestImpl.setHeaders(a(request.c));
        requestImpl.setExtProperty(RequestConstant.APPKEY, request.m);
        requestImpl.setExtProperty(RequestConstant.AUTH_CODE, request.o);
        requestImpl.setFollowRedirects(request.u);
        if (!StringUtils.isEmpty(request.s)) {
            requestImpl.setExtProperty(RequestConstant.KEY_TRACE_ID, request.s);
        }
        if (request.t != null && !request.t.isEmpty()) {
            requestImpl.setTraceContext(request.t);
        }
        if (request.v) {
            requestImpl.setExtProperty("zstd", "enable");
        }
        if (request.A) {
            requestImpl.setExtProperty("zstd-d", "enable");
        }
        if (request.z) {
            requestImpl.setExtProperty(RequestConstant.UPLINK_ENCODE, "enable");
        }
        if (request.x && SwitchConfig.getInstance().isStreamJsonEnable()) {
            requestImpl.setExtProperty(HttpConstant.STREAMING_PARSER, "open");
        }
        if (request.C) {
            requestImpl.setExtProperty(RequestConstant.ENABLE_COOKIE, "false");
        }
        int i = request.p;
        if (i == 0) {
            requestImpl.setExtProperty(RequestConstant.ENVIRONMENT, "online");
        } else if (i == 1) {
            requestImpl.setExtProperty(RequestConstant.ENVIRONMENT, "pre");
        } else if (i == 2) {
            requestImpl.setExtProperty(RequestConstant.ENVIRONMENT, "test");
        }
        if ("POST".equalsIgnoreCase(request.b)) {
            ParcelableRequestBodyImpl parcelableRequestBodyImpl = (ParcelableRequestBodyImpl) request.d;
            requestImpl.setBodyEntry(new ParcelableRequestBodyEntry(parcelableRequestBodyImpl));
            requestImpl.addHeader("Content-Type", parcelableRequestBodyImpl.contentType());
            long contentLength = parcelableRequestBodyImpl.contentLength();
            if (contentLength > 0) {
                requestImpl.addHeader("Content-Length", String.valueOf(contentLength));
            }
        }
        return requestImpl;
    }

    public static NetworkStats a(StatisticData statisticData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStats) ipChange.ipc$dispatch("cde23f97", new Object[]{statisticData});
        }
        if (statisticData == null) {
            return null;
        }
        NetworkStats networkStats = new NetworkStats();
        networkStats.resultCode = statisticData.resultCode;
        networkStats.isRequestSuccess = statisticData.isRequestSuccess;
        networkStats.host = statisticData.host;
        networkStats.ip_port = statisticData.ip_port;
        networkStats.connectionType = statisticData.connectionType;
        networkStats.isSSL = statisticData.isSSL;
        networkStats.oneWayTime_ANet = statisticData.oneWayTime_ANet;
        networkStats.processTime = statisticData.processTime;
        networkStats.firstDataTime = statisticData.firstDataTime;
        networkStats.sendWaitTime = statisticData.sendBeforeTime;
        networkStats.recDataTime = statisticData.recDataTime;
        networkStats.sendSize = statisticData.sendSize;
        networkStats.recvSize = statisticData.totalSize;
        networkStats.serverRT = statisticData.serverRT;
        networkStats.dataSpeed = statisticData.dataSpeed;
        networkStats.retryTimes = statisticData.retryTime;
        return networkStats;
    }
}
