package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class EmbedSecondFloorView$getView$3$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedSecondFloorView$getView$3$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        rul<JSONObject, t> n = this.this$0.n();
        if (n == null) {
            return;
        }
        n.mo2421invoke(jSONObject);
    }
}
