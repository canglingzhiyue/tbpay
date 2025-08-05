package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.pir;
import tb.pkw;

/* loaded from: classes5.dex */
public class b implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "addToCart";
    public static final String EVENT_TYPE_ALTERNATIVE = "add_to_cart";

    /* renamed from: a  reason: collision with root package name */
    private Context f10692a;
    private eyx b;

    static {
        kge.a(1566111216);
        kge.a(1967244270);
    }

    public b(Context context, eyx eyxVar) {
        this.f10692a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (!com.taobao.android.detail.ttdetail.utils.ao.c()) {
            com.taobao.android.detail.ttdetail.utils.ao.a(true);
            return true;
        }
        pir pirVar = (pir) this.b.a().a(pkw.PARSER_ID);
        if (pirVar == null) {
            return false;
        }
        this.b.e().a("skuClickTime", String.valueOf(System.currentTimeMillis()));
        this.b.e().a("skuClickTimeType", com.taobao.android.sku.utils.o.P_CART_BTN_CLICK);
        String str = null;
        Feature feature = (Feature) pirVar.a(Feature.class);
        if (com.taobao.android.detail.ttdetail.utils.j.ac() && com.taobao.android.detail.ttdetail.utils.k.e(feature)) {
            str = "fromDetailAddCart";
        } else if (!com.taobao.android.detail.ttdetail.utils.k.a((SkuCore) pirVar.a(SkuCore.class)) && !com.taobao.android.detail.ttdetail.utils.k.a(feature)) {
            str = com.taobao.android.detail.ttdetail.c.a("ADDCART", com.taobao.android.detail.ttdetail.utils.k.a(feature), com.taobao.android.detail.ttdetail.utils.k.b(feature));
        }
        this.b.c().a(w.a("ADDCART", str), runtimeAbilityParamArr);
        return true;
    }
}
