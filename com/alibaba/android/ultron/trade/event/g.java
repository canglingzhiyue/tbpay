package com.alibaba.android.ultron.trade.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(389290268);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
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
        bmz b = this.f.F().b();
        if (b == null || this.h == null) {
            return;
        }
        IDMComponent c = b.c();
        if (a(c)) {
            this.f.w().a(c, b);
        }
        this.f.y().a(true);
    }

    private boolean a(IDMComponent iDMComponent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue();
        }
        JSONObject stashData = iDMComponent.getStashData();
        JSONObject data = iDMComponent.getData();
        if (stashData != null && data != null) {
            try {
                JSONObject jSONObject = data.getJSONObject("fields");
                JSONObject jSONObject2 = stashData.getJSONObject("fields");
                if (jSONObject.containsKey(l.KEY_COMPONENTS_GROUPS)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(l.KEY_COMPONENTS_GROUPS);
                    JSONArray jSONArray2 = jSONObject2.getJSONArray(l.KEY_COMPONENTS_GROUPS);
                    int min = Math.min(jSONArray.size(), jSONArray2.size());
                    z = false;
                    for (int i = 0; i < min; i++) {
                        try {
                            z = a(((JSONObject) jSONArray.get(i)).getJSONObject(p.KEY_AS_SELECT), ((JSONObject) jSONArray2.get(i)).getJSONObject(p.KEY_AS_SELECT));
                            if (z) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    z = a(jSONObject.getJSONObject(p.KEY_AS_SELECT), jSONObject2.getJSONObject(p.KEY_AS_SELECT));
                }
                break;
            } catch (Exception unused2) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue() : jSONObject.toJSONString().equals(jSONObject2.toJSONString());
    }
}
