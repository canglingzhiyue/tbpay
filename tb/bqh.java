package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.arc;

/* loaded from: classes2.dex */
public class bqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(707921553);
    }

    public static MtopRequest a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("f69096f6", new Object[]{aURANextRPCEndpoint});
        }
        MtopRequest mtopRequest = new MtopRequest();
        String api = aURANextRPCEndpoint.getApi();
        String version = aURANextRPCEndpoint.getVersion();
        mtopRequest.setApiName(api);
        mtopRequest.setVersion(version);
        Map<String, String> dataParams = aURANextRPCEndpoint.getDataParams();
        if (dataParams != null) {
            mtopRequest.dataParams = dataParams;
            mtopRequest.setData(JSON.toJSONString(dataParams));
        }
        mtopRequest.setNeedEcode(aURANextRPCEndpoint.isNeedEncode());
        mtopRequest.setNeedSession(aURANextRPCEndpoint.isNeedSession());
        return mtopRequest;
    }

    public static MtopBusiness a(MtopRequest mtopRequest, AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("643668fe", new Object[]{mtopRequest, aURANextRPCEndpoint});
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        a(build, aURANextRPCEndpoint);
        return build;
    }

    private static void a(MtopBusiness mtopBusiness, AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b670dfa9", new Object[]{mtopBusiness, aURANextRPCEndpoint});
            return;
        }
        mtopBusiness.mo1305reqMethod(aURANextRPCEndpoint.isPostMethod() ? MethodEnum.POST : MethodEnum.GET);
        if (aURANextRPCEndpoint.isNeedEncode()) {
            mtopBusiness.mo1335useWua();
        }
        int bizId = aURANextRPCEndpoint.getBizId();
        if (bizId != -1) {
            mtopBusiness.mo1340setBizId(bizId);
        }
        String unitStrategy = aURANextRPCEndpoint.getUnitStrategy();
        if (!StringUtils.isEmpty(unitStrategy)) {
            mtopBusiness.mo1328setUnitStrategy(unitStrategy);
        }
        String ttid = aURANextRPCEndpoint.getTtid();
        if (!StringUtils.isEmpty(ttid)) {
            mtopBusiness.mo1332ttid(ttid);
        }
        int timeout = aURANextRPCEndpoint.getTimeout();
        if (timeout > 0) {
            mtopBusiness.mo1312setConnectionTimeoutMilliSecond(timeout);
        }
        int socketTimeoutMilliSecond = aURANextRPCEndpoint.getSocketTimeoutMilliSecond();
        if (socketTimeoutMilliSecond > 0) {
            mtopBusiness.mo1326setSocketTimeoutMilliSecond(socketTimeoutMilliSecond);
        }
        String pageUrl = aURANextRPCEndpoint.getPageUrl();
        if (!StringUtils.isEmpty(pageUrl)) {
            mtopBusiness.mo1321setPageUrl(pageUrl);
        }
        Map<String, String> requestHeaders = aURANextRPCEndpoint.getRequestHeaders();
        if (requestHeaders != null) {
            mtopBusiness.mo1297headers(requestHeaders);
        }
        int retryTime = aURANextRPCEndpoint.getRetryTime();
        if (retryTime == 1 || retryTime == 0) {
            mtopBusiness.mo1339retryTime(retryTime);
        }
        String topic = aURANextRPCEndpoint.getTopic();
        if (!StringUtils.isEmpty(topic)) {
            mtopBusiness.mo1310setBizTopic(topic);
        }
        if (aURANextRPCEndpoint.getPrefetchMode() == 1) {
            mtopBusiness.mo1302prefetchMode(aURANextRPCEndpoint.getPrefetchMode());
        }
        MtopPrefetch.IPrefetchComparator prefetchComparator = aURANextRPCEndpoint.getPrefetchComparator();
        if (prefetchComparator != null) {
            mtopBusiness.mo1301prefetchComparator(prefetchComparator);
        }
        b(mtopBusiness, aURANextRPCEndpoint);
    }

    private static void b(MtopBusiness mtopBusiness, AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e9f1aa", new Object[]{mtopBusiness, aURANextRPCEndpoint});
            return;
        }
        arc.a().a(aURANextRPCEndpoint.useMainThread() ? "UI" : "非UI线程进行网络请求", arc.a.a().a("AURA/performance").b());
        if (aURANextRPCEndpoint.useMainThread()) {
            return;
        }
        mtopBusiness.mo1296handler(bbh.c());
    }
}
