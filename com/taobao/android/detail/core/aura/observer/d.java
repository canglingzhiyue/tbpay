package com.taobao.android.detail.core.aura.observer;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.dwy;
import tb.dxu;
import tb.emu;
import tb.iok;
import tb.iyh;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends c implements iyh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PRICE_MODEL = "price_model";
    public static final String TAG = "MainScreenPriceComponentUpdate";

    static {
        kge.a(-473290604);
        kge.a(-6659769);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(Context context, dxu dxuVar) {
        super(context, dxuVar);
        emu.a("com.taobao.android.detail.core.aura.observer.MainScreenPriceComponentUpdate");
    }

    private void b() {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!(this.c instanceof a) || (a2 = ((a) this.c).a()) == null) {
        } else {
            a(JSON.parseObject(a2.a(KEY_PRICE_MODEL)));
        }
    }

    private void a(JSONObject jSONObject) {
        AURARenderComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            List a3 = a();
            Set<String> keySet = jSONObject.keySet();
            ArrayList arrayList = new ArrayList();
            JSONObject c = c();
            if (c == null) {
                return;
            }
            for (String str : keySet) {
                if (!iok.KEY_PRICE_SECTION.equals(str) && !a.KEY_PROP_PATH.equals(str) && !"skuId".equals(str)) {
                    for (String str2 : a(c, str)) {
                        if (!TextUtils.isEmpty(str2) && (a2 = a(Arrays.asList(str2), a3)) != null && a2.data != null && a2.data.fields != null && a(a2, str)) {
                            a2.data.fields.putAll(jSONObject.getJSONObject(str));
                            arrayList.add(a2);
                        }
                    }
                }
            }
            a(arrayList);
        }
    }

    @Override // tb.iyh.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            b();
        }
    }

    private JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        try {
            return ((DetailCoreActivity) this.c).C().f10055a.l().getJSONArray("apiStack").getJSONObject(0).getJSONObject("value").getJSONObject("hierarchy").getJSONObject("structure");
        } catch (Exception e) {
            i.a(TAG, "getStructure parse exception:" + e.getMessage());
            return null;
        }
    }

    private List<String> a(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("954730b5", new Object[]{this, jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = jSONObject.getJSONArray(str);
        } catch (Exception e) {
            i.a(TAG, "findComponentKey parse exception:" + e.getMessage());
        }
        if (jSONArray != null && jSONArray.size() != 0) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    List<String> a2 = a(jSONObject, (String) next);
                    if (a2 != null && a2.size() != 0) {
                        arrayList.addAll(a2);
                    }
                    arrayList.add((String) next);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    private boolean a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a501ee1", new Object[]{this, aURARenderComponent, str})).booleanValue() : !str.contains("bottomBar") || (aURARenderComponent.data.fields.get(dwy.KEY_DETAIL) != null && Boolean.parseBoolean(String.valueOf(aURARenderComponent.data.fields.get(dwy.KEY_DETAIL))));
    }
}
