package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.a;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.utils.am;
import com.taobao.android.detail.ttdetail.utils.b;
import java.util.List;

/* loaded from: classes5.dex */
public class tab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33979a;
    private eyx b;

    static {
        kge.a(-635797813);
    }

    public static /* synthetic */ d a(tab tabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("e369ffae", new Object[]{tabVar}) : tabVar.a();
    }

    public static /* synthetic */ void a(tab tabVar, d dVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf999009", new Object[]{tabVar, dVar, list});
        } else {
            tabVar.a(dVar, list);
        }
    }

    public tab(Context context, eyx eyxVar) {
        this.f33979a = context;
        this.b = eyxVar;
        this.b.e().a(a.KEY_PROP_PATH, new tac() { // from class: tb.tab.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tac
            public void a(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                } else {
                    tab.a(tab.this, tab.a(tab.this), obj2 != null ? am.a(obj2.toString().split(";")) : null);
                }
            }
        });
    }

    private void a(d dVar, List<String> list) {
        JSONObject d;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5544f24", new Object[]{this, dVar, list});
        } else if (dVar != null && (d = dVar.getComponentData().d()) != null && (jSONArray = d.getJSONArray("skuContents")) != null) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < jSONArray.size(); i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                if (jSONObject != null) {
                    if (Boolean.parseBoolean(jSONObject.getString("isSelected")) && i2 == -1) {
                        i2 = i3;
                    }
                    if (b.a(jSONObject.getString(a.KEY_PROP_PATH), list)) {
                        jSONObject.put("isSelected", (Object) Boolean.TRUE.toString());
                        i = i3;
                    } else {
                        jSONObject.put("isSelected", (Object) Boolean.FALSE.toString());
                    }
                }
            }
            d.put(g.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i, 0)));
            boolean z2 = i != i2;
            JSONObject jSONObject2 = d.getJSONObject("mainImage");
            if (jSONObject2 != null) {
                boolean parseBoolean = Boolean.parseBoolean(jSONObject2.getString("isSelected"));
                jSONObject2.put("isSelected", (Object) (i != -1 ? Boolean.FALSE : Boolean.TRUE).toString());
                if (parseBoolean == Boolean.parseBoolean(jSONObject2.getString("isSelected"))) {
                    z = false;
                }
                z2 |= z;
            }
            if (!z2) {
                return;
            }
            dVar.updateComponent();
        }
    }

    private d a() {
        qpk h;
        ptl f;
        d a2;
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("63731b33", new Object[]{this});
        }
        pir pirVar = (pir) this.b.a().a(pkw.PARSER_ID);
        if (pirVar != null && (h = pirVar.h()) != null && (f = h.f()) != null && f.b() > 0) {
            int b = f.b();
            for (int i = 0; i < b; i++) {
                qms a3 = f.a(i);
                if (a3 != null && (a2 = a3.a(this.b.d())) != null && (c = a2.getComponentData().c()) != null && (c.contains("detail_v3_headersku") || c.contains("tbovs_pdp_header_sku_i18n"))) {
                    return a2;
                }
            }
        }
        return null;
    }
}
