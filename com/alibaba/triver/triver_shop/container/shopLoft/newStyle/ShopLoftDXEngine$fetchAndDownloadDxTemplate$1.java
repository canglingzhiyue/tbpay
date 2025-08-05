package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.ruk;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopLoftDXEngine$fetchAndDownloadDxTemplate$1 extends Lambda implements ruw<DXTemplateItem, Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul<View, t> $createViewCallback;
    public final /* synthetic */ ruk<t> $createViewFailedCallback;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopLoftDXEngine$fetchAndDownloadDxTemplate$1(rul<? super View, t> rulVar, a aVar, JSONObject jSONObject, ruk<t> rukVar) {
        super(2);
        this.$createViewCallback = rulVar;
        this.this$0 = aVar;
        this.$data = jSONObject;
        this.$createViewFailedCallback = rukVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(DXTemplateItem dXTemplateItem, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, dXTemplateItem, bool});
        }
        invoke(dXTemplateItem, bool.booleanValue());
        return t.INSTANCE;
    }

    public final void invoke(DXTemplateItem dxTemplate, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ba376c", new Object[]{this, dxTemplate, new Boolean(z)});
            return;
        }
        q.d(dxTemplate, "dxTemplate");
        if (z) {
            rul<View, t> rulVar = this.$createViewCallback;
            a aVar = this.this$0;
            JSONObject jSONObject = this.$data;
            rulVar.mo2421invoke(a.$ipChange);
            ceg.Companion.b(q.a("dx template download success : ", (Object) dxTemplate.toString()));
            return;
        }
        ceg.Companion.b(q.a("dx template download failed : ", (Object) dxTemplate.toString()));
        ruk<t> rukVar = this.$createViewFailedCallback;
        if (rukVar == null) {
            return;
        }
        rukVar.mo2427invoke();
    }
}
