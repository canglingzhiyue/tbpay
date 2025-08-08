package com.taobao.android.address;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.webkit.CookieManager;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.c;
import com.taobao.android.address.model.DeliverRequest;
import com.taobao.android.address.model.RecommendAddressContainer;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.cookies.LoginCookie;
import com.taobao.login4android.session.cookies.LoginCookieUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.doc;
import tb.dod;
import tb.noa;
import tb.xmb;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADDRESS_FILE = "globalAddress";
    public static final String PAGE_NAME = "globalAddress";
    private Context b;
    private SharedPreferences c;
    private BroadcastReceiver i;

    /* renamed from: a */
    public ExecutorService f8968a = Executors.newFixedThreadPool(1, new xmb("AddressSDKDelegate"));
    private RecommendAddressContainer d = new RecommendAddressContainer();
    private boolean e = false;
    private long f = 0;
    private boolean g = false;
    private int h = 10000;

    /* renamed from: com.taobao.android.address.c$5 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8974a = new int[LoginAction.values().length];

        static {
            try {
                f8974a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8974a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8974a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("efc6a81a", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, String str2, String str3, DeliverRequest deliverRequest, boolean z, boolean z2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d02ebb", new Object[]{cVar, context, str, str2, str3, deliverRequest, new Boolean(z), new Boolean(z2), aVar});
        } else {
            cVar.a(context, str, str2, str3, deliverRequest, z, z2, aVar);
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, String str2, String str3, boolean z, boolean z2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23308ac0", new Object[]{cVar, context, str, str2, str3, new Boolean(z), new Boolean(z2), aVar});
        } else {
            cVar.a(context, str, str2, str3, z, z2, aVar);
        }
    }

    public static /* synthetic */ void a(c cVar, TBLocationDTO tBLocationDTO, DeliverRequest deliverRequest, Context context, String str, String str2, String str3, boolean z, boolean z2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1169b3b1", new Object[]{cVar, tBLocationDTO, deliverRequest, context, str, str2, str3, new Boolean(z), new Boolean(z2), aVar});
        } else {
            cVar.a(tBLocationDTO, deliverRequest, context, str, str2, str3, z, z2, aVar);
        }
    }

    public static /* synthetic */ void a(c cVar, String str, boolean z, boolean z2, String str2, DeliverRequest deliverRequest, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7920ab49", new Object[]{cVar, str, new Boolean(z), new Boolean(z2), str2, deliverRequest, aVar});
        } else {
            cVar.a(str, z, z2, str2, deliverRequest, aVar);
        }
    }

    public static /* synthetic */ boolean a(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a35edb3a", new Object[]{cVar, str, str2})).booleanValue() : cVar.c(str, str2);
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75d587f6", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.g = z;
        return z;
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa5cee3", new Object[]{cVar});
        } else {
            cVar.b();
        }
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea14c055", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.e = z;
        return z;
    }

    public static /* synthetic */ BroadcastReceiver c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("cacbd99b", new Object[]{cVar}) : cVar.i;
    }

    public c(Context context) {
        this.b = context.getApplicationContext();
        this.c = this.b.getSharedPreferences("globalAddress", 0);
        try {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f8968a;
            threadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public RecommendedAddress a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendedAddress) ipChange.ipc$dispatch("c8fe8796", new Object[]{this, str});
        }
        AdapterForTLog.loge("globalAddress", "enterGlobalRecommendAdd " + str);
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || recommendAddressContainer.recommendAddressMap == null || this.d.recommendAddressMap.isEmpty()) {
            c();
        }
        RecommendedAddress recommendedAddress = this.d.recommendAddressMap.get(str);
        if (recommendedAddress == null || recommendedAddress.recommendedAddress == null) {
            recommendedAddress = this.d.recommendAddressMap.get("biz_common");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getGlobalRecommendAdd:");
        sb.append(recommendedAddress);
        AdapterForTLog.loge("globalAddress", sb.toString() == null ? "" : JSON.toJSONString(recommendedAddress));
        return recommendedAddress;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        AdapterForTLog.loge("globalAddress", "enter getAllRecommendAddrData " + str);
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || recommendAddressContainer.recommendAddressMap == null || this.d.recommendAddressMap.isEmpty()) {
            c();
        }
        String jSONString = JSON.toJSONString(this.d.recommendAddressMap);
        AdapterForTLog.loge("globalAddress", "getAllRecommendAddrData:" + jSONString);
        return jSONString;
    }

    public void a(Context context, String str, String str2, String str3, String str4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb73684", new Object[]{this, context, str, str2, str3, str4, aVar});
        } else {
            b(context, str, str2, str3, str4, aVar);
        }
    }

    public void b(Context context, String str, String str2, String str3, String str4, a aVar) {
        boolean z;
        a aVar2 = aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9552bae3", new Object[]{this, context, str, str2, str3, str4, aVar2});
            return;
        }
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || recommendAddressContainer.recommendAddressMap == null || this.d.recommendAddressMap.isEmpty()) {
            c();
        }
        boolean a2 = dod.a(context, str4);
        AdapterForTLog.loge("globalAddress", "enter syncGlobalRecommend " + str + "；;locationPermission:" + a2 + ";isUserSwitchAdd:" + this.e);
        if (StringUtils.equals(str3, "addressInfoChange") || StringUtils.equals(str3, "login")) {
            z = a2;
            this.e = false;
            a();
        } else {
            if (c(str)) {
                if (this.e && !StringUtils.equals(str, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                    a(str, aVar2);
                    return;
                } else if (StringUtils.equals(str, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                    this.e = false;
                }
            } else if (this.e) {
                a(str, aVar2);
                return;
            }
            if (a2) {
                if (!a(this.d.timestamp, str, str3) && this.d.locationEnabled) {
                    AdapterForTLog.loge("globalAddress", "isDataExpire = false ");
                    if (StringUtils.equals(str, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                        b(this.c.getString("clientCache", ""), this.c.getString("ccokiesKey", ""));
                    }
                    a(str, aVar);
                    return;
                }
                aVar2 = aVar;
                z = a2;
            } else {
                z = a2;
                if (!a(this.d.timestamp, str, str3) && !this.d.locationEnabled) {
                    AdapterForTLog.loge("globalAddress", "isDataExpire = false ");
                    if (StringUtils.equals(str, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                        b(this.c.getString("clientCache", ""), this.c.getString("ccokiesKey", ""));
                    }
                    a(str, aVar2);
                    return;
                }
            }
        }
        if (StringUtils.equals(str3, "login") && !c("requestAddressWhenLogin", "true")) {
            a(str, aVar2);
        } else if (StringUtils.equals(str3, "addressInfoChange") && !c("requestAddressWhenAddressChange", "true")) {
            a(str, aVar2);
        } else if (StringUtils.isEmpty(Login.getUserId()) && StringUtils.equals("appLaunch", str3) && c("ingoreLBSWhenLaunch", "true")) {
            a(str, aVar2);
        } else {
            if (StringUtils.isEmpty(Login.getUserId()) && this.d.isSessionValid) {
                AdapterForTLog.loge("globalAddress", "clearDeliverAddr");
                a();
            }
            if (!Login.checkSessionValid() && !StringUtils.isEmpty(Login.getLoginToken())) {
                Login.login(false);
                a(str, str2, str3, z, aVar);
                return;
            }
            a(context, str, str2, str3, z, false, aVar);
        }
    }

    public void a(Context context, String str, String str2, String str3, boolean z, String str4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4fe49c", new Object[]{this, context, str, str2, str3, new Boolean(z), str4, aVar});
            return;
        }
        AdapterForTLog.loge("globalAddress", "enter asyncGetRecommendAdd " + str);
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || recommendAddressContainer.recommendAddressMap == null || this.d.recommendAddressMap.isEmpty()) {
            c();
        }
        if (z) {
            a(context, str, str2, str3, dod.a(context, str4), true, aVar);
        } else {
            a(context, str, str2, str3, str4, aVar);
        }
    }

    private void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e63c8ae", new Object[]{this, str, aVar});
        } else if (aVar == null) {
        } else {
            RecommendedAddress a2 = a(str);
            if (a2 != null) {
                aVar.a(JSON.toJSONString(a2));
            } else {
                aVar.a("");
            }
        }
    }

    private void a(final Context context, final String str, final String str2, final String str3, final boolean z, final boolean z2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463b00ba", new Object[]{this, context, str, str2, str3, new Boolean(z), new Boolean(z2), aVar});
            return;
        }
        AdapterForTLog.loge("globalAddress", "startSyncRecommendAddrFromRemote,eventType=" + str3 + ",hasLocation=" + z);
        this.f8968a.execute(new Runnable() { // from class: com.taobao.android.address.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final DeliverRequest deliverRequest = new DeliverRequest();
                try {
                    if (!z || (StringUtils.equals("appLaunch", str3) && c.a(c.this, "ingoreLBSWhenLaunch", "true"))) {
                        c.a(c.this, context, str, str2, str3, deliverRequest, z2, z, aVar);
                        return;
                    }
                    TBLocationOption tBLocationOption = new TBLocationOption();
                    tBLocationOption.setTimeout(TBLocationOption.Timeout.THREE_SECONDS);
                    tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.FIR_MIN);
                    TBLocationClient.a(c.a(c.this)).a(tBLocationOption, new com.taobao.location.client.a() { // from class: com.taobao.android.address.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // com.taobao.location.client.a
                        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                            } else {
                                c.a(c.this, tBLocationDTO, deliverRequest, context, str, str2, str3, z2, z, aVar);
                            }
                        }
                    }, Looper.getMainLooper());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void a(TBLocationDTO tBLocationDTO, DeliverRequest deliverRequest, Context context, String str, String str2, String str3, boolean z, boolean z2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734e2177", new Object[]{this, tBLocationDTO, deliverRequest, context, str, str2, str3, new Boolean(z), new Boolean(z2), aVar});
            return;
        }
        if (tBLocationDTO == null) {
            TBLocationDTO b = TBLocationClient.b();
            if (b != null) {
                deliverRequest.lat = b.latitude;
                deliverRequest.lng = b.longitude;
                deliverRequest.city = b.cityName;
            }
        } else {
            deliverRequest.lat = tBLocationDTO.latitude;
            deliverRequest.lng = tBLocationDTO.longitude;
            deliverRequest.city = tBLocationDTO.cityName;
        }
        a(context, str, str2, str3, deliverRequest, z, z2, aVar);
    }

    private void a(Context context, final String str, String str2, String str3, final DeliverRequest deliverRequest, boolean z, final boolean z2, final a aVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89e9401", new Object[]{this, context, str, str2, str3, deliverRequest, new Boolean(z), new Boolean(z2), aVar});
        } else if (!z && !Login.checkSessionValid() && StringUtils.isEmpty(deliverRequest.lng) && StringUtils.isEmpty(deliverRequest.lat)) {
            AdapterForTLog.loge("globalAddress", "AddrFromRemote no lbs");
            if (aVar == null) {
                return;
            }
            aVar.a(101, "没有登录态和LBS，不更新");
        } else {
            int a2 = a("address_traffic_limit_interval", String.valueOf(3000));
            if (!z && System.currentTimeMillis() - this.f < a2) {
                if (aVar == null) {
                    return;
                }
                aVar.a(102, "调用频繁");
            } else if (!z && System.currentTimeMillis() - this.f < a2 * 5 && this.g) {
                if (aVar == null) {
                    return;
                }
                aVar.a(102, "调用频繁");
            } else {
                try {
                    Double a3 = doc.a(deliverRequest.lng, deliverRequest.lat, this.c.getString(DispatchConstants.LONGTITUDE, ""), this.c.getString("Lat", ""));
                    AdapterForTLog.loge("globalAddress", "updateRecommendAddressFromRemote distance = " + a3);
                    int a4 = a("forceRequestInterval", "1440");
                    if (!z && a3 != null && c("checkDistanceThreshold", "true") && a3.doubleValue() < a("distanceThreshold", "300") && System.currentTimeMillis() - this.d.timestamp < a4 * 60000) {
                        if (aVar == null) {
                            return;
                        }
                        aVar.a(103, "间隔过近，不需要刷新");
                        return;
                    }
                } catch (Throwable unused) {
                }
                AdapterForTLog.loge("globalAddress", "updateRecommendAddressFromRemote");
                String string = this.c.getString("extInfoKey", "");
                try {
                    if (StringUtils.isEmpty(string)) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(string);
                    }
                    jSONObject.put("bizIdentity", str);
                    jSONObject.put("channel", str2);
                    if (StringUtils.equals(str, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                        jSONObject.put("eventType", "enterSearch");
                    } else if (!StringUtils.isEmpty(str3)) {
                        jSONObject.put("eventType", str3);
                    } else {
                        jSONObject.put("eventType", "nativeInvoke");
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                deliverRequest.extInfo = string;
                this.f = System.currentTimeMillis();
                this.g = true;
                HashMap hashMap = null;
                if (c("lbs_pull_flow_control", "true")) {
                    String d = d("lbs_pull_flow_control_info", "group=guide");
                    if (!StringUtils.isEmpty(d)) {
                        hashMap = new HashMap();
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "mbis");
                        if (!StringUtils.isEmpty(str)) {
                            d = d + ";biz_identity=" + str;
                        }
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, d);
                    }
                }
                e.a(this.b, deliverRequest, hashMap, new IRemoteBaseListener() { // from class: com.taobao.android.address.AddressSDKDelegate$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote onSystemError = " + i);
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(104, "网络异常");
                        }
                        c.a(c.this, false);
                        c.b(c.this);
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        c.a(c.this, false);
                        if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
                            return;
                        }
                        try {
                            final String optString = mtopResponse.getDataJsonObject().optString("returnValue");
                            AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote returnValue = " + optString);
                            c.this.f8968a.execute(new Runnable() { // from class: com.taobao.android.address.AddressSDKDelegate$2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    c.a(c.this, str, z2, false, optString, deliverRequest, aVar);
                                    c.b(c.this, false);
                                }
                            });
                        } catch (Throwable th2) {
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a("");
                            }
                            th2.printStackTrace();
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        c.a(c.this, false);
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(104, "网络异常");
                        }
                        AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote onError = " + i);
                        c.b(c.this);
                    }
                });
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!c("updateLocaleWhenPullFail", "false")) {
        } else {
            c();
            int a2 = a("expireTimeWhenPullFail", "5");
            this.d.timestamp = System.currentTimeMillis() - (((a("recommendAddressExpireTimeV2", "30") - a2) * 60) * 1000);
            d();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AdapterForTLog.loge("globalAddress", "clearDeliverAddress");
        this.d = new RecommendAddressContainer();
        SharedPreferences.Editor edit = this.c.edit();
        edit.clear();
        edit.apply();
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        AdapterForTLog.loge("globalAddress", "onUserSwitchAddr");
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || recommendAddressContainer.recommendAddressMap == null || this.d.recommendAddressMap.isEmpty()) {
            c();
        }
        a(str, StringUtils.equals(str2, "location"), false, str3, (DeliverRequest) null, (a) null);
        if (!StringUtils.equals(str2, "deliver")) {
            return;
        }
        this.e = true;
    }

    private void b(String str, String str2) {
        List parseArray;
        Map map;
        AdapterForTLog.loge("globalAddress", "updateTmallMarket clientCacheStr = " + str + ";;cookieStr=" + str2);
        try {
            if (!StringUtils.isEmpty(str) && c("refreshAddressClientCache", "true") && (map = (Map) com.alibaba.fastjson.JSONObject.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.android.address.c.2
                {
                    c.this = this;
                }
            }, new Feature[0])) != null && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        Class.forName("com.taobao.homepage.business.permission.b").getMethod("updateCache", String.class, String.class, String.class, String.class).invoke(null, "LBS", entry.getKey(), entry.getValue(), "JSBRIDGE");
                    }
                }
            }
            if (StringUtils.isEmpty(str2) || !c("refreshAddressCookies", "true") || (parseArray = JSONArray.parseArray(str2, String.class)) == null || parseArray.size() <= 0) {
                return;
            }
            a((String[]) parseArray.toArray(new String[0]));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else if (strArr != null) {
            for (String str : strArr) {
                if (!StringUtils.isEmpty(str)) {
                    LoginCookie parseCookie = LoginCookieUtils.parseCookie(str);
                    try {
                        CookieManager.getInstance().setCookie(LoginCookieUtils.getHttpDomin(parseCookie), parseCookie.toString());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    public void a(final String str, String str2, final boolean z, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b578a2", new Object[]{this, str, str2, new Boolean(z), str3});
            return;
        }
        AdapterForTLog.loge("globalAddress", "updateRecommendAddr recommendAddr = " + str3 + ";;;bizId = " + str);
        if (StringUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (this.d == null || this.d.recommendAddressMap == null || this.d.recommendAddressMap.isEmpty()) {
                c();
            }
            this.f8968a.execute(new Runnable() { // from class: com.taobao.android.address.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this, str, false, z, str3, (DeliverRequest) null, (a) null);
                    }
                }
            });
            if (!StringUtils.equals(str2, "deliver")) {
                return;
            }
            this.e = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
            return;
        }
        AdapterForTLog.loge("globalAddress", "updateRecommendAddr addressId = " + str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        try {
            if (this.d == null || this.d.recommendAddressMap == null || this.d.recommendAddressMap.isEmpty()) {
                c();
            }
            if (this.d.recommendAddressMap == null) {
                return;
            }
            Iterator<RecommendedAddress> it = this.d.recommendAddressMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                RecommendedAddress next = it.next();
                if (next != null && next.recommendedAddress != null && StringUtils.equals(next.recommendedAddress.addressId, str)) {
                    this.d.recommendAddressMap.clear();
                    break;
                }
            }
            if (!z) {
                return;
            }
            a(context, "", "", "addressInfoChange", str2, (a) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(String str, boolean z, boolean z2, String str2, DeliverRequest deliverRequest, a aVar) {
        Map<String, RecommendedAddress> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e953dc3", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, deliverRequest, aVar});
            return;
        }
        try {
            String str3 = "";
            if (StringUtils.isEmpty(str2)) {
                c();
                this.d.timestamp = System.currentTimeMillis();
                this.d.locationEnabled = z;
                this.d.isSessionValid = Login.checkSessionValid();
                d();
                a(str, aVar);
                SharedPreferences.Editor edit = this.c.edit();
                edit.putString("Lat", deliverRequest == null ? str3 : deliverRequest.lat);
                if (deliverRequest != null) {
                    str3 = deliverRequest.lng;
                }
                edit.putString(DispatchConstants.LONGTITUDE, str3);
                edit.apply();
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("data");
            if (!StringUtils.isEmpty(optString) && (map = (Map) com.alibaba.fastjson.JSONObject.parseObject(optString, new TypeReference<Map<String, RecommendedAddress>>() { // from class: com.taobao.android.address.c.4
                {
                    c.this = this;
                }
            }, new Feature[0])) != null) {
                this.d.timestamp = System.currentTimeMillis();
                this.d.locationEnabled = z;
                this.d.recommendAddressMap = map;
                this.d.isSessionValid = Login.checkSessionValid();
                d();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("clientCache");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("cookies");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("extInfo");
            String jSONObject2 = optJSONObject == null ? str3 : optJSONObject.toString();
            String jSONArray = optJSONArray == null ? str3 : optJSONArray.toString();
            String jSONObject3 = optJSONObject2 == null ? str3 : optJSONObject2.toString();
            SharedPreferences.Editor edit2 = this.c.edit();
            edit2.putString("clientCache", jSONObject2);
            edit2.putString("ccokiesKey", jSONArray);
            edit2.putString("extInfoKey", jSONObject3);
            edit2.putString("Lat", deliverRequest == null ? str3 : deliverRequest.lat);
            if (deliverRequest != null) {
                str3 = deliverRequest.lng;
            }
            edit2.putString(DispatchConstants.LONGTITUDE, str3);
            edit2.apply();
            if (StringUtils.equals(str, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME) || z2) {
                b(jSONObject2, jSONArray);
            }
            a(str, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a154e74", new Object[]{this, new Long(j), str, str2})).booleanValue();
        }
        long j2 = -1;
        if (!StringUtils.isEmpty(str)) {
            j2 = a(str + "_recommendAddressExpireTimeV2", "-1");
        }
        if (j2 < 0 && !StringUtils.isEmpty(str2)) {
            j2 = a(str2 + "_recommendAddressExpireTimeV2", "-1");
        }
        if (j2 < 0) {
            j2 = a("recommendAddressExpireTimeV2", "30");
        }
        return (System.currentTimeMillis() - ((j2 * 60) * 1000)) - j > 0;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        return c(str + "_needForceRefresh", "true");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String string = this.c.getString("globalAddressKey", "");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        try {
            this.d = (RecommendAddressContainer) com.alibaba.fastjson.JSONObject.parseObject(string, RecommendAddressContainer.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.d != null) {
            return;
        }
        this.d = new RecommendAddressContainer();
        this.d.recommendAddressMap = new HashMap();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String jSONString = JSON.toJSONString(this.d);
        this.c.edit().putString("globalAddressKey", jSONString).apply();
        AdapterForTLog.loge("globalAddress", "syncAddressInfoToLocal data = " + jSONString);
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("login4android", str, str2);
            AdapterForTLog.loge("globalAddress", "LoginSwitch:getConfig, key=" + str + ", value=" + config);
            return Integer.parseInt(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("login4android", str, str2);
            AdapterForTLog.loge("globalAddress", "LoginSwitch:getConfig, key=" + str + ", value=" + config);
            return Boolean.parseBoolean(config);
        } catch (Throwable unused) {
            return true;
        }
    }

    private String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bded401", new Object[]{this, str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig("login4android", str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    private void a(final String str, final String str2, final String str3, final boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7930eca", new Object[]{this, str, str2, str3, new Boolean(z), aVar});
            return;
        }
        this.i = new BroadcastReceiver() { // from class: com.taobao.android.address.AddressSDKDelegate$6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null) {
                } else {
                    int i = c.AnonymousClass5.f8974a[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i == 1) {
                        LoginBroadcastHelper.unregisterLoginReceiver(c.a(c.this), c.c(c.this));
                    } else if (i != 2 && i != 3) {
                    } else {
                        LoginBroadcastHelper.unregisterLoginReceiver(c.a(c.this), c.c(c.this));
                        c.a(c.this, context, str, str2, str3, z, false, aVar);
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(this.b, this.i);
    }
}
