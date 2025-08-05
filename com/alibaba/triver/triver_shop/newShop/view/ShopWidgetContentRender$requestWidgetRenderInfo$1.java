package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopWidgetContentRender$requestWidgetRenderInfo$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul<JSONObject, t> $success;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopWidgetContentRender$requestWidgetRenderInfo$1(rul<? super JSONObject, t> rulVar) {
        super(1);
        this.$success = rulVar;
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
        rul<JSONObject, t> rulVar = this.$success;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke(jSONObject);
    }
}
