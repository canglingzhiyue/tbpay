package com.alibaba.android.icart.core.event;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bdo;
import tb.bdx;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class ae extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-975806919);
    }

    public static /* synthetic */ Object ipc$super(ae aeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ bcb a(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("e3fc4ae", new Object[]{aeVar}) : aeVar.b;
    }

    public static /* synthetic */ bbz b(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("9b7a7556", new Object[]{aeVar}) : aeVar.f25791a;
    }

    public static /* synthetic */ bbz c(ae aeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("28b526d7", new Object[]{aeVar}) : aeVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        Object[] objArr = (Object[]) bmzVar.b("extraParams");
        if (objArr == null || objArr.length < 2) {
            return;
        }
        String str = (String) b(1);
        if (str == null) {
            str = "";
        }
        JSONArray jSONArray = this.h.getFields().getJSONArray("tabs");
        if (jSONArray == null || !(b(2) instanceof Integer)) {
            return;
        }
        int intValue = ((Integer) b(2)).intValue();
        JSONObject jSONObject = jSONArray.getJSONObject(intValue);
        String string = jSONObject.getString("url");
        Map<String, String> a2 = bdo.a(this.f25791a);
        a2.put("clickFilterItem", str);
        a2.put("title", jSONObject.getString("title"));
        a2.put("url", string);
        if (!TextUtils.isEmpty(string)) {
            JSONObject c = c();
            c.put("url", (Object) string);
            c.put("pageType", (Object) jSONObject.getString("pageType"));
            c.put("method", (Object) jSONObject.getString("method"));
            bmz a3 = this.f25791a.F().a();
            a3.c(this.d.f());
            a3.a("openUrl");
            a3.a(this.d.e());
            c(a2);
            this.f25791a.F().a(a3);
            return;
        }
        final String c2 = this.b.c();
        if (str.equals(c2)) {
            str = "";
        } else {
            z = true;
        }
        this.b.c(str);
        a2.put("lastFilterItem", c2);
        a2.put("isOpen", z + "");
        c(a2);
        if (str.startsWith("http")) {
            com.taobao.android.t.a().a(this.e).a(str);
            return;
        }
        this.b.o().a(this.h.getKey()).a(bmzVar, intValue);
        this.f25791a.x().a(this.h);
        this.f25791a.a(true, (Map<String, String>) null, new jnv() { // from class: com.alibaba.android.icart.core.event.ae.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z2, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z2), map});
                    return;
                }
                ae.a(ae.this).c(c2);
                ae.b(ae.this).x().n();
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                final RecyclerView recyclerView = (RecyclerView) ae.c(ae.this).x().s();
                recyclerView.post(new Runnable() { // from class: com.alibaba.android.icart.core.event.ae.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            recyclerView.scrollToPosition(0);
                        }
                    }
                });
            }
        });
    }

    private void d(Map<String, String> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else if (this.h.getData() != null && this.h.getData().getJSONObject("features") != null && this.h.getData().getJSONObject("features").getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT) != null && (jSONObject = this.h.getData().getJSONObject("features").getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT).getJSONObject("args")) != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    map.put(entry.getKey(), (String) value);
                }
            }
        }
    }

    private void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        d(map);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.f25791a.v().f(), 2101, "Page_ShoppingCart_TabCard_TabClick", "", "", map).build());
    }
}
