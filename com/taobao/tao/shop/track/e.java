package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f21105a;

    static {
        kge.a(-1784897511);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c733255", new Object[]{this, aVar});
        } else {
            this.f21105a = aVar;
        }
    }

    public void a(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5ae019", new Object[]{this, mtopTaobaoWirelessShopRouteProcessResponseData, str});
        } else if (this.f21105a == null) {
        } else {
            if (!ShopConstants.V_SHOP_RULESET_SHOP.equals(str) && !ShopConstants.V_SHOP_RULESET_PERSONAL.equals(str)) {
                return;
            }
            this.f21105a.a(mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl(), mtopTaobaoWirelessShopRouteProcessResponseData.getSellerId(), Boolean.parseBoolean(mtopTaobaoWirelessShopRouteProcessResponseData.getIsTmall()));
        }
    }
}
