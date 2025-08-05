package com.taobao.family;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aej;
import tb.aek;
import tb.ael;

/* loaded from: classes7.dex */
public class h implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_BUBBLE_SWITCH = "bubbleSwitch";
    public static final String EVENT_RELATION_UNBIND = "relationUnbind";

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (i != 3005 || !(objArr[0] instanceof String)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) objArr[0]);
            String optString = jSONObject.optString("event");
            String optString2 = jSONObject.optString("param");
            if (EVENT_BUBBLE_SWITCH.equals(optString)) {
                new JSONObject(optString2).optBoolean("isShow", true);
            } else if (!EVENT_RELATION_UNBIND.equals(optString)) {
                return null;
            }
            FamilyManager.sendGetFamilyRelationRequest();
            return new ael(true);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
