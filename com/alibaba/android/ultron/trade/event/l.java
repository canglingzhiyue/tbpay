package com.alibaba.android.ultron.trade.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class l extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMPONENTS_GROUPS = "componentGroups";

    static {
        kge.a(-1971518517);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        if (str.hashCode() == -1790496587) {
            return super.a((JSONObject) objArr[0], (String) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.m
    public List<IDMComponent> a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("954730b5", new Object[]{this, jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_COMPONENTS_GROUPS);
        if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.addAll(super.a((JSONObject) jSONArray.get(i), str));
            }
        }
        return arrayList;
    }
}
