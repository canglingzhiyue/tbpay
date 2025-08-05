package com.taobao.android.order.bundle.helper;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import java.util.HashMap;
import java.util.List;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTENT_KEY_MY_TAOBAO_NEED_REFRESH = "myTaoBaoNeedRefresh";
    public static final String INTENT_KEY_ORDER_DETAIL_NEED_REFRESH = "orderDetailNeedRefresh";
    public static final String INTENT_KEY_ORDER_LIST_NEED_REFRESH = "orderListNeedRefresh";

    static {
        kge.a(-410401883);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        b.a("MyTaobao_Order_Refresh", context, INTENT_KEY_MY_TAOBAO_NEED_REFRESH, false);
        hyn.a("ActivityHelper", "refreshMyTaoBao", "action = myTaoBaoNeedRefresh");
    }

    public static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{context, new Boolean(z)});
        } else {
            a(context, z, null);
        }
    }

    public static void a(Context context, boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72804631", new Object[]{context, new Boolean(z), intent});
            return;
        }
        b.a(b.ORDER_ACTION, context, intent, INTENT_KEY_ORDER_LIST_NEED_REFRESH, z);
        hyn.a("ActivityHelper", "refreshOrderList", "action = orderListNeedRefresh");
    }

    public static void a(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{context, list});
            return;
        }
        Intent intent = new Intent();
        HashMap hashMap = new HashMap();
        hashMap.put(CoreConstants.BATCH_CONFIRM_GOOD_ONLINE_ORDER_IDS, list);
        intent.putExtra(CoreConstants.QUERY_PARAM_KEY_CONDITION, hashMap);
        b.a(b.ORDER_ACTION, context, intent, INTENT_KEY_ORDER_LIST_NEED_REFRESH, false);
    }

    public static void c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f616af6", new Object[]{context, new Boolean(z)});
            return;
        }
        b.a(b.ORDER_ACTION, context, INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, z);
        hyn.a("ActivityHelper", "refreshOrderDetail", "action = orderDetailNeedRefresh");
    }
}
