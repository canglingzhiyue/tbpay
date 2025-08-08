package android.taobao.windvane.extra.uc;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.a;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Header;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class AliRequestAdapter implements IRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PHASE_ENDDATA = "enddata";
    private static final String PHASE_NORMAL = "normal";
    public static final String PHASE_RELOAD = "reload";
    public static final String PHASE_STOP = "stop";
    public static int connectTimeout;
    public static int readTimeout;
    public static int retryTimes;
    private String bizCode;
    private Context mContext;
    private EventHandler mEventHandler;
    public Future<Response> mFutureResponse;
    private Map<String, String> mHeaders;
    private boolean mIsUCProxy;
    private boolean mIsUseWebP;
    private int mLoadType;
    private String mMethod;
    private int mRequestType;
    private Map<String, String> mUCHeaders;
    private Map<String, byte[]> mUploadDataMap;
    private Map<String, String> mUploadFileMap;
    private long mUploadFileTotalLen;
    private String mUrl;
    public String originalUrl;
    public String TAG = "alinetwork";
    private String mCurId = "";
    private String mParentId = "";
    private final Object mClientResource = new Object();
    private final ExtImgDecoder extImgDecoder = ExtImgDecoder.getInstance();
    public String cancelPhase = "normal";
    public Request mAliRequest = formatAliRequest();

    static {
        kge.a(45228288);
        kge.a(-2100482115);
        retryTimes = 1;
        connectTimeout = 10000;
        readTimeout = 10000;
    }

    public String getCurId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this}) : this.mCurId;
    }

    public void setCurId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d87160a", new Object[]{this, str});
        } else {
            this.mCurId = str;
        }
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this}) : this.mParentId;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
            return;
        }
        this.mParentId = str;
        this.mAliRequest.setExtProperty(RequestConstant.KEY_PARENT_TRACE_ID, str);
    }

    public AliRequestAdapter(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2, boolean z2, String str3, Context context) {
        this.mMethod = "GET";
        this.mIsUseWebP = z2;
        this.mEventHandler = eventHandler;
        this.mUrl = str;
        this.mMethod = str2;
        this.mIsUCProxy = z;
        this.mHeaders = map;
        this.mUCHeaders = map2;
        this.mUploadFileMap = map3;
        this.mUploadDataMap = map4;
        this.mUploadFileTotalLen = j;
        this.mRequestType = i;
        this.mLoadType = i2;
        this.bizCode = str3;
        Context context2 = context;
        this.mContext = !(context2 instanceof Application) ? context.getApplicationContext() : context2;
    }

    private Request formatAliRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("4b92ef15", new Object[]{this}) : formatAliRequest(this.mUrl, this.mMethod, this.mIsUCProxy, this.mHeaders, this.mUCHeaders, this.mUploadFileMap, this.mUploadDataMap, this.mUploadFileTotalLen, this.mRequestType, this.mLoadType, this.mIsUseWebP);
    }

    private boolean bizCodeLimit(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4d8be50", new Object[]{this, str})).booleanValue() : j.commonConfig.bz || str.contains("-yinhe.");
    }

    private Request formatAliRequest(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2, boolean z2) {
        String str3;
        String str4;
        String key;
        String justConvergeAndWebP;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("c74a03a3", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2), new Boolean(z2)});
        }
        try {
            this.originalUrl = null;
            boolean canExtImgDecoder = this.extImgDecoder.canExtImgDecoder();
            if (z2 && a.b(str)) {
                if (canExtImgDecoder && this.extImgDecoder.isExchangeImgUrlEnable() && bizCodeLimit(str)) {
                    if (j.commonConfig.bA) {
                        justConvergeAndWebP = ImageStrategyDecider.convergeAndHeif(str);
                    } else {
                        justConvergeAndWebP = ImageStrategyDecider.decideUrl(str, -1, -1, null);
                    }
                    m.a(this.TAG, " use heic decideUrl=" + justConvergeAndWebP);
                } else {
                    justConvergeAndWebP = ImageStrategyDecider.justConvergeAndWebP(str);
                    m.a(this.TAG, " use default decideUrl=" + justConvergeAndWebP);
                }
                if (!StringUtils.isEmpty(justConvergeAndWebP) && !justConvergeAndWebP.equals(str)) {
                    m.c(this.TAG, str + " decideUrl to : " + justConvergeAndWebP);
                    this.originalUrl = str;
                    str = justConvergeAndWebP;
                }
            }
            boolean z3 = j.commonConfig.cc;
            boolean z4 = j.commonConfig.cd;
            if ((z3 || z4) && canExtImgDecoder && shouldModifyAcceptHeader(str)) {
                m.e(this.TAG, "add heic accept " + str);
                if (map == null) {
                    map = new HashMap();
                }
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str3 = null;
                        str4 = null;
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (next != null && (key = next.getKey()) != null && key.equalsIgnoreCase("accept")) {
                        str3 = next.getValue();
                        str4 = next.getKey();
                        break;
                    }
                }
                if (StringUtils.isEmpty(str4)) {
                    str4 = HttpRequest.HEADER_ACCEPT;
                }
                if (z3) {
                    if (StringUtils.isEmpty(str3)) {
                        str3 = "image/heic";
                    } else {
                        str3 = "image/heic," + str3;
                    }
                }
                if (z4) {
                    if (StringUtils.isEmpty(str3)) {
                        str3 = "image/heia";
                    } else {
                        str3 = "image/heia," + str3;
                    }
                }
                map.put(str4, str3);
            }
        } catch (Throwable unused) {
        }
        Request createRequest = createRequest(str, str2, map);
        if (createRequest == null) {
            return null;
        }
        if (o.getPerformanceMonitor() != null) {
            o.getPerformanceMonitor().didResourceStartLoadAtTime(this.mUrl, System.currentTimeMillis());
        }
        return createRequest;
    }

    public Request createRequest(String str, String str2, List<Header> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("8f97e605", new Object[]{this, str, str2, list});
        }
        Request createRequest = createRequest(str, str2);
        if (createRequest == null) {
            return null;
        }
        if (list != null) {
            createRequest.setHeaders(list);
        }
        return createRequest;
    }

    private Request createRequest(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("6ce155d6", new Object[]{this, str, str2});
        }
        try {
            RequestImpl requestImpl = new RequestImpl(str);
            requestImpl.setFollowRedirects(false);
            requestImpl.setBizId(this.bizCode);
            requestImpl.setRetryTime(retryTimes);
            requestImpl.setConnectTimeout(connectTimeout);
            requestImpl.setReadTimeout(readTimeout);
            requestImpl.setCookieEnabled(WVUCWebView.isNeedCookie(str));
            requestImpl.setMethod(str2);
            return requestImpl;
        } catch (Exception e) {
            String str3 = this.TAG;
            m.e(str3, " AliRequestAdapter formatAliRequest Exception" + e.getMessage());
            return null;
        }
    }

    public Request createRequest(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("b2210a4d", new Object[]{this, str, str2, map});
        }
        Request createRequest = createRequest(str, str2);
        if (createRequest == null) {
            return null;
        }
        if (map != null) {
            createRequest.addHeader("f-refer", "wv_h5");
            UCNetworkDelegate.getInstance().onSendRequest(map, str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                createRequest.addHeader(key, value);
                String str3 = this.TAG;
                m.b(str3, "AliRequestAdapter from uc header key=" + key + ",value=" + value);
            }
        }
        return createRequest;
    }

    public void setFutureResponse(Future<Response> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc7f4d9", new Object[]{this, future});
        } else {
            this.mFutureResponse = future;
        }
    }

    public void complete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77d7140", new Object[]{this});
            return;
        }
        WVUCWebView.isStop = false;
        if (!this.mEventHandler.isSynchronous()) {
            return;
        }
        synchronized (this.mClientResource) {
            m.b(this.TAG, "AliRequestAdapter complete will notify");
            this.mClientResource.notifyAll();
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        if (WVUCWebView.isStop) {
            this.cancelPhase = "stop";
        }
        String str = this.TAG;
        m.e(str, "cancel id= " + this.mEventHandler.hashCode() + ", phase:[" + this.cancelPhase + riy.ARRAY_END_STR);
        try {
            if (m.a() && this.mFutureResponse != null && this.mFutureResponse.get() != null) {
                String str2 = this.TAG;
                m.b(str2, "AliRequestAdapter cancel desc url=" + this.mFutureResponse.get().getDesc());
            }
            complete();
        } catch (InterruptedException e) {
            e.printStackTrace();
            String str3 = this.TAG;
            m.b(str3, "AliRequestAdapter cancel =" + e.getMessage());
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            String str4 = this.TAG;
            m.b(str4, "AliRequestAdapter cancel =" + e2.getMessage());
        }
        Future<Response> future = this.mFutureResponse;
        if (future == null) {
            return;
        }
        future.cancel(true);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void setEventHandler(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cc001", new Object[]{this, eventHandler});
        } else {
            this.mEventHandler = eventHandler;
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public EventHandler getEventHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventHandler) ipChange.ipc$dispatch("ccb6ed91", new Object[]{this}) : this.mEventHandler;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : this.mHeaders;
    }

    public Request getAliRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("1a01dad6", new Object[]{this}) : this.mAliRequest;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.mUrl;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.mMethod;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, String> getUploadFileMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("96766785", new Object[]{this}) : this.mUploadFileMap;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, byte[]> getUploadDataMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e57f3617", new Object[]{this}) : this.mUploadDataMap;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public long getUploadFileTotalLen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6542f2df", new Object[]{this})).longValue() : this.mUploadFileTotalLen;
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        this.bizCode = str;
        Request request = this.mAliRequest;
        if (request == null) {
            return;
        }
        request.setBizId(str);
    }

    private static boolean shouldModifyAcceptHeader(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f122c3b7", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.contains("/O1CN")) {
            return true;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (!StringUtils.equals("gw.alicdn.com", host)) {
                    if (StringUtils.equals("img.alicdn.com", host)) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
