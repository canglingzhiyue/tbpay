package com.taobao.android.searchbaseframe.ace;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.AceStrategy;
import com.taobao.android.searchbaseframe.ace.model.AceStrategySummary;
import com.taobao.android.searchbaseframe.ace.model.AceSubStrategy;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.MTopModel;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.network.domain.Request;
import tb.imn;
import tb.imp;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACE_PARAMS_FLAG = "__ACE_PARAMS_FLAG__";
    public static final String ACE_REPORT_FLAG = "__ACE_REPORT_FLAG__";

    /* renamed from: a  reason: collision with root package name */
    private static volatile AceStrategy f14945a;
    private static final Map<String, AceSubStrategy> b;

    static {
        kge.a(-1417973419);
        b = new ConcurrentHashMap();
    }

    public static void a(String str, AceSubStrategy aceSubStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3699df3f", new Object[]{str, aceSubStrategy});
            return;
        }
        b.put(str, aceSubStrategy);
        f14945a = null;
        imp.a().b(c());
    }

    public static void a(AceStrategy aceStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b26a041", new Object[]{aceStrategy});
            return;
        }
        f14945a = aceStrategy;
        b.clear();
        imp.a().b(c());
    }

    private static AceSubStrategy b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AceSubStrategy) ipChange.ipc$dispatch("246e5c14", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        if (f14945a != null) {
            return f14945a.getSubStrategy(str);
        }
        return b.get(str);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f14945a = null;
        b.clear();
        imp.a().b(c());
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        b.remove(str);
        imp.a().b(c());
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        f14945a = null;
        imp.a().b(c());
    }

    public static JsonRpcRequest c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("224efb29", new Object[0]);
        }
        List<AceStrategySummary> d = d();
        JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.strategy");
        obtainMessage.setParams((JSON) JSON.toJSON(d));
        return obtainMessage;
    }

    private static boolean a(imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edf4cad2", new Object[]{imnVar})).booleanValue() : imnVar.l().a() && imp.a().b();
    }

    public static String a(imn imnVar, String str) {
        AceSubStrategy b2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c4eaa88", new Object[]{imnVar, str}) : (a(imnVar) && (b2 = b(str)) != null) ? b2.getUrl() : "";
    }

    public static void a(imn imnVar, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d75501", new Object[]{imnVar, map, str});
        } else {
            a(imnVar, map, str, true);
        }
    }

    public static void a(imn imnVar, Map<String, String> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7613fdf3", new Object[]{imnVar, map, str, new Boolean(z)});
        } else if (!a(imnVar)) {
        } else {
            map.put(ACE_PARAMS_FLAG, "true");
            if (z) {
                map.put(ACE_REPORT_FLAG, "true");
            }
            if (f14945a != null) {
                map.putAll(f14945a.getParams());
            }
            AceSubStrategy b2 = b(str);
            if (b2 == null) {
                return;
            }
            map.put("aceId", b2.getId());
            Map<String, String> requestParams = b2.getRequestParams();
            if (requestParams == null) {
                return;
            }
            map.putAll(requestParams);
        }
    }

    public static void a(imn imnVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c182e4e", new Object[]{imnVar, str, str2, jSONObject});
        } else if (a(imnVar)) {
            try {
                HashMap hashMap = new HashMap();
                Uri parse = Uri.parse(str);
                for (String str3 : parse.getQuery().split("&")) {
                    String[] split = str3.split("=");
                    if (split.length >= 2) {
                        hashMap.put(split[0], split[1]);
                    }
                }
                String uri = parse.buildUpon().clearQuery().build().toString();
                MTopModel mTopModel = new MTopModel();
                mTopModel.setApiName(uri);
                mTopModel.setParams((JSONObject) JSON.toJSON(hashMap));
                mTopModel.setResponse(jSONObject);
                mTopModel.setStatus("200");
                mTopModel.setRequestAlias(str2);
                a(mTopModel);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(imn imnVar, String str, com.taobao.android.searchbaseframe.net.a aVar, e eVar) {
        Map map;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e58130", new Object[]{imnVar, str, aVar, eVar});
        } else if (imnVar.l().a() && imp.a().b()) {
            try {
                if ("POST".equals(aVar.f14989a)) {
                    str2 = (String) aVar.b;
                    map = (Map) aVar.c;
                } else {
                    HashMap hashMap = new HashMap();
                    Uri parse = Uri.parse((String) aVar.b);
                    for (String str3 : parse.getQuery().split("&")) {
                        String[] split = str3.split("=");
                        if (split.length >= 2) {
                            hashMap.put(split[0], split[1]);
                        }
                    }
                    String uri = parse.buildUpon().clearQuery().build().toString();
                    map = hashMap;
                    str2 = uri;
                }
                MTopModel mTopModel = new MTopModel();
                mTopModel.setApiName(str2);
                mTopModel.setParams((JSONObject) JSON.toJSON(map));
                mTopModel.setResponse(JSON.parseObject(new String(eVar.a())));
                eVar.e().remove(null);
                mTopModel.setResponseHeaders((JSONObject) JSON.toJSON(eVar.e()));
                mTopModel.setStatus("200");
                mTopModel.setRequestAlias(str);
                a(mTopModel);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(imn imnVar, String str, MtopRequest mtopRequest, d dVar) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f439bc9", new Object[]{imnVar, str, mtopRequest, dVar});
        } else if (!a(imnVar) || (bArr = dVar.e) == null) {
        } else {
            MTopModel mTopModel = new MTopModel();
            mTopModel.setApiName(mtopRequest.getApiName());
            mTopModel.setParams(JSON.parseObject(mtopRequest.getData()));
            mTopModel.setResponse(JSON.parseObject(new String(bArr)));
            mTopModel.setStatus(String.valueOf(dVar.f21113a));
            JSONObject jSONObject = (JSONObject) JSON.toJSON(dVar.g);
            jSONObject.remove(null);
            mTopModel.setResponseHeaders(jSONObject);
            mTopModel.setRequestAlias(str);
            AceSubStrategy b2 = b(str);
            if (b2 == null || "strategy".equals(b2.getStrategyType())) {
                a(mTopModel);
                return;
            }
            JSONObject b3 = b(mTopModel);
            if (b3 == null) {
                return;
            }
            dVar.e = b3.toString().getBytes();
        }
    }

    private static void a(MTopModel mTopModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62122ed6", new Object[]{mTopModel});
            return;
        }
        JsonRpcRequest obtainRequest = JsonRpcRequest.obtainRequest("monitor.data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hookType", (Object) "mtop");
        jSONObject.put("data", JSON.toJSON(mTopModel));
        obtainRequest.setParams(jSONObject);
        imp.a().b(obtainRequest);
    }

    private static JSONObject b(MTopModel mTopModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e1b5e77", new Object[]{mTopModel});
        }
        JsonRpcRequest obtainRequest = JsonRpcRequest.obtainRequest("getAceMockResult");
        obtainRequest.setParams((JSON) JSON.toJSON(mTopModel));
        try {
            return imp.a().a(obtainRequest).get(3000L, TimeUnit.MILLISECONDS).getResult().getJSONObject("data");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(imn imnVar, String str, MtopRequest mtopRequest, MtopResponse mtopResponse, MtopBusiness mtopBusiness) {
        Request request;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6500706", new Object[]{imnVar, str, mtopRequest, mtopResponse, mtopBusiness});
        } else if (!a(imnVar)) {
        } else {
            byte[] bytedata = mtopResponse.getBytedata();
            MTopModel mTopModel = new MTopModel();
            mTopModel.setApiName(mtopRequest.getApiName());
            mTopModel.setParams(JSON.parseObject(mtopRequest.getData()));
            if (bytedata != null) {
                mTopModel.setResponse(JSON.parseObject(new String(bytedata)));
            } else {
                mTopModel.setResponse(new JSONObject());
            }
            mTopModel.setStatus(String.valueOf(mtopResponse.getResponseCode()));
            JSONObject jSONObject = (JSONObject) JSON.toJSON(mtopResponse.getHeaderFields());
            if (jSONObject != null) {
                jSONObject.remove(null);
                mTopModel.setResponseHeaders(jSONObject);
            }
            if (mtopBusiness != null && mtopBusiness.getMtopContext() != null && (request = mtopBusiness.getMtopContext().k) != null) {
                mTopModel.setRequestHeaders((JSONObject) JSON.toJSON(request.c));
            }
            mTopModel.setRequestAlias(str);
            AceSubStrategy b2 = b(str);
            if (b2 == null || "strategy".equals(b2.getStrategyType())) {
                a(mTopModel);
                return;
            }
            JSONObject b3 = b(mTopModel);
            if (b3 == null) {
                return;
            }
            if (mtopResponse.getOriginFastJsonObject() != null) {
                mtopResponse.setOriginFastJsonObject(b3);
            }
            mtopResponse.setBytedata(b3.toString().getBytes());
            JSONArray jSONArray = b3.getJSONArray(com.taobao.mtop.wvplugin.a.RESULT_KEY);
            if (jSONArray == null || jSONArray.isEmpty()) {
                return;
            }
            String[] split = jSONArray.getString(0).split("::");
            if (split.length < 2) {
                return;
            }
            mtopResponse.setRetCode(split[0]);
            mtopResponse.setRetMsg(split[1]);
        }
    }

    public static List<AceStrategySummary> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        if (f14945a != null) {
            arrayList.add(AceStrategySummary.strategy(f14945a.getId(), f14945a.getName(), f14945a.getParams()));
        } else {
            for (Map.Entry<String, AceSubStrategy> entry : b.entrySet()) {
                arrayList.add(AceStrategySummary.mock(entry.getValue().getId(), entry.getKey()));
            }
        }
        return arrayList;
    }
}
