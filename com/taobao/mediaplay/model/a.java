package com.taobao.mediaplay.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f18044a;
    private JSONObject b;
    private String c;

    static {
        kge.a(998841344);
    }

    public a(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public String a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f18044a) && (jSONObject = this.b) != null) {
            Object opt = jSONObject.opt("cacheKey");
            this.f18044a = opt == null ? null : opt.toString();
        }
        return this.f18044a;
    }

    public String b() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c) && (jSONObject = this.b) != null) {
            Object opt = jSONObject.opt("definition");
            this.c = opt == null ? null : opt.toString();
        }
        return this.c;
    }
}
