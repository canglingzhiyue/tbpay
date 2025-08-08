package com.taobao.android.detail.core.aura.observer;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.trade.event.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.dxu;
import tb.eir;
import tb.emu;
import tb.iyh;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends c implements iyh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f9395a;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-125035997);
        kge.a(-6659769);
        f9395a = new ArrayList<String>() { // from class: com.taobao.android.detail.core.aura.observer.MainPageSkuComponentUpdate$1
            {
                add("detailHeaderSKU");
                add("detail3SkuBarBottom");
            }
        };
    }

    public b(Context context, dxu dxuVar) {
        super(context, dxuVar);
        emu.a("com.taobao.android.detail.core.aura.observer.MainPageSkuComponentUpdate");
    }

    private String b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2162506", new Object[]{this, list});
        }
        AURARenderComponent a2 = a(f9395a, a());
        a aVar = new a();
        if (a(a2, aVar, list)) {
            a(a2);
            g.a(this.c, aVar.a());
            if ((this.c instanceof DetailCoreActivity) && ((DetailCoreActivity) this.c).K_()) {
                f.a(this.c).a(new com.taobao.android.detail.core.event.basic.c(aVar.a()));
            }
        }
        return aVar.a();
    }

    private boolean a(AURARenderComponent aURARenderComponent, a aVar, List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("876ed1aa", new Object[]{this, aURARenderComponent, aVar, list})).booleanValue() : g.a(aURARenderComponent, aVar, list);
    }

    @Override // tb.iyh.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        List<String> asList = str2 != null ? Arrays.asList(str2.split(";")) : null;
        String b = b(asList);
        if (!eir.e() || !b()) {
            return;
        }
        a(asList, b);
    }

    private void a(List<String> list, String str) {
        iyh a2;
        JSONArray a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
        } else if ((this.c instanceof com.taobao.android.detail.core.aura.observer.a) && (a2 = ((com.taobao.android.detail.core.aura.observer.a) this.c).a()) != null && (a3 = a(((DetailCoreActivity) this.c).L_())) != null && !a3.isEmpty()) {
            if (!StringUtils.isEmpty(str)) {
                for (int i = 0; i < a3.size(); i++) {
                    JSONObject jSONObject = a3.getJSONObject(i);
                    if (a(list, jSONObject)) {
                        a2.a(d.KEY_PRICE_MODEL, JSON.toJSONString(jSONObject));
                        String string = jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH);
                        if (StringUtils.isEmpty(string)) {
                            return;
                        }
                        a2.b(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, string);
                        return;
                    }
                }
            }
            JSONObject a4 = a(a3);
            if (a4 == null) {
                return;
            }
            a2.a(d.KEY_PRICE_MODEL, JSON.toJSONString(a4));
        }
    }

    private static JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{jSONArray});
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (StringUtils.isEmpty(jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH)) && StringUtils.isEmpty(jSONObject.getString("skuId"))) {
                return jSONObject;
            }
        }
        return null;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            return StringUtils.equals("true", ((DetailCoreActivity) this.c).C().f10055a.a().getJSONObject("feature").getString("detail3SkuPriceLinkage"));
        } catch (Exception e) {
            i.a("MainPageSkuComponentUpdate", "isDetail3SkuLinkage parse exception:" + e.getMessage());
            return false;
        }
    }

    private static boolean a(List<String> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2bd60bb", new Object[]{list, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH);
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        List asList = Arrays.asList(string.split(";"));
        for (String str : list) {
            if (!asList.contains(str)) {
                return false;
            }
        }
        return true;
    }

    private static JSONArray a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b99aadb6", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("detailAdjustModel")) != null) {
            return jSONObject2.getJSONArray("adjustModel");
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f9396a;

        static {
            kge.a(-1013187914);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f9396a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f9396a = str;
            }
        }
    }
}
