package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopMoreUtils$shopLoftLike$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul<String, t> $likeCountCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopMoreUtils$shopLoftLike$1(rul<? super String, t> rulVar) {
        super(1);
        this.$likeCountCallback = rulVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        rul<String, t> rulVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
        } else {
            String string = jSONObject2.getString("likeCountStr");
            if (!q.a((Object) jSONObject2.getString("success"), (Object) "true") || string == null || (rulVar = this.$likeCountCallback) == null) {
                return;
            }
            rulVar.mo2421invoke(string);
        }
    }
}
