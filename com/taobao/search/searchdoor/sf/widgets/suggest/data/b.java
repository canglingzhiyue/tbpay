package com.taobao.search.searchdoor.sf.widgets.suggest.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.common.util.ab;
import com.taobao.search.common.util.k;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.sf.j;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ioz;
import tb.itw;
import tb.iub;
import tb.kge;
import tb.npp;
import tb.npy;
import tb.npz;
import tb.nrh;
import tb.nul;

/* loaded from: classes7.dex */
public class b extends npp<com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;
    private final itw c = new ab();

    static {
        kge.a(987725229);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b b(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b4445f2", new Object[]{this, jSONObject, nulVar}) : a(jSONObject, nulVar);
    }

    public b(String str, boolean z) {
        this.b = str;
        this.f31630a = z;
    }

    public com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b a(JSONObject jSONObject, nul nulVar) {
        Object obj;
        JSONObject jSONObject2;
        String str;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b) ipChange.ipc$dispatch("a9ac8461", new Object[]{this, jSONObject, nulVar});
        }
        com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar = new com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b();
        if (jSONObject == null) {
            a(bVar, 1, "Mtop Result Empty");
            nul.a(nulVar, "DataConvert", "-1", "JSON is empty");
            return bVar;
        }
        HashMap hashMap = new HashMap();
        if (this.f31630a) {
            try {
                obj = jSONObject.get(com.taobao.mtop.wvplugin.a.RESULT_KEY);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONArray) {
                try {
                    str = ((JSONArray) obj).getString(0);
                } catch (JSONException e) {
                    e.printStackTrace();
                    str = "";
                }
                if (!StringUtils.isEmpty(str) && (split = str.split("::")) != null && split.length > 1) {
                    bVar.a(split[0]);
                    bVar.b(split[1]);
                    if (!bVar.a()) {
                        hashMap.put("errCode", bVar.b());
                        hashMap.put("errMsg", str);
                        bVar.a(new ResultError(1, str));
                    }
                }
            }
            try {
                jSONObject2 = jSONObject.getJSONObject("data");
            } catch (Exception unused2) {
                a(bVar, 3, "Mtop Data Convert Error");
                if (bVar.a()) {
                    hashMap.put("errCode", "-1");
                    hashMap.put("errMsg", "Mtop Data Convert Error");
                }
                hashMap.put("sourceData", jSONObject.toString());
                nul.b(nulVar, "DataConvert", hashMap);
                return bVar;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2 == null) {
            a(bVar, 5, "Mtop Result Data Empty");
            if (bVar.a()) {
                hashMap.put("errCode", "-1");
                hashMap.put("errMsg", "Mtop Result Data Empty");
            }
            hashMap.put("sourceData", jSONObject.toString());
            nul.b(nulVar, "DataConvert", hashMap);
            return bVar;
        }
        hashMap.put("pvId", jSONObject2.optString(aw.PARAM_PVID));
        hashMap.put("tpp_trace", jSONObject2.optString("tpp_trace"));
        a(jSONObject2, bVar, hashMap, nulVar);
        return bVar;
    }

    private void a(JSONObject jSONObject, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar, Map<String, String> map, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4282e2e", new Object[]{this, jSONObject, bVar, map, nulVar});
            return;
        }
        bVar.l = jSONObject;
        bVar.b = this.b;
        bVar.f19366a = jSONObject.optString(k.KEY_SUGGEST_RN);
        b(jSONObject, bVar);
        a(jSONObject, bVar);
        ioz iozVar = new ioz();
        bVar.g = a(jSONObject, iozVar);
        this.c.a(bVar.g);
        map.put("pageStruct", iozVar.f29197a);
        nul.a(nulVar, "DataConvert", map);
    }

    private void a(JSONObject jSONObject, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43c0ee2", new Object[]{this, jSONObject, bVar});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("review");
        if (optJSONObject == null) {
            return;
        }
        bVar.e = new nrh();
        bVar.e.a(Boolean.valueOf(optJSONObject.optBoolean("show")));
        bVar.e.a(optJSONObject.optString("h5Url"));
        bVar.e.b(optJSONObject.optString("iconUrl"));
        bVar.e.c(optJSONObject.optString("showText"));
        bVar.e.d("suggest");
    }

    private void b(JSONObject jSONObject, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        npy d;
        ActivateTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369725c1", new Object[]{this, jSONObject, bVar});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("result");
        bVar.d = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0 || (d = npz.a().d()) == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(optJSONArray.optString(i));
            if (parseObject != null && (a2 = d.a(parseObject, bVar)) != null) {
                bVar.d.add(a2);
            }
        }
    }

    private Map<String, TemplateBean> a(JSONObject jSONObject, ioz iozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("47d99ce7", new Object[]{this, jSONObject, iozVar});
        }
        String optString = jSONObject.optString("templates");
        if (!StringUtils.isEmpty(optString)) {
            return iub.a(com.alibaba.fastjson.JSONArray.parseArray(optString), iozVar, j.f19452a);
        }
        return null;
    }

    private void a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e845419", new Object[]{this, bVar, new Integer(i), str});
        } else if (bVar.c() != null) {
        } else {
            bVar.a(false);
            bVar.a(new ResultError(i, str));
        }
    }

    public com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b) ipChange.ipc$dispatch("e3a9227a", new Object[]{this}) : new com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b();
    }
}
