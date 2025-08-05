package com.taobao.order.downgrade.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.order.bundle.TBOrderListFragment;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager;
import com.taobao.android.order.bundle.weex2.TBRefundInstanceManager;
import tb.add;
import tb.bxd;
import tb.cup;
import tb.hyk;
import tb.hyn;
import tb.jqg;
import tb.jqh;
import tb.kge;

/* loaded from: classes7.dex */
public class a implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.order.bundle.nav.c<Intent> f18617a = new com.taobao.android.order.bundle.nav.c<>();

    static {
        kge.a(1606333816);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "OrderListNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public a() {
        this.f18617a.a(new com.taobao.android.order.bundle.nav.list.e(), new com.taobao.android.order.bundle.nav.list.d(), new com.taobao.android.order.bundle.nav.list.a(), new com.taobao.android.order.bundle.nav.list.b());
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        hyn.a(CoreConstants.NAV_TAG, "OrderListNavProcessor", new String[0]);
        if (intent != null && intent.getData() != null && intent.getData().isOpaque()) {
            jqg.b(CoreConstants.NAV_TAG, "uri is opaque");
            return false;
        }
        if (hyk.B()) {
            OrderType orderType = OrderType.ORDERLIST;
            if (TextUtils.equals("OrderFilter", com.taobao.android.order.bundle.helper.g.b(intent, CoreConstants.USER_ORDER_TYPE))) {
                orderType = OrderType.ORDERFILTER;
            } else if (!TextUtils.isEmpty(com.taobao.android.order.bundle.helper.g.a(intent, "searchKey"))) {
                orderType = OrderType.ORDERSEARCH;
            }
            intent.putExtra("orderType", orderType.getValue());
            boolean equals = OrderType.ORDERLIST.equals(orderType);
            if (!equals && bxd.a("useOrderSearchActivity", false)) {
                dVar.a("com.taobao.taobao");
                dVar.b("com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity");
                return true;
            }
            if (equals && "reFund".equals(com.taobao.android.order.bundle.helper.g.b(intent, com.taobao.android.order.bundle.helper.g.IN_PARAM_ORDER_LIST_TYPE))) {
                jqh.a(new Runnable() { // from class: com.taobao.order.downgrade.list.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TBRefundInstanceManager.startPreRequestOnIdle();
                        }
                    }
                });
                if (cup.d() && (dVar.a() instanceof Activity)) {
                    AsyncInstanceLoadManager.INSTANCE.a((Activity) dVar.a());
                }
            }
            com.taobao.android.order.bundle.nav.list.g.INSTANCE.a(intent, dVar);
            if (bxd.a("useOrderListFragment", true) && add.a("AB_OrderListFragment_Android", "202409051501_108", "useOrderListFragment", false)) {
                a(intent, dVar);
            }
            this.f18617a.a((com.taobao.android.order.bundle.nav.c<Intent>) intent);
        }
        return true;
    }

    private void a(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d54a2f", new Object[]{this, intent, dVar});
        } else if (dVar.a() == null || intent == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_JUMP, "true");
            bundle.putString(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_NAME, TBOrderListFragment.class.getName());
            dVar.c(JumpAbility.NAV_JUMP_ABILITY_FRAGMENT);
            intent.putExtra(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_BUNDLE, bundle);
        }
    }
}
