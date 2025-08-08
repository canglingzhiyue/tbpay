package com.alibaba.android.ultron.event;

import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import tb.kge;

/* loaded from: classes2.dex */
public class m extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DM_COMPONENT_EXT_KEY_TEXT = "componentTextInputKey";

    static {
        kge.a(-900475719);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        com.taobao.android.ultron.common.model.b b;
        JSONObject fields;
        JSONArray jSONArray;
        Editable text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (eVar == null || (b = b()) == null || (fields = b.getFields()) == null) {
        } else {
            String string = fields.getString(DM_COMPONENT_EXT_KEY_TEXT);
            if (StringUtils.isEmpty(string)) {
                return;
            }
            Object d = eVar.d(com.alibaba.android.ultron.event.base.f.KEY_DXEVENT);
            String str = null;
            if ((d instanceof DXTextInputEvent) && (text = ((DXTextInputEvent) d).getText()) != null) {
                str = text.toString();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(string, (Object) str);
            a(eVar, jSONObject);
            JSONObject jSONObject2 = fields.getJSONObject("next");
            if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("onChange")) == null) {
                return;
            }
            a(jSONArray);
        }
    }
}
