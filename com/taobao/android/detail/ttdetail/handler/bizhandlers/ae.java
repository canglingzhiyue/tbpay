package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.weex.common.Constants;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class ae implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "switchMainImage";

    /* renamed from: a  reason: collision with root package name */
    private Context f10676a;
    private eyx b;

    static {
        kge.a(-963474697);
        kge.a(1967244270);
    }

    public ae(Context context, eyx eyxVar) {
        this.f10676a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        com.taobao.android.detail.ttdetail.component.module.d a2;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null || (a2 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr)) == null || (d = a2.getComponentData().d()) == null) {
            return false;
        }
        String string = b.getString("imageUrl");
        d.put("mainImageUrl", (Object) string);
        JSONArray jSONArray = d.getJSONArray(Constants.Name.Recycler.LIST_DATA);
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    if (TextUtils.equals(jSONObject.getString("imageUrl"), string)) {
                        jSONObject.put(ThemisConfig.SCENE_SELECT, (Object) "true");
                    } else {
                        jSONObject.put(ThemisConfig.SCENE_SELECT, (Object) "false");
                    }
                }
            }
        }
        a2.updateComponent();
        return true;
    }
}
