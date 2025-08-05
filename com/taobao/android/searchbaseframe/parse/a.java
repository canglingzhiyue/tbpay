package com.taobao.android.searchbaseframe.parse;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1004381703);
    }

    public abstract void a(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception;

    public void a(BEAN bean, JSONObject jSONObject, CTX ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5071fe08", new Object[]{this, bean, jSONObject, ctx});
        }
    }

    public abstract String b();

    public abstract Class<BEAN> c();

    public abstract BEAN d();

    public final BEAN a(JSONObject jSONObject, CTX ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BEAN) ipChange.ipc$dispatch("c2724e", new Object[]{this, jSONObject, ctx});
        }
        try {
            BEAN b = b(jSONObject, ctx);
            a((a<BEAN, CTX>) b, jSONObject, (JSONObject) ctx);
            return b;
        } catch (Exception e) {
            a(e);
            return null;
        }
    }

    public BEAN b(JSONObject jSONObject, CTX ctx) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BEAN) ipChange.ipc$dispatch("c7ce594f", new Object[]{this, jSONObject, ctx});
        }
        BEAN d = d();
        a(jSONObject, (JSONObject) d, (BEAN) ctx);
        return d;
    }

    public void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            return;
        }
        k.a("Parser_" + b(), (String) null, exc);
    }
}
