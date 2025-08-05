package com.alibaba.triver.triver_shop.newShop.ext;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
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
public final class ShopDXEngine$fetchAndDownloadDxTemplate$1 extends Lambda implements ruw<DXTemplateItem, Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul<View, t> $createViewCallback;
    public final /* synthetic */ ruk<t> $createViewFailedCallback;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ JSONObject $dxJsonConfig;
    public final /* synthetic */ boolean $useNewApiRender;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopDXEngine$fetchAndDownloadDxTemplate$1(rul<? super View, t> rulVar, e eVar, JSONObject jSONObject, boolean z, JSONObject jSONObject2, ruk<t> rukVar) {
        super(2);
        this.$createViewCallback = rulVar;
        this.this$0 = eVar;
        this.$data = jSONObject;
        this.$useNewApiRender = z;
        this.$dxJsonConfig = jSONObject2;
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
        JSONArray k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ba376c", new Object[]{this, dxTemplate, new Boolean(z)});
            return;
        }
        q.d(dxTemplate, "dxTemplate");
        if (z) {
            rul<View, t> rulVar = this.$createViewCallback;
            e eVar = this.this$0;
            JSONObject jSONObject = this.$data;
            boolean z2 = this.$useNewApiRender;
            rulVar.mo2421invoke(e.$ipChange);
            ceg.Companion.b(q.a("dx template download success : ", (Object) dxTemplate.toString()));
            return;
        }
        ceg.Companion.b(q.a("dx template download failed : ", (Object) dxTemplate.toString()));
        com.alibaba.triver.triver_shop.newShop.data.d a2 = this.this$0.a();
        if (a2 != null && (k = a2.k()) != null) {
            k.add(this.$dxJsonConfig);
        }
        ruk<t> rukVar = this.$createViewFailedCallback;
        if (rukVar == null) {
            return;
        }
        rukVar.mo2427invoke();
    }
}
