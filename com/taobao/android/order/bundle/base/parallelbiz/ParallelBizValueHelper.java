package com.taobao.android.order.bundle.base.parallelbiz;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import tb.cts;
import tb.kge;

/* loaded from: classes6.dex */
public class ParallelBizValueHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14535a = new int[PageType.values().length];

        static {
            try {
                f14535a[PageType.order_list.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14535a[PageType.order_detail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14535a[PageType.order_search.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14535a[PageType.logistics_detail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum PageType {
        order_list,
        order_detail,
        order_search,
        logistics_detail
    }

    static {
        kge.a(-134770981);
    }

    public static String a(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc64595b", new Object[]{pageType});
        }
        boolean z = !b.c();
        int i = AnonymousClass1.f14535a[pageType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : z ? "Page_NewLogisticsDetail" : "Page_Overseas_NewLogisticsDetail" : z ? "Page_OrderSearch" : "Page_Overseas_OrderSearch" : z ? cts.a.BIZ_ORDER_DETAIL : "Page_Overseas_OrderDetail" : z ? cts.a.BIZ_ORDER_LIST : "Page_Overseas_OrderList";
    }

    public static String b(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5cbd23a", new Object[]{pageType});
        }
        boolean z = !b.c();
        int i = AnonymousClass1.f14535a[pageType.ordinal()];
        return i != 1 ? i != 2 ? i != 4 ? "" : "a2141.26898204.0.0" : "a2141.7631730.0.0" : CoreConstants.UT_ORDER_LIST_SPM_CNT;
    }

    public static String c(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f334b19", new Object[]{pageType});
        }
        int i = AnonymousClass1.f14535a[pageType.ordinal()];
        return i != 1 ? i != 2 ? i != 4 ? "" : OrderBizCode.logisticsDetail : OrderBizCode.orderDetail : OrderBizCode.orderList;
    }

    public static String d(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("489ac3f8", new Object[]{pageType});
        }
        boolean z = !b.c();
        int i = AnonymousClass1.f14535a[pageType.ordinal()];
        return i != 1 ? i != 2 ? i != 4 ? "" : z ? "物流详情" : "海外物流详情" : z ? "订单详情" : "海外订单详情" : z ? "订单列表" : "海外订单列表";
    }
}
