package com.taobao.order.downgrade.detail;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import tb.abm;
import tb.bxa;
import tb.bxb;
import tb.hyk;
import tb.hyn;
import tb.hyq;
import tb.jqg;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.order.bundle.nav.c<Intent> f18616a = new com.taobao.android.order.bundle.nav.c<>();

    static {
        kge.a(1651690782);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "OrderDetailNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public b() {
        this.f18616a.a(new com.taobao.android.order.bundle.nav.detail.f(), new com.taobao.android.order.bundle.nav.detail.e(), new com.taobao.android.order.bundle.nav.detail.b(), new com.taobao.android.order.bundle.nav.detail.d(), new com.taobao.android.order.bundle.nav.detail.c());
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        hyn.a(CoreConstants.NAV_TAG, "OrderDetailNavProcessor", new String[0]);
        bxa.b();
        if (a(intent, dVar)) {
            return false;
        }
        if (hyk.n()) {
            this.f18616a.a((com.taobao.android.order.bundle.nav.c<Intent>) intent);
            hyq.a(null, "NewOrderDetailNavProcessor", "", null);
        }
        return true;
    }

    private boolean a(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40d54a33", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (!hyk.a()) {
            jqg.b("OrderDetailNavProcessor.preInterceptODetail", "switcher is off");
            return false;
        }
        if (dVar != null && dVar.a() != null) {
            Context a2 = dVar.a();
            if (intent != null && intent.getData() != null && intent.getData().getQuery() != null) {
                String query = intent.getData().getQuery();
                if (query.contains("downgrade2native=true")) {
                    jqg.b("OrderDetailNavProcessor.preInterceptODetail", "query contains downgrade2native");
                    return false;
                } else if ("true".equals(com.taobao.android.order.bundle.helper.g.b(intent, CoreConstants.IN_PARAMS_VIEW_LOGISTICS))) {
                    return false;
                } else {
                    String d = com.taobao.android.order.bundle.helper.g.d(intent);
                    if (StringUtils.isEmpty(d)) {
                        jqg.b("OrderDetailNavProcessor.preInterceptODetail", "orderId is empty");
                        return false;
                    }
                    String str = abm.a(String.format("https://meta.m.taobao.com/app/tb-trade/odetail/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&wx_limit_raster_cache=true&openFrom=native2weex&wx_auto_back=true&orderId=%s&orderLineId=%s&disableNav=YES&status_bar_transparent=true&nativeDirectToweex=true", d, d)) + '&' + query;
                    if (hyk.h()) {
                        str = str + "&tradeHybrid=true";
                    }
                    Nav.from(a2).disableTransition().toUri(Uri.parse(str));
                    bxb.a(bxb.a.b(OrderBizCode.orderDetail, "nativeDirectToOrder4").a(1.0f).a("nav to odetail4, original url:" + intent.getData().toString()));
                    return true;
                }
            }
        }
        return false;
    }
}
