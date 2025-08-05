package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.q;
import com.taobao.taolive.room.ui.fanslevel.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class non {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1654213577);
    }

    public static nob a(JSONObject jSONObject, ioz iozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nob) ipChange.ipc$dispatch("f8a93d73", new Object[]{jSONObject, iozVar});
        }
        if (jSONObject == null) {
            q.b("TopBarParser", "parse:topBarObject为空");
            return null;
        }
        nob nobVar = new nob();
        a(nobVar, jSONObject, iozVar);
        nobVar.h = new HashMap();
        a(nobVar.h, jSONObject);
        nobVar.f31606a = jSONObject.optBoolean("showFilter");
        nobVar.f = jSONObject.optString("filterItemType");
        nobVar.b = jSONObject.optBoolean("showStyle");
        nobVar.c = jSONObject.optBoolean("needRefresh");
        nobVar.e = jSONObject.optString("filterTitle");
        nobVar.d = jSONObject.optBoolean("refreshAuction");
        return nobVar;
    }

    private static void a(Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a683c1", new Object[]{map, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("traceMap");
        if (optJSONObject == null) {
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                map.put(next, optString);
            }
        }
    }

    private static void a(nob nobVar, JSONObject jSONObject, ioz iozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbd8483", new Object[]{nobVar, jSONObject, iozVar});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("main");
        if (optJSONArray == null) {
            optJSONArray = jSONObject.optJSONArray("data");
        }
        if (optJSONArray == null || optJSONArray.length() == 0) {
            q.b("TopBarParser", "parseTopBarCellList:cellList为空");
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            noc b = b(optJSONArray.optJSONObject(i));
            if (b != null) {
                sb.append(b.b);
                sb.append("/");
                if (!TextUtils.equals(b.f31607a, "botSearch")) {
                    arrayList.add(b);
                }
            }
        }
        if (iozVar != null) {
            iozVar.f29197a = sb.toString();
        }
        nobVar.g = arrayList;
    }

    private static noc b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (noc) ipChange.ipc$dispatch("5b9dfcef", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            q.b("TopBarParser", "parseSingleTopBarCell:cellObject为空");
            return null;
        }
        noc nocVar = new noc();
        nocVar.f31607a = jSONObject.optString("type");
        nocVar.b = jSONObject.optString("showText");
        nocVar.c = jSONObject.optBoolean(gbk.TYPE_SELECTED);
        nocVar.h = jSONObject.optString("trace");
        nocVar.k = jSONObject.optBoolean("disableStyleChange");
        JSONObject optJSONObject = jSONObject.optJSONObject(a.ICON_RENDER);
        if (optJSONObject != null) {
            nocVar.e = optJSONObject.optString("img_normal");
            nocVar.g = optJSONObject.optString("img_active");
            nocVar.f = optJSONObject.optString("img_transparent_normal");
        }
        nocVar.i = b(jSONObject.optJSONArray("params"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("subList");
        if (optJSONObject2 != null) {
            nod nodVar = new nod();
            nodVar.f31608a = optJSONObject2.optString("tItemType");
            nodVar.b = a(optJSONObject2.optJSONArray("data"));
            nocVar.j = nodVar;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("style");
        if (optJSONObject3 != null) {
            nocVar.l = optJSONObject3.optString("normalTextColor");
            nocVar.m = optJSONObject3.optString("normalBgColor");
            nocVar.n = optJSONObject3.optString("normalBorderColor");
            nocVar.o = optJSONObject3.optString("selectedTextColor");
            nocVar.p = optJSONObject3.optString("selectedBgColor");
            nocVar.q = optJSONObject3.optString("selectedBorderColor");
            nocVar.r = optJSONObject3.optString("icon");
            nocVar.s = optJSONObject3.optBoolean("bold");
        }
        nocVar.t = new HashMap();
        a(nocVar.t, jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("showImage");
        if (optJSONObject4 != null) {
            nocVar.u = optJSONObject4.optString("normalUrl");
            nocVar.v = optJSONObject4.optString("activeUrl");
            int optInt = optJSONObject4.optInt("width");
            int optInt2 = optJSONObject4.optInt("height");
            if (optInt2 > 0) {
                nocVar.w = (int) ((optInt / optInt2) * l.a(22));
            }
        }
        return nocVar;
    }

    private static List<noe> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6e6e7505", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            q.b("TopBarParser", "parseTopBarDropList:subListArray为空");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            noe a2 = a(jSONArray.optJSONObject(i));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static noe a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (noe) ipChange.ipc$dispatch("ddc6412c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            q.b("TopBarParser", "parseCellBean:subListCellObject is null");
            return null;
        }
        noe noeVar = new noe();
        noeVar.f31609a = jSONObject.optString("showText");
        noeVar.b = jSONObject.optString("tailText");
        noeVar.d = jSONObject.optString("promptText");
        noeVar.c = jSONObject.optString("topText");
        noeVar.e = jSONObject.optBoolean(gbk.TYPE_SELECTED);
        noeVar.f = jSONObject.optString("trace");
        noeVar.g = b(jSONObject.optJSONArray("params"));
        noeVar.h = a(jSONObject.optJSONArray("subData"));
        noeVar.i = new HashMap();
        a(noeVar.i, jSONObject);
        return noeVar;
    }

    private static Map<String, String> b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37ec16f8", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                hashMap.put(optJSONObject.optString("key"), optJSONObject.optString("value"));
            }
        }
        return hashMap;
    }
}
