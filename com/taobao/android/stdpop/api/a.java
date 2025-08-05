package com.taobao.android.stdpop.api;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.scq;

/* loaded from: classes6.dex */
public abstract class a implements scq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1780903766);
        kge.a(791819816);
    }

    @Override // tb.scq
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.scq
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        }
    }
}
