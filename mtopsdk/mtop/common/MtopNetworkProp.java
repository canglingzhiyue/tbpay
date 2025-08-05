package mtopsdk.mtop.common;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.global.SwitchConfig;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class MtopNetworkProp implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -3528337805304245196L;
    public String accessToken;
    public ApiTypeEnum apiType;
    public String authCode;
    public boolean backGround;
    @Deprecated
    public int bizId;
    public String bizIdStr;
    public String bizTopic;
    public String clientTraceId;
    public String customDailyDomain;
    public String customDomain;
    public String customOnlineDomain;
    public String customPreDomain;
    public boolean enableProgressListener;
    public String falcoId;
    public String fullTraceId;
    public Handler handler;
    public boolean isInnerOpen;
    public boolean isLoginTimeout;
    public boolean isTimeoutEnable;
    public long loginTime;
    public String miniAppKey;
    public int netParam;
    public String openBiz;
    public String openBizData;
    public Map<String, String> openTraceContext;
    public String pTraceId;
    public int pageIndex;
    public String pageName;
    public String pageUrl;
    public String placeId;
    public boolean priorityFlag;
    public Map<String, String> queryParameterMap;
    public String reqAppKey;
    public String reqBizExt;
    public int reqSource;
    public String reqUserId;
    public Map<String, String> requestHeaders;
    public String requestSourceAppKey;
    public String routerId;
    public boolean streamMode;
    public String ttid;
    public ProtocolEnum protocol = ProtocolEnum.HTTPSECURE;
    public MethodEnum method = MethodEnum.GET;
    public boolean allowSwitchToPOST = false;
    public boolean autoRedirect = true;
    public int retryTimes = 1;
    public boolean timeCalibrated = false;
    public boolean useCache = false;
    public boolean forceRefreshCache = false;
    public boolean skipCacheCallback = false;
    public List<String> cacheKeyBlackList = null;
    public int wuaFlag = -1;
    public boolean wuaRetry = false;
    public String openAppKey = "DEFAULT_AUTH";
    public int connTimeout = 0;
    public int socketTimeout = 0;
    public int streamFirstStageReadTimeMills = 0;
    public int streamSubStageReadTimeMills = 0;
    public EnvModeEnum envMode = EnvModeEnum.ONLINE;
    public String userInfo = "DEFAULT";
    public Object reqContext = null;
    public Map<String, String> priorityData = null;

    static {
        kge.a(1193158799);
        kge.a(1028243835);
    }

    @Deprecated
    public ProtocolEnum getProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtocolEnum) ipChange.ipc$dispatch("f3c3b4d6", new Object[]{this});
        }
        if (!SwitchConfig.getInstance().isGlobalSpdySslSwitchOpen()) {
            return ProtocolEnum.HTTP;
        }
        return this.protocol;
    }

    @Deprecated
    public void setProtocol(ProtocolEnum protocolEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7500f096", new Object[]{this, protocolEnum});
        } else if (protocolEnum == null) {
        } else {
            this.protocol = protocolEnum;
        }
    }

    @Deprecated
    public MethodEnum getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this}) : this.method;
    }

    @Deprecated
    public void setMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550a2236", new Object[]{this, methodEnum});
        } else if (methodEnum == null) {
        } else {
            this.method = methodEnum;
        }
    }

    @Deprecated
    public Map<String, String> getRequestHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a1965029", new Object[]{this}) : this.requestHeaders;
    }

    @Deprecated
    public void setRequestHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec0085", new Object[]{this, map});
        } else {
            this.requestHeaders = map;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("MtopNetworkProp [ protocol=");
        sb.append(this.protocol);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", envMode=");
        sb.append(this.envMode);
        sb.append(", autoRedirect=");
        sb.append(this.autoRedirect);
        sb.append(", retryTimes=");
        sb.append(this.retryTimes);
        sb.append(", requestHeaders=");
        sb.append(this.requestHeaders);
        sb.append(", timeCalibrated=");
        sb.append(this.timeCalibrated);
        sb.append(", ttid=");
        sb.append(this.ttid);
        sb.append(", useCache=");
        sb.append(this.useCache);
        sb.append(", forceRefreshCache=");
        sb.append(this.forceRefreshCache);
        sb.append(", cacheKeyBlackList=");
        sb.append(this.cacheKeyBlackList);
        if (this.apiType != null) {
            sb.append(", apiType=");
            sb.append(this.apiType.getApiType());
            sb.append(", openAppKey=");
            sb.append(this.openAppKey);
            sb.append(", accessToken=");
            sb.append(this.accessToken);
        }
        sb.append(", queryParameterMap=");
        sb.append(this.queryParameterMap);
        sb.append(", connTimeout=");
        sb.append(this.connTimeout);
        sb.append(", socketTimeout=");
        sb.append(this.socketTimeout);
        sb.append(", bizId=");
        sb.append(this.bizIdStr);
        sb.append(", pTraceId=");
        sb.append(this.pTraceId);
        sb.append(", reqBizExt=");
        sb.append(this.reqBizExt);
        sb.append(", reqUserId=");
        sb.append(this.reqUserId);
        sb.append(", reqAppKey=");
        sb.append(this.reqAppKey);
        sb.append(", authCode=");
        sb.append(this.authCode);
        sb.append(", clientTraceId =");
        sb.append(this.clientTraceId);
        sb.append(", netParam=");
        sb.append(this.netParam);
        sb.append(", reqSource=");
        sb.append(this.reqSource);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
