package com.taobao.tbpoplayer.filter;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.util.e;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.arz;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Map<PopRequest, Pair<String, MtopBusiness>> f22213a = new ConcurrentHashMap();

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static b f22214a;

        static {
            kge.a(-1985958775);
            f22214a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9dc299e4", new Object[0]) : f22214a;
        }
    }

    static {
        kge.a(-1400688714);
    }

    public static /* synthetic */ void lambda$FGnZrlK9Pcck1aKH8j1Rx945CEs(b bVar, String str, JSONObject jSONObject, d dVar, IUserCheckRequestListener iUserCheckRequestListener) {
        bVar.b(str, jSONObject, dVar, iUserCheckRequestListener);
    }

    /* renamed from: lambda$LPLlbzqnWnWu33NR0YftW-K-oQI */
    public static /* synthetic */ void m1443lambda$LPLlbzqnWnWu33NR0YftWKoQI(b bVar, String str, JSONObject jSONObject, d dVar, IUserCheckRequestListener iUserCheckRequestListener) {
        bVar.d(str, jSONObject, dVar, iUserCheckRequestListener);
    }

    /* renamed from: lambda$QMvQvA-1eL-_cLrzto-WIfDoqD4 */
    public static /* synthetic */ void m1444lambda$QMvQvA1eL_cLrztoWIfDoqD4(b bVar, String str, JSONObject jSONObject, d dVar, IUserCheckRequestListener iUserCheckRequestListener) {
        bVar.c(str, jSONObject, dVar, iUserCheckRequestListener);
    }

    public static /* synthetic */ void a(b bVar, d dVar, String str, MtopResponse mtopResponse, String str2, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc0bed0", new Object[]{bVar, dVar, str, mtopResponse, str2, iUserCheckRequestListener});
        } else {
            bVar.a(dVar, str, mtopResponse, str2, iUserCheckRequestListener);
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9dc299e4", new Object[0]) : a.a();
    }

    public JSONObject a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8fb0e994", new Object[]{this, popRequest});
        }
        try {
            if (!(popRequest instanceof d)) {
                if (popRequest != null) {
                    popRequest.t().v = com.taobao.bootimage.d.CLOSE_TYPE_SKIP;
                }
                return null;
            }
            String str = ((d) popRequest).x().popPreCheckParams;
            if (StringUtils.isEmpty(str)) {
                popRequest.t().v = com.taobao.bootimage.d.CLOSE_TYPE_SKIP;
                return null;
            }
            JSONObject parseObject = JSONObject.parseObject(str);
            if (!StringUtils.isEmpty(parseObject.containsKey("name") ? parseObject.getString("name") : "")) {
                return parseObject;
            }
            popRequest.t().v = com.taobao.bootimage.d.CLOSE_TYPE_SKIP;
            return null;
        } catch (Throwable th) {
            c.a("getValidConfigJson.error.", th);
            return null;
        }
    }

    public boolean a(PopRequest popRequest, final JSONObject jSONObject, final IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77571ff", new Object[]{this, popRequest, jSONObject, iUserCheckRequestListener})).booleanValue();
        }
        try {
            final d dVar = (d) popRequest;
            final String string = jSONObject.getString("name");
            this.f22213a.put(popRequest, new Pair<>(string, null));
            long longValue = jSONObject.containsKey("sliceMs") ? jSONObject.getLong("sliceMs").longValue() : 0L;
            if (longValue > 0 && Build.VERSION.SDK_INT >= 19) {
                Handler handler = new Handler(Looper.getMainLooper());
                long abs = Math.abs(new SecureRandom().nextLong()) % longValue;
                String a2 = d.a(popRequest);
                c.b("triggerEvent", a2, "startPopCheckRequest.ReadyToExecute.name=" + string + ".sliceMs=" + longValue + ".delayMs=" + abs);
                handler.postDelayed(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$b$QMvQvA-1eL-_cLrzto-WIfDoqD4
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.m1444lambda$QMvQvA1eL_cLrztoWIfDoqD4(b.this, string, jSONObject, dVar, iUserCheckRequestListener);
                    }
                }, abs);
            } else {
                String a3 = d.a(popRequest);
                c.b("triggerEvent", a3, "startPopCheckRequest.ReadyToExecute.name=" + string + ".NoDelay.");
                Coordinator.execute(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$b$FGnZrlK9Pcck1aKH8j1Rx945CEs
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.lambda$FGnZrlK9Pcck1aKH8j1Rx945CEs(b.this, string, jSONObject, dVar, iUserCheckRequestListener);
                    }
                }, 23);
            }
            return true;
        } catch (Throwable th) {
            this.f22213a.remove(popRequest);
            iUserCheckRequestListener.onFinished(false, "", OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "startPopCheckRequestError", null, null);
            c.a("startPopCheckRequest.error.", th);
            return true;
        }
    }

    public /* synthetic */ void c(final String str, final JSONObject jSONObject, final d dVar, final IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3671ceb", new Object[]{this, str, jSONObject, dVar, iUserCheckRequestListener});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tbpoplayer.filter.-$$Lambda$b$LPLlbzqnWnWu33NR0YftW-K-oQI
                @Override // java.lang.Runnable
                public final void run() {
                    b.m1443lambda$LPLlbzqnWnWu33NR0YftWKoQI(b.this, str, jSONObject, dVar, iUserCheckRequestListener);
                }
            }, 23);
        }
    }

    public /* synthetic */ void d(String str, JSONObject jSONObject, d dVar, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec1136c", new Object[]{this, str, jSONObject, dVar, iUserCheckRequestListener});
        } else {
            a(str, jSONObject, dVar, iUserCheckRequestListener);
        }
    }

    public /* synthetic */ void b(String str, JSONObject jSONObject, d dVar, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80d266a", new Object[]{this, str, jSONObject, dVar, iUserCheckRequestListener});
        } else {
            a(str, jSONObject, dVar, iUserCheckRequestListener);
        }
    }

    public boolean b(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecf42c39", new Object[]{this, popRequest})).booleanValue();
        }
        if (popRequest == null) {
            return false;
        }
        try {
            Pair<String, MtopBusiness> pair = this.f22213a.get(popRequest);
            if (pair != null) {
                this.f22213a.remove(popRequest);
                if (pair.second != null && !((MtopBusiness) pair.second).isTaskCanceled()) {
                    ((MtopBusiness) pair.second).cancelRequest();
                    c.b("triggerEvent", d.a(popRequest), "startPopCheckRequest.cancelPopCheckRequest.");
                    return true;
                }
            }
        } catch (Throwable th) {
            c.a("cancelPopCheckRequest.error", th);
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01bf: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:123:0x01bf */
    private void a(final String str, JSONObject jSONObject, final d dVar, final IUserCheckRequestListener iUserCheckRequestListener) {
        d dVar2;
        d dVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb32fe9", new Object[]{this, str, jSONObject, dVar, iUserCheckRequestListener});
            return;
        }
        try {
            try {
                if (!StringUtils.isEmpty(str) && jSONObject != null && dVar != null && this.f22213a.containsKey(dVar)) {
                    String string = jSONObject.containsKey("version") ? jSONObject.getString("version") : "1.0";
                    String string2 = jSONObject.containsKey("requestParams") ? jSONObject.getString("requestParams") : "";
                    int intValue = jSONObject.containsKey("timeoutMs") ? jSONObject.getInteger("timeoutMs").intValue() : 3000;
                    final String string3 = jSONObject.getString("falseAction");
                    boolean booleanValue = jSONObject.getBooleanValue("login");
                    boolean booleanValue2 = jSONObject.getBooleanValue("wua");
                    if (booleanValue && StringUtils.isEmpty(Login.getUserId())) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("reason", "userIdEmpty");
                        hashMap.put("appendInfo", new JSONObject(hashMap2));
                        this.f22213a.remove(dVar);
                        dVar.t().aj = false;
                        iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, "userIdEmpty", null, hashMap);
                        return;
                    }
                    MtopRequest mtopRequest = new MtopRequest();
                    mtopRequest.setApiName(str);
                    mtopRequest.setVersion(string);
                    mtopRequest.setNeedEcode(booleanValue);
                    String a2 = d.a(dVar);
                    c.b("triggerEvent", a2, "startPopCheckRequest.ReadyToSend.names=" + str + ".needLogin=" + booleanValue + "needECode=" + booleanValue);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("poplayerParams", (Object) dVar.x().params);
                    jSONObject2.put("triggerUri", (Object) dVar.y().uri);
                    jSONObject2.put("triggerParam", (Object) dVar.y().param);
                    jSONObject2.put("uuid", (Object) a2);
                    JSONObject jSONObject3 = new JSONObject();
                    if (!StringUtils.isEmpty(string2)) {
                        jSONObject3 = JSON.parseObject(string2);
                    }
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                    }
                    a(jSONObject3, jSONObject2, true);
                    mtopRequest.setData(JSON.toJSONString(jSONObject3));
                    MtopBusiness mo1326setSocketTimeoutMilliSecond = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tbpoplayer.filter.MtopPopCheckHelper$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                b.a(b.this, dVar, str, mtopResponse, string3, iUserCheckRequestListener);
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            } else {
                                b.a(b.this, dVar, str, mtopResponse, string3, iUserCheckRequestListener);
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                b.a(b.this, dVar, str, mtopResponse, string3, iUserCheckRequestListener);
                            }
                        }
                    }).mo1342showLoginUI(false).mo1305reqMethod(MethodEnum.POST).mo1312setConnectionTimeoutMilliSecond(3000).mo1326setSocketTimeoutMilliSecond(intValue);
                    if (booleanValue2) {
                        mo1326setSocketTimeoutMilliSecond.mo1335useWua();
                    }
                    mo1326setSocketTimeoutMilliSecond.startRequest();
                    this.f22213a.put(dVar, new Pair<>(str, mo1326setSocketTimeoutMilliSecond));
                    return;
                }
                dVar2 = dVar;
                try {
                    iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "pageSwitchedAfterThreadSwitch", null, null);
                } catch (Throwable th) {
                    th = th;
                    if (dVar2 != null) {
                        try {
                            this.f22213a.remove(dVar2);
                        } catch (Throwable unused) {
                            iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "sendErrorError", str, null);
                            return;
                        }
                    }
                    iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "sendError", str, null);
                    c.a("startPopCheckRequest.sendUserCheckRequest.error", th);
                }
            } catch (Throwable th2) {
                th = th2;
                dVar2 = dVar3;
            }
        } catch (Throwable th3) {
            th = th3;
            dVar2 = dVar;
        }
    }

    private void a(d dVar, String str, MtopResponse mtopResponse, String str2, IUserCheckRequestListener iUserCheckRequestListener) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9b8746", new Object[]{this, dVar, str, mtopResponse, str2, iUserCheckRequestListener});
            return;
        }
        String a2 = d.a(dVar);
        c.b("triggerEvent", a2, "startPopCheckRequest.dealMtopResponse.");
        if (!this.f22213a.containsKey(dVar)) {
            return;
        }
        this.f22213a.remove(dVar);
        c.b("triggerEvent", a2, "startPopCheckRequest.dealMtopResponse.NeedDeal.");
        HashMap hashMap = new HashMap();
        try {
            if (mtopResponse != null) {
                String str3 = null;
                if (mtopResponse.getHeaderFields() != null && (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) != null && !list.isEmpty()) {
                    str3 = list.get(0);
                }
                dVar.t().w = str3;
                Map<String, Object> a3 = a(mtopResponse);
                JSONObject jSONObject = (JSONObject) a3.get("result");
                if (mtopResponse.isApiSuccess()) {
                    boolean a4 = a(e.a(jSONObject, "poplayerShouldPop"));
                    c.b("triggerEvent", a2, "startPopCheckRequest.dealMtopResponse.isApiSuccess=true.isPop=" + a4);
                    if (!a4) {
                        if (!b(e.a(jSONObject, "poplayerSkipFalseAction"))) {
                            a(str2, dVar);
                        }
                        iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop, a(jSONObject), null, a3);
                        return;
                    }
                    dVar.t().v = "commonPass";
                    iUserCheckRequestListener.onFinished(true, str, null, null, null, a3);
                    return;
                }
                c.b("triggerEvent", a2, "startPopCheckRequest.dealMtopResponse.isApiSuccess=false.RetCode=" + mtopResponse.getRetCode() + ".ResponseCode=" + mtopResponse.getResponseCode());
                dVar.t().W = b(mtopResponse);
                iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, mtopResponse.getRetCode(), str, a3);
                return;
            }
            c.b("triggerEvent", a2, "startPopCheckRequest.dealMtopResponse.response==null.");
            iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "responseNull", str, hashMap);
        } catch (Throwable th) {
            try {
                this.f22213a.remove(dVar);
                c.a("startPopCheckRequest.asyncRequest.dealMtopResponse.error", th);
                hashMap.put("result", (mtopResponse == null || mtopResponse.getBytedata() == null) ? "" : JSON.parseObject(new String(mtopResponse.getBytedata())));
                iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "dealMtopResponseError", str, hashMap);
            } catch (Throwable unused) {
                iUserCheckRequestListener.onFinished(false, str, OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail, "dealMtopResponseErrorError", str, hashMap);
            }
        }
    }

    public boolean a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7727ef70", new Object[]{this, jSONObject, jSONObject2, new Boolean(z)})).booleanValue();
        }
        if (jSONObject != null && jSONObject2 != null) {
            try {
                for (String str : jSONObject.keySet()) {
                    if (str != null && str.equals("popOriginParams")) {
                        jSONObject.put(str, (Object) JSON.toJSONString(jSONObject2));
                        return true;
                    } else if (jSONObject.get(str) instanceof JSONObject) {
                        if (a(jSONObject.getJSONObject(str), jSONObject2, false)) {
                            return true;
                        }
                    } else if (jSONObject.get(str) instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) jSONObject.get(str);
                        for (int i = 0; i < jSONArray.size(); i++) {
                            if (a(jSONArray.getJSONObject(i), jSONObject2, false)) {
                                return true;
                            }
                        }
                        continue;
                    } else if (jSONObject.get(str) instanceof String) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                        if (a(jSONObject3, jSONObject2, false)) {
                            jSONObject.put(str, (Object) JSON.toJSONString(jSONObject3));
                            return true;
                        }
                        JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                        if (jSONArray2 != null) {
                            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                                if (a(jSONArray2.getJSONObject(i2), jSONObject2, false)) {
                                    jSONObject.put(str, (Object) JSON.toJSONString(jSONArray2));
                                    return true;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                if (z) {
                    jSONObject.put("popOriginParams", (Object) JSON.toJSONString(jSONObject2));
                }
            } catch (Throwable th) {
                c.a("replacePopRequestOriginParams.error.", th);
            }
        }
        return false;
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!StringUtils.isDigitsOnly(str)) {
                return Boolean.parseBoolean(str);
            }
            return !str.equals("0");
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            return (obj instanceof Integer) && ((Integer) obj).intValue() != 0;
        }
    }

    private boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public void a(String str, PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b596dcbe", new Object[]{this, str, popRequest});
            return;
        }
        String a2 = d.a(popRequest);
        if (StringUtils.isEmpty(str) || popRequest == null || StringUtils.isEmpty(a2)) {
            return;
        }
        if (str.equals("increaseTime")) {
            popRequest.v();
        } else if (!str.equals("finishPop")) {
        } else {
            popRequest.w();
        }
    }

    public String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        Object a2 = e.a(jSONObject, "falseReason");
        return a2 instanceof String ? (String) a2 : "normalNoPop";
    }

    public Map<String, Object> a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8bf0da2", new Object[]{this, mtopResponse});
        }
        HashMap hashMap = new HashMap();
        if (mtopResponse != null) {
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("retCode", mtopResponse.getRetCode());
                hashMap2.put(arz.KEY_MAPPING_CODE, mtopResponse.getMappingCode());
                hashMap2.put(ZimMessageChannel.K_RPC_RES_CODE, Integer.valueOf(mtopResponse.getResponseCode()));
                hashMap.put("appendInfo", new JSONObject(hashMap2));
                JSONObject jSONObject = null;
                if (mtopResponse.getBytedata() != null) {
                    String str = new String(mtopResponse.getBytedata(), "UTF-8");
                    if (!StringUtils.isEmpty(str)) {
                        jSONObject = JSON.parseObject(str);
                    }
                }
                hashMap.put("result", jSONObject);
            } catch (Throwable th) {
                c.a("getResponseData.error.", th);
            }
        }
        return hashMap;
    }

    public String b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2ef8f2", new Object[]{this, mtopResponse});
        }
        JSONObject jSONObject = new JSONObject();
        if (mtopResponse != null) {
            try {
                jSONObject.put("api", (Object) mtopResponse.getApi());
                jSONObject.put("v", (Object) mtopResponse.getV());
                jSONObject.put("retCode", (Object) mtopResponse.getRetCode());
                jSONObject.put(arz.KEY_RET_MSG, (Object) mtopResponse.getRetMsg());
                jSONObject.put(arz.KEY_MAPPING_CODE, (Object) mtopResponse.getMappingCode());
                jSONObject.put(ZimMessageChannel.K_RPC_RES_CODE, (Object) Integer.valueOf(mtopResponse.getResponseCode()));
                jSONObject.put("headerFields", (Object) mtopResponse.getHeaderFields());
            } catch (Throwable th) {
                c.a("getErrorInfoForFailRequest.error.", th);
            }
        }
        return jSONObject.toJSONString();
    }

    public String a(d dVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f50b17e8", new Object[]{this, dVar});
        }
        if (dVar == null) {
            return "";
        }
        try {
            return (d.c(dVar) == null || (a2 = a((PopRequest) dVar)) == null || !a2.containsKey("requestParams")) ? "" : a2.getString("requestParams");
        } catch (Throwable th) {
            c.a("getRequestParam.error.", th);
            return "";
        }
    }
}
