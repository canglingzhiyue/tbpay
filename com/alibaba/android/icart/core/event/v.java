package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.bca;
import tb.bei;
import tb.bmz;
import tb.jpy;
import tb.kge;

/* loaded from: classes2.dex */
public class v extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c = "transparent";
    private final String k = "globalTransparent";

    static {
        kge.a(-276981369);
    }

    public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        List<com.taobao.android.ultron.common.model.b> list = (List) bmzVar.b("events");
        if (list == null) {
            return;
        }
        JSONObject jSONObject = null;
        List<IDMComponent> list2 = null;
        for (com.taobao.android.ultron.common.model.b bVar : list) {
            if (TextUtils.equals(bVar.getType(), "openPopupWindow")) {
                list2 = bei.a(this.b, bVar);
            }
        }
        if (list2 == null) {
            return;
        }
        JSONObject c = c();
        JSONObject a2 = a(c, this.h.getData(), "transparent");
        CartGlobal m = this.b.m();
        if (m != null) {
            jSONObject = a(c, m.getOriginGlobal(), "globalTransparent");
        }
        for (IDMComponent iDMComponent : list2) {
            JSONObject fields = iDMComponent.getFields();
            fields.clear();
            if (a2 != null) {
                fields.putAll(a2);
            }
            if (jSONObject != null) {
                fields.putAll(jSONObject);
            }
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f7bd1352", new Object[]{this, jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) jpy.a(jSONObject2, obj);
        }
        return JSONObject.parseObject(String.valueOf(jpy.a(jSONObject2, jSONObject.getString(str))));
    }
}
