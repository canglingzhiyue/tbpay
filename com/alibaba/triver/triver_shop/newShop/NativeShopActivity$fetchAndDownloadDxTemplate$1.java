package com.alibaba.triver.triver_shop.newShop;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class NativeShopActivity$fetchAndDownloadDxTemplate$1 extends Lambda implements ruw<DXTemplateItem, Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul<View, t> $createViewCallback;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ JSONObject $dxJsonConfig;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeShopActivity$fetchAndDownloadDxTemplate$1(rul<? super View, t> rulVar, NativeShopActivity nativeShopActivity, JSONObject jSONObject, JSONObject jSONObject2) {
        super(2);
        this.$createViewCallback = rulVar;
        this.this$0 = nativeShopActivity;
        this.$data = jSONObject;
        this.$dxJsonConfig = jSONObject2;
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
            NativeShopActivity nativeShopActivity = this.this$0;
            JSONObject jSONObject = this.$data;
            rulVar.mo2421invoke(NativeShopActivity.$ipChange);
            NativeShopActivity.a(this.this$0, NativeShopActivity.$ipChange + 1);
            this.this$0.b(g.KEY_PAGE_LOADED);
            ceg.Companion.b(q.a("dx template download success : ", (Object) dxTemplate.toString()));
            return;
        }
        ceg.Companion.b(q.a("dx template download failed : ", (Object) dxTemplate.toString()));
        d b = NativeShopActivity.b(this.this$0);
        if (b == null) {
            q.b("shopDataParser");
            throw null;
        }
        b.k().add(this.$dxJsonConfig);
        NativeShopActivity.u(this.this$0);
    }
}
