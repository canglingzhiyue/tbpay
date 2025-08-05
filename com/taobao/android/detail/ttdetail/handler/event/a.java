package com.taobao.android.detail.ttdetail.handler.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FIELDS = "fields";
    public static final String KEY_KEY = "key";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_TYPE = "type";

    /* renamed from: a  reason: collision with root package name */
    private String f10733a;
    private JSONObject b;

    static {
        kge.a(295087152);
    }

    public a(JSONObject jSONObject) {
        this.f10733a = jSONObject.getString("type");
        this.b = jSONObject.getJSONObject("fields");
        if (TextUtils.isEmpty(this.f10733a)) {
            this.f10733a = jSONObject.getString("key");
        }
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            this.b = jSONObject.getJSONObject("params");
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10733a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }
}
