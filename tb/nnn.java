package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.search.common.util.y;
import com.taobao.search.sf.j;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.LimitDialog;
import com.taobao.tao.util.TaoHelper;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class nnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(139479299);
    }

    public static nno a(nnl nnlVar, nul nulVar) {
        HashMap hashMap;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nno) ipChange.ipc$dispatch("bd5d2060", new Object[]{nnlVar, nulVar});
        }
        nnm nnmVar = new nnm();
        if (nnlVar == null) {
            nul.a(nulVar, "Request", "-1", "mtopInfo is null");
            nnmVar.e = false;
            return nnmVar;
        }
        if (j.f19452a != null) {
            String a2 = j.f19452a.k().a(nnlVar.i);
            if (!StringUtils.isEmpty(a2)) {
                return a(a2, nnlVar);
            }
        }
        String str2 = nnlVar.f31592a;
        String str3 = nnlVar.b;
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str2);
        mtopRequest.setVersion(str3);
        a(mtopRequest, nnlVar);
        if (nnlVar.g != null && !nnlVar.g.isEmpty()) {
            hashMap = new HashMap(nnlVar.g);
            str = (String) hashMap.get("appId");
        } else {
            hashMap = new HashMap();
            str = "";
        }
        hashMap.put("apiVersion", str3);
        hashMap.put("appId", str);
        hashMap.put("apiName", str2);
        if (nnlVar.h != null && !nnlVar.h.isEmpty()) {
            hashMap.putAll(nnlVar.h);
        }
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "api or version is null");
            nul.b(nulVar, "Request", hashMap);
            return nnmVar;
        }
        mtopRequest.setNeedSession(nnlVar.c);
        mtopRequest.setNeedEcode(nnlVar.d);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, TaoHelper.getTTID());
        build.mo1340setBizId(89);
        if (nnlVar.j) {
            build.mo1335useWua();
        }
        if (!StringUtils.isEmpty(nnlVar.l)) {
            build.mo1310setBizTopic(nnlVar.l).mo1319setPageIndex(nnlVar.m.intValue());
        }
        if (nnlVar.k != null) {
            build.mo1305reqMethod(nnlVar.k);
        }
        if (nnlVar.f != null && nnlVar.f.size() > 0) {
            for (Map.Entry<String, String> entry : nnlVar.f.entrySet()) {
                build.mo1289addHttpQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        MtopResponse syncRequest = build.syncRequest();
        b.a(j.f19452a, nnlVar.i, mtopRequest, syncRequest, build);
        byte[] bytedata = syncRequest.getBytedata();
        nnmVar.b = syncRequest.getRetCode();
        nnmVar.c = syncRequest.getRetMsg();
        if ("SUCCESS".equalsIgnoreCase(nnmVar.b)) {
            nnmVar.e = true;
        } else {
            nnmVar.e = false;
            nnmVar.f31593a = LimitDialog.setErrorResponse(syncRequest);
        }
        if (bytedata != null) {
            nnmVar.f = bytedata;
        }
        String str4 = nnlVar.i;
        if (nnlVar.e) {
            str4 = str4 + "-" + nnlVar.g.get("appId");
        }
        if (j.f19452a != null) {
            j.f19452a.k().a(b(nnlVar), nnmVar.f, str4, true);
        }
        nnmVar.d = syncRequest.getMtopStat();
        try {
            hashMap.put("mtopTraceId", build.mtopProp.falcoId);
            List<String> list = syncRequest.getHeaderFields().get("eagleeye-traceid");
            if (list != null && list.size() > 0) {
                hashMap.put("eagleeyeTraceId", list.get(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!nnmVar.e) {
            hashMap.put("errCode", nnmVar.b);
            hashMap.put("errMsg", nnmVar.c);
            hashMap.put("isApiLocked", String.valueOf(nnmVar.f31593a));
            nul.b(nulVar, "Request", hashMap);
        } else {
            nul.a(nulVar, "Request", hashMap);
        }
        return nnmVar;
    }

    public static nno a(nnl nnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nno) ipChange.ipc$dispatch("9629738b", new Object[]{nnlVar}) : a(nnlVar, (nul) null);
    }

    public static JSONObject a(byte[] bArr, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e5c4ce8", new Object[]{bArr, nulVar});
        }
        if (bArr != null && bArr.length != 0) {
            try {
                String str = new String(bArr, "UTF-8");
                if (StringUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    return new JSONObject(str);
                } catch (JSONException e) {
                    e.printStackTrace();
                    nul.a(nulVar, "JsonConvert", "-1", e.getMessage());
                    return null;
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                nul.a(nulVar, "ByteDataConvert", "-1", e2.getMessage());
            }
        }
        return null;
    }

    public static JSONObject b(byte[] bArr, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85350ca9", new Object[]{bArr, nulVar});
        }
        JSONObject a2 = a(bArr, nulVar);
        if (a2 == null) {
            return null;
        }
        JSONObject optJSONObject = a2.optJSONObject("data");
        return optJSONObject != null ? optJSONObject : a2;
    }

    public static nnk a(String str, nnl nnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnk) ipChange.ipc$dispatch("5c2ec605", new Object[]{str, nnlVar});
        }
        if (StringUtils.isEmpty(str)) {
            return new nnk();
        }
        HashMap hashMap = new HashMap();
        if (nnlVar.e && nnlVar.h != null) {
            hashMap.putAll(nnlVar.h);
        }
        if (nnlVar.g != null) {
            hashMap.putAll(nnlVar.g);
        }
        return nnp.a(y.a(str, hashMap), nnlVar.i);
    }

    public static void a(MtopRequest mtopRequest, nnl nnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f016b17", new Object[]{mtopRequest, nnlVar});
        } else if (mtopRequest == null || nnlVar == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (nnlVar.e) {
                if (nnlVar.h != null) {
                    if (j.f19452a != null) {
                        j.f19452a.k().a(nnlVar.h, nnlVar.i);
                        b.a(j.f19452a, nnlVar.h, nnlVar.i);
                    }
                    hashMap.put("params", JSON.toJSONString(nnlVar.h));
                }
            } else if (j.f19452a != null) {
                j.f19452a.k().a(nnlVar.g, nnlVar.i);
                b.a(j.f19452a, nnlVar.g, nnlVar.i);
            }
            if (nnlVar.g != null) {
                hashMap.putAll(nnlVar.g);
            }
            if (hashMap.size() <= 0) {
                return;
            }
            mtopRequest.setData(JSON.toJSONString(hashMap));
        }
    }

    private static String b(nnl nnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac8ed913", new Object[]{nnlVar});
        }
        String str = "http://mtop.taobao.com/" + nnlVar.f31592a + "/" + nnlVar.b;
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.putAll(nnlVar.g);
        if (j.f19452a != null) {
            jSONObject.put("utd_id", (Object) j.f19452a.a().b());
        }
        if (nnlVar.h != null && !nnlVar.h.isEmpty()) {
            jSONObject.put("params", JSON.toJSON(nnlVar.h));
        }
        return y.a(str, "data", jSONObject.toString());
    }
}
