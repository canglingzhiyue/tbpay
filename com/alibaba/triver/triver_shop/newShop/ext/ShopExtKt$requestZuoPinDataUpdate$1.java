package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopExtKt$requestZuoPinDataUpdate$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul<Boolean, t> $needShowRedDotCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopExtKt$requestZuoPinDataUpdate$1(rul<? super Boolean, t> rulVar) {
        super(1);
        this.$needShowRedDotCallback = rulVar;
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
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        String str = null;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && (jSONObject3 = jSONObject2.getJSONObject("data")) != null) {
            str = jSONObject3.getString("status");
        }
        this.$needShowRedDotCallback.mo2421invoke(Boolean.valueOf(q.a((Object) "1", (Object) str)));
    }
}
