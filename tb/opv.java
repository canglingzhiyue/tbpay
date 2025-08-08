package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes.dex */
public class opv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f32270a;
    private final String b;

    static {
        kge.a(-33495237);
    }

    public opv(String str, String str2) {
        this.f32270a = str;
        this.b = str2;
    }

    public void a(AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2192a0", new Object[]{this, awesomeGetRequestParams});
            return;
        }
        b(awesomeGetRequestParams, this.b, this.f32270a);
        a(awesomeGetRequestParams, this.b, this.f32270a);
    }

    public void a(AwesomeGetRequestParams awesomeGetRequestParams, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab41e5db", new Object[]{this, awesomeGetRequestParams, str, map});
            return;
        }
        b(awesomeGetRequestParams, str, map, this.b, this.f32270a);
        a(awesomeGetRequestParams, str, map, this.b, this.f32270a);
    }

    private void a(AwesomeGetRequestParams awesomeGetRequestParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee87f7b4", new Object[]{this, awesomeGetRequestParams, str, str2});
            return;
        }
        ksk a2 = ksk.a(b(awesomeGetRequestParams));
        if (a2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("optimizeType", str);
        hashMap.put("from", str2);
        lap.a("recmdPrefetch", "umbrellaTrackerWhenStart", "receiveParams:" + hashMap);
        a.a(a2.f30287a, "prefetchRequestStart", (String) null, "infoflowPrefetchRequest", (String) null, hashMap);
    }

    private void a(AwesomeGetRequestParams awesomeGetRequestParams, String str, Map<String, String> map, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe8896f", new Object[]{this, awesomeGetRequestParams, str, map, str2, str3});
            return;
        }
        ksk a2 = ksk.a(b(awesomeGetRequestParams));
        if (a2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            String str5 = map.get(MtopPrefetch.IPrefetchCallback.DATA_API);
            String str6 = map.get(MtopPrefetch.IPrefetchCallback.DATA_VERSION);
            if (str5 != null && str6 != null) {
                hashMap.put("apiName", str5);
                hashMap.put("apiVersion", str6);
            }
        }
        if ("TYPE_HIT".equals(str) || "TYPE_MERGE".equals(str)) {
            str4 = "success";
        } else {
            if (map != null) {
                map.remove(MtopPrefetch.IPrefetchCallback.DATA_REQ_PARAM);
                hashMap.put("errorMsg", map.toString());
                hashMap.put("errorCode", str);
            }
            str4 = "failed";
        }
        hashMap.put("result", str4);
        hashMap.put("concreteType", str);
        hashMap.put("optimizeType", str2);
        hashMap.put("from", str3);
        lap.a("recmdPrefetch", "umbrellaTrackerWhenEnd", "receiveParams:" + hashMap);
        a.a(a2.f30287a, "prefetchRequestResult", (String) null, "infoflowPrefetchRequest", (String) null, hashMap);
    }

    private void b(AwesomeGetRequestParams awesomeGetRequestParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3125d3", new Object[]{this, awesomeGetRequestParams, str, str2});
        } else {
            a(ksk.a(b(awesomeGetRequestParams)), "preRequestStart", (JSONObject) null, str, str2);
        }
    }

    private void b(AwesomeGetRequestParams awesomeGetRequestParams, String str, Map<String, String> map, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5975db30", new Object[]{this, awesomeGetRequestParams, str, map, str2, str3});
            return;
        }
        ksk a2 = ksk.a(b(awesomeGetRequestParams));
        if (a2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if ("TYPE_HIT".equals(str) || "TYPE_MERGE".equals(str)) {
            str4 = "success";
        } else {
            if (map != null) {
                map.remove(MtopPrefetch.IPrefetchCallback.DATA_REQ_PARAM);
                jSONObject.put("errorMsg", (Object) map);
                jSONObject.put("errorCode", (Object) str);
            }
            str4 = "failed";
        }
        jSONObject.put("result", (Object) str4);
        a(a2, "preRequestEnd", new JSONObject(jSONObject), str2, str3);
    }

    private String b(AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2aa23641", new Object[]{this, awesomeGetRequestParams});
        }
        Set<String> keySet = awesomeGetRequestParams.containerParams.keySet();
        if (keySet.isEmpty()) {
            return null;
        }
        return keySet.iterator().next();
    }

    private static void a(ksk kskVar, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d644e5", new Object[]{kskVar, str, jSONObject, str2, str3});
        } else if (kskVar == null) {
        } else {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            String c = opj.c();
            if (!StringUtils.isEmpty(c)) {
                jSONObject2.put("experimentType", (Object) c);
            }
            jSONObject2.put("optimizeType", (Object) str2);
            jSONObject2.put("from", (Object) str3);
            jSONObject2.put("deviceLevel", (Object) g.b());
            lap.a("recmdPrefetch", "commitCurrentStagePrefetch", str + ResponseProtocolType.COMMENT + jSONObject2);
            kss.a(kskVar.c, 19999, "tradeInfoflowPrefetchRequest", kskVar.f30287a, str, jSONObject2);
        }
    }
}
