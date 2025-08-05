package com.alipay.android.msp.network.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspBaseDefine;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.network.DispatchType;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspSwitchUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class RequestConfig implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SETTING_PROVIDER = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    /* renamed from: a  reason: collision with root package name */
    private RequestChannel f4936a;
    private StEvent b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private boolean v;
    private Map<String, String> w;
    private boolean x;

    @Deprecated
    /* loaded from: classes3.dex */
    public enum RequestChannel {
        PB_V1_CASHIER("rpc_pbv1"),
        PB_V1_SECURITY("rpc_pbv1"),
        PB_V2_CASHIER("rpc_pbv2"),
        PB_V2_SECURITY("rpc_pbv2"),
        PB_V3_SDK("rpc_pbv3"),
        PB_V3_CASHIER("rpc_pbv3"),
        BYTES_CASHIER("http_bytes"),
        BYTES_SECURITY("http_bytes"),
        DYNAMIC_HOST("http_mobilesp"),
        JSON_CASHIER("rpc_json");
        
        private String mVal;

        RequestChannel(String str) {
            this.mVal = str;
        }

        public final String fullName() {
            return this.mVal + "-" + name();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.mVal;
        }
    }

    public String getExtendParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c6bf1b9", new Object[]{this, str});
        }
        Map<String, String> map = this.w;
        if (map != null && map.containsKey(str)) {
            return this.w.get(str);
        }
        return null;
    }

    public Map<String, String> getExtendParamsMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("940e06c2", new Object[]{this}) : this.w;
    }

    public void setExtendParamsMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15262a4", new Object[]{this, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        this.w = map;
    }

    public StEvent getStatisticEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("a3780888", new Object[]{this}) : this.b;
    }

    public void setStatisticEvent(StEvent stEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18a979e", new Object[]{this, stEvent});
        } else {
            this.b = stEvent;
        }
    }

    public void setIsNeedLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bcaee6", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public boolean hasTryLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("96c687b3", new Object[]{this})).booleanValue() : this.q;
    }

    public void setHasTryLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de01d87", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public RequestConfig(String str, String str2, int i, boolean z) {
        this.f4936a = null;
        this.j = true;
        this.n = "";
        this.o = false;
        this.g = "";
        this.s = 0;
        this.t = false;
        this.v = false;
        this.q = false;
        this.u = 0;
        this.r = false;
        this.v = z;
        if (str != null) {
            if (str.contains("need_login")) {
                this.t = true;
            } else {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                if (OrderInfoUtil.isRewordRequest(str) || (this.v && mspContextByBizId != null && mspContextByBizId.isFromWallet())) {
                    this.t = true;
                }
                if (OrderInfoUtil.isOpenAuthOrder(mspContextByBizId)) {
                    this.t = true;
                }
            }
        }
        this.l = str2;
        c();
        this.u = i;
        b();
    }

    public RequestConfig() {
        this.f4936a = null;
        this.j = true;
        this.n = "";
        this.o = false;
        this.g = "";
        this.s = 0;
        this.t = false;
        this.v = false;
        this.q = false;
        this.u = 0;
        this.r = false;
        c();
        b();
    }

    public RequestConfig(RequestChannel requestChannel) {
        this.f4936a = null;
        this.j = true;
        this.n = "";
        this.o = false;
        this.g = "";
        this.s = 0;
        this.t = false;
        this.v = false;
        this.q = false;
        this.u = 0;
        this.r = false;
        c();
        this.f4936a = requestChannel;
        b();
    }

    public RequestConfig(RequestChannel requestChannel, boolean z) {
        this.f4936a = null;
        this.j = true;
        this.n = "";
        this.o = false;
        this.g = "";
        this.s = 0;
        this.t = false;
        this.v = false;
        this.q = false;
        this.u = 0;
        this.r = false;
        this.v = z;
        c();
        this.f4936a = requestChannel;
        b();
    }

    public boolean isDynamicHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50bfed08", new Object[]{this})).booleanValue() : this.f4936a == RequestChannel.DYNAMIC_HOST;
    }

    public boolean isBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ccf4596c", new Object[]{this})).booleanValue() : this.f4936a == RequestChannel.BYTES_CASHIER || this.f4936a == RequestChannel.BYTES_SECURITY;
    }

    public RequestChannel getChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestChannel) ipChange.ipc$dispatch("a45a6a7b", new Object[]{this}) : this.f4936a;
    }

    public boolean isPbV1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18e6c162", new Object[]{this})).booleanValue() : this.f4936a == RequestChannel.PB_V1_CASHIER || this.f4936a == RequestChannel.PB_V1_SECURITY;
    }

    public boolean isPbv3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f9e0444", new Object[]{this})).booleanValue() : this.f4936a == RequestChannel.PB_V3_CASHIER;
    }

    public boolean isPbv2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f8fecc3", new Object[]{this})).booleanValue() : this.f4936a == RequestChannel.PB_V2_CASHIER || this.f4936a == RequestChannel.PB_V2_SECURITY;
    }

    public boolean isPbv3ForSdk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a9847d5", new Object[]{this})).booleanValue() : this.f4936a == RequestChannel.PB_V3_SDK;
    }

    private void b() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.k)) {
        } else {
            String str = MspSwitchUtil.isPbv3Enabled() ? "https://mobilegw.alipay.com/mgw.htm" : "http://mobilegw.alipay.com/mgw.htm";
            if (GlobalConstant.DEBUG && (context = GlobalHelper.getInstance().getContext()) != null) {
                try {
                    Cursor query = context.getContentResolver().query(Uri.parse(SETTING_PROVIDER), null, null, null, null);
                    if (query != null && query.getCount() > 0) {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndex("url"));
                            if (!TextUtils.isEmpty(string)) {
                                str = string;
                            }
                        }
                        query.close();
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            this.k = str;
        }
    }

    private static RequestChannel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestChannel) ipChange.ipc$dispatch("7d3c130f", new Object[0]);
        }
        if (MspSwitchUtil.isPbv3Enabled()) {
            return RequestChannel.PB_V3_SDK;
        }
        return RequestChannel.BYTES_CASHIER;
    }

    private void c() {
        IChannelInfo channelInfo;
        String[] actionParams;
        IChannelInfo channelInfo2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f = "com.alipay.mobilecashier";
        this.h = "com.alipay.quickpay";
        this.c = "5.7.2";
        this.p = MspNetConstants.Request.DEFAULT_CONTENT_TYPE;
        this.f4936a = a();
        MspInitAssistService sdkInstance = MspInitAssistService.getSdkInstance();
        if (sdkInstance != null && (channelInfo2 = sdkInstance.getChannelInfo()) != null) {
            this.h = channelInfo2.getApiName();
        }
        if (TextUtils.isEmpty(this.l)) {
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(this.l);
            if (parseObject.containsKey("namespace")) {
                setNamespace(parseObject.getString("namespace"));
            }
            if (parseObject.containsKey("apiVersion")) {
                setApiVersion(parseObject.getString("apiVersion"));
            }
            if (parseObject.containsKey("name")) {
                String a2 = a(parseObject.getString("name"));
                if (!TextUtils.isEmpty(a2) && a2.startsWith("js://") && (actionParams = Utils.getActionParams(a2)) != null && actionParams.length > 1) {
                    a2 = actionParams[1];
                }
                if (!TextUtils.isEmpty(a2)) {
                    String[] split = a2.split("/");
                    if (split.length > 2) {
                        setType(split[1]);
                        setMethod(split[2]);
                    }
                }
            }
            if (parseObject.containsKey("apiName")) {
                String string = parseObject.getString("apiName");
                if (TextUtils.isEmpty(string) && sdkInstance != null && (channelInfo = sdkInstance.getChannelInfo()) != null) {
                    string = channelInfo.getApiName();
                }
                setApiName(string);
            }
            if (parseObject.containsKey("https")) {
                z = parseObject.getBooleanValue("https");
            }
            if (parseObject.containsKey("host")) {
                String string2 = parseObject.getString("host");
                if (!TextUtils.isEmpty(string2) && string2.startsWith("http")) {
                    setHost(string2);
                }
                if (string2 != null && z) {
                    if (!string2.contains("mobilegw") && string2.contains("/pad/pci.htm")) {
                        this.f4936a = RequestChannel.DYNAMIC_HOST;
                    }
                    this.f4936a = RequestChannel.BYTES_SECURITY;
                }
            }
            if (parseObject.containsKey(MspBaseDefine.ACTION_REQ_PARAM)) {
                this.m = parseObject.getString(MspBaseDefine.ACTION_REQ_PARAM);
            }
            if (!parseObject.containsKey(MspBaseDefine.ACTION_CONTENT_TYPE)) {
                return;
            }
            this.p = parseObject.getString(MspBaseDefine.ACTION_CONTENT_TYPE);
        } catch (JSONException e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public boolean ismResponseHeaderGzipFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c0e35a2", new Object[]{this})).booleanValue() : this.o;
    }

    public void setmResponseHeaderGzipFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e85c2e", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public String getNamespace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c37174", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f)) {
            this.f = "com.alipay.mobilecashier";
        }
        return this.f;
    }

    public void setNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e878ea", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f = str;
        }
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : this.h;
    }

    public void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.h = str;
        }
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.e;
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.e = str;
        }
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.i;
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.i = str;
        }
    }

    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : this.c;
    }

    public void setApiVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4201f1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c = str;
        }
    }

    public boolean isFromWallet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue() : this.x;
    }

    public void setFromWallet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa96c08", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.k;
    }

    private static String a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        LogUtil.record(4, "RequestConfig.splitSubmitMethod", str);
        if (str != null && str.contains("loc:") && str.contains(";")) {
            for (String str2 : str.split(";")) {
                if (str2 != null && !str2.startsWith("loc:")) {
                    LogUtil.record(4, "phonecashiermsp#flybird", "RequestConfig.splitSubmitMethod submit", str2);
                    return str2;
                }
            }
        }
        return str;
    }

    public void setHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.k = str;
        }
    }

    public boolean isSupportGzip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c337074a", new Object[]{this})).booleanValue() : this.j;
    }

    public void isSupportGzip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3aa944e", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public String getTridesKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20ea5097", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.n)) {
            this.n = Utils.getTriDesKey();
        }
        return this.n;
    }

    public String getRequestKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f443a973", new Object[]{this}) : this.m;
    }

    public String getHttpContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27df3aa4", new Object[]{this});
        }
        if (this.f4936a == RequestChannel.PB_V3_SDK) {
            this.p = HeaderConstant.HEADER_VALUE_PB_TYPE;
        } else if (this.f4936a == RequestChannel.JSON_CASHIER) {
            this.p = "application/json";
        } else if (TextUtils.isEmpty(this.p)) {
            this.p = MspNetConstants.Request.DEFAULT_CONTENT_TYPE;
        }
        return this.p;
    }

    public String getSessionId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this}) : this.d;
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
            return;
        }
        this.d = str;
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.u);
        if (mspContextByBizId == null) {
            return;
        }
        mspContextByBizId.setSpmUniqueId(str);
        mspContextByBizId.setGlobalSession(str);
        mspContextByBizId.getStatisticInfo().updateAttr(Vector.Id, "sessionId", str);
    }

    public boolean ismNeedUa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7898630", new Object[]{this})).booleanValue() : this.s == 1;
    }

    public int getmUac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee60507a", new Object[]{this})).intValue() : this.s;
    }

    public void setmUac(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fdf3d0", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    public String getMiniDispatchType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b49b0158", new Object[]{this});
        }
        String requestChannel = this.f4936a.toString();
        if ((this.f4936a != RequestChannel.PB_V3_CASHIER && this.f4936a != RequestChannel.PB_V2_CASHIER) || !this.t) {
            return requestChannel;
        }
        return this.f4936a.toString() + "CheckLogin";
    }

    public String getDispatchType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("718433ef", new Object[]{this});
        }
        switch (this.f4936a) {
            case PB_V3_CASHIER:
                return this.t ? DispatchType.PB_V3_CASHIER_LOGIN : DispatchType.PB_V3_CASHIER;
            case PB_V2_CASHIER:
                return this.t ? DispatchType.PB_V2_CASHIER_LOGIN : DispatchType.PB_V2_CASHIER;
            case PB_V3_SDK:
                return DispatchType.PB_V3_SDK;
            case PB_V2_SECURITY:
            case DYNAMIC_HOST:
            default:
                return DispatchType.PB_V2_CASHIER;
            case PB_V1_CASHIER:
                return DispatchType.PB_V1_CASHIER;
            case PB_V1_SECURITY:
                return DispatchType.PB_V1_SECURITY;
            case BYTES_CASHIER:
                return DispatchType.BYTES_CASHIER;
            case BYTES_SECURITY:
                return DispatchType.BYTES_SECURITY;
            case JSON_CASHIER:
                return DispatchType.JSON_CASHIER;
        }
    }

    public String getmTradeNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e46a614b", new Object[]{this}) : this.g;
    }

    public void setmTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bf228b", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public boolean ismNeedLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fea63bbb", new Object[]{this})).booleanValue() : this.t;
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue() : this.u;
    }

    public String getActionJson() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4070b45", new Object[]{this}) : this.l;
    }

    public boolean isPreloadNetRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f56d91c", new Object[]{this})).booleanValue() : this.r;
    }

    public void setPreloadNetRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762f1f4", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public boolean isFirstRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43089c14", new Object[]{this})).booleanValue() : this.v;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        Object[] objArr = new Object[3];
        objArr[0] = this.e;
        objArr[1] = this.i;
        RequestChannel requestChannel = this.f4936a;
        objArr[2] = requestChannel != null ? requestChannel.fullName() : "null";
        return String.format("<RequestConfig [/%s/%s] %s>", objArr);
    }

    /* renamed from: clone */
    public RequestConfig m542clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("9d4184b3", new Object[]{this});
        }
        RequestConfig requestConfig = new RequestConfig();
        requestConfig.f = this.f;
        requestConfig.h = this.h;
        requestConfig.e = this.e;
        requestConfig.i = this.i;
        requestConfig.c = this.c;
        requestConfig.k = this.k;
        requestConfig.l = this.l;
        requestConfig.j = this.j;
        requestConfig.n = this.n;
        requestConfig.m = this.m;
        requestConfig.p = this.p;
        requestConfig.d = this.d;
        requestConfig.o = this.o;
        requestConfig.g = this.g;
        requestConfig.s = this.s;
        requestConfig.t = this.t;
        requestConfig.v = this.v;
        requestConfig.q = this.q;
        requestConfig.u = this.u;
        requestConfig.r = this.r;
        Map<String, String> map = this.w;
        if (map != null) {
            requestConfig.w = new HashMap(map);
        }
        return requestConfig;
    }
}
