package com.taobao.umipublish.extension.windvane.innercall;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.util.u;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import java.util.HashMap;
import java.util.Map;
import tb.ios;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class InnerCallBaseAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InnerCallBaseAbility";

    /* renamed from: a  reason: collision with root package name */
    public String f23354a = "";
    public ios.a b;

    static {
        kge.a(-1816762761);
    }

    public abstract void a(JSONObject jSONObject, ios.a aVar);

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public final void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        u.b(TAG, "params = " + jSONObject.toJSONString());
        String c = e.c(this.mContext);
        if (c == null) {
            errorCallback("2", "EMPTY_SESSION_ID");
            return;
        }
        this.f23354a = c;
        this.b = ios.a(c);
        a(jSONObject, this.b);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.b = ios.a(this.f23354a);
        HashMap hashMap = new HashMap(this.b.a());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                if (TextUtils.equals("publishParams", entry.getKey()) || TextUtils.equals("data", entry.getKey())) {
                    for (Map.Entry<String, Object> entry2 : jSONObject.getJSONObject(entry.getKey()).entrySet()) {
                        if (!TextUtils.isEmpty(entry2.getKey())) {
                            hashMap.put(entry2.getKey(), entry2.getValue().toString());
                        }
                    }
                } else {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        ios.a aVar = new ios.a();
        aVar.a(hashMap);
        ios.a(this.f23354a, aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ios.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        ios.a(this.f23354a, aVar);
    }
}
