package com.taobao.android.tbabilitykit;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import tb.kge;

/* loaded from: classes6.dex */
public final class l implements com.taobao.android.abilitykit.mega.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1923080318);
        kge.a(-492976882);
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult a(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b88a424e", new Object[]{this, result});
        }
        kotlin.jvm.internal.q.d(result, "result");
        return result;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult b(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("1ae5592d", new Object[]{this, result});
        }
        kotlin.jvm.internal.q.d(result, "result");
        return result;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            a(jSONObject, "businessId", PopConst.BRIDGE_KEY_BUSINESS_ID);
            a(jSONObject, "imageUrl", "imageURL");
        }
        return jSONObject;
    }

    private final void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
            return;
        }
        jSONObject.put((JSONObject) str2, (String) jSONObject.get(str));
        jSONObject.remove(str);
    }
}
