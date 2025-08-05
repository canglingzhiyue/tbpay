package com.taobao.android.weex_ability.mtop;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import anetwork.channel.statist.StatisticData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.mtop.MUSMtopModule;
import com.taobao.android.weex_framework.adapter.i;
import com.taobao.android.weex_framework.common.a;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.g;
import com.taobao.mtop.wvplugin.MtopWVPlugin;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.impl.ResponseProtocolType;
import org.json.JSONArray;
import tb.jvk;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSMtopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_FAILED = "MS_FAILED";
    public static final String MSG_PARAM_ERR = "MSG_PARAM_ERR";
    public static final String MSG_SUCCESS = "MS_SUCCESS";
    private static final ScheduledThreadPoolExecutor b;

    /* renamed from: a  reason: collision with root package name */
    private MUSMtopModule.MTOP_VERSION f15939a;
    private Handler c = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.weex_ability.mtop.MUSMtopRequest.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.taobao.android.weex_framework.bridge.b d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 500 || !(message.obj instanceof b)) {
            } else {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("MUSMtopRequest", "call result, retString: " + ((b) message.obj).toString());
                }
                try {
                    b bVar = (b) message.obj;
                    if (bVar.c() == null || bVar.e() == null) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (MUSMtopRequest.a(MUSMtopRequest.this) == MUSMtopModule.MTOP_VERSION.V1) {
                        jSONObject.put("result", (Object) (bVar.a() ? MUSMtopRequest.MSG_SUCCESS : MUSMtopRequest.MSG_FAILED));
                        if (bVar.f() != null) {
                            jSONObject.put("data", (Object) bVar.f());
                        } else {
                            jSONObject.put("data", (Object) JSON.parseObject(bVar.toString()));
                        }
                        d = bVar.c();
                        if (!bVar.a()) {
                            a(bVar);
                        }
                    } else {
                        if (bVar.f() != null) {
                            jSONObject = bVar.f();
                        } else {
                            jSONObject = JSON.parseObject(bVar.toString());
                        }
                        if (bVar.a()) {
                            d = bVar.c();
                        } else {
                            if (!jSONObject.containsKey("result")) {
                                jSONObject.put("result", (Object) bVar.b());
                            }
                            d = bVar.d();
                            a(bVar);
                        }
                    }
                    if (d == null) {
                        return;
                    }
                    d.a(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        private void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2acb538c", new Object[]{this, bVar});
                return;
            }
            try {
                String string = bVar.e() != null ? bVar.e().getString("code") : "";
                if (l.a().i() == null) {
                    return;
                }
                i i = l.a().i();
                i.a(WXExceptionConfig.EXCEPTION_MTOP_ERROR, "MTOP", string, bVar.b() + "|" + bVar.f15947a, bVar.g());
            } catch (Exception unused) {
                g.d("mtop report exception");
            }
        }
    };

    public static /* synthetic */ MUSMtopModule.MTOP_VERSION a(MUSMtopRequest mUSMtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSMtopModule.MTOP_VERSION) ipChange.ipc$dispatch("77c5063a", new Object[]{mUSMtopRequest}) : mUSMtopRequest.f15939a;
    }

    public static /* synthetic */ b a(MUSMtopRequest mUSMtopRequest, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("43883001", new Object[]{mUSMtopRequest, bVar, bVar2, mtopResponse}) : mUSMtopRequest.a(bVar, bVar2, mtopResponse);
    }

    public static /* synthetic */ c a(MUSMtopRequest mUSMtopRequest, org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("985d9781", new Object[]{mUSMtopRequest, jSONObject}) : mUSMtopRequest.a(jSONObject);
    }

    public static /* synthetic */ com.taobao.android.weex_framework.common.a a(MUSMtopRequest mUSMtopRequest, int i, c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.common.a) ipChange.ipc$dispatch("ea47f00c", new Object[]{mUSMtopRequest, new Integer(i), cVar}) : mUSMtopRequest.a(i, cVar);
    }

    public static /* synthetic */ RemoteBusiness a(MUSMtopRequest mUSMtopRequest, MtopRequest mtopRequest, c cVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("4637c094", new Object[]{mUSMtopRequest, mtopRequest, cVar, str}) : mUSMtopRequest.a(mtopRequest, cVar, str);
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]) : b;
    }

    public static /* synthetic */ MtopRequest a(MUSMtopRequest mUSMtopRequest, c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequest) ipChange.ipc$dispatch("1a91c954", new Object[]{mUSMtopRequest, cVar}) : mUSMtopRequest.a(cVar);
    }

    public static /* synthetic */ void a(MUSMtopRequest mUSMtopRequest, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67434ca", new Object[]{mUSMtopRequest, bVar});
        } else {
            mUSMtopRequest.a(bVar);
        }
    }

    static {
        kge.a(-1075233453);
        b = new ScheduledThreadPoolExecutor(1, new jvk("MUSMtopRequest"));
        try {
            b.setKeepAliveTime(3L, TimeUnit.SECONDS);
            b.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            Log.e("MUSMtopRequest", "", th);
        }
    }

    public MUSMtopRequest(MUSMtopModule.MTOP_VERSION mtop_version) {
        this.f15939a = mtop_version;
    }

    public void a(p pVar, final String str, final com.taobao.android.weex_framework.bridge.b bVar, final com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76fe45d", new Object[]{this, pVar, str, bVar, bVar2});
            return;
        }
        final int instanceId = pVar.getInstanceId();
        final com.taobao.android.weex_framework.devtool.a aVar = new com.taobao.android.weex_framework.devtool.a();
        b.submit(new Runnable() { // from class: com.taobao.android.weex_ability.mtop.MUSMtopRequest.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    c a2 = MUSMtopRequest.a(MUSMtopRequest.this, jSONObject);
                    if (a2 == null) {
                        b bVar3 = new b(bVar, bVar2);
                        bVar3.a(com.taobao.mtop.wvplugin.a.RESULT_KEY, new JSONArray().put("HY_PARAM_ERR"));
                        MUSMtopRequest.a(MUSMtopRequest.this, bVar3);
                        return;
                    }
                    if (aVar != null) {
                        aVar.a(MUSMtopRequest.a(MUSMtopRequest.this, instanceId, a2));
                    }
                    MtopRequest a3 = MUSMtopRequest.a(MUSMtopRequest.this, a2);
                    String optString = jSONObject.optString("userAgent");
                    if (TextUtils.isEmpty(optString)) {
                        optString = m.a("system", "userAgent");
                    }
                    RemoteBusiness a4 = MUSMtopRequest.a(MUSMtopRequest.this, a3, a2, optString);
                    RbListener rbListener = new RbListener(bVar, bVar2, a4, a2.f, instanceId, aVar);
                    rbListener.requestAi = a3.getApiName();
                    a4.registeListener((IRemoteListener) rbListener);
                    a4.startRequest();
                } catch (Exception e) {
                    TBSdkLog.e("MUSMtopRequest", "send Request failed" + e);
                    b bVar4 = new b(bVar, bVar2);
                    bVar4.a(com.taobao.mtop.wvplugin.a.RESULT_KEY, new JSONArray().put("HY_FAILED"));
                    MUSMtopRequest.a(MUSMtopRequest.this, bVar4);
                }
            }
        });
    }

    public void a(p pVar, JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f74f19", new Object[]{this, pVar, jSONObject, bVar, bVar2});
        } else {
            a(pVar, jSONObject.toString(), bVar, bVar2);
        }
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2acb538c", new Object[]{this, bVar});
        } else {
            this.c.obtainMessage(500, bVar).sendToTarget();
        }
    }

    private com.taobao.android.weex_framework.common.a a(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.common.a) ipChange.ipc$dispatch("3cbd73ce", new Object[]{this, new Integer(i), cVar});
        }
        com.taobao.android.weex_framework.common.a aVar = new com.taobao.android.weex_framework.common.a();
        aVar.d = cVar.h ? "POST" : "GET";
        aVar.c = String.format("mtop://%s/%s?v=%s", this.f15939a == MUSMtopModule.MTOP_VERSION.V1 ? "send" : "request", cVar.f15948a, cVar.b);
        if (cVar.h) {
            aVar.e = cVar.j;
        } else {
            aVar.c += String.format("&data=%s", cVar.j);
        }
        Map<String, String> b2 = cVar.b();
        if (b2 != null) {
            aVar.b.putAll(b2);
        }
        aVar.g = new a.C0618a(NetworkResourceType.Fetch, i);
        return aVar;
    }

    private MtopRequest a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("d86d6016", new Object[]{this, cVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(cVar.f15948a);
        mtopRequest.setVersion(cVar.b);
        mtopRequest.setNeedEcode(cVar.c);
        mtopRequest.setNeedSession(true);
        if (!TextUtils.isEmpty(cVar.j)) {
            mtopRequest.setData(cVar.j);
        }
        mtopRequest.dataParams = cVar.a();
        return mtopRequest;
    }

    private RemoteBusiness a(MtopRequest mtopRequest, c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("c77c4756", new Object[]{this, mtopRequest, cVar, str});
        }
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, StringUtils.isBlank(cVar.e) ? SDKConfig.getInstance().getGlobalTtid() : cVar.e);
        build.mo1342showLoginUI(!cVar.i.equals("AutoLoginOnly"));
        if (cVar.l) {
            build.mo1303protocol(ProtocolEnum.HTTPSECURE);
        } else {
            build.mo1303protocol(ProtocolEnum.HTTP);
        }
        if (!TextUtils.isEmpty(cVar.k)) {
            build.mo1313setCustomDomain(cVar.k);
        }
        if (cVar.d > 0) {
            build.mo1335useWua();
        }
        build.mo1305reqMethod(cVar.h ? MethodEnum.POST : MethodEnum.GET);
        if (cVar.b() != null) {
            build.mo1297headers(cVar.b());
        }
        if (StringUtils.isNotBlank(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("x-ua", str);
            build.mo1297headers((Map<String, String>) hashMap);
        }
        if (!StringUtils.isBlank(cVar.g) && ("json".equals(cVar.g) || "originaljson".equals(cVar.g))) {
            build.mo1315setJsonType(JsonTypeEnum.valueOf(cVar.g.toUpperCase()));
        }
        if (!TextUtils.isEmpty(cVar.o)) {
            build.mo1310setBizTopic(cVar.o);
        }
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: JSONException -> 0x017a, TryCatch #0 {JSONException -> 0x017a, blocks: (B:6:0x002c, B:9:0x0050, B:12:0x0057, B:14:0x005f, B:21:0x007e, B:25:0x009a, B:27:0x00a2, B:35:0x00bd, B:38:0x00c7, B:40:0x00dc, B:41:0x00e5, B:43:0x00ee, B:45:0x0111, B:48:0x011c, B:49:0x0120, B:51:0x0126, B:53:0x013b, B:55:0x013f, B:56:0x0147, B:57:0x014d, B:59:0x0155, B:60:0x0159, B:62:0x015f, B:64:0x016f, B:66:0x0175, B:42:0x00e7, B:28:0x00a7, B:30:0x00ad, B:31:0x00b2, B:15:0x0068, B:19:0x0071, B:20:0x0074), top: B:71:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: JSONException -> 0x017a, TryCatch #0 {JSONException -> 0x017a, blocks: (B:6:0x002c, B:9:0x0050, B:12:0x0057, B:14:0x005f, B:21:0x007e, B:25:0x009a, B:27:0x00a2, B:35:0x00bd, B:38:0x00c7, B:40:0x00dc, B:41:0x00e5, B:43:0x00ee, B:45:0x0111, B:48:0x011c, B:49:0x0120, B:51:0x0126, B:53:0x013b, B:55:0x013f, B:56:0x0147, B:57:0x014d, B:59:0x0155, B:60:0x0159, B:62:0x015f, B:64:0x016f, B:66:0x0175, B:42:0x00e7, B:28:0x00a7, B:30:0x00ad, B:31:0x00b2, B:15:0x0068, B:19:0x0071, B:20:0x0074), top: B:71:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[Catch: JSONException -> 0x017a, TryCatch #0 {JSONException -> 0x017a, blocks: (B:6:0x002c, B:9:0x0050, B:12:0x0057, B:14:0x005f, B:21:0x007e, B:25:0x009a, B:27:0x00a2, B:35:0x00bd, B:38:0x00c7, B:40:0x00dc, B:41:0x00e5, B:43:0x00ee, B:45:0x0111, B:48:0x011c, B:49:0x0120, B:51:0x0126, B:53:0x013b, B:55:0x013f, B:56:0x0147, B:57:0x014d, B:59:0x0155, B:60:0x0159, B:62:0x015f, B:64:0x016f, B:66:0x0175, B:42:0x00e7, B:28:0x00a7, B:30:0x00ad, B:31:0x00b2, B:15:0x0068, B:19:0x0071, B:20:0x0074), top: B:71:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[Catch: JSONException -> 0x017a, TryCatch #0 {JSONException -> 0x017a, blocks: (B:6:0x002c, B:9:0x0050, B:12:0x0057, B:14:0x005f, B:21:0x007e, B:25:0x009a, B:27:0x00a2, B:35:0x00bd, B:38:0x00c7, B:40:0x00dc, B:41:0x00e5, B:43:0x00ee, B:45:0x0111, B:48:0x011c, B:49:0x0120, B:51:0x0126, B:53:0x013b, B:55:0x013f, B:56:0x0147, B:57:0x014d, B:59:0x0155, B:60:0x0159, B:62:0x015f, B:64:0x016f, B:66:0x0175, B:42:0x00e7, B:28:0x00a7, B:30:0x00ad, B:31:0x00b2, B:15:0x0068, B:19:0x0071, B:20:0x0074), top: B:71:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c A[Catch: JSONException -> 0x017a, TryCatch #0 {JSONException -> 0x017a, blocks: (B:6:0x002c, B:9:0x0050, B:12:0x0057, B:14:0x005f, B:21:0x007e, B:25:0x009a, B:27:0x00a2, B:35:0x00bd, B:38:0x00c7, B:40:0x00dc, B:41:0x00e5, B:43:0x00ee, B:45:0x0111, B:48:0x011c, B:49:0x0120, B:51:0x0126, B:53:0x013b, B:55:0x013f, B:56:0x0147, B:57:0x014d, B:59:0x0155, B:60:0x0159, B:62:0x015f, B:64:0x016f, B:66:0x0175, B:42:0x00e7, B:28:0x00a7, B:30:0x00ad, B:31:0x00b2, B:15:0x0068, B:19:0x0071, B:20:0x0074), top: B:71:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155 A[Catch: JSONException -> 0x017a, TryCatch #0 {JSONException -> 0x017a, blocks: (B:6:0x002c, B:9:0x0050, B:12:0x0057, B:14:0x005f, B:21:0x007e, B:25:0x009a, B:27:0x00a2, B:35:0x00bd, B:38:0x00c7, B:40:0x00dc, B:41:0x00e5, B:43:0x00ee, B:45:0x0111, B:48:0x011c, B:49:0x0120, B:51:0x0126, B:53:0x013b, B:55:0x013f, B:56:0x0147, B:57:0x014d, B:59:0x0155, B:60:0x0159, B:62:0x015f, B:64:0x016f, B:66:0x0175, B:42:0x00e7, B:28:0x00a7, B:30:0x00ad, B:31:0x00b2, B:15:0x0068, B:19:0x0071, B:20:0x0074), top: B:71:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.android.weex_ability.mtop.c a(org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.mtop.MUSMtopRequest.a(org.json.JSONObject):com.taobao.android.weex_ability.mtop.c");
    }

    private b a(com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1ef7677f", new Object[]{this, bVar, bVar2, mtopResponse});
        }
        long currentTimeMillis = System.currentTimeMillis();
        b bVar3 = new b(bVar, bVar2);
        if (mtopResponse != null) {
            bVar3.f15947a = mtopResponse.getApi();
        }
        bVar3.a(com.taobao.mtop.wvplugin.a.RESULT_KEY, new JSONArray().put("HY_FAILED"));
        if (mtopResponse == null) {
            bVar3.a("code", "-1");
            TBSdkLog.d("MUSMtopRequest", "parseResult: time out");
            return bVar3;
        }
        bVar3.a("code", String.valueOf(mtopResponse.getResponseCode()));
        if (mtopResponse.isSessionInvalid()) {
            bVar3.a(com.taobao.mtop.wvplugin.a.RESULT_KEY, new JSONArray().put(MtopWVPlugin.ERR_SID_INVALID));
            return bVar3;
        }
        try {
            if (mtopResponse.getBytedata() != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new String(mtopResponse.getBytedata(), "utf-8"));
                jSONObject.put("code", String.valueOf(mtopResponse.getResponseCode()));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (mtopResponse.getMtopStat() != null && mtopResponse.getMtopStat().getNetStat() != null) {
                    MtopStatistics mtopStat = mtopResponse.getMtopStat();
                    StatisticData netStat = mtopResponse.getMtopStat().getNetStat();
                    jSONObject2.put("oneWayTime", netStat.oneWayTime_AEngine);
                    jSONObject2.put("recDataSize", netStat.totalSize);
                    jSONObject2.put("eagleEyeTraceId", mtopStat.eagleEyeTraceId);
                    jSONObject2.put("falcoId", mtopStat.falcoId);
                } else {
                    jSONObject2.put("oneWayTime", 0);
                    jSONObject2.put("recDataSize", 0);
                }
                jSONObject.put("stat", jSONObject2);
                bVar3.a(jSONObject);
            }
            if (mtopResponse.isApiSuccess()) {
                bVar3.a(true);
            } else {
                bVar3.a(mtopResponse.getRetCode());
            }
        } catch (Exception unused) {
            if (TBSdkLog.isPrintLog()) {
                TBSdkLog.e("MUSMtopRequest", "parseResult mtop response parse fail, content: " + mtopResponse.toString());
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("MUSMtopRequest", "parseResult cost time(ms):" + (System.currentTimeMillis() - currentTimeMillis));
        }
        return bVar3;
    }

    /* loaded from: classes6.dex */
    public class RbListener implements IRemoteCacheListener, IRemoteListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MtopResponse cachedResponse;
        private com.taobao.android.weex_framework.bridge.b callback;
        private com.taobao.android.weex_framework.bridge.b failure;
        public String id;
        public int instanceId;
        private WeakReference<RemoteBusiness> rbWeakRef;
        public String requestAi;
        private long timer;
        private final com.taobao.android.weex_framework.devtool.a tracker;
        private boolean isTimeout = false;
        private boolean isFinish = false;

        static {
            kge.a(2104510229);
            kge.a(1840360250);
            kge.a(1454207888);
        }

        public static /* synthetic */ com.taobao.android.weex_framework.bridge.b access$700(RbListener rbListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.bridge.b) ipChange.ipc$dispatch("408ea7b5", new Object[]{rbListener}) : rbListener.callback;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.bridge.b access$800(RbListener rbListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.bridge.b) ipChange.ipc$dispatch("fc37d5d4", new Object[]{rbListener}) : rbListener.failure;
        }

        public RbListener(com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2, RemoteBusiness remoteBusiness, long j, int i, com.taobao.android.weex_framework.devtool.a aVar) {
            this.callback = bVar;
            this.failure = bVar2;
            this.timer = j;
            this.rbWeakRef = new WeakReference<>(remoteBusiness);
            this.instanceId = i;
            this.tracker = aVar;
        }

        public synchronized void onTimeOut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47459e9", new Object[]{this});
            } else if (this.isFinish) {
            } else {
                if (this.tracker != null) {
                    this.tracker.a(400, "request timeout");
                }
                this.isTimeout = true;
                RemoteBusiness remoteBusiness = this.rbWeakRef.get();
                if (remoteBusiness != null) {
                    remoteBusiness.cancelRequest();
                }
                MUSMtopRequest.a(MUSMtopRequest.this, MUSMtopRequest.a(MUSMtopRequest.this, this.callback, this.failure, this.cachedResponse));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public synchronized void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            if (mtopResponse != null && !this.isTimeout) {
                if (this.tracker != null) {
                    this.tracker.a(mtopResponse.getResponseCode(), false, mtopResponse.getHeaderFields());
                    this.tracker.a(mtopResponse.getBytedata());
                    this.tracker.b();
                }
                this.isFinish = true;
                MUSMtopRequest.a().submit(new Runnable() { // from class: com.taobao.android.weex_ability.mtop.MUSMtopRequest.RbListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b a2 = MUSMtopRequest.a(MUSMtopRequest.this, RbListener.access$700(RbListener.this), RbListener.access$800(RbListener.this), mtopResponse);
                        if (a2 != null) {
                            try {
                                a2.a(JSON.parseObject(a2.toString()));
                            } catch (Exception unused) {
                            }
                        }
                        MUSMtopRequest.a(MUSMtopRequest.this, a2);
                    }
                });
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public synchronized void onError(int i, final MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null && !this.isTimeout) {
                if (this.tracker != null) {
                    this.tracker.a(mtopResponse.getResponseCode(), false, mtopResponse.getHeaderFields());
                    this.tracker.a(mtopResponse.getBytedata());
                    com.taobao.android.weex_framework.devtool.a aVar = this.tracker;
                    aVar.a(404, mtopResponse.getRetCode() + ResponseProtocolType.COMMENT + mtopResponse.getRetMsg());
                }
                this.isFinish = true;
                MUSMtopRequest.a().submit(new Runnable() { // from class: com.taobao.android.weex_ability.mtop.MUSMtopRequest.RbListener.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b a2 = MUSMtopRequest.a(MUSMtopRequest.this, RbListener.access$700(RbListener.this), RbListener.access$800(RbListener.this), mtopResponse);
                        a2.a(RbListener.this.instanceId);
                        MUSMtopRequest.a(MUSMtopRequest.this, a2);
                    }
                });
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
        public synchronized void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            if (mtopCacheEvent != null) {
                this.cachedResponse = mtopCacheEvent.getMtopResponse();
                if (this.tracker != null) {
                    this.tracker.a(this.cachedResponse.getResponseCode(), true, this.cachedResponse.getHeaderFields());
                    this.tracker.a(this.cachedResponse.getBytedata());
                    this.tracker.b();
                }
                MUSMtopRequest.a().schedule(new Runnable() { // from class: com.taobao.android.weex_ability.mtop.MUSMtopRequest.RbListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            RbListener.this.onTimeOut();
                        }
                    }
                }, this.timer, TimeUnit.MILLISECONDS);
            }
        }
    }
}
