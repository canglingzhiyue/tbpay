package com.taobao.mytaobao.ultron.event;

import android.support.v4.util.ArrayMap;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements com.alibaba.android.ultron.event.base.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "BehaviX";

    static {
        kge.a(-1122962588);
        kge.a(-750523774);
    }

    @Override // com.alibaba.android.ultron.event.base.d
    public void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
        } else if (eVar == null || !(eVar.i() instanceof com.taobao.android.ultron.common.model.b)) {
        } else {
            a(((com.taobao.android.ultron.common.model.b) eVar.i()).getFields(), eVar.d());
        }
    }

    private void a(JSONObject jSONObject, IDMComponent iDMComponent) {
        ArrayMap<String, Object> extMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d60ccc", new Object[]{this, jSONObject, iDMComponent});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("eventId");
            String string2 = jSONObject.getString("page");
            String string3 = jSONObject.getString("arg1");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if ("2101".equals(string)) {
                BehaviR.getInstance().commitNewTap(string2, string3, null, a(jSONObject2));
            } else if (!"2201".equals(string)) {
            } else {
                if (iDMComponent != null && (extMap = iDMComponent.getExtMap()) != null) {
                    Object obj = extMap.get("key_exposure");
                    if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                        return;
                    }
                    extMap.put("key_exposure", Boolean.TRUE);
                }
                BehaviR.getInstance().trackAppear(string2, string3, null, null, a(jSONObject2));
            }
        }
    }

    private String[] a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1bd1fd57", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        int i = 0;
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = String.format("%s=%s", str, string);
                i++;
            }
        }
        return strArr;
    }
}
