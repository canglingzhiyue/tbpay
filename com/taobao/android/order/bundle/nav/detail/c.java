package com.taobao.android.order.bundle.nav.detail;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import tb.hyk;
import tb.hyn;
import tb.hyq;
import tb.kge;

/* loaded from: classes.dex */
public class c extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1674919538);
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
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (TextUtils.isEmpty(c(intent))) {
            intent.putExtra(CoreConstants.IN_PARAM_BIZ_ORDER_ID, d(intent));
        }
        if (TextUtils.isEmpty(e(intent))) {
            intent.putExtra(CoreConstants.IN_PARAM_ARCHIVE, f(intent));
        }
        String str = "http://h5.m.taobao.com/awp/base/order/detailultron.htm";
        if (hyk.o() && (data = intent.getData()) != null) {
            String encodedQuery = data.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                str = str + "?" + encodedQuery;
            }
        }
        Uri parse = Uri.parse(str);
        intent.setData(com.taobao.android.order.bundle.nav.f.a(parse));
        String[] strArr = new String[1];
        strArr[0] = parse != null ? parse.toString() : "";
        hyn.a(CoreConstants.NAV_TAG, "GoToV2Detail", strArr);
        hyq.a("GoToV2DetailTask", "GoToV2Detail", "GoToV2Detail");
        return true;
    }

    private static String c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("249b0259", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        String stringExtra2 = intent.getStringExtra(CoreConstants.IN_PARAM_PAY_ORDER_ID);
        return TextUtils.isEmpty(stringExtra2) ? intent.getStringExtra("orderId") : stringExtra2;
    }

    private static String d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de128ff8", new Object[]{intent});
        }
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_PAY_ORDER_ID);
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        String queryParameter2 = data.getQueryParameter(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
        return TextUtils.isEmpty(queryParameter2) ? data.getQueryParameter("orderId") : queryParameter2;
    }

    private static String e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978a1d97", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra(CoreConstants.IN_PARAM_ARCHIVE);
        return TextUtils.isEmpty(stringExtra) ? intent.getStringExtra(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER) : stringExtra;
    }

    private static String f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5101ab36", new Object[]{intent});
        }
        if (intent.getData() == null) {
            return null;
        }
        String queryParameter = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_ARCHIVE);
        return TextUtils.isEmpty(queryParameter) ? intent.getData().getQueryParameter(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER) : queryParameter;
    }
}
