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
public class f implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "buyNow";
    public static final String EVENT_TYPE_ALTERNATIVE = "buy_now";

    /* renamed from: a  reason: collision with root package name */
    private Context f10699a;
    private eyx b;

    static {
        kge.a(-440924533);
        kge.a(1967244270);
    }

    public f(Context context, eyx eyxVar) {
        this.f10699a = context;
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
        this.b.e().a("skuClickTimeType", com.taobao.android.sku.utils.o.P_BUY_BTN_CLICK);
        String str = null;
        Feature feature = (Feature) pirVar.a(Feature.class);
        if (com.taobao.android.detail.ttdetail.utils.j.ac() && com.taobao.android.detail.ttdetail.utils.k.e(feature)) {
            str = "fromDetailBuyNow";
        } else if (!com.taobao.android.detail.ttdetail.utils.k.a((SkuCore) pirVar.a(SkuCore.class)) && !com.taobao.android.detail.ttdetail.utils.k.a(feature) && !com.taobao.android.detail.ttdetail.utils.k.b(feature)) {
            str = com.taobao.android.detail.ttdetail.c.a("BUYNOW", com.taobao.android.detail.ttdetail.utils.k.a(feature), com.taobao.android.detail.ttdetail.utils.k.b(feature));
        }
        this.b.c().a(w.a("BUYNOW", str), runtimeAbilityParamArr);
        return true;
    }
}
