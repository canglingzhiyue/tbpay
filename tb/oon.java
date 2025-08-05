package tb;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.android.nav.Nav;
import com.taobao.homepage.utils.e;
import com.taobao.tao.homepage.d;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.recommend3.util.c;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class oon extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-798093554);
    }

    public static /* synthetic */ Object ipc$super(oon oonVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("clickParam")) == null) {
        } else {
            String string = jSONObject2.getString("page");
            if (TextUtils.isEmpty(string) || !string.equals("Page_Home")) {
                return;
            }
            gmq.a("Page_Home", "track_center_action", "rec_list_item_click_count");
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
            return;
        }
        ksp.a("RTapEventHandler", "handleEvent");
        JSONObject jSONObject2 = null;
        if (obj instanceof List) {
            jSONObject = (JSONObject) ((List) obj).get(0);
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        a(jSONObject);
        if (obj2 instanceof JSONObject) {
            jSONObject2 = (JSONObject) obj2;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        String string = jSONObject.getString("targetUrl");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        e.a(jSONObject2, jSONObject);
        View a2 = c.a(view);
        if (jSONObject.getJSONObject("clickParam") != null) {
            a(jSONObject, jSONObject2, a2);
            a(jSONObject2, jSONObject);
            a();
        }
        boolean uri = Nav.from(e.a(view)).withExtras(b(jSONObject)).toUri(string);
        ksp.a("RTapEventHandler", "handleEvent.Navurl=" + string);
        kss.b((JSONObject) obj2, jSONObject);
        lat.a(jSONObject);
        if (uri) {
            return;
        }
        try {
            ora.a(jSONObject2, string);
        } catch (Throwable th) {
            TLog.loge("AdMonitorHelper", "checkLunBoSection error.", th);
        }
    }

    private Bundle b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("273ad92b", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        laq c = laq.a().a("rTap").b("RTapEventHandler.parserNavPassParamsExtras").c("详情页优化，透传targetParams");
        Bundle bundle = new Bundle();
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("targetParams");
            if (!TextUtils.isEmpty(string)) {
                bundle.putSerializable("targetParams", string);
            }
            c.a("targetParams", string);
        }
        c.b();
        return bundle;
    }

    private void a() {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ope f = d.f(null);
        if (f == null || (g = f.g()) == null || g.size() <= 0) {
            return;
        }
        String jSONString = g.toJSONString();
        kss.a((HashMap) JSON.parseObject(jSONString, new TypeReference<HashMap<String, String>>() { // from class: tb.oon.1
        }, new Feature[0]));
        kss.a(jSONString);
        com.taobao.android.home.component.utils.e.e("Page_Home_Track", "DX2Rap updateNextPageUtParams");
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("args");
            jSONObject3.put(aw.PARAM_PVID, (Object) jSONObject4.getString(aw.PARAM_PVID));
            jSONObject3.put("spm", (Object) jSONObject4.getString("spm"));
            JSONObject jSONObject5 = jSONObject4.getJSONObject("utLogMapEdge");
            if (jSONObject5 != null) {
                jSONObject3.put(kox.X_OBJECT_ID, (Object) jSONObject5.getString(kox.X_OBJECT_ID));
                if (jqm.a()) {
                    com.taobao.android.home.component.utils.e.e(oor.TAG, "commit tap, it can get utLogMapEdge");
                }
            } else {
                String string = jSONObject4.getString("utLogMap");
                try {
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject3.put(kox.X_OBJECT_ID, (Object) JSONObject.parseObject(URLDecoder.decode(string, "utf-8")).getString(kox.X_OBJECT_ID));
                    }
                } catch (UnsupportedEncodingException | NullPointerException unused) {
                }
            }
        }
        if (jSONObject2.getJSONObject("clickParam") != null) {
            str3 = jSONObject2.getJSONObject("clickParam").getString("itemId");
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
            str2 = jSONObject2.getJSONObject("clickParam").getString("page");
        } else {
            str = "click_recommend_item";
            str2 = "";
            str3 = null;
        }
        h.a(str2, str, (String) null, str3, nlr.b(jSONObject3));
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, View view) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9138ff6a", new Object[]{this, jSONObject, jSONObject2, view});
            return;
        }
        Object tag = view.getTag(R.id.tag_recommend_containerId);
        String obj = tag == null ? null : tag.toString();
        String string = jSONObject.getJSONObject("clickParam").getString("itemId");
        String string2 = jSONObject2.getString("sectionBizCode");
        c.b(obj, string);
        c.a(obj, string, string2, c(jSONObject2));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("containerId", (Object) obj);
        jSONObject3.put("itemId", (Object) string);
        if (oqc.b(obj)) {
            bVar = new b("RTapClick", oqc.f, jSONObject3);
        } else {
            bVar = new b("RTapClick", opb.g, jSONObject3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message == null) {
            return;
        }
        d.b(obj).a(message);
    }

    private JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        if (jSONObject.getJSONObject("bizData") == null) {
            return null;
        }
        return jSONObject.getJSONObject("bizData").getJSONObject("itemPassParam");
    }
}
