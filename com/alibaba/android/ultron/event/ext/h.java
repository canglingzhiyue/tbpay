package com.alibaba.android.ultron.event.ext;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bkd;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = false;
    public static final String NEXT_TAG_FAIL = "fail";
    public static final String NEXT_TAG_SUCESS = "success";
    public static final String TAG = "MtopV2Subscriber";

    /* renamed from: a */
    private String f2592a = null;
    private Map<String, String> b = null;

    static {
        kge.a(-575124503);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "2110943770285271256";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Context a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bbe70304", new Object[]{hVar}) : hVar.d;
    }

    public h a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("af23c048", new Object[]{this, str});
        }
        this.f2592a = str;
        return this;
    }

    public h b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("73b644be", new Object[]{this, map});
        }
        this.b = map;
        return this;
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        JSONObject e = e(eVar);
        if (e == null) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: eventFields is null");
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject jSONObject = e.getJSONObject("mtopConfig");
        final String string = e.getString("subfilter");
        if (jSONObject == null) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: mtopConfig is null");
            return;
        }
        String string2 = jSONObject.getString("apiMethod");
        String string3 = jSONObject.getString("apiVersion");
        JSONObject jSONObject2 = null;
        if (jSONObject.get("data") instanceof JSONObject) {
            jSONObject2 = jSONObject.getJSONObject("data");
        } else if (jSONObject.get("data") instanceof String) {
            try {
                jSONObject2 = JSONObject.parseObject(jSONObject.getString("data"));
            } catch (Throwable th) {
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", th.toString());
            }
        }
        boolean equals = "true".equals(jSONObject.getString("isNeedWua"));
        boolean equals2 = "true".equals(jSONObject.getString("usePost"));
        com.alibaba.android.ultron.vfw.instance.b h = eVar.h();
        String string4 = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        HashMap hashMap = new HashMap();
        if (StringUtils.equals(string4, "async")) {
            hashMap.put("params", a(h.b(), eVar.d()));
        } else if (StringUtils.equals(string4, "submit")) {
            hashMap.put("params", a(h.b()));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.putAll(hashMap);
        if (jSONObject2 != null) {
            for (String str : jSONObject2.keySet()) {
                Object obj = jSONObject2.get(str);
                if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                    jSONObject3.put(str, (Object) JSON.toJSONString(obj));
                } else {
                    jSONObject3.put(str, obj);
                }
            }
        }
        Map<String, String> map = this.b;
        if (map != null) {
            jSONObject3.putAll(map);
        }
        a(mtopRequest, jSONObject3);
        if (StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3)) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: apiMethod or apiVersion is null");
            return;
        }
        JSONObject jSONObject4 = e.getJSONObject("loadingConfig");
        if (jSONObject4 != null) {
            eVar.h().a(jSONObject4.getString("message"));
        }
        mtopRequest.setApiName(string2);
        mtopRequest.setVersion(string3);
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(equals2 ? MethodEnum.POST : MethodEnum.GET);
        if (equals) {
            build.mo1335useWua();
        }
        String str2 = this.f2592a;
        if (str2 != null) {
            build.mo1328setUnitStrategy(str2);
        }
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.event.ext.MtopV2Subscriber$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    return;
                }
                bkd.a("MtopV2Subscriber", "onSystemError", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
                eVar.h().e();
                h.this.a(eVar, "fail", mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj2});
                    return;
                }
                bkd.a("MtopV2Subscriber", "onSuccess", mtopResponse.getApi() + " onSuccess: " + mtopResponse.getRetMsg());
                eVar.h().e();
                if (!StringUtils.isEmpty(string) && com.alibaba.android.ultron.engine.utils.h.a(h.a(h.this), string, mtopResponse.getDataJsonObject())) {
                    bkd.a("MtopV2Subscriber", "onSuccess", "subfilter执行失败，请求判断为fail: " + string);
                    h.this.a(eVar, "fail", mtopResponse);
                    return;
                }
                h.this.a(eVar, "success", mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    return;
                }
                bkd.a("MtopV2Subscriber", "onError", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
                eVar.h().e();
                h.this.a(eVar, "fail", mtopResponse);
            }
        });
        String simpleName = getClass().getSimpleName();
        bkd.a(simpleName, "onHandleEventChain", "start execute: " + string2);
        build.startRequest();
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str, MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee77c92", new Object[]{this, eVar, str, mtopResponse});
            return;
        }
        String str2 = null;
        if (mtopResponse != null) {
            try {
                jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            } catch (Exception e) {
                bkd.a(getClass().getSimpleName(), "getAndDoNextByTag", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "JSON PARSE ERROR:" + bkd.a(e));
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                jSONObject.put("api", (Object) mtopResponse.getApi());
                jSONObject.put("data", (Object) new JSONObject());
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) jSONArray);
                Object[] objArr = new Object[2];
                objArr[0] = StringUtils.isEmpty(mtopResponse.getRetCode()) ? Integer.valueOf(mtopResponse.getResponseCode()) : mtopResponse.getRetCode();
                objArr[1] = mtopResponse.getRetMsg();
                jSONArray.add(String.format("%s::%s", objArr));
                jSONObject.put("v", (Object) mtopResponse.getV());
            }
            a(eVar, str, jSONObject);
        } else {
            a(eVar, str);
        }
        String str3 = "success".equals(str) ? "toastSucceed" : "toastError";
        if (e(eVar).get(str3) instanceof String) {
            String string = e(eVar).getString(str3);
            if ("response_msg".equals(string)) {
                if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
                    str2 = mtopResponse.getDataJsonObject().optString("msg");
                }
                if (StringUtils.isEmpty(str2) && mtopResponse != null && str == "fail") {
                    str2 = mtopResponse.getRetMsg();
                }
            } else {
                str2 = string;
            }
        }
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        com.alibaba.android.ultron.vfw.widget.a.a(this.d, str2);
    }

    public boolean a(MtopRequest mtopRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e4381", new Object[]{this, mtopRequest, jSONObject})).booleanValue();
        }
        if (mtopRequest == null || jSONObject == null) {
            return false;
        }
        mtopRequest.setData(jSONObject.toJSONString());
        return true;
    }

    private String a(jny jnyVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c4f388f", new Object[]{this, jnyVar, iDMComponent});
        }
        if (!(jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b)) {
            return "";
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
        return bVar.t().a(bVar, iDMComponent);
    }

    private String a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26e03ffd", new Object[]{this, jnyVar});
        }
        if (!(jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b)) {
            return "";
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
        return bVar.t().a(bVar);
    }
}
