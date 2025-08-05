package com.taobao.android.order.bundle.nav.list;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.OrderListFragment;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.tao.tbmainfragment.i;
import tb.hyn;
import tb.hyq;
import tb.kge;

/* loaded from: classes.dex */
public class b extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1791260718);
    }

    @Override // com.taobao.android.order.bundle.nav.a
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.order.bundle.nav.b
    public /* synthetic */ boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue() : b((Intent) obj);
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        String str = "http://h5.m.taobao.com/awp/base/order/listultron.htm";
        Uri data = intent.getData();
        if (data != null) {
            String encodedQuery = data.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                str = str + "?" + encodedQuery;
            }
            try {
                if ("true".equalsIgnoreCase(data.getQueryParameter("isOLFragmentPop"))) {
                    intent.putExtra(i.KEY_FRAGMENT_NAME, OrderListFragment.class.getName());
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
        Uri parse = Uri.parse(str);
        intent.setData(com.taobao.android.order.bundle.nav.f.a(parse));
        if (parse.getQueryParameter("jumpParams") != null) {
            intent.setFlags(65536);
        }
        String[] strArr = new String[1];
        strArr[0] = parse != null ? parse.toString() : "";
        hyn.a(CoreConstants.NAV_TAG, "GoToV2ListTask", strArr);
        hyq.a("GoToV2ListTask", "GoToV2List", "GoToV2List");
        return true;
    }
}
