package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.performance2.WVWPData;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.taobao.windvane.monitor.f;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.a;
import android.taobao.windvane.util.e;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import mtopsdk.common.util.StringUtils;
import anet.channel.entity.ConnType;
import anet.channel.util.HttpConstant;
import anetwork.channel.Header;
import anetwork.channel.IBodyHandler;
import anetwork.channel.Network;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.b;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.ParseException;
import org.json.JSONException;
import org.json.JSONObject;
import tb.adk;
import tb.adl;
import tb.adm;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class AliNetworkAdapter implements INetwork, adm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGTAG = "AliNetwork";
    public static final int NETWORK_WORKING_MODE_ASYNC = 1;
    public static final int NETWORK_WORKING_MODE_SYNC = 0;
    private static String RVLOG_NETWORK_MODEL;
    private static boolean enableAir;
    private static IOnSgHttpRequestCallback iOnSgHttpRequestCallback;
    private int BUFFER_SIZE;
    private String bizCode;
    public boolean isReload;
    public boolean isStop;
    private boolean isUseWebpImg;
    private Network mAliNetwork;
    private Context mContext;
    private int mNetworkType;
    private int mWorkingMode;
    public HashSet<EventHandler> mainRequest;
    private String pid;
    private String uid;
    private WVUCWebView webView;

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public int getNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : "1.0";
    }

    public static /* synthetic */ WVUCWebView access$000(AliNetworkAdapter aliNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("c1792d92", new Object[]{aliNetworkAdapter}) : aliNetworkAdapter.webView;
    }

    public static /* synthetic */ void access$100(AliNetworkAdapter aliNetworkAdapter, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e8d294", new Object[]{aliNetworkAdapter, request});
        } else {
            aliNetworkAdapter.injectTraceContext(request);
        }
    }

    public static /* synthetic */ void access$200(AliNetworkAdapter aliNetworkAdapter, AliRequestAdapter aliRequestAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5448b36", new Object[]{aliNetworkAdapter, aliRequestAdapter});
        } else {
            aliNetworkAdapter.monitorRequest(aliRequestAdapter);
        }
    }

    public static /* synthetic */ void access$300(AliNetworkAdapter aliNetworkAdapter, AliRequestAdapter aliRequestAdapter, Request request, EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac5b9ad", new Object[]{aliNetworkAdapter, aliRequestAdapter, request, eventHandler});
        } else {
            aliNetworkAdapter.syncSendRequest(aliRequestAdapter, request, eventHandler);
        }
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60292585", new Object[0]) : RVLOG_NETWORK_MODEL;
    }

    public static /* synthetic */ int access$500(AliNetworkAdapter aliNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25a886bd", new Object[]{aliNetworkAdapter})).intValue() : aliNetworkAdapter.BUFFER_SIZE;
    }

    public static /* synthetic */ Context access$600(AliNetworkAdapter aliNetworkAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cb9b8183", new Object[]{aliNetworkAdapter}) : aliNetworkAdapter.mContext;
    }

    static {
        kge.a(197703809);
        kge.a(-1352689828);
        kge.a(1616078155);
        RVLOG_NETWORK_MODEL = "WindVane/Network";
        enableAir = false;
    }

    public AliNetworkAdapter(Context context) {
        this(context, "windvane");
    }

    public AliNetworkAdapter(Context context, String str) {
        this(context, 2, str);
    }

    public AliNetworkAdapter(Context context, String str, WVUCWebView wVUCWebView) {
        this(context, 2, str);
        this.webView = wVUCWebView;
    }

    public AliNetworkAdapter(Context context, int i) {
        this(context, i, "windvane");
    }

    public AliNetworkAdapter(Context context, int i, String str) {
        this.mNetworkType = -1;
        this.mWorkingMode = 1;
        this.BUFFER_SIZE = 1024;
        this.isUseWebpImg = true;
        this.bizCode = "";
        this.isReload = false;
        this.isStop = false;
        this.pid = "";
        this.uid = "";
        this.mainRequest = new HashSet<>();
        this.mContext = context;
        this.mNetworkType = i;
        this.bizCode = str;
        if (j.commonConfig.n > Math.random()) {
            this.isUseWebpImg = true;
        } else {
            this.isUseWebpImg = false;
        }
        int i2 = this.mNetworkType;
        if (i2 == 0) {
            this.mAliNetwork = new HttpNetwork(context);
        } else if (i2 != 1 && i2 != 2) {
        } else {
            this.mAliNetwork = new DegradableNetwork(context);
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean requestURL(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85230ab7", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
        }
        updateCurId();
        m.c(LOGTAG, "requestURL:" + str + " isUCProxyReq:" + z + " requestType:" + i);
        String tryDecodeUrl = Escape.tryDecodeUrl(str);
        if (e.b() && enableAir) {
            map.put(adk.KEY_GREY, "true");
        }
        AliRequestAdapter aliRequestAdapter = new AliRequestAdapter(eventHandler, tryDecodeUrl, str2, z, map, map2, map3, map4, j, i, i2, this.isUseWebpImg, this.bizCode, this.mContext);
        if (j.commonConfig.bL) {
            aliRequestAdapter.setCurId(getCurId());
        }
        aliRequestAdapter.setId(this.pid);
        if (this.isReload) {
            aliRequestAdapter.cancelPhase = "reload";
        }
        setRequestBodyHandler(aliRequestAdapter.getAliRequest(), aliRequestAdapter);
        eventHandler.setRequest(aliRequestAdapter);
        return sendRequestInternal(aliRequestAdapter);
    }

    public static boolean willLog(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a80d945", new Object[]{eventHandler})).booleanValue();
        }
        int resourceType = eventHandler.getResourceType();
        return resourceType == 0 || resourceType == 14 || eventHandler.isSynchronous();
    }

    private boolean sendRequestInternal(AliRequestAdapter aliRequestAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99a0d8fe", new Object[]{this, aliRequestAdapter})).booleanValue();
        }
        Request aliRequest = aliRequestAdapter.getAliRequest();
        injectTraceContext(aliRequest);
        monitorRequest(aliRequestAdapter);
        EventHandler eventHandler = aliRequestAdapter.getEventHandler();
        m.c(LOGTAG, "requestURL eventId=" + aliRequestAdapter.getEventHandler().hashCode() + ", url=" + aliRequestAdapter.getUrl() + ",isSync=" + eventHandler.isSynchronous());
        int i = this.mWorkingMode;
        if (i == 0) {
            syncSendRequest(aliRequestAdapter, aliRequest, eventHandler);
        } else if (i == 1) {
            asyncSendRequest(aliRequestAdapter, aliRequest, eventHandler);
        }
        return true;
    }

    private void asyncSendRequest(AliRequestAdapter aliRequestAdapter, Request request, EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49edb37", new Object[]{this, aliRequestAdapter, request, eventHandler});
            return;
        }
        if (request.getHeaders() != null && request.getHeaders().size() != 0) {
            JSONObject jSONObject = new JSONObject();
            for (Header header : request.getHeaders()) {
                try {
                    jSONObject.put(header.getName(), header.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        AliNetCallback aliNetCallback = new AliNetCallback();
        aliNetCallback.setId(this);
        aliNetCallback.setEventHandler(eventHandler);
        aliNetCallback.setURL(aliRequestAdapter.getUrl());
        aliNetCallback.setRequest(aliRequestAdapter);
        aliRequestAdapter.setFutureResponse(this.mAliNetwork.asyncSend(request, aliRequestAdapter.originalUrl, null, aliNetCallback));
    }

    private void syncSendRequest(AliRequestAdapter aliRequestAdapter, Request request, EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da0038", new Object[]{this, aliRequestAdapter, request, eventHandler});
            return;
        }
        Response syncSend = this.mAliNetwork.syncSend(request, null);
        Throwable error = syncSend.getError();
        if (error != null) {
            eventHandler.error(getErrorFromException(error), error.toString());
            return;
        }
        int statusCode = syncSend.getStatusCode();
        String str = syncSend.getStatisticData().connectionType;
        if (!StringUtils.isEmpty(str) && str.startsWith(ConnType.HTTP2)) {
            eventHandler.status(2, 0, statusCode, "");
        } else {
            eventHandler.status(0, 0, statusCode, "");
        }
        if (m.a()) {
            m.b(LOGTAG, "status code=" + statusCode);
        }
        eventHandler.headers(syncSend.getConnHeadFields());
        byte[] bytedata = syncSend.getBytedata();
        if (bytedata != null) {
            eventHandler.data(bytedata, bytedata.length);
        }
        aliRequestAdapter.cancelPhase = AliRequestAdapter.PHASE_ENDDATA;
        eventHandler.endData();
    }

    private void monitorRequest(AliRequestAdapter aliRequestAdapter) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee01600b", new Object[]{this, aliRequestAdapter});
            return;
        }
        try {
            String url = aliRequestAdapter.getUrl();
            if (url != null && StringUtils.equals(p.d(url), p.d(this.webView.getCachedUrl()))) {
                z = true;
            }
            if (z) {
                this.webView.wpData.setPageCurrentStatus(WVWPData.REQUEST_HTML);
            } else if (url != null && url.endsWith(".js")) {
                this.webView.wpData.setPageCurrentStatus(WVWPData.REQUEST_JS);
            }
            if (!j.commonConfig.bL) {
                return;
            }
            b b = com.taobao.android.riverlogger.e.a(RVLLevel.Info, RVLOG_NETWORK_MODEL).a("request", getCurId()).b(this.webView.pageTracker.getPageIdentifier());
            if (z) {
                b.a("isPage", (Object) 1);
            }
            b.a("url", (Object) url).a("method", (Object) aliRequestAdapter.getMethod()).a("header", aliRequestAdapter.getHeaders());
            b.a();
        } catch (Throwable unused) {
        }
    }

    private void injectTraceContext(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f2f3b0", new Object[]{this, request});
            return;
        }
        try {
            if (this.webView != null && this.webView.getSpanWrapper() != null) {
                r rVar = FalcoGlobalTracer.get();
                if (rVar == null) {
                    return;
                }
                request.setTraceContext(rVar.a(this.webView.getSpanWrapper().c()));
            } else if (this.webView == null) {
                m.c(LOGTAG, "webView == null");
            } else {
                m.c(LOGTAG, "webView.getFalcoSpan() == null");
            }
        } catch (Throwable th) {
            m.e(LOGTAG, a.a(th));
        }
    }

    public static void setEnableAir(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef20fc8", new Object[]{new Boolean(z)});
        } else {
            enableAir = z;
        }
    }

    public void setId(adm admVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ddb8aa", new Object[]{this, admVar});
        } else if (admVar == null) {
        } else {
            this.pid = admVar.getCurId();
        }
    }

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
            return;
        }
        this.uid = "" + id.addAndGet(1);
    }

    @Override // tb.adm
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return "WVNet_" + this.uid;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this}) : this.pid;
    }

    /* loaded from: classes2.dex */
    public class AliNetCallback implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public adm id;
        public EventHandler mEventHandler;
        public IRequest mReq;
        public String mUrl;
        public int size = 0;
        public int total = 0;

        static {
            kge.a(398504743);
            kge.a(-501869850);
            kge.a(1776397793);
            kge.a(-324998464);
        }

        public AliNetCallback() {
        }

        public void setEventHandler(EventHandler eventHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31cc001", new Object[]{this, eventHandler});
            } else {
                this.mEventHandler = eventHandler;
            }
        }

        public void setURL(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b79a47e", new Object[]{this, str});
            } else {
                this.mUrl = str;
            }
        }

        public void setRequest(IRequest iRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e61966", new Object[]{this, iRequest});
            } else {
                this.mReq = iRequest;
            }
        }

        public void setId(adm admVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ddb8aa", new Object[]{this, admVar});
            } else {
                this.id = admVar;
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                return;
            }
            m.c(AliNetworkAdapter.LOGTAG, "[onDataReceived] event:" + progressEvent + "event.getSize():" + progressEvent.getSize() + ", data:" + progressEvent.getBytedata().length + " bytes");
            this.mEventHandler.data(progressEvent.getBytedata(), progressEvent.getSize());
            this.size = this.size + progressEvent.getSize();
            if (this.total != 0) {
                return;
            }
            this.total = progressEvent.getTotal();
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x0248 A[Catch: Throwable -> 0x0055, TryCatch #0 {Throwable -> 0x0055, blocks: (B:19:0x0058, B:21:0x007e, B:22:0x0086, B:24:0x008c, B:26:0x0098, B:28:0x00a4, B:29:0x00b3, B:31:0x00b9, B:32:0x00c6, B:34:0x00cc, B:36:0x00e3, B:35:0x00d6, B:40:0x00f4, B:42:0x0109, B:44:0x0117, B:51:0x012b, B:53:0x0133, B:55:0x0139, B:56:0x013f, B:58:0x0145, B:60:0x014d, B:64:0x015c, B:73:0x017c, B:75:0x0182, B:77:0x018a, B:79:0x0193, B:84:0x01af, B:93:0x01c4, B:95:0x01ce, B:97:0x01d8, B:99:0x01e4, B:101:0x01ee, B:103:0x01f7, B:105:0x0204, B:107:0x0210, B:109:0x0219, B:110:0x021e, B:111:0x0233, B:104:0x01fe, B:112:0x0236, B:115:0x0242, B:117:0x0248, B:119:0x0250, B:122:0x0259, B:124:0x0261, B:130:0x02aa, B:132:0x02b0, B:134:0x02b8, B:135:0x02bd, B:136:0x02ca, B:138:0x02d2, B:125:0x0277, B:129:0x0295, B:11:0x003e, B:13:0x0044, B:15:0x004d), top: B:157:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02b0 A[Catch: Throwable -> 0x0055, TryCatch #0 {Throwable -> 0x0055, blocks: (B:19:0x0058, B:21:0x007e, B:22:0x0086, B:24:0x008c, B:26:0x0098, B:28:0x00a4, B:29:0x00b3, B:31:0x00b9, B:32:0x00c6, B:34:0x00cc, B:36:0x00e3, B:35:0x00d6, B:40:0x00f4, B:42:0x0109, B:44:0x0117, B:51:0x012b, B:53:0x0133, B:55:0x0139, B:56:0x013f, B:58:0x0145, B:60:0x014d, B:64:0x015c, B:73:0x017c, B:75:0x0182, B:77:0x018a, B:79:0x0193, B:84:0x01af, B:93:0x01c4, B:95:0x01ce, B:97:0x01d8, B:99:0x01e4, B:101:0x01ee, B:103:0x01f7, B:105:0x0204, B:107:0x0210, B:109:0x0219, B:110:0x021e, B:111:0x0233, B:104:0x01fe, B:112:0x0236, B:115:0x0242, B:117:0x0248, B:119:0x0250, B:122:0x0259, B:124:0x0261, B:130:0x02aa, B:132:0x02b0, B:134:0x02b8, B:135:0x02bd, B:136:0x02ca, B:138:0x02d2, B:125:0x0277, B:129:0x0295, B:11:0x003e, B:13:0x0044, B:15:0x004d), top: B:157:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x02d2 A[Catch: Throwable -> 0x0055, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0055, blocks: (B:19:0x0058, B:21:0x007e, B:22:0x0086, B:24:0x008c, B:26:0x0098, B:28:0x00a4, B:29:0x00b3, B:31:0x00b9, B:32:0x00c6, B:34:0x00cc, B:36:0x00e3, B:35:0x00d6, B:40:0x00f4, B:42:0x0109, B:44:0x0117, B:51:0x012b, B:53:0x0133, B:55:0x0139, B:56:0x013f, B:58:0x0145, B:60:0x014d, B:64:0x015c, B:73:0x017c, B:75:0x0182, B:77:0x018a, B:79:0x0193, B:84:0x01af, B:93:0x01c4, B:95:0x01ce, B:97:0x01d8, B:99:0x01e4, B:101:0x01ee, B:103:0x01f7, B:105:0x0204, B:107:0x0210, B:109:0x0219, B:110:0x021e, B:111:0x0233, B:104:0x01fe, B:112:0x0236, B:115:0x0242, B:117:0x0248, B:119:0x0250, B:122:0x0259, B:124:0x0261, B:130:0x02aa, B:132:0x02b0, B:134:0x02b8, B:135:0x02bd, B:136:0x02ca, B:138:0x02d2, B:125:0x0277, B:129:0x0295, B:11:0x003e, B:13:0x0044, B:15:0x004d), top: B:157:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x032d  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0334  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0182 A[Catch: Throwable -> 0x0055, TryCatch #0 {Throwable -> 0x0055, blocks: (B:19:0x0058, B:21:0x007e, B:22:0x0086, B:24:0x008c, B:26:0x0098, B:28:0x00a4, B:29:0x00b3, B:31:0x00b9, B:32:0x00c6, B:34:0x00cc, B:36:0x00e3, B:35:0x00d6, B:40:0x00f4, B:42:0x0109, B:44:0x0117, B:51:0x012b, B:53:0x0133, B:55:0x0139, B:56:0x013f, B:58:0x0145, B:60:0x014d, B:64:0x015c, B:73:0x017c, B:75:0x0182, B:77:0x018a, B:79:0x0193, B:84:0x01af, B:93:0x01c4, B:95:0x01ce, B:97:0x01d8, B:99:0x01e4, B:101:0x01ee, B:103:0x01f7, B:105:0x0204, B:107:0x0210, B:109:0x0219, B:110:0x021e, B:111:0x0233, B:104:0x01fe, B:112:0x0236, B:115:0x0242, B:117:0x0248, B:119:0x0250, B:122:0x0259, B:124:0x0261, B:130:0x02aa, B:132:0x02b0, B:134:0x02b8, B:135:0x02bd, B:136:0x02ca, B:138:0x02d2, B:125:0x0277, B:129:0x0295, B:11:0x003e, B:13:0x0044, B:15:0x004d), top: B:157:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onResponseCode(int r21, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r22, java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 831
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.AliNetworkAdapter.AliNetCallback.onResponseCode(int, java.util.Map, java.lang.Object):boolean");
        }

        private String getCacheUrlFromWebView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aa12ed6d", new Object[]{this});
            }
            if (AliNetworkAdapter.access$000(AliNetworkAdapter.this) == null) {
                return null;
            }
            return AliNetworkAdapter.access$000(AliNetworkAdapter.this).getCachedUrl();
        }

        private void reSendRequest(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("726261f2", new Object[]{this, new Integer(i), str});
                return;
            }
            AliRequestAdapter aliRequestAdapter = (AliRequestAdapter) this.mReq;
            Request aliRequest = aliRequestAdapter.getAliRequest();
            Request createRequest = aliRequestAdapter.createRequest(str, aliRequest.getMethod(), aliRequest.getHeaders());
            AliNetworkAdapter.access$100(AliNetworkAdapter.this, createRequest);
            AliNetworkAdapter.access$200(AliNetworkAdapter.this, aliRequestAdapter);
            EventHandler eventHandler = aliRequestAdapter.getEventHandler();
            m.e(AliNetworkAdapter.LOGTAG, "404 reSendRequest eventId=" + aliRequestAdapter.getEventHandler().hashCode() + ", unchangedUrl=" + str + ",isSync=" + eventHandler.isSynchronous() + ",errorUrl=" + aliRequest.getUrlString());
            AliNetworkAdapter.access$300(AliNetworkAdapter.this, aliRequestAdapter, createRequest, eventHandler);
            android.taobao.windvane.monitor.a.commitFail("reSendRequest", i, str, aliRequest.getUrlString());
        }

        private void monitorWebpResource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("926ab5d5", new Object[]{this, str});
            } else if (!android.taobao.windvane.monitor.r.needSampleWebp()) {
            } else {
                String str2 = null;
                if (AliNetworkAdapter.access$000(AliNetworkAdapter.this) != null) {
                    str2 = AliNetworkAdapter.access$000(AliNetworkAdapter.this).getCachedUrl();
                }
                if (StringUtils.isEmpty(str2)) {
                    return;
                }
                android.taobao.windvane.monitor.r.commitWebpResource(str, str2, 3);
            }
        }

        private void monitorOnResponse(int i, String str, String str2, boolean z, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3becd1a7", new Object[]{this, new Integer(i), str, str2, new Boolean(z), map});
            } else if (o.getWVNetWorkMonitorInterface() == null) {
            } else {
                if (StringUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                o.getWVNetWorkMonitorInterface().onResponse(this.mUrl, str2, i, z, map);
                if (i >= 400) {
                    wpUpload(str2, i, str, z);
                } else if (i < 200 || i >= 300) {
                } else {
                    try {
                        if (z) {
                            AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setPageCurrentStatus(WVWPData.RESPONSE_HTML);
                        } else if (str == null) {
                        } else {
                            if (str.endsWith(".js")) {
                                AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setPageCurrentStatus(WVWPData.RESPONSE_JS);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        private void monitorOnResponseNew(int i, String str, String str2, boolean z, Map<String, List<String>> map, boolean z2, IRequest iRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("703defab", new Object[]{this, new Integer(i), str, str2, new Boolean(z), map, new Boolean(z2), iRequest});
                return;
            }
            monitorOnResponse(i, str, str2, z, map);
            if (!(iRequest instanceof AliRequestAdapter)) {
                return;
            }
            AliRequestAdapter aliRequestAdapter = (AliRequestAdapter) iRequest;
            com.taobao.android.riverlogger.e.a(z2 ? RVLLevel.Info : RVLLevel.Warn, AliNetworkAdapter.access$400()).a(InputFrame3.TYPE_RESPONSE, aliRequestAdapter.getCurId()).b(aliRequestAdapter.getPId()).a("url", (Object) str).a("statusCode", Integer.valueOf(i)).a("header", map).a();
        }

        private void wpUpload(String str, int i, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50bf9432", new Object[]{this, str, new Integer(i), str2, new Boolean(z)});
                return;
            }
            try {
                if (z) {
                    AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setHtmlError(i, str2);
                    AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.ucBkpg = false;
                    m.e(AliNetworkAdapter.LOGTAG, "onOccurWhitePage " + str2);
                    if (j.commonConfig.aT >= Math.random()) {
                        android.taobao.windvane.monitor.a.commitWPData(str, AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData);
                    }
                } else if (str2 == null) {
                } else {
                    if (str2.endsWith(".js")) {
                        AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setJsErrorCode(i, str2);
                        WVWPData wVWPData = AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData;
                        wVWPData.addProbableReason("js Download failed: errorCode=" + i + " url=" + this.mUrl);
                    }
                }
            } catch (Throwable unused) {
                m.e(AliNetworkAdapter.LOGTAG, "");
            }
        }

        private void addGreyPageInfo(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f54fe1e1", new Object[]{this, map});
                return;
            }
            try {
                List<String> list = map.get(adk.KEY_GREY);
                String str = null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                List<String> list2 = map.get(adk.KEY_ENV);
                if (list2 != null && list2.size() > 0) {
                    str = list2.get(0);
                }
                if (StringUtils.isEmpty(str) && StringUtils.isEmpty(str2)) {
                    return;
                }
                adl.a().a(new adk(this.mUrl, str, str2));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            if (AliNetworkAdapter.access$000(AliNetworkAdapter.this) != null) {
                AliNetworkAdapter.access$000(AliNetworkAdapter.this).pageTracker.onResourceFinished(this.mUrl, this.size);
            }
            m.e(AliNetworkAdapter.LOGTAG, "onFinished code = " + finishEvent.getHttpCode() + ", url = " + this.mUrl + ", rev_size = " + this.size + ", total_size = " + this.total);
            monitorOnFinished(finishEvent);
            if (o.getPerformanceMonitor() != null) {
                try {
                    String str = finishEvent.getStatisticData().connectionType;
                    finishEvent.getStatisticData();
                    o.getPerformanceMonitor().didResourceFinishLoadAtTime(this.mUrl, System.currentTimeMillis(), str, 0L);
                } catch (Throwable th) {
                    o.getPerformanceMonitor().didResourceFinishLoadAtTime(this.mUrl, System.currentTimeMillis(), "unknown", 0L);
                    m.b(AliNetworkAdapter.LOGTAG, "didResourceFinishLoadAtTime failed ", th, new Object[0]);
                }
            }
            AliRequestAdapter aliRequestAdapter = (AliRequestAdapter) this.mReq;
            int httpCode = finishEvent.getHttpCode();
            UCNetworkDelegate.getInstance().onFinish(httpCode, this.mUrl);
            if (httpCode < 0) {
                m.e(AliNetworkAdapter.LOGTAG, "error code=" + httpCode + ",desc=" + finishEvent.getDesc() + ",url=" + this.mUrl);
                this.mEventHandler.error(httpCode, finishEvent.getDesc());
                aliRequestAdapter.complete();
                return;
            }
            aliRequestAdapter.cancelPhase = AliRequestAdapter.PHASE_ENDDATA;
            this.mEventHandler.endData();
            aliRequestAdapter.complete();
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void monitorOnFinished(anetwork.channel.NetworkEvent.FinishEvent r9) {
            /*
                r8 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.extra.uc.AliNetworkAdapter.AliNetCallback.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L15
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r8
                r1[r2] = r9
                java.lang.String r9 = "f74e6fd2"
                r0.ipc$dispatch(r9, r1)
                return
            L15:
                android.taobao.windvane.config.j.a()
                android.taobao.windvane.config.k r0 = android.taobao.windvane.config.j.commonConfig
                boolean r0 = r0.bn
                if (r0 == 0) goto Ldd
                if (r9 == 0) goto Ldd
                int r0 = r9.getHttpCode()
                if (r0 >= 0) goto Ldd
                android.taobao.windvane.monitor.f$c r0 = android.taobao.windvane.monitor.o.getWVNetWorkMonitorInterface()
                if (r0 == 0) goto Ldd
                r0 = 0
                android.taobao.windvane.extra.uc.interfaces.IRequest r1 = r8.mReq     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L54
                android.taobao.windvane.extra.uc.interfaces.IRequest r1 = r8.mReq     // Catch: java.lang.Throwable -> L75
                java.util.Map r1 = r1.getHeaders()     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L54
                java.lang.String r4 = "Referer"
                java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L75
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L75
                boolean r0 = android.text.StringUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L52
                if (r0 == 0) goto L50
                java.lang.String r0 = "referer"
                java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L52
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L52
                goto L54
            L50:
                r0 = r4
                goto L54
            L52:
                r0 = r4
                goto L75
            L54:
                java.lang.String r1 = r8.mUrl     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L73
                java.lang.String r1 = r8.mUrl     // Catch: java.lang.Throwable -> L75
                java.lang.String r1 = android.taobao.windvane.util.p.d(r1)     // Catch: java.lang.Throwable -> L75
                android.taobao.windvane.extra.uc.AliNetworkAdapter r4 = android.taobao.windvane.extra.uc.AliNetworkAdapter.this     // Catch: java.lang.Throwable -> L75
                android.taobao.windvane.extra.uc.WVUCWebView r4 = android.taobao.windvane.extra.uc.AliNetworkAdapter.access$000(r4)     // Catch: java.lang.Throwable -> L75
                java.lang.String r4 = r4.getCachedUrl()     // Catch: java.lang.Throwable -> L75
                java.lang.String r4 = android.taobao.windvane.util.p.d(r4)     // Catch: java.lang.Throwable -> L75
                boolean r1 = android.text.StringUtils.equals(r1, r4)     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L73
                r3 = 1
            L73:
                r7 = r3
                goto L76
            L75:
                r7 = 0
            L76:
                android.taobao.windvane.config.k r1 = android.taobao.windvane.config.j.commonConfig
                boolean r1 = r1.bL
                if (r1 == 0) goto Lbe
                com.taobao.android.riverlogger.RVLLevel r1 = com.taobao.android.riverlogger.RVLLevel.Info
                java.lang.String r2 = android.taobao.windvane.extra.uc.AliNetworkAdapter.access$400()
                com.taobao.android.riverlogger.b r1 = com.taobao.android.riverlogger.e.a(r1, r2)
                android.taobao.windvane.extra.uc.AliNetworkAdapter r2 = android.taobao.windvane.extra.uc.AliNetworkAdapter.this
                java.lang.String r2 = r2.getCurId()
                java.lang.String r3 = "finish"
                com.taobao.android.riverlogger.b r1 = r1.a(r3, r2)
                android.taobao.windvane.extra.uc.AliNetworkAdapter r2 = android.taobao.windvane.extra.uc.AliNetworkAdapter.this
                android.taobao.windvane.extra.uc.WVUCWebView r2 = android.taobao.windvane.extra.uc.AliNetworkAdapter.access$000(r2)
                android.taobao.windvane.extra.performance2.WVPageTracker r2 = r2.pageTracker
                java.lang.String r2 = r2.getPageIdentifier()
                com.taobao.android.riverlogger.b r1 = r1.b(r2)
                java.lang.String r2 = r8.mUrl
                java.lang.String r3 = "url"
                com.taobao.android.riverlogger.b r1 = r1.a(r3, r2)
                anetwork.channel.statist.StatisticData r2 = r9.getStatisticData()
                long r2 = r2.totalSize
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.String r3 = "dataSize"
                com.taobao.android.riverlogger.b r1 = r1.a(r3, r2)
                r1.a()
            Lbe:
                android.taobao.windvane.monitor.f$c r1 = android.taobao.windvane.monitor.o.getWVNetWorkMonitorInterface()
                java.lang.String r2 = r8.mUrl
                if (r0 != 0) goto Lca
                java.lang.String r3 = "unknown"
                goto Lcb
            Lca:
                r3 = r0
            Lcb:
                int r4 = r9.getHttpCode()
                r6 = 0
                r5 = r7
                r1.onResponse(r2, r3, r4, r5, r6)
                int r9 = r9.getHttpCode()
                java.lang.String r1 = r8.mUrl
                r8.wpUpload(r0, r9, r1, r7)
            Ldd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.AliNetworkAdapter.AliNetCallback.monitorOnFinished(anetwork.channel.NetworkEvent$FinishEvent):void");
        }
    }

    private void setRequestBodyHandler(Request request, AliRequestAdapter aliRequestAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313a83f", new Object[]{this, request, aliRequestAdapter});
        } else if (aliRequestAdapter.getUploadFileTotalLen() == 0) {
        } else {
            final Map<String, String> uploadFileMap = aliRequestAdapter.getUploadFileMap();
            final Map<String, byte[]> uploadDataMap = aliRequestAdapter.getUploadDataMap();
            final int size = uploadFileMap.size() + uploadDataMap.size();
            request.setBodyHandler(new IBodyHandler() { // from class: android.taobao.windvane.extra.uc.AliNetworkAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public byte[] buffer;
                public List<InputStream> instream;
                public boolean isCompleted = false;
                public int postedLen = 0;
                public int curFilenum = 0;
                public String fileNameValue = null;
                public byte[] dataValue = null;
                public boolean hasInitilized = false;

                {
                    this.buffer = new byte[AliNetworkAdapter.access$500(AliNetworkAdapter.this)];
                    this.instream = new ArrayList(size);
                }

                public void initStream() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ef4b4137", new Object[]{this});
                        return;
                    }
                    try {
                        this.curFilenum = 0;
                        while (this.curFilenum < size) {
                            this.fileNameValue = (String) uploadFileMap.get(String.valueOf(this.curFilenum));
                            this.dataValue = (byte[]) uploadDataMap.get(String.valueOf(this.curFilenum));
                            if (m.a() && this.dataValue != null) {
                                m.b(AliNetworkAdapter.LOGTAG, "len =" + this.dataValue.length + ",datavalue=" + new String(this.dataValue, 0, this.dataValue.length));
                            }
                            if (this.fileNameValue != null) {
                                if (this.fileNameValue.toLowerCase().startsWith("content://")) {
                                    this.instream.add(this.curFilenum, AliNetworkAdapter.access$600(AliNetworkAdapter.this).getContentResolver().openInputStream(Uri.parse(this.fileNameValue)));
                                } else {
                                    this.instream.add(this.curFilenum, new FileInputStream(this.fileNameValue));
                                }
                            } else {
                                this.instream.add(this.curFilenum, new ByteArrayInputStream(this.dataValue));
                            }
                            this.curFilenum++;
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // anetwork.channel.IBodyHandler
                public int read(byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
                    }
                    if (!this.hasInitilized) {
                        initStream();
                        List<InputStream> list = this.instream;
                        if (list == null || list.size() == 0) {
                            this.isCompleted = true;
                            return 0;
                        }
                        this.hasInitilized = true;
                    }
                    for (InputStream inputStream : this.instream) {
                        try {
                            int read = inputStream.read(this.buffer, 0, AliNetworkAdapter.access$500(AliNetworkAdapter.this) > bArr.length ? bArr.length : AliNetworkAdapter.access$500(AliNetworkAdapter.this));
                            if (read != -1) {
                                System.arraycopy(this.buffer, 0, bArr, 0, read);
                                this.postedLen += read;
                                m.c(AliNetworkAdapter.LOGTAG, "read len=" + read);
                                return read;
                            }
                        } catch (Exception e) {
                            m.c(AliNetworkAdapter.LOGTAG, "read exception" + e.getMessage());
                            this.isCompleted = true;
                            return 0;
                        }
                    }
                    m.c(AliNetworkAdapter.LOGTAG, "read finish");
                    this.isCompleted = true;
                    return 0;
                }

                @Override // anetwork.channel.IBodyHandler
                public boolean isCompleted() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
                    }
                    boolean z = this.isCompleted;
                    if (!z) {
                        return z;
                    }
                    this.isCompleted = false;
                    this.hasInitilized = false;
                    try {
                        for (InputStream inputStream : this.instream) {
                            inputStream.close();
                        }
                        this.instream.clear();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
            });
        }
    }

    public int getErrorFromException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9892708e", new Object[]{this, th})).intValue();
        }
        if (th instanceof ParseException) {
            return -43;
        }
        if (th instanceof SocketTimeoutException) {
            return -46;
        }
        if (th instanceof SocketException) {
            return -47;
        }
        if (th instanceof IOException) {
            return -44;
        }
        if (th instanceof IllegalStateException) {
            return -45;
        }
        return th instanceof UnknownHostException ? -2 : -99;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public IRequest formatRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRequest) ipChange.ipc$dispatch("5c346fdd", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)});
        }
        updateCurId();
        String tryDecodeUrl = Escape.tryDecodeUrl(str);
        if (e.b() && enableAir) {
            map.put(adk.KEY_GREY, "true");
        }
        if (o.getWVNetWorkMonitorInterface() != null) {
            String str3 = map.get(HttpConstant.REFERER);
            f.c wVNetWorkMonitorInterface = o.getWVNetWorkMonitorInterface();
            if (str3 == null) {
                str3 = "unknown";
            }
            wVNetWorkMonitorInterface.onFormatRequest(tryDecodeUrl, str3, str2);
        }
        WVHeaderManager.getInstance().addCustomRequestHeaderCheck(tryDecodeUrl, map);
        sgRequestCheck(tryDecodeUrl, str2, z, map, map2, map3, map4, i);
        AliRequestAdapter aliRequestAdapter = new AliRequestAdapter(eventHandler, tryDecodeUrl, str2, z, map, map2, map3, map4, j, i, i2, this.isUseWebpImg, this.bizCode, this.mContext);
        if (j.commonConfig.bL) {
            aliRequestAdapter.setCurId(getCurId());
        }
        aliRequestAdapter.setId(this.pid);
        if (this.isReload) {
            aliRequestAdapter.cancelPhase = "reload";
        }
        setRequestBodyHandler(aliRequestAdapter.getAliRequest(), aliRequestAdapter);
        eventHandler.setRequest(aliRequestAdapter);
        eventHandler.setResourceType(i);
        return aliRequestAdapter;
    }

    private void sgRequestCheck(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, int i) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9decb137", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4, new Integer(i)});
            return;
        }
        try {
            if (iOnSgHttpRequestCallback == null || !j.commonConfig.ao) {
                return;
            }
            Map<String, String> map5 = null;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!j.commonConfig.ap) {
                map5 = iOnSgHttpRequestCallback.onSgHttpRequest(str, str2, z, map, map2, map3, map4);
            } else if (i == 0 || i == 1) {
                m.a(LOGTAG, "sgRequestCheck() called with: url = [" + str + "], method = [" + str2 + "], isUCProxyReq = [" + z + "], headers = [" + map + "], ucHeaders = [" + map2 + "], uploadFileMap = [" + map3 + "], uploadDataMap = [" + map4 + "], requestType = [" + i + riy.ARRAY_END_STR);
                map5 = iOnSgHttpRequestCallback.onSgHttpRequest(str, str2, z, map, map2, map3, map4);
            } else {
                z2 = false;
            }
            if (z2) {
                m.e(LOGTAG, "onSgHttpRequest use time:" + (SystemClock.uptimeMillis() - uptimeMillis));
            }
            if (map5 == null) {
                return;
            }
            for (String str3 : map5.keySet()) {
                if (!map.containsKey(str3)) {
                    String str4 = map5.get(str3);
                    map.put(str3, str4);
                    m.a(LOGTAG, "add header key:" + str3 + " value:" + str4);
                } else {
                    m.e(LOGTAG, "add header conflict key:" + str3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean sendRequest(IRequest iRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f55a9b04", new Object[]{this, iRequest})).booleanValue() : sendRequestInternal((AliRequestAdapter) iRequest);
    }

    public void destoryWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78625e6c", new Object[]{this});
        } else {
            this.webView = null;
        }
    }

    public static void addHttpRequestCallback(IOnSgHttpRequestCallback iOnSgHttpRequestCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00f21c1", new Object[]{iOnSgHttpRequestCallback2});
            return;
        }
        iOnSgHttpRequestCallback = iOnSgHttpRequestCallback2;
        m.e(LOGTAG, "addHttpRequestCallback");
    }

    public static void clearHttpRequestCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1fdfc6", new Object[0]);
            return;
        }
        iOnSgHttpRequestCallback = null;
        m.e(LOGTAG, "clearHttpRequestCallback");
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }
}
